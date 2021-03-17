package Pet;

public class Parrot {

    public String animal;
    public int age;
    public String characteristics;
    private String name;

    public Parrot(String animal, String name, int age, String characteristics) {
        this.animal = animal;
        this.name = name;
        this.age = age;
        this.characteristics = characteristics;
    }

    public String introduceParrot() {
        return "My pet is " + animal + " - His name is " + name + " and he is " + age + " years old." + "\nHe is " + characteristics + ".";

    }

    public String getName() {
        return name;
    }
}


