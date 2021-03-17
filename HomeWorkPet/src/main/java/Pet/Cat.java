package Pet;

public class Cat {
    public String animal;
    public String name;
    public int age;
    public String color;
    public float weight;


    public Cat(String animal, String name, int age, String color, float weight) {
        this.animal = animal;
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }


    public String introduceCat() {
        return "My pet is " + animal + " - Her name is " + name + " and she is " + age + " years old." + "\nShe is " + color + " and she weights " + weight + " kg.";


    }
}


