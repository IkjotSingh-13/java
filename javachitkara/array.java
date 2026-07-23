
import java.util.*;
public class array {
    public static void main(String[] args){
        Scanner ab = new Scanner(System.in);

        int n =ab.nextInt();
        int arr[]= new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=ab.nextInt();
        }
        int target = ab.nextInt();
        int i=0;

        for(i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println(i);
                break;
            }
        }

        if(i==n)
            System.out.println(-1);

        ab.close();
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

