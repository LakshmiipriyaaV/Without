package without;



import without.Parent;
import without.subclass1;
import without.subclass3;

public class Abstractparent {
public static void main(String[] args) {

	        subclass1 s1 = new subclass1();
	        s1.message();
	        subclass3 s3 = new subclass3();
	        s3.message();
	    }
	}
	abstract class Parent{
	    public abstract void message(); 
	} 
	class subclass1 extends Parent{
	    @Override
	    public void message(){
	        System.out.println("This is first subclass: ");
	    }
	}
	class subclass3 extends Parent{
	    @Override
	    public void message(){
	        System.out.println("This is Second subclass: ");
	    }
	}


