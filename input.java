import java.util.Scanner;

public class input {
    public static void main(String[] args){
     Scanner scanner= new Scanner(System.in);

     System.out.println("Enter your name");
     String name = scanner.nextLine();

     System.out.println("Enter your age");
     int age=scanner.nextInt();

     System.out.println("What is your sgpa and your unoversity name");
     float marks=scanner.nextFloat();
     scanner.nextLine();   // used to solve input buffer
     String uni =scanner.nextLine();



     System.out.println("Your name is "+name+" your age is "+age+"\nYour sgpa is "+marks+" "+uni);
     scanner.close();
    }
}
