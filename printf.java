public class printf {
    public static void main(String[] args){
        // printf() = is a method used to format output 

        // %[flags][width][.precision][specifier-character]

       String name = "Ikjot";
       char firstLetter = 'I';
       int age = 19;
       double weight = 70.456;
       boolean isStudent = true;

       System.out.printf("Hello %s your first letter is %c and you are %d years old your weight is %.2f and you are a student %b\n\n", name,firstLetter,age,weight,isStudent);

       // + = output a plus
       // , = comma grouping separator
       // ( = negative number is enclosed in () 
       // space = display a minus if negative, space if positive

     double price1 = 9000.9;
     double price2 = 100000.15;
     double price3 =  -54000.01;

     System.out.printf("%+.2f\n",price1);
     System.out.printf("%+.2f\n",price2);
     System.out.printf("%+.2f\n\n",price3);

     System.out.printf("%,.2f\n",price1);
     System.out.printf("%,.2f\n",price2);
     System.out.printf("%,.2f\n\n",price3);

     System.out.printf("%(.2f\n",price1);
     System.out.printf("%(.2f\n",price2);
     System.out.printf("%(.2f\n\n",price3);

     System.out.printf("% .2f\n",price1);
     System.out.printf("% .2f\n",price2);
     System.out.printf("% .2f\n\n",price3);

     // 0 = Zero padding
     // number = right justified padding
     // negative number = left justified padding

     int id1 = 1;
     int id2 = 23;
     int id3 = 456;
     int id4 = 7890;

     System.out.printf("%04d\n",id1);
     System.out.printf("%04d\n",id2);
     System.out.printf("%04d\n",id3);
     System.out.printf("%04d\n\n",id4);

      System.out.printf("%4d\n",id1);
     System.out.printf("%4d\n",id2);
     System.out.printf("%4d\n",id3);
     System.out.printf("%4d\n\n",id4);

      System.out.printf("%-4d\n",id1);
     System.out.printf("%-4d\n",id2);
     System.out.printf("%-4d\n",id3);
     System.out.printf("%-4d\n\n",id4);

    }

    // note using %.1f automaticaly roundsoff and prints till 1 decimal place
    

}
