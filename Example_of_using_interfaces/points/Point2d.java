package com.nt.points;

import com.nt.IDistance;

public class Point2d implements IDistance {
    private float x = 0.0f;
    private float y = 0.0f;


    @Override
        public  double getDistance(float []f){
        return Math.sqrt(Math.pow(this.x-f[0],2)+ Math.pow(this.y - f[1],2));


    }
    public float[] getXY(){
        float masXY[] = new float[2];
        masXY[0]=this.x;
        masXY[1]=this.y;
        return masXY;
    }

    public void  setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

     public String toString(){
        return "("+x+", "+y+") ";
    }

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }


}
