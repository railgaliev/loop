import java.util.Scanner;

public class program6_theme5_a {
    public static void main(String[] args) {

        Person tom = new Person();
        Person bob = new Person();

        tom.displayId();    // Id = 105
        bob.displayId();    // Id = 106
    }
}
class Person{

    private int id;
    static int counter;

    static{
        counter = 105;
        System.out.println("Static initializer");
    }
    Person(){
        id=counter++;
        System.out.println("Constructor");
        System.out.printf("Id: %d \n", id);
    }
    public void displayId(){

        System.out.printf("Id: %d \n", id);
    }
}
