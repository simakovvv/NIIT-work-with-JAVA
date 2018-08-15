public class Triangle  {

    private Point v1;
    private Point v2;
    private Point v3;
    private double minLength, midLength, maxLength;

    public Triangle() {
    }

    public Triangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        getMinMax();
    }

    public double getPerimeter(){

        ///TODO Please use distance method from Point
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    private static double min(double a, double b) {
        if (a < b)
            return a;
        else
            return b;

    }

    private static double max(double a, double b) {
        if (a > b)
            return a;
        else
            return b;
    }


    public void getMinMax(){ //* This method determines which side is larger and which is smaller
        minLength = min(min(v1.distance(v2),v2.distance(v3)),v3.distance(v1));

        midLength = min(max(v1.distance(v2),v2.distance(v3)),v3.distance(v1));

        maxLength = max(max(v1.distance(v2),v2.distance(v3)),v3.distance(v1));
    }




    public TriangleType getTriangleType(){ //* triangle type definition
        ///TODO please try to use switch case statement
        int choise = 0;
        getMinMax();


        if (Math.pow(maxLength,2) == Math.pow(midLength,2)+ Math.pow(minLength,2))
        choise = 1;
        else if(Math.pow(maxLength,2) < Math.pow(midLength,2)+ Math.pow(minLength,2)){
            choise = 2;
        } else if(Math.pow(maxLength,2) > Math.pow(midLength,2)+ Math.pow(minLength,2)) {
            choise = 3;

        }


        switch (choise){
            case 1 : return TriangleType.RECTANGULAR;
            case 2 : return TriangleType.OUTSIDE;
            case 3 : return TriangleType.DENTISTRY;
            default: return TriangleType.DOESNOTEXIST;

        }



    }

    @Override
    public String toString() {
        return "Triangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 + "\n" +
                "minLength=" + minLength +
                ", midLength=" + midLength +
                ", maxLength=" + maxLength +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return  true;
        }

        if(obj instanceof Triangle) return false;

        Triangle triangle = (Triangle)obj;

        return v1.equals(triangle.v1) && v2.equals(triangle.v2) && v3.equals(triangle.v3);

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result + this.v1.hashCode();
        result = 31*result + this.v2.hashCode();
        result = 31*result + this.v3.hashCode();
        return result;

    }
}

