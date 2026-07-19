import java.util.Arrays;  
import java.util.Scanner;
public class array {
    public static void main(String[] args){
        // array = a collection of values of the same data type
        String[] fruit={"apple","mango","cherry","orange","melon"};

        System.out.println(fruit); // array is a refrence datatype soo when we print this this return the memory address 
        System.out.println(fruit[0]);
        fruit[0]="Pineapple";
        System.out.println(fruit[0]);
        int numOfFruits=fruit.length;
        System.out.println(numOfFruits);
        System.out.println();

        //below is a enhanced forloop
     Arrays.sort(fruit);       // to use .sort import java.util.Arrays
        for(String x : fruit){
            System.out.println(x);
        }
      //sorts strings in lexicographical (dictionary) order based on Unicode values thats why pineapple comes first as unicode of 
      // uppercase pineapple is 80 lower then others 
      System.out.println();
      Arrays.fill(fruit,"banana");   // all values will now be banana
      for(String y:fruit){
        System.out.println(y);
      }
      System.out.println();




      // taking array input below


     Scanner input = new Scanner(System.in);
      int[] number = new int[5];

      for(int i=0;i<5;i++){
        System.out.print("Enter the numbers");
        number[i]=input.nextInt();
      }
      for(int x:number){
        System.out.print(" "+x);
      }
input.close();
    }
}
