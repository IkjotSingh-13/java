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


// | Function          | Syntax                                    | Purpose                                          |
// | ----------------- | ----------------------------------------- | ------------------------------------------------ |
// | Sort              | `Arrays.sort(arr);`                       | Sorts array in ascending order                   |
// | Sort (range)      | `Arrays.sort(arr, from, to);`             | Sorts from index `from` to `to-1`                |
// | Binary Search     | `Arrays.binarySearch(arr, key);`          | Returns index if found, otherwise negative value |
// | Fill              | `Arrays.fill(arr, value);`                | Fills entire array with one value                |
// | Fill (range)      | `Arrays.fill(arr, from, to, value);`      | Fills part of array                              |
// | Copy Array        | `Arrays.copyOf(arr, newLength);`          | Returns a copied array                           |
// | Copy Range        | `Arrays.copyOfRange(arr, from, to);`      | Copies a specific range                          |
// | Compare Arrays    | `Arrays.equals(arr1, arr2);`              | Returns `true` if equal                          |
// | Deep Compare      | `Arrays.deepEquals(arr1, arr2);`          | Compares nested arrays                           |
// | Convert to String | `Arrays.toString(arr);`                   | Prints array nicely                              |
// | Deep String       | `Arrays.deepToString(arr);`               | Prints 2D or nested arrays                       |
// | Hash Code         | `Arrays.hashCode(arr);`                   | Hash code of array                               |
// | Deep Hash Code    | `Arrays.deepHashCode(arr);`               | Hash code for nested arrays                      |
// | Mismatch          | `Arrays.mismatch(arr1, arr2);`            | Returns first differing index                    |
// | Set All           | `Arrays.setAll(arr, i -> value);`         | Assign values using lambda                       |
// | Parallel Set All  | `Arrays.parallelSetAll(arr, i -> value);` | Multi-threaded version                           |
// | Parallel Sort     | `Arrays.parallelSort(arr);`               | Faster sort for large arrays                     |

