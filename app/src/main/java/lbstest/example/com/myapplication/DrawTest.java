package lbstest.example.com.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by chen on 17-12-13.
 */

public class DrawTest extends View {


    public DrawTest(Context context) {
        super(context);
    }

    public DrawTest(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawTest(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 创建画笔
        Paint p = new Paint();
        p.setColor(Color.BLUE);// 设置红色
        p.setTextSize(30);
        p.setAntiAlias(true);// 设置画笔的锯齿效果

        canvas.drawText("画圆：", 10, 60, p);// 画圆
        canvas.drawCircle(200, 45, 20, p);


        canvas.drawText("画线",10,120,p);
        canvas.drawLine(220,100,300,100,p);

        canvas.drawText("画正方形",10,180,p);
        canvas.drawRect(150, 150, 200, 200, p);

        canvas.drawText("画长方形",10,240,p);
        canvas.drawRect(200, 200, 300, 250, p);

        canvas.drawText("画弧形",10,300,p);
        p.setStyle(Paint.Style.STROKE); //空心
        RectF oval1=new RectF(150,260,200,330);
        canvas.drawArc(oval1, 180, 180, false, p);//小弧形
        p.setStyle(Paint.Style.FILL); //实心
        oval1.set(220,260,250,330);
        canvas.drawArc(oval1, 180, 180, true, p);//小弧形

        canvas.drawText("画三角型",10,360,p);
        Path path = new Path();
        path.moveTo(150,360);//起点
        path.lineTo(180,360);
        path.lineTo(160,320);
        path.close();
        canvas.drawPath(path,p);

        canvas.drawText("贝塞尔曲线",10,420,p);
        p.setStyle(Paint.Style.STROKE);
        Path path2=new Path();
        path2.moveTo(180, 420);//设置Path的起点
        path2.quadTo(200, 450, 250, 420);
        canvas.drawPath(path2,p);

        canvas.drawText("图片",10,460,p);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.logo);
        canvas.drawBitmap(bitmap,10,500,p);












        //画笑脸弧线
//        p.setStyle(Paint.Style.STROKE);//设置空心
//        RectF oval1=new RectF(150,20,180,40);
//        canvas.drawArc(oval1, 180, 180, false, p);//小弧形
//        oval1.set(190, 20, 220, 40);
//        canvas.drawArc(oval1, 180, 180, false, p);//小弧形
//        oval1.set(160, 30, 210, 60);
//        canvas.drawArc(oval1, 0, 180, false, p);//小弧形
//
//        canvas.drawText("画矩形：", 10, 80, p);
//        p.setColor(Color.GRAY);// 设置灰色
//        p.setStyle(Paint.Style.FILL);//设置填满
//        canvas.drawRect(60, 60, 80, 80, p);// 正方形
//        canvas.drawRect(60, 90, 160, 100, p);// 长方形
//
//        canvas.drawText("画扇形和椭圆:", 10, 120, p);
//
//        Shader mShader = new LinearGradient(0, 0, 100, 100,
//                new int[] { Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW,
//                        Color.LTGRAY }, null, Shader.TileMode.REPEAT); // 一个材质,打造出一个线性梯度沿著一条线。
//        p.setShader(mShader);
//        // p.setColor(Color.BLUE);
//        RectF oval2 = new RectF(60, 100, 200, 240);// 设置个新的长方形，扫描测量
//        canvas.drawArc(oval2, 200, 130, true, p);
//        // 画弧，第一个参数是RectF：该类是第二个参数是角度的开始，第三个参数是多少度，第四个参数是真的时候画扇形，是假的时候画弧线
//        //画椭圆，把oval改一下
//        oval2.set(210,100,250,130);
//        canvas.drawOval(oval2, p);
//
//        canvas.drawText("画三角形：", 10, 200, p);
//        // 绘制这个三角形,你可以绘制任意多边形
//        Path path = new Path();
//        path.moveTo(80, 200);// 此点为多边形的起点
//        path.lineTo(120, 250);
//        path.lineTo(80, 250);
//        path.close(); // 使这些点构成封闭的多边形
//        canvas.drawPath(path, p);
//
//        // 你可以绘制很多任意多边形，比如下面画六连形
//        p.reset();//重置
//        p.setColor(Color.LTGRAY);
//        p.setStyle(Paint.Style.STROKE);//设置空心
//        Path path1=new Path();
//        path1.moveTo(180, 200);
//        path1.lineTo(200, 200);
//        path1.lineTo(210, 210);
//        path1.lineTo(200, 220);
//        path1.lineTo(180, 220);
//        path1.lineTo(170, 210);
//        path1.close();//封闭
//        canvas.drawPath(path1, p);
//
//
//        //画圆角矩形
//        p.setStyle(Paint.Style.FILL);//充满
//        p.setColor(Color.LTGRAY);
//        p.setAntiAlias(true);// 设置画笔的锯齿效果
//        canvas.drawText("画圆角矩形:", 10, 260, p);
//        RectF oval3 = new RectF(80, 260, 200, 300);// 设置个新的长方形
//        canvas.drawRoundRect(oval3, 20, 15, p);//第二个参数是x半径，第三个参数是y半径
//
//        //画贝塞尔曲线
//        canvas.drawText("画贝塞尔曲线:", 10, 310, p);
//        p.reset();
//        p.setStyle(Paint.Style.STROKE);
//        p.setColor(Color.GREEN);
//        Path path2=new Path();
//        path2.moveTo(100, 320);//设置Path的起点
//        path2.quadTo(150, 310, 170, 400); //设置贝塞尔曲线的控制点坐标和终点坐标
//        canvas.drawPath(path2, p);//画出贝塞尔曲线
//
//        //画点
//        p.setStyle(Paint.Style.FILL);
//        canvas.drawText("画点：", 10, 390, p);
//        canvas.drawPoint(60, 390, p);//画一个点
//        canvas.drawPoints(new float[]{60,400,65,400,70,400}, p);//画多个点

//        //画图片，就是贴图
//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher_foreground);
//        canvas.drawBitmap(bitmap, 250,360, p);
    }

//    private int measureWidth(int measureSpec){
//        int result = 0;
//        int specMode = MeasureSpec.getMode(measureSpec);    //模式
//        int specSize = MeasureSpec.getSize(measureSpec);    //尺寸
//        if(specMode == MeasureSpec.EXACTLY){
//            result = specSize;
//        }else {
//                result = 200;
//                if (specMode == MeasureSpec.AT_MOST){
//                        result = Math.min(result,specSize);
//                }
//        }
//        return result;
//    }
}
