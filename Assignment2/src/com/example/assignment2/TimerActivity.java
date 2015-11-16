package com.example.assignment2;

import java.util.Timer;
import java.util.TimerTask;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.Button;
import android.widget.TextView;
import android.view.View; 
  



public class TimerActivity extends Activity {
	Timer timer = new Timer();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_timer);
		Button num0 = (Button) findViewById(R.id.Button41);
		Button num1 = (Button) findViewById(R.id.Button11);
		Button num2 = (Button) findViewById(R.id.Button12);
		Button num3 = (Button) findViewById(R.id.Button13);
		Button num4 = (Button) findViewById(R.id.Button21);
		Button num5 = (Button) findViewById(R.id.Button22);
		Button num6 = (Button) findViewById(R.id.Button23);
		Button num7 = (Button) findViewById(R.id.Button31);
		Button num8 = (Button) findViewById(R.id.Button32);
		Button num9 = (Button) findViewById(R.id.Button33);
		Button start = (Button) findViewById(R.id.Button51);
		Button stop = (Button) findViewById(R.id.Button52);
		Button clear = (Button) findViewById(R.id.Button53);
		num0.setOnClickListener(new push_button_deal());
		num1.setOnClickListener(new push_button_deal());
		num2.setOnClickListener(new push_button_deal());
		num3.setOnClickListener(new push_button_deal());
		num4.setOnClickListener(new push_button_deal());
		num5.setOnClickListener(new push_button_deal());
		num6.setOnClickListener(new push_button_deal());
		num7.setOnClickListener(new push_button_deal());
		num8.setOnClickListener(new push_button_deal());
		num9.setOnClickListener(new push_button_deal());
		start.setOnClickListener(new push_button_deal());
		stop.setOnClickListener(new push_button_deal());
		clear.setOnClickListener(new push_button_deal());
	}
	static int number = 0;
	static int runflag = 0;

	class push_button_deal implements View.OnClickListener
	{
		
		private TextView number_text = (TextView) findViewById(R.id.textView1);
		  
	    @SuppressLint("HandlerLeak")
		Handler handler = new Handler(){  
	  
	        public void handleMessage(Message msg) {  
	            switch (msg.what) {      
	            case 1:  
	            	if(number>0)number--;
	            	else 
	            	{
	            		timer.cancel();
	            		runflag = 0;
	            	}
	            	
	            	number_text.setText(""+number);
	                break;  
	           
	            }      
	            super.handleMessage(msg);  
	        }  
	          
	    };  
	    TimerTask task1 = new TimerTask(){    
	        public void run() {  
	            Message message = new Message();      
	            message.what = 1;      
	            handler.sendMessage(message);    
	        }     
	    };  


		public void onClick(View v){
			
			if(number>99999999){return;}
			if(runflag==0){
				switch(v.getId()){
					case R.id.Button41:
						number=(number*10+0);
						number_text.setText(""+number);
						break;
						
					case R.id.Button11:
						number=(number*10+1);
						number_text.setText(""+number);
						break;
						
					case R.id.Button12:
						number=number*10+2;
						number_text.setText(""+number);
						break;
						
					case R.id.Button13:
						number=number*10+3;
						number_text.setText(""+number);
						break;
						
					case R.id.Button21:
						number=number*10+4;
						number_text.setText(""+number);
						break;
						
					case R.id.Button22:
						number=number*10+5;
						number_text.setText(""+number);
						break;
						
					case R.id.Button23:
						number=number*10+6;
						number_text.setText(""+number);
						break;
						
					case R.id.Button31:
						number=number*10+7;
						number_text.setText(""+number);
						break;
						
					case R.id.Button32:
						number=number*10+8;
						number_text.setText(""+number);
						break;
						
					case R.id.Button33:
						number=number*10+9;
						number_text.setText(""+number);
						
						break;
						
					case R.id.Button51:
						
					    TimerTask task1 = new TimerTask(){    
					        public void run() {  
					            Message message = new Message();      
					            message.what = 1;      
					            handler.sendMessage(message);    
					        }     
					    };  
						timer = new Timer(true);
						runflag=1;
						timer.schedule(task1,1000,1000);			
						break;
					default:
						break;
				}
			}else if(runflag==1){
				switch(v.getId()){
				case R.id.Button52:
					
					runflag=0;
					number_text.setText(""+number);
					timer.cancel();
					break;
				default:break;
				}
			}else{}
			switch(v.getId()){
			case R.id.Button53:
				number=0;
				runflag=0;
				number_text.setText(""+number);
				timer.cancel();
				break;
			default:break;
			}
		}
	};
};

