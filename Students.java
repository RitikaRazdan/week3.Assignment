package week3.homeAssignment;

/*Assignment 4
==============

      Class: Students
      Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
*/

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Ritika"); 
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Department - ECE");
	}
	
	public void getStudentInfo(String email, int number) {
		System.out.println("Ritika Razdan");
	}
	
	public static void main(String[] args) {
		Students info = new Students();
		info.getStudentInfo(1,"Ritika");
	}

}
