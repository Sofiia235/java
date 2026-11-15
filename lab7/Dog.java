// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Nov-2026
// Purpose 			: 

public class Dog extends Animal 
{

	   // Constructors
	   public Dog(String type, int age, char gender) 
	   {
	      super(type, age, gender);
	   }
	   
	   @Override
	   public void eat() 
	   {
	      System.out.println("Dog is eating");
	   }

	   @Override
	   public void sleep() 
	   {
	      System.out.println("Dog is sleeping");
	   }

	   @Override
	   public void makeSound() 
	   {
	      System.out.println("woof woof");
	   }

}