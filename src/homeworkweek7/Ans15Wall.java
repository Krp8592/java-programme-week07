package homeworkweek7;

/**
 * Write a class with the name Wall. The class needs two fields (instance variables) with name width
 * and height of type double.
 */

public class Ans15Wall {
    //Define global variable.
    double width,height;

    /**
     * Create a main method with call variable
     * and set value of height.
     */
    public static void main(String[] args)
    {
        Ans15Wall ans15Wall = new Ans15Wall(5,4);
        System.out.println("area= " + ans15Wall.getArea());
        ans15Wall.setHeight(-1.5);
        System.out.println("width= " + ans15Wall.getWidth());
        System.out.println("height= " + ans15Wall.getHeight());
        System.out.println("area= " + ans15Wall.getArea());
    }
  //Create an instance method with params
    public Ans15Wall(double width, double height) {
        if (width < 0) {
            width = 0;
        } else if (height < 0) {
            height = 0;
        } else {
            this.width = width;
            this.height = height;
        }
    }
    //Create a method with return type
    public double getWidth(){
        return width;
    }
    //Create a method with return type
    public double getHeight()
    {
        return height;
    }
    //create an instance method
    public void setWidth(double width)
    {
        if (width<0)
        {
            width=0;
        }
        this.width = width;
    }
    //create an instance method with params.
    public void setHeight(double height)
    {
        if (height<0)
        {
            height=0;
        }
        this.height = height;
    }
    //create a method with return type.
    public double getArea()
    {
        double area = height*width;
        return area;
    }

}
