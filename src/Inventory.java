/*
 * Read: Contains Checkpoint 4 tasks
 */
 import java.util.ArrayList;
 /**
 * This is an Interface called "Inventory".  
 * 
 * It allows objects that meet the following criteria to be included in
 * an Inventory Type.
 * 
 * Classes that can implement the Inventory Interface must be able to get their name,
 * description, and weight.
 * 
 * Note that you cannot create an Inventory object
 */
 
 //TODO Checkpoint 4: create the Inventory interface and be sure to add the abstract methods needed to enforce the rules above
 public interface Inventory {

	 public abstract String getName();
	 public abstract String getDescription();
	 public abstract double getWeight();

	/**
	 * main method
	 * Tests the constructor and methods in the Food Class
	 */
	//TODO: create a main method to test the class by constructing the subclasses
	// and putting them into an array of Inventory items
	 public static void main(String[] args) {
		 ArrayList<Inventory> test = new ArrayList<Inventory>();
		 Food apple = new Food("Apple", "red and tasty", 1.0);
		 test.add(apple);
		 Key key = new Key("Command sector key","small enough to fit in one of your pockets", 0.2);
		 test.add(key);
		 
		 System.out.println(apple);
		 System.out.println();
		 System.out.println(key);
	 }
	 
}