package Pet;

public class Dog {
    public String animal;
    public int age;
    public String color;
    public float weight;
    private String name;

    public String introduceDog() {
        return "My pet is " + animal + " - Her name is " + name + " and she is " + age + " months old." + "\nShe is " + color + " and she weights " + weight + " kg.";

    }

    public void setName(String nameToSet) {
        name = nameToSet;
    }
}

