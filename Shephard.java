public class Shephard extends Dog {
    private String myCondition;
    private final String BREED = "German Shephard";

    public Shephard() {
        this("Unknown", -1, -1, "unknown");
    }

    // name, weight, age, condition
    public Shephard(String n, int w, int a, String c) {
        super(n, w, a);
        myCondition = c;
    }

    public String toString(){
        return super.toString() + "Breed: " + BREED + "\nCondition: " + myCondition+"\n";
    }


}
