package AnimalProj;

public class Animal {
    private String name;
    private double weight;
    public boolean fur;
    public String sound;
    public boolean warmOrCOld;


    public Animal (String name, boolean warmOrCOld, boolean fur, String sound, double weight ) {

        this.name = name;
        this.weight = weight;
        this.fur = fur;
        this.sound = sound;
        this.warmOrCOld = warmOrCOld;
    }

    public Animal(){
        this.name = "Tom";
        this.weight = 5.7;
        this.fur = true;
        this.sound = "meow";
        this.warmOrCOld = true;
    }

    public String MakeASound () {
        return " makes this sound "+ sound;
    }
    public String isWarmOrCOld () {
        String result = warmOrCOld ? name + " is warm blooded" : name + " is cold blooded";

        return result;
    }

    public String isFurOrNot () {
        String result = fur ?  name + " does not have fur" : name + " does not have fur";

        return result;
    }

    public String getAnimalInfo () {
        return name+ " weight is " + weight + "and "+ this.MakeASound();
    }
}