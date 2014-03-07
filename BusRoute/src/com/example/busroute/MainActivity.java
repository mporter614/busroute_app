package com.example.busroute;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		View v = findViewById(R.id.routebutton);
		//set event listener
	        v.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onClick (View view) {
		  
		  if (view.getId() == R.id.routebutton) 
		  {
			  Intent myIntent = new Intent(view.getContext(), RouteActivity.class);
			  startActivityForResult(myIntent, 0);
		  }
		  else if (view.getId() == R.id.settingsbutton) 
		  {
			  Toast.makeText(this, "Yep, you pressed settings", Toast.LENGTH_LONG).show();
		  }
		  else if (view.getId() == R.id.logoutbutton) 
		  {
			  Toast.makeText(this, "Yep, you pressed log out", Toast.LENGTH_LONG).show();
		  }
		  
		} 

}
