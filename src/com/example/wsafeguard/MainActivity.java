package com.example.wsafeguard;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	final Intent intent = new Intent(this, PhotoIntentActivity.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //}

    //public void onCreateDialog(Bundle savedInstanceState) {
    	AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle(R.string.select_mode);
        alertDialog.setItems(R.array.mode_array, new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int which) {
                
                   if(which==0)
                   {
                	   intent.putExtra("mode_name","Danger");
                	   startActivity(intent);
                   }
                   if(which==1)
                   {
                	   intent.putExtra("mode_name","Walk Alone");
                	   startActivity(intent);
                   }
                   if(which==2)
                   {
                	   intent.putExtra("mode_name","Medical Emergency");
                	   startActivity(intent);
                   }
               }
        });
        AlertDialog alert = alertDialog.create();
        alert.show();
        
        //return alertDialog.create();
        
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    /** Called when the user clicks the Settings button */
    public void GotoSettings(View view) {
        // Do something in response to button
    	Intent intent = new Intent(this,Settings.class);
    	startActivity(intent); 
    }
    
    public void GotoAddContact(View v){
        Intent intent = new Intent(this, AddContactActivity.class);
        startActivity(intent); 
 }
    public void GotoMap(View v){
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent); 
 }
    
}
