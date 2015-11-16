
package org.lee.android;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyListView extends Activity {

	private ListView listView;
	//private List<String> data = new ArrayList<String>();
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		listView = new ListView(this);
		listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,getData()));
		setContentView(listView);
	}
	
	
	
	private List<String> getData(){
		
		List<String> data = new ArrayList<String>();
		data.add("test1");
		data.add("test2");
		data.add("test3");
		data.add("test4");
		data.add("test5");
		data.add("test6");
		data.add("test7");
		data.add("test8");
		data.add("test9");
		data.add("test10");
		data.add("test11");
		data.add("test12");
		data.add("test13");
		data.add("test14");
		data.add("test15");
		data.add("test16");
		data.add("test17");
		data.add("test18");
		
		
		return data;
	}
}
