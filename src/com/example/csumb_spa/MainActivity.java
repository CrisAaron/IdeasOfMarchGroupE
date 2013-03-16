package com.example.csumb_spa;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.app.*;
import android.content.*;
import android.net.*;
import android.widget.*;
import android.view.*;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final Button button = (Button) findViewById(R.id.TestButton);
		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v){
				setContentView(R.layout.activity_signs__main);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void myClickHandler() {
		setContentView(R.layout.activity_signs__main);
	}

}
