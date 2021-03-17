import Pet.Cat;
import Pet.Dog;
import Pet.Parrot;

public class Main {

    public static void main(String[] args) {

        Dog tiana = new Dog();
        tiana.animal = "dog";
        tiana.age = 3;
        tiana.color = "white";
        tiana.weight = 4;
        tiana.setName("Tiana");

        Cat tutu = new Cat("Cat", "Tutu", 2, "black", 5f);

        Parrot diegs = new Parrot("parrot", "Diegs", 3, "loud");

        System.out.println(tiana.introduceDog());
        System.out.println(tutu.introduceCat());
        System.out.println(diegs.introduceParrot());
    }

}


