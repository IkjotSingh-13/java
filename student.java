public class student {
    String name ="Ikjot singh";
    int age;
    double cgpa;
    boolean isEnrolled;

    student(String n, int b, double c){
        this.name = n;        // this keyword is very imp think of it as we are doing student1.name = name(parameter)
        this.age = b;
        this.cgpa = c;
    }
}
