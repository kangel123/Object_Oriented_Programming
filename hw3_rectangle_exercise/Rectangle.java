/*
 * Q: Write Rectangle class that implements the following features:
 *
 * 1. Make RectangleRunner.java run with Rectangle class that you design
 *      in Rectangle.java
 *      a. First of all, take a look at output_RectangleRunner.txt and
 *          plan to make RectangleRunner.class generate the desired output
 *      b. No need to modify RectangleRunner.java. Only write code lines
 *          in Rectangle.java
 *      c. Start by modifying the template in this file (Rectangle.java)
 * 2. In particular, design Rectangle class applying the object design technique
 *      of ADT (Abstract Data Type)
 *      a. instance variables declared as private
 *      b. constructors with width and height variables as initial input parameters
 *      c. methods: calculateArea(), print(), resize()
 *      d. setters and getters for the instance variables
 */

public class Rectangle
{
    /* instance variables go here (width and height) */
    private double width;
    private double height;
    /* Constructors */
    public Rectangle(double w, double h){
        width=w;
        height=h;
    }

    public double calculateArea(){
        return width*height;
    }

    public void print(){
        int i, j;
        System.out.println(width+" X "+height);
        for(j=0;j<height;j++){
            for(i=0;i<width;i++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public void resize(double w,double h){
        setWidth(w);
        setHeight(h);
    }
    /* Methods: calculateArea(), print(), resize() */

    /* Setters and getters */
    public void setWidth(double updateWidth){
        width=updateWidth;
    }

    public void setHeight(double updateHeight){
        height=updateHeight;
    }

    public int getsWidth(){
        return width;
    }

    public int getsHeight(){
        return height;
    }
}
