package Maths;
public class Number{
    int sum;
    int diff;
    double div;
    int mul;
    public void add(int a,int b){
        sum=a+b;
        System.out.println("Sum: "+a+"+"+b+" = "+sum);
    }
    public void subtract(int a,int b){
        diff=a-b;
        System.out.println("Difference: "+a+"-"+b+" = "+diff);
    }
    public void divide(int a,int b){
        double div=(double)a/b;
        System.out.println("Division: "+a+"/"+b+" = "+div);
    }
    public void multiply(int a,int b){
        int mul=a*b;
        System.out.println("Multiplication: "+a+"*"+b+" = "+mul);
    }
}
