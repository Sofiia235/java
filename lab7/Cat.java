// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Nov-2026
// Purpose 			: 

public class Cat extends Animal 
{

	   // Constructors
	   public Cat(String type, int age, char gender) 
	   {
	      super(type, age, gender);
	   }
	   
	   @Override
	   public void eat() 
	   {
	      System.out.println("Cat is eating");
	   }

	   @Override
	   public void sleep() 
	   {
	      System.out.println("Cat is sleeping");
	   }

	   @Override
	   public void makeSound() 
	   {
	      System.out.println("prrrr");
	   }

}