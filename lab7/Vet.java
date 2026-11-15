// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Nov-2026
// Purpose 			: 

public class Vet 
{
	   // Variables
	   private String name;
	   
	   
	   // Constructors
	   public Vet(String name) 
	   {
	      this.name = name;
	   }
	   

	   public void vaccinate(Animal animal) 
	   {
	      System.out.println(name + " is vaccinating.");
		  if (animal instanceof Dog)
		  {
			System.out.println("Dog has been vaccinated: " + animal);
		  }
		  else if(animal instanceof Cat)
		  {
			System.out.println("Cat has been vaccinated: " + animal);
		  }
	   }

}
