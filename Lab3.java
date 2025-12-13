import java.util.Scanner;
class Books{
    String name,author;
    int price, numPages;
    Books(String name,String author,int price,int numPages){
        this.name=name;
        this.author=author;
        this.price=price;
        this.numPages=numPages;
    }
    public String toString(){
       String name,author,price,numPages;
       name="Book name: "+this.name+"\n";
       author="Author name: "+this.author+"\n";
       price="Price: "+this.price+"\n";
       numPages="Number of pages: "+this.numPages+"\n";
       return name+author+price+numPages;
}
}
public class Lab3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,price,numPages;
        String name,author;
        System.out.print("Enter number of books: ");
        n=s.nextInt();
        Books b[];
        b=new Books[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter book name for book "+(i+1)+": ");
            name=s.next();
            System.out.print("Enter author name for book "+(i+1)+": ");
            author=s.next();
            System.out.print("Enter price for book "+(i+1)+": ");
            price=s.nextInt();
            System.out.print("Enter no. of pages of book "+(i+1)+": ");
            numPages=s.nextInt();
            b[i]=new Books(name,author,price,numPages);
        }
        for(int i=0;i<n;i++){
            System.out.println(b[i]);
        }
    }
}
