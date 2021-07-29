package day29exceptionsabstraction;

	/*
	 	1)Abstract methods can be stored in "Abstract Classes"
	 	2)To create an abstract method, a)Do not put method body
	 									b)Put "abstract" keyword between access modifier and return type
	 	3)For abstract methods "public", "protected", and "default" access modifiers can be used
	 	  but "private" cannot. Because we create "abstract methods" to access from child classes
	 	4)Abstract classes can have concrete methods as well, but "concrete classes" can have
	 	  just concrete methods.
	 	5)Abstract methods must be overridden by child classes, otherwise you will get CTE
	 	  Note: Because of that, if we think sth is must for every child class, we make them 
	 	        abstract then child classes have to override them
	 	6)Just concrete child classes must to override "abstract methods", it is not must
	 	  to override abstract methods for abstract child classes
	 	7)If an abstract method is overridden by class X, child classes of the class X may or may not override the method 
	 */

public abstract class Animal {
	
	public abstract void eat();
	
	public void drink() {
		System.out.println("They drink");
	}

}







