package com.incite.toolbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class InciteToolbox extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        
        Button button = (Button)findViewById(R.id.login);
        button.setOnClickListener(this);

    }
    
    public void onClick(View v) {
		
        setContentView(R.layout.main);
    	
	}
}
