package Animals;

/**
 * Created by Danyon on 6/06/2016.
 */
public class Animal {
    private String type;
    private int numLegs;
    private String name;

    //Default Constructor
    public Animal(String type, int numLegs){
        this.type = type;
        this.numLegs = numLegs;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        System.out.println("Printing name for " + this.type);
        return this.name;
    }
}
