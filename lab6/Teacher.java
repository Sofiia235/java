// Student Name 	: Sofiia Sablina
// Student Id Number: C00322001
// Date 			: Nov-2026
// Purpose 			: inheritance

public class Teacher extends  Person {
	   // Variables
	   private String[] courses;
	   private int numCourses;

	   
	   // Constructors
	   public Teacher(String name, String address) {
	      super(name, address);
		  numCourses = 0;
		  courses = new String[20];
	   }

	   public boolean addCourse(String course)
	   {
			for (int i = 0; i < numCourses; i++) 
			{
				if (courses[i].equals(course)) {
					return false;
				}
			}
			courses[numCourses] = course;
			numCourses++;
			return true;
	   }

	   public boolean removeCourse(String course)
	   {
			for (int i = 0; i < numCourses; i++) 
			{
				if (courses[i].equals(course)) 
				{
					for (int j = i; j < numCourses - 1; j++) {
					courses[j] = courses[j + 1];
					}
					numCourses--;
            		return true;
				}
			}
			return false;
	   }
	   
	   //toString
	   public String toString() {
	      return "Teacher: " + super.toString();
	   }
	}