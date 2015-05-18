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

	public void handle(View view) {
		/*Log.d("msnid", ""+e1.toString());
		a=Integer.parseInt(e1.getText().toString());
		b=Integer.parseInt(e2.getText().toString());
		c=a+b;
		Toast.makeText(getApplicationContext(), "sum="+c, Toast.LENGTH_LONG).show();*/
		if(i1.getTag().equals("0")){
			i1.setTag("1");
			i1.setBackgroundColor(Color.parseColor("#F78454"));
		}else{
			i1.setTag("0");
			i1.setBackgroundColor(Color.parseColor("#F76486"));
			
		}
		
		Log.d("getBackground", ""+i1.getBackground());
	}
}
