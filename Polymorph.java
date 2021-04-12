// Code that goes along with 9.6 Polymorphism slides

public class Polymorph {

  public static void main(String[] args) {

    // slide 5 - Coding with polymorphism
    Employee ed = new Lawyer();
    System.out.println(ed.getSalary());
    System.out.println(ed.getVacationForm());
    System.out.println();

    // slide 6 - Polymorphism and parameters
    Employee steve = new Employee();
    Lawyer sarah = new Lawyer();
    printInfo(steve);
    printInfo(sarah);

    // slide 7 - Polymorphism and arrays
    Employee[] e = { new Employee(), new Lawyer(), new Secretary(), new LegalSecretary() };
    for (int i = 0; i < e.length; i++) {
      System.out.println("salary: " + e[i].getSalary());
      System.out.println("forms: " + e[i].getVacationForm());
      System.out.println();
    }

    // slide 8 - Casting references
    double salary = ed.getSalary(); // ok; it's in Employee
    // ed.sue(); // compiler error

    // to use Lawyer methods on ed, we have to type-cast it
    Lawyer theRealEd = (Lawyer) ed;
    theRealEd.sue(); // ok

    ((Lawyer) ed).sue();// shorter version, two sets of()

    // slide 9 - More about casting
    Employee eric = new Secretary();
    ((Secretary) eric).takeDictation("hi"); // ok

    // the next line causes a class cast exception since Secretary doesn't know to
    // file briefs
    // ((LegalSecretary) eric).fileLegalBriefs();

    // You can cast only up and down the tree, not sideways.
    Lawyer linda = new Lawyer(); 
    // ((Secretary) linda).takeDictation("hi"); // incompatible types error

    String form = ((Employee) linda).getVacationForm();
    System.out.println("Linda's vacation form: " + form); // yellow (Lawyer's)

  }

  public static void printInfo(Employee empl) {
    System.out.println("salary: " + empl.getSalary());
    System.out.println("v.form: " + empl.getVacationForm());
    System.out.println();
  }
} // end Polymorph class

class Employee {
  public double getSalary() {
    return 50000.0;
  }

  public String getVacationForm() {
    return "pink";
  }
}

class Lawyer extends Employee {
  public double getSalary() {
    return 60000.0;
  }

  public String getVacationForm() {
    return "yellow";
  }

  public void sue() {
    System.out.println("I will see you in court!");
  }
}

class Secretary extends Employee {

  public void takeDictation(String str) {
    System.out.println("Write the following...");
  }
}

class LegalSecretary extends Secretary {

  public void fileLegalBriefs() {
    System.out.println("File these in section...");
  }
}