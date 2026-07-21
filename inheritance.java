public class inheritance {


    //visit animal.java and dog.java and cat.java

    public static void main(String[] args){

      //  inheritance = one class inherits the attributes and methods from another class
                        // child <- parent
    // our animal class is parent  and dog and cat are child class

    dog germanshephard = new dog();
    cat billo  = new cat();

    System.out.println(germanshephard.isAlive);
    System.out.println(billo.isAlive);

  germanshephard.eat();
  billo.eat();
    }

}


