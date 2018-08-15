public class TriangularTest {
    public static void main(String[] args) {
        Point a = new Point(1,1);
        Point b = new Point(2,2);
        Point c = new Point(3,1);
        Triangle myTriangle = new Triangle(a,b,c);
        Triangle myTriangle1 = new Triangle(a,b,c);

        System.out.println( myTriangle.toString() ); //* Here we will see the initial data of our triangle
        System.out.println("Рerimeter of a triangle: " + myTriangle.getPerimeter());
        System.out.println("the type of triangle :" + myTriangle.getTriangleType());

        System.out.println(myTriangle == myTriangle1);
        System.out.println(myTriangle.equals(myTriangle1));

        System.out.println(myTriangle.hashCode());
        System.out.println(myTriangle1.hashCode());

        System.out.println("TriangularTest.main");
    }
}
