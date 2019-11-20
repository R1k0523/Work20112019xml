package com.example.myapplication11;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {
    public MyView(Context context){
       super(context);
    }
    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        //здесь команда рисования
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        int y = 0;
        while(y<canvas.getHeight());
        {
            canvas.drawLine(0,y,this.getWidth(),y,paint);
            y +=30;

        }
        }

}
