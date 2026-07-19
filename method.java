public class method {
    public static void main(String[] args){
        // method = a block of reusable code that is executed when called()
        int age=19;
      happyBirthday(age);
      happyBirthday(age);

      System.out.println(add(3,4));
      System.out.println(add(2,3,4));
    }
    static void happyBirthday(int age){                    // we use static because this method is being called froma method that is static
        System.out.println("Happy Birthday to you");
        System.out.println("you are "+age+" years old\n");
    }

    // overloaded method = methods that share the same name,but different parameters
    //                      signature= name + parameters


    static double add(double a , double b){
        return a+b;
    }
    static double add(double a , double b,double c){
        return a+b+c;
    }
}

// methods are unaware of variables in other methods 
