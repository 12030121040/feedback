package com.example.openlink;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class CaseConverter extends Activity {
	private Button btn1;
	private TextView eT1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_case_converter);
		
		String passedString=getIntent().getStringExtra("username");
		int code=getIntent().getExtras().getInt("code");
		eT1=(TextView) findViewById(R.id.eT1);
		eT1.setText(passedString);
		btn1=(Button) findViewById(R.id.btn1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.case_converter, menu);
		return true;
	}

}
