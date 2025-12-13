import java.util.Scanner;
class InputScanner{
    Scanner s=new Scanner(System.in);
}
abstract class Shape extends InputScanner{
    int a,b;
    abstract void printArea();
}
class Rectangle extends Shape{
    void input(){
        System.out.println("Enter length and breadth of rectangle: ");
        a=s.nextInt();
        b=s.nextInt();
    }
    void printArea(){
        System.out.println("Area = "+(a*b));
    }
}
class Triangle extends Shape{
    void input(){
        System.out.println("Enter base and height of triangle: ");
        a=s.nextInt();
        b=s.nextInt();
    }
    void printArea(){
        System.out.println("Area = "+(0.5*a*b));
    }
}
class Circle extends Shape{
    void input(){
        System.out.println("Enter radius of circle: ");
        a=s.nextInt();
    }
    void printArea(){
        System.out.println("Area = "+(3.14*a*a));
    }
}
public class Lab4 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        Circle c=new Circle();
        r.input();
        r.printArea();
        t.input();
        t.printArea();
        c.input();
        c.printArea();
    }
}
