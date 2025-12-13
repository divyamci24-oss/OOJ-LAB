import java.util.Scanner;
class Subject{
    int subjectMarks;
    int credits;
    int grade;
}
class Student{
    String name,usn;
    double sgpa;
    Scanner s;
    Subject[] subject;
    Student(){
        s=new Scanner(System.in);
        subject=new Subject[8];
        for(int i=0;i<subject.length;i++)
          subject[i]=new Subject();
    }
    void getStudentDetails(){
        System.out.println("Enter student name: ");
        name=s.nextLine();
        System.out.println("Enter USN: ");
        usn=s.nextLine();
    }
    void getMarks(){
        for(int i=0;i<subject.length;i++){
            while(true){
                System.out.print("Enter marks for subject "+(i+1)+" : ");
                subject[i].subjectMarks=s.nextInt();
                if(subject[i].subjectMarks>=0 && subject[i].subjectMarks<=100){
                   break;
                }
                System.out.println("Invalid Marks");
        }
            System.out.print("Enter credits for subject "+(i+1)+" : ");
            subject[i].credits=s.nextInt();
            subject[i].grade = (subject[i].subjectMarks/10) + 1;
            if(subject[i].grade==1) subject[i].grade=10;
            if(subject[i].grade<=4) subject[i].grade=0;
        }
    }
    void computeSGPA(){
        int effectiveScore=0,totalCredits=0;
        for(int i=0;i<subject.length;i++){
            effectiveScore+=(subject[i].grade*subject[i].credits);
            totalCredits+=subject[i].credits;
            sgpa=(double)effectiveScore/(double)totalCredits;
        }
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("USN: "+usn);
        System.out.println("SGPA: "+sgpa);
    }
}
public class Lab2 {
    public static void main(String[] args) {
        Student stud=new Student();
        stud.getStudentDetails();;
        stud.getMarks();
        stud.computeSGPA();
        stud.display();
    }
}
