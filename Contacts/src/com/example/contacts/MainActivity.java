package com.example.contacts;

import java.util.ArrayList;

import android.app.TabActivity;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.ContactsContract.PhoneLookup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

	private ListView lv_p;
	private ArrayList<String> name = new ArrayList<String>();
	private Button call_10;
	private Button call_11;
	private Button call_0;
	private Button call_1;
	private Button call_2;
	private Button call_6;
	private Button call_3;
	private Button call_4;
	private Button call_5;
	private Button call_7;
	private Button call_8;
	private Button call_9;
	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);


		TabHost th = getTabHost();
		LayoutInflater.from(this).inflate(R.layout.activity_main,
				th.getTabContentView(), true);

		call_0 = (Button) findViewById(R.id.call_0);
		call_1 = (Button) findViewById(R.id.call_1);
		call_2 = (Button) findViewById(R.id.call_2);
		call_3 = (Button) findViewById(R.id.call_3);
		call_4 = (Button) findViewById(R.id.call_4);
		call_5 = (Button) findViewById(R.id.call_5);
		call_6 = (Button) findViewById(R.id.call_6);
		call_7 = (Button) findViewById(R.id.call_7);
		call_8 = (Button) findViewById(R.id.call_8);
		call_9 = (Button) findViewById(R.id.call_9);
		call_10 = (Button) findViewById(R.id.call_10);
		call_11 = (Button) findViewById(R.id.call_11);
		tv = (TextView) findViewById(R.id.call_num);

		ContentResolver cr = getContentResolver();
		Cursor cursor = cr.query(ContactsContract.Contacts.CONTENT_URI, null,
				null, null, null);
		while (cursor.moveToNext()) {
			// 取得联系人名字
			int nameFieldColumnIndex = cursor
					.getColumnIndex(PhoneLookup.DISPLAY_NAME);
			String name1 = cursor.getString(nameFieldColumnIndex);
			name.add(name1);
		}
		lv_p = (ListView) findViewById(R.id.list_people);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, name);
		lv_p.setAdapter(adapter);

		th.addTab(th.newTabSpec("all").setIndicator("所有通话记录")
				.setContent(R.id.list_record));
		th.addTab(th.newTabSpec("all").setIndicator("联系人")
				.setContent(R.id.list_people));
		th.addTab(th.newTabSpec("all").setIndicator("拨号").setContent(R.id.call));

		System.out.println("3333");
		call_0.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				System.out.println("4444");
				tv.append("0");
				System.out.println("5555");
			}
		});
		
		call_1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				tv.append("1");
			}
		});
		call_2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				tv.append("2");
			}
		});

		call_3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				tv.append("3");
			}
		});

		call_4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				tv.append("4");
			}
		});

		call_5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				tv.append("5");
			}
		});

		call_6.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				tv.append("6");
			}
		});

		call_7.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				tv.append("7");
			}
		});

		call_8.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				tv.append("8");
			}
		});

		call_9.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				tv.append("9");
			}
		});
		call_11.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				String s = tv.getText().toString();
				if(s.length() != 0){
				    String s1 = s.substring(0, s.length() - 1);
					tv.setText(s1);
					}
			}
		});
		call_10.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent it = new Intent();
				it.setAction("android.intent.action.CALL");
				it.setData(Uri.parse("tel:"+tv.getText().toString()));
				startActivity(it);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
