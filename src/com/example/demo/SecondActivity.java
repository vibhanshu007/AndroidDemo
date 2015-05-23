package com.example.demo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.Toast;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		Intent intent=getIntent();
		String name=intent.getStringExtra("name");
		Toast.makeText(getApplicationContext(), "Name: "+name, Toast.LENGTH_SHORT).show();
	}



}
