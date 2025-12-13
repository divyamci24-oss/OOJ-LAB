import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        int a,b,c;
        double r1,r2;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of a, b and c");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if (a==0) {
            System.out.println("Not a quadratic equation. Enter a non-zero value for a: ");
            a=in.nextInt();
        }
        float d=(b*b)-(4*a*c);
        if (d==0){
            r1=(-b)/(2*a);
            System.out.println("Roots are real and equal");
            System.out.println("Root 1 = "+r1+" Root 2 = "+r1);
        }
        else if(d>0){
            r1=((-b)+(Math.sqrt(d)))/(double)(2*a);
            r2=((-b)-(Math.sqrt(d)))/(double)(2*a);
            System.out.println("Roots are real and distinct");
            System.out.println("Root 1 = "+r1+" Root 2 = "+r2);
        }
        else{
            r1=(-b)/(2*a);
            r2=Math.sqrt(-d)/(2*a);
            System.out.println("Roots are imaginary");
            System.out.println("Root 1 = "+r1+"+"+r2+"i");
            System.out.println("Root 2 = "+r1+"-"+r2+"i");
        }
    }
}
