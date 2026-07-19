import java.util.Random;  // import this 

public class random {
    public static void main(String[] args){
     
    Random random=new Random();

    int number;
    int dice;
    number = random.nextInt();  // generates a random number which ranges between -2 billion and +2 billion
    dice =  random.nextInt(1,6);  // gives a random number between 1 and 6 where 1 is inclusive and 6 is exclusive
    System.out.println(dice);
    System.out.println(number);
    }

    // you can also generate random double use nextDouble()
    // you also can generate random boolean use nextBoolean()
}
