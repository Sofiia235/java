// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Nov-2026
// Purpose 			: inheritance

public class Student extends  Person {
	   // Variables
	   private String[] courses;
	   private int[] grades;
	   private int numCourses;

	   
	   // Constructors
	   public Student(String name, String address) {
	      super(name, address);
		  numCourses = 0;
		  courses = new String[20];
		  grades = new int[20];

	   }
	   
	   public void addCourseGrade(String course, int grade)
	   {
			courses[numCourses] = course;
			grades[numCourses] = grade;
			numCourses++;
	   }

	   public void printGrades()
	   {
			System.out.print(this);
			for (int i = 0; i < numCourses; i++) 
			{
            	System.out.print(" " + courses[i] + ": " + grades[i] + " ");
        	}
			System.out.println();			
	   }

	   // Getters & Setters
	   public double getAverageGrade() 
	   {
	    	int sum = 0;
			for (int i = 0; i < numCourses; i++) 
			{
				sum += grades[i];
			}
			return (sum/numCourses);
	   }

	   //toString
	   public String toString() {
	      return "Student: " + super.toString();
	   }
	}