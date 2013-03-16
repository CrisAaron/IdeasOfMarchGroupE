package com.example.csumb_spa;

import android.app.Activity;
import android.content.*;
import android.view.Menu;
import android.view.View;
import android.net.*;
import android.os.Bundle;
import android.util.*;
import android.widget.*;
import android.view.*;

public class MainMenuActivity  extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainmenu2);
	    buttonHandlers();
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	protected void buttonHandlers(){
		//button variables
		
		final Button callHotlineButton = (Button) findViewById(R.id.mm_callbutton);	//suicide hotline button
		final Button SignsButton = (Button) findViewById(R.id.mm_signsbutton); //signs to look for button
		final Button HelpButton = (Button) findViewById(R.id.mm_howtohelpbutton); //how to help  button
		final Button ResourcesButton = (Button) findViewById(R.id.mm_resourcesbutton); //resources button
		final Button WebLinkButton = (Button) findViewById(R.id.mm_linktowebbutton); // link to web button
		
		callHotlineButton.setOnClickListener(new View.OnClickListener() {
        	 public void onClick(View v) {
                 callHotline();
             }
        });
		
		SignsButton.setOnClickListener(new View.OnClickListener() {
       	 public void onClick(View v) {
                openSignsPage();
            }
       });
       
       HelpButton.setOnClickListener(new View.OnClickListener() {
        	 public void onClick(View v) {
                 openHelpPage();
             }
        });
        
        ResourcesButton.setOnClickListener(new View.OnClickListener() {
        	 public void onClick(View v) {
                 openResourcesPage();
             }
        	 
        });
		
        
        WebLinkButton.setOnClickListener(new View.OnClickListener() {
       	 public void onClick(View v) {
                openWebLink();
            }
       });
	}
	
	/**
	 * Calls the central coast suicide hotline
	 */
	private void callHotline() {
	    try {
	        Intent callIntent = new Intent(Intent.ACTION_CALL);
	        callIntent.setData(Uri.parse("tel:18776635433"));
	        startActivity(callIntent);
	    } catch (ActivityNotFoundException e) {
	        Log.e("Sucide Hotline Method", "Call failed", e);
	    }
	}
	
	private void openSignsPage(){
		
	}
	
	private void openHelpPage(){
		
	}
	
	private void openResourcesPage(){
		
	}
	
	private void openWebLink(){
		
	}
}



