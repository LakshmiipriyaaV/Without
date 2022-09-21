package without;

abstract class Animal {
	  abstract void makeSound();

	  
	}

	class Dog extends Animal {

	  
	  public void makeSound() {
	    System.out.println("Bark bark");
	  }
	}
	class Cat extends Animal {

		  
		  public void makeSound() {
		    System.out.println("Meow mewo");
		  }
		}

	class AbstractAnimal {
	  public static void main(String[] args) {

	    
	    Dog d1 = new Dog();
        Cat c1 = new Cat();
	    d1.makeSound();
	    c1.makeSound();
	   
	  }
	}