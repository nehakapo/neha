package com.example.wsafeguard;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AddContactActivity extends Activity {

	private ContactDatabase ContactDB;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_contact);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_contact, menu);
		return true;
	}
	
	 public void GotoHome(View v){
	        Intent intent = new Intent(this, MainActivity.class);
	        startActivity(intent); 
	 }
	
}
