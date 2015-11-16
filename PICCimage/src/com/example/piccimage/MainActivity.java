package com.example.piccimage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ViewFlipper;

public class MainActivity extends Activity {
	 private LinearLayout linearLayout;
	 private LinearLayout linearLayout1;
	 private RelativeLayout relativelayout;
	private ViewFlipper mViewFlipper;
	private PicBar picBar;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_next=(Button) findViewById(R.id.Button_next);
        Button btn=(Button) findViewById(R.id.Button_flip1);
        relativelayout=(RelativeLayout) findViewById(R.id.relativeLayout);
        linearLayout=(LinearLayout) relativelayout.findViewById(R.id.linearLayout);
        linearLayout1=(LinearLayout) linearLayout.findViewById(R.id.linearLayout1);
        linearLayout1.setVisibility(View.GONE);
        
        mViewFlipper=(ViewFlipper) findViewById(R.id.details);
        btn_next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				linearLayout1.setVisibility(View.GONE);
				mViewFlipper.setVisibility(View.VISIBLE);
				mViewFlipper.stopFlipping();
				mViewFlipper.showNext();
				
				
			}
		});
        
        
        Button button2=(Button) findViewById(R.id.Button_flip);
        button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				linearLayout1.setVisibility(View.GONE);
				mViewFlipper.setVisibility(View.VISIBLE);
				mViewFlipper.setFlipInterval(3000);
				mViewFlipper.startFlipping();
	
			}
		});
       
        btn.setOnClickListener(new BtnListener());
       
    }
    class  BtnListener implements OnClickListener
    {

		@Override
		public void onClick(View view) {
			// TODO Auto-generated method stub
			mViewFlipper.setVisibility(View.GONE);
			linearLayout1.setVisibility(View.VISIBLE);
    		picBar = new PicBar(MainActivity.this); 
    		linearLayout1.addView(picBar); 
		}
    	
    }
}