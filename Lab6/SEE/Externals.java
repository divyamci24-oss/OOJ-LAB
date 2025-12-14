package SEE;
import CIE.Internals;
import java.util.Scanner;
public class Externals extends Internals{
    protected int seeMarks[]=new int[5];
    protected int finalMarks[]=new int[5];
    public void inputSEEmarks(){
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Enter SEE marks for subject "+(i+1)+": ");
            seeMarks[i]=s.nextInt();
        }
    }
    public void calculateFinalMarks(){
        for(int i=0;i<5;i++){
            finalMarks[i]=seeMarks[i]+cieMarks[i];
        }
    }
    public void displayFinalMarks(){
        System.out.println("---Final Marks---");
        for(int i=0;i<5;i++){
            System.out.println("Subject "+(i+1)+": "+finalMarks[i]);
        }
    }
}
