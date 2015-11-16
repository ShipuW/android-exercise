package com.example.assignment1;


import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;


public class ShowActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show);
		Button button110 = (Button) findViewById(R.id.b110);
		Button button112 = (Button) findViewById(R.id.b112);
		Button button119 = (Button) findViewById(R.id.b119);
		button110.setOnClickListener(new get_button_text());
		button112.setOnClickListener(new get_button_text());
		button119.setOnClickListener(new get_button_text());
		
	}
	
	private class get_button_text implements View.OnClickListener{
		public void onClick(View v){
			CharSequence button_choose;
			switch(v.getId()){
			case R.id.b110:
				Button button110 = (Button) findViewById(R.id.b110);
				button_choose = button110.getText();
				setTitle(button_choose);
				break;
			case R.id.b112:
				Button button112 = (Button) findViewById(R.id.b112);
				button_choose = button112.getText();
				setTitle(button_choose);
				break;
			case R.id.b119:
				Button button119 = (Button) findViewById(R.id.b119);
				button_choose = button119.getText();
				setTitle(button_choose);
				break;
			}
			
		}
	};
}
 
