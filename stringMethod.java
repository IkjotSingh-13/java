public class stringMethod {
    public static void main(String[] args){

        String name ="Ikjot Singh";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("i");   // this is case sensitive  also returns -1 if char is absent 
        int lastIndex= name.lastIndexOf("n");  // indexOf gives first occurance and lastIndexOf gives the last occurance

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println();

        name = name.toUpperCase();  // all letters are  uppercase now
        System.out.println(name);

        name = name.toLowerCase(); // all are lower case now
        System.out.println(name);
        System.out.println();

        String name2 = "   Google   "; // this string has space at beginning and ending 
        System.out.println(name2);
        name2 = name2.trim(); // removes space at end and start
        System.out.println(name2);
       System.out.println();

       name2 = name2.replace("o","a" );
       System.out.println(name2); 
       System.out.println();

       System.out.println(name2.isEmpty()); // isEmpty() returns boolean to check is a string is empty or not 

       System.out.println(name.contains(" ")); // gives a boolean value if that string is present in the string or not 
       System.out.println();

       System.out.println(name.equals(name2)); // prints boolean value
       System.out.println(name.equals("ikjot singh")); // .equals() is case sensitive
       System.out.println(name.equalsIgnoreCase("Ikjot SINGH")); // ignores case
       System.out.println();


       // .substring()= A method used to extract a portion of a string
      //                string.substring(start,end) where end is exclusive and start in inclusive 

      String brother = "Manmohit";
      System.out.println(brother.substring(1,3));



    }
}
