class BMS extends Thread{
    public void run(){
        try{
            for(int i=1;i<=5;i++){
            System.out.println("BMS college of Engineering: "+i);
            Thread.sleep(10000);
            }
        }
        catch(InterruptedException ie){
            System.out.println("BMS Thread quitting");
        }
    }
}
class CSE extends Thread{
    public void run(){
        try{
            for(int i=1;i<=5;i++){
            System.out.println("CSE: "+i);
            Thread.sleep(2000);
            }
        }
        catch(InterruptedException ie){
            System.out.println("CSE Thread quitting");
        }
    }
}
public class Lab8 {
    public static void main(String args[]) {
        BMS b=new BMS();
        CSE c=new CSE();
        b.start();
        c.start();
    }
}
