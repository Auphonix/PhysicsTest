package Animals;

/**
 * Created by Danyon on 6/06/2016.
 */
public class Main {
    public static void main(String[] args) {

        Cat myCat = new Cat();
        Dog myDog = new Dog();

        myCat.setName("PUSSCAT");
        myDog.setName("WOOFDOG");

        System.out.println("Your name is: " + myCat.getName());
        System.out.println("Your Dog's Name is: " + myDog.getName());
    }
}
