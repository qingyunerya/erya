package com.mycompany.myapp2;
import android.os.Bundle;  
import android.view.MotionEvent;  
import android.view.View;  
import android.view.View.OnTouchListener;  
import android.widget.FrameLayout;  
import android.app.Activity;  


public class MainActivity extends Activity {  

    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.meizi);  
        FrameLayout frame = (FrameLayout) findViewById(R.id.meiziFrameLayout1);  
        final MeiziView mezi = new MeiziView(MainActivity.this);  
        //为我们的萌妹子添加触摸事件监听器  
        mezi.setOnTouchListener(new OnTouchListener() {  
				@Override  
				public boolean onTouch(View view, MotionEvent event) {  
					//设置妹子显示的位置  
					mezi.bitmapX = event.getX() - 150;  
					mezi.bitmapY = event.getY() - 150;  
					//调用重绘方法  
					mezi.invalidate();  
					return true;  
				}  
			});  
        frame.addView(mezi);  
    }  
}
