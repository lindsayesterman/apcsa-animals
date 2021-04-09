public class Main {
    public static void main(String[] args){
        Animal a = new Animal("Spot", 50, 10);

        Dog d1 = new Dog("Buddy", 60, 12);
        Animal d2 = new Dog("Duke", 40, 5);
        
        Shephard s1 = new Shephard("Sparky", 65, 3, "Allergies");
        Animal s2 = new Shephard ("Rover", 100, 3, "Diabetes");

        //actions for dog1
        System.out.println(d1);
        d1.speak();
        d1.move();
        d1.move();
        d1.eat();
        System.out.println(d1.getName() + " weighs " + d1.getWeight());

        //actions for dog2
        System.out.println(d2);
        d2.speak();
        int loop = (int)(Math.random()*4+1);
        for (int i = 0; i < loop; i++){
            d2.move();
        }
        d2.eat();
        System.out.println(d2.getName() + " weighs " + d2.getWeight());

        //Shephards

        System.out.println(s1);
        s1.speak();
        s1.move();
        s1.move();
        s1.eat();
        System.out.println(s1.getName() + " weighs " + s1.getWeight());        

        System.out.println(s2);
        s2.speak();
        s2.move();
        s2.move();
        s2.eat();
        System.out.println(s2.getName() + " weighs " + s2.getWeight());        
    }
}
