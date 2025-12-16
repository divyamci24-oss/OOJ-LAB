import Maths.Number;
import java.util.Scanner;
public class Mathsdemo{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Number n=new Number();
        String op;
        System.out.println("Enter two numbers: ");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("Enter operation: ");
        op=s.next();
        switch(op){
            case "+":
                n.add(a,b);
                break;
            case "-":
                n.subtract(a,b);
                break;
            case "/":
                n.divide(a,b);
                break;
            case "*":
                n.multiply(a,b);
                break;
            default: System.out.println("Invalid choice");
        }
    }
}
