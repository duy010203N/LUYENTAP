package Baitap;
public class Shape {
    public String color = "red";
    public String filled = "true";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", filled=" + filled + '}';
    }
    

}
class clrole extends Shape
{
    public double radius =1.0;
    public Cirole(){}
    public Cirole(double radius)
    {
        this.radius = radius;
    }
    public Cirole(String color, boolean filled, double radius)
    {
        supper(color, filled);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea()
    {
        return 0;
    }
    public double getPerimeter()
    {
        return 0;
    }

    @Override
    public String toString() {
        return "clrole{" + "radius=" + radius + '}';
    }
    
}
