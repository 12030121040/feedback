package com.example.openlink;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Button logon;
	private Button exit;
	private EditText usr;
	private EditText pwd;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		exit=(Button) findViewById(R.id.exit);
		logon=(Button) findViewById(R.id.log);
		usr=(EditText) findViewById(R.id.usr);
		pwd=(EditText) findViewById(R.id.pwd);
		OnClickListener listener=new OnClickListener() {
			

			@Override
			public void onClick(View arg0) {
				if((usr.getText().toString()).equals(pwd.getText().toString()))
				{
				Intent intent= new Intent(getApplicationContext(), CaseConverter.class);
				intent.putExtra("username",usr.toString());
				startActivity(intent);}
				else
					Toast.makeText(getApplicationContext(),"Wrong username password" , Toast.LENGTH_LONG).show();
					
			}
		};
		logon.setOnClickListener(listener);
	
	OnClickListener listen=new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			finish();
			
		}
	};
	exit.setOnClickListener(listen);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
