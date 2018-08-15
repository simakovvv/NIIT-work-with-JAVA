public class Point {
    private int x;
    private int y;

    public double distance(int x, int y){
        return Math.sqrt(Math.pow(this.x-x,2)+ Math.pow(this.y-y,2));
    }
    public  double distance(Point anotherPoint){ //* determination of distance between points
        return Math.sqrt(Math.pow(anotherPoint.getX() - this.getX(),2)
                + Math.pow(anotherPoint.getY() - this.getY(),2));
    }

    public double distance(){
        return Math.sqrt(Math.pow(this.x,2)+ Math.pow(this.y,2));
    }

    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {

        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(!(obj instanceof Point)){
            return false;
        }
        Point point = (Point)obj;

        return this.x == point.getX() && this.y == point.getY();
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result+ this.getX();
        result = 31* result + this.getY();
        return result;


    }
}
