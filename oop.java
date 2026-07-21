public class oop {
    // visit car.java made a class there
    public static void main(String[] args){
        // Object = An entity that holds data (attributes) and can perform actions (methods)
        //          it is a reference data type 

        car name = new car(); // name is a object to class car in this example
        System.out.println(name);  // object is a refrence  datatype hence prints a memory address
        System.out.println(name.modelYear);
        System.out.println();

        name.start();
        name.stop();

    }
}
// the problem we face is no matter how many times we call name.name it remains mustang so we use constructors