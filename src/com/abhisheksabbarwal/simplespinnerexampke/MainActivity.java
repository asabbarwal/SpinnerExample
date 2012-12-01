package com.abhisheksabbarwal.simplespinnerexampke;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.app.Activity;


public class MainActivity extends Activity {
	
	private Spinner spinner1;
	private Button dispBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
        
        dispBtn = (Button) findViewById(R.id.disp_button);
        
        dispBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				StringBuilder responseText = new StringBuilder();
				responseText.append("You have selected : ");
				
				responseText.append(String.valueOf(spinner1.getSelectedItem().toString()));
				
				Toast.makeText(getApplicationContext(), responseText.toString(), Toast.LENGTH_SHORT).show();
			}
		});
    }

  
}
