public class Animal
{
   // instance variables
   private String myName;
   private int myWeight;
   private int myAge;
      
   // constructors
   public Animal()
   {
      this("none", -1, -1);
   }
   
   public Animal( String n, int w, int a )
   {
      myName = n;
      myWeight = w;
      myAge = a;  
   }

   // getters   
   public String getName() {return myName;}
   public int getWeight() {return myWeight;}
   public int getAge(){return myAge;}
   
   // setters   
   public void setName(String n) {myName = n;}
   public void setWeight(int w) {myWeight = w;}
   public void setAge(int a){myAge = a;}

   // methods defining animal behaviors   
   public void speak()
   {
      System.out.println(myName+" says noise\n");
   }
   
   public void move()
   {
      System.out.println("moving..");
      myWeight--;
   }
   
   public void eat()
   {
      System.out.println("eating..");
      myWeight++;
   }

   // display format   
   public String toString()
   {
      return "\nName: "+myName+"\nWeight: "+myWeight+"\nAge: "+myAge+"\n";
   }
}