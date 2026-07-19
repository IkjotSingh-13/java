public class varargs {
    public static void main(String[] args){
        // varargs(variable arguments) = allows a ethod to accept a varying number of arguments makes methods more flexible 
        //                               hence no need to overload methods java will pack the arguments into an array
        //                               ...(ellipsis)
     
        System.out.println(add(1,2,3));
        System.out.println(add(1,4,5,6,7,3,2));
    }
    static int add(int...numbers){              // numbers is name of the array
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum += numbers[i];
        }
        return sum;

    }
}
