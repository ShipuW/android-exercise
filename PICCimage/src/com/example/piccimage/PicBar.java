package com.example.piccimage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class PicBar extends View{           
	  
    int COMPONENT_WIDTH;
    int COMPONENT_HEIGHT;
    boolean initflag = false;
    Bitmap[] bmp;
    int currIndex = 0;
    int[] bitmapId;
    boolean workFlag = true;

    public PicBar(Context context) { 
            super(context); 
              
            
            bitmapId =new int[]{R.drawable.picc1, R.drawable.picc2, R.drawable.picc3, R.drawable.picc4, R.drawable.picc5, R.drawable.picc6, R.drawable.picc7, R.drawable.picc8};  
              
            
            bmp = new Bitmap[bitmapId.length];

            
            initBitmap();

           

            new Thread(){   

                    
                    public void run(){ 
                            
                            while(workFlag)
                            {   
                                    currIndex = (currIndex+1)%bitmapId.length;
                                    PicBar.this.postInvalidate();
                                    try 
                                    {   
                                            Thread.sleep(1000);
                                    }  
                                    catch (InterruptedException e)    
                                    {   
                                            
                                            e.printStackTrace();   
                                    }  
                            }  
                    }  
            }.start();  
    } 

    
    public void initBitmap()   

    {   

        

            Resources res = this.getResources();   

            for(int i=0;i<bitmapId.length;i++){   
                    bmp[i] = BitmapFactory.decodeResource(res, bitmapId[i]);   
            }  
    }  

   
    @SuppressLint("DrawAllocation")
	@Override 
    protected void onDraw(Canvas canvas)    
    {   
           
            super.onDraw(canvas);   
            if(!initflag)
            {   
                    COMPONENT_WIDTH = this.getWidth();   
                    COMPONENT_HEIGHT = this.getHeight();   
                    initflag = true;   
            }  
            Paint p = new Paint(); 
            canvas.drawBitmap(bmp[currIndex], 0, 0, p);
    }  

}