import java.util.Scanner;
class WrongAge extends Exception{
    WrongAge(){
        super("Error Message");
    }
    WrongAge(String msg){
        super(msg);
    }
}
class inputScanner{
    Scanner s=new Scanner(System.in);;
}
class Father extends inputScanner{
    int fatherAge;
    Father() throws WrongAge{
        System.out.println("Enter father's age: ");
        fatherAge=s.nextInt();
        if(fatherAge<0)
           throw new WrongAge("Age cannot be negative");
    }
    public void display(){
        System.out.println("Father Age = "+fatherAge);
    }
}
class Son extends Father{
    int sonAge;
    Son() throws WrongAge{
        System.out.println("Enter son's age: ");
        sonAge=s.nextInt();
        if(sonAge>fatherAge){
            throw new WrongAge("Sons's age cannot be greater than father's age");
        }
        else if(sonAge<0){
            throw new WrongAge("Age cannot be negative");
        }
    }
    public void display(){
        System.out.println("Son's Age = "+sonAge);
    }
}
public class lab7 {
    public static void main(String[] args){
        try{
            Son s=new Son();
            s.display();
            Father f=new Father();
            f.display();
        }
        catch(WrongAge e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
