// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Nov-2026
// Purpose 			: 

public class Animal 
{
	   // Variables
	   private String type;
	   private char gender;
	   private int age;
	   
	   // Constructors
	   public Animal(String type, int age, char gender) 
	   {
	      this.type = type;
	      this.gender = gender;
		  this.age = age;
	   }
	   

	   public void eat() 
	   {
	      System.out.println("Animal is eating");
	   }
	   public void sleep() 
	   {
	      System.out.println("Animal is sleeping");
	   }
	   public void makeSound() 
	   {
	      System.out.println("A generic animal sound");
	   }


	   //toString
	   public String toString() {
	      return "Type: " + type + " Gender: " + gender + " Age: "+ age;
	   }
}
