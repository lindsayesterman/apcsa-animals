import java.util.ArrayList;

public class MainList {
    public static void main(String[] args) {
        ArrayList<Animal> petList = new ArrayList<Animal>();

        petList.add(new Animal("Spot", 50, 10));
        petList.add(new Dog("Buddy", 60, 12));
        petList.add(new Dog("Duke", 40, 5));
        petList.add(new Shephard("Sparky", 65, 3, "Allergies"));

        for (Animal a : petList){
            System.out.println(a);
            a.speak();
            int loop = (int)(Math.random()*4+1);
            for (int i = 0; i < loop; i++){
                a.move();
            }
            a.eat();
            System.out.println(a.getName()+" weighs " + a.getWeight());
        }
    }
}