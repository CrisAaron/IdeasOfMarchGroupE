package com.example.csumb_spa;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.*;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;

public class Signs_Main extends Activity{
//instance vars
final int num_screens = 3;
int currentLayout;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		currentLayout = 1;
		loadPage1();
		
		buttonHandlers();
		// Show the Up button in the action bar.
		setupActionBar();
	}

	public void buttonHandlers(){
		//button variables
		
		
		final Button BackButton = (Button) findViewById(R.id.s_BackButton);	//back button
		final Button HomeButton = (Button) findViewById(R.id.s_HomeButton); //home button
		final Button NextButton = (Button) findViewById(R.id.s_NextButton); //next  button

		
		BackButton.setOnClickListener(new View.OnClickListener() {
        	 public void onClick(View v) {
        		 if(currentLayout == 1){
        	       		Intent MainMenuIntent = new Intent(Signs_Main.this, MainActivity.class);   		
        	    		Signs_Main.this.startActivity(MainMenuIntent);
        	            
        		 }
        		 
        		 if(currentLayout == 2){
        			 currentLayout = 1;
        			 loadPage1();
        		 }
        		 
        		 if(currentLayout == 3){
        			 currentLayout = 2;
        			 loadPage2();
        		 }
             }
        });
		
		HomeButton.setOnClickListener(new View.OnClickListener() {
       	public void onClick(View v) {
     		
       		Intent MainMenuIntent = new Intent(Signs_Main.this, MainActivity.class);   		
    		Signs_Main.this.startActivity(MainMenuIntent);
            }
       });
       
       NextButton.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			changePage();
		}
		});
       } 

        
	
	
     public void changePage(){
    	 if(this.currentLayout == 1){
				this.currentLayout = 2;
				 loadPage2();
			 }
			if(this.currentLayout == 2){
				this.currentLayout = 3;
				 loadPage3();
			 }
			 
			 if(this.currentLayout == 3){
				 this.currentLayout = 1;
				 loadPage1();
			 }
     }
       
	protected void loadPage1(){
		setContentView(R.layout.activity_signs__main);
	}
	
	protected void loadPage2(){
		setContentView(R.layout.activity_signs_2);
	}
	
	protected void loadPage3(){
		setContentView(R.layout.activity_signs_3);
	}
	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.signs__main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

