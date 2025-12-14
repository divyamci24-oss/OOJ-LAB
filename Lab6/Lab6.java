import SEE.Externals;
import java.util.Scanner;
public class Lab6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of students: ");
        int n=s.nextInt();
        Externals[] students=new Externals[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter details of student "+(i+1)+": ");
            students[i]=new Externals();
            students[i].inputStudentDetails();
            students[i].inputCIEmarks();
            students[i].inputSEEmarks();
            students[i].calculateFinalMarks();
        }
        for(int i=0;i<n;i++){
            System.out.println("\nStudent "+(i+1));
            students[i].displayFinalMarks();
        }
    }
}
