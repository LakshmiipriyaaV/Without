package without;

class Student{  
	   int rollno; 
	   String name;  
	   static String college ="Ust"; 
	    
	   Student(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	    
	   void display (){System.out.println(rollno+" "+name+" "+college);}  
	}  
	  
	public class StaticVariable{  
	 public static void main(String args[]){  
	 Student s1 = new Student(111,"lakshmi");  
	 Student s2 = new Student(222,"priya");  
	
	 s1.display();  
	 s2.display();  
	 }  
	}  