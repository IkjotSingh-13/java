public class arrayOfObject {
    // visit car2.java

    public static void main(String[] args){
        car2 car1 = new car2("creta","pink" );
        car2 car2 = new car2("creta","pink" );
        car2 car3 = new car2("mustang", "red"); 

        car2[] cars = new car2[3];  // or you could have just car2 [] cars = new car2[car1,car2,car3]

        // or you could have 

        // car2[] cars = {new car2("creta","pink" ),new car2("creta","pink" ),new car2("mustang", "red")};

       cars[0]=car1;
       cars[1]= car2;
       cars[2]= car3;

       for(int i =0;i<cars.length;i++){         
        cars[i].drive();
       }
        //   or you could have for(car2 car:cars){
        //          car.drive();
        //                  }
 

    }
}
