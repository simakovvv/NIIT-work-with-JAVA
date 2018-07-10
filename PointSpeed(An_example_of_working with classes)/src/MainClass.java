public class MainClass {
    public static void main(String[] args) {

        MovablePoint movablePoint = new MovablePoint();//*Created an instance of the class

        System.out.println(movablePoint.toString());

        movablePoint.setXY(2, 2);//*Set the starting point

        movablePoint.setSpeed(3,3);//* Set the speed of the point

        System.out.println(movablePoint.toString());

        movablePoint.getSpeed(movablePoint.speedXY);//*got the speed in the array

        System.out.println(movablePoint.toString());

        movablePoint.move(); //*moved the point and cleared the array of speed

        System.out.println(movablePoint.toString());



    }
}
