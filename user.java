public class user {
    // very similar to method overloading 
    String userName;
    String email;
    int age;

    user(String username){
        this.userName = username;

        // below is default assignment 
        this.email = "Not given";
        this.age=0;
    }


    user(){ // a constructor that takes no argument
  this.userName="Guest";
  this.email="Not provided";
  this.age=0;
    }

    user(String username, String email){
    this.userName=username;
    this.email=email;
    this.age=0;
    }
}
