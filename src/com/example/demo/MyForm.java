package com.example.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MyForm extends Activity {


	Button button;
	EditText name;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_form);

		name=(EditText)findViewById(R.id.et_name);

		button=(Button)findViewById(R.id.Submit_button);
		button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent=new Intent(getApplicationContext(), SecondActivity.class);
				intent.putExtra("name", name.getText().toString());
				startActivity(intent);

			}
		});

	}
}
