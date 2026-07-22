public class person {
    
    String firstName;
    String lastName;

    person(String first, String last){
        this.firstName = first;
        this.lastName = last;
    }

    void showName(){
      System.out.println(this.firstName+" "+this.lastName);
    }
}
