public class Dog extends Animal
{
   private static int dogID=100; 
   private int myID;
   
   public Dog()
   {
      this("Unknown", -1, -1);
   }
   
   public Dog(String n, int w, int a)
   {
      super(n, w, a);
      dogID++;
      myID=dogID;
   }

   public void speak()
   {
      System.out.println(getName()+" barks\n");
   }
   
   public void eat()
   {
      System.out.println("eating..");
      System.out.println("eating..");
      int w = getWeight()+2; 
      setWeight(w);
   }   
   
   public String toString()
   {
      return super.toString()+"ID: "+myID+"\n" ;
   }
}