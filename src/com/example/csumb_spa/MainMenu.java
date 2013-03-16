/**
 * @author Jacob Button
 * Activity for the Main Menu
 */

package com.example.csumb_spa;

import android.os.Bundle;
import android.app.Activity;
import android.content.*;
import android.view.Menu;
import android.net.*;
import android.util.*;
import android.widget.*;
import android.view.*;


public class MainMenu extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/*
        final Button button = (Button) findViewById();
        button.setOnClickListener(new View.OnClickListener() {
        	 public void onClick(View v) {
                 call();
             }
        });*/
	}
	
//rrhgrehrhtr
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

	/**
	 * Sample Call method
	 * http://www.helloandroid.com/tutorials/how-make-phone-call-your-application
	 */
	private void call() {
	    try {
	        Intent callIntent = new Intent(Intent.ACTION_CALL);
	        callIntent.setData(Uri.parse("tel:123456789"));
	        startActivity(callIntent);
	    } catch (ActivityNotFoundException e) {
	        Log.e("MainMenu Call Method", "Call failed", e);
	    }
	}
	
}
