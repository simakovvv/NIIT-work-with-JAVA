package com.nt.points;

public class Point3d extends Point2d {
    private  float z = 0.0f;

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }


    @Override
    public  double getDistance(float[] f) {
        return Math.sqrt(Math.pow(super.getX()-f[0],2)+ Math.pow(super.getY() - f[1],2)
                + Math.pow(this.z - f[2],2));
    }
    /*public Point3d(){

    }*/

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

 public float[] getXYZ(){
        return new float[]{super.getX(), super.getY(), getZ()};
 }

    @Override
    public String toString() {
        return "Point3d{" +
                "z=" + z +
                '}';
    }
}
