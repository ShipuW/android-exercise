package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setTitle("Edit_Activity");
		Button get_edit_view_button = (Button) findViewById(R.id.get_edit_view_button);
		get_edit_view_button.setOnClickListener(new get_edit_view_button_listener());
		
	}
	
	private class get_edit_view_button_listener implements View.OnClickListener{
		public void onClick(View v){
			EditText edit_text = (EditText) findViewById(R.id.edit_text);
			CharSequence edit_text_value = edit_text.getText();
			setTitle(" ‰»Îµƒ÷µ£∫" + edit_text_value);
			
		}
	}
	

}
