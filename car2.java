public class car2 {
    String name;
    String colour;

    car2(String name, String colour){
        this.name=name;
        this.colour=colour;
    }
    void drive(){
        System.out.println("You are driving a "+colour+" "+name);
    }
}
