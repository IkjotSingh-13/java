
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
