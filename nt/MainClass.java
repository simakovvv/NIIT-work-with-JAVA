package com.nt;

import com.nt.points.*;


public class MainClass {
    public static void main(String[] args) {
       
        IDistance myIDistance2d = new Point2d(2,2); //* The first point 2d of the plane
        IDistance myIDistance2dnew = new Point2d(1,1); //* The second point 2d of the plane

        IDistance myIDistance3d = new Point3d(1,1,1);//* The first point 3d of the plane
        IDistance myIDistance3dnew = new Point3d(2,2,2);//* The second point 2d of the plane

        System.out.println(myIDistance2d.getDistance(((Point2d) myIDistance2dnew).getXY()));
        //*Through the method of the first point to "getDistance" - get a distance, we pass
        // the method of the second point to "getXY'Z()" - obtain an array of coordinates
        System.out.println(myIDistance3d.getDistance(((Point3d) myIDistance3dnew).getXYZ()));


    }
}
