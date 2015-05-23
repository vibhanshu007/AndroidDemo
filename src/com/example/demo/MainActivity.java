package com.example.demo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;


public class MainActivity extends Activity {
	EditText e1,e2;
	int a,b,c;
	ImageView i1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_dialog);
//		requestWindowFeature(Window.FEATURE_CONTEXT_MENU);
		//e1=(EditText)findViewById(R.id.edit_text);
		//e2=(EditText)findViewById(R.id.edit_text2);
		//i1=(ImageView)findViewById(R.id.img1);
	}

}
