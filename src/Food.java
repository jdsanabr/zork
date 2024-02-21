/*
 * TODO: Create the class here, be sure to pay attention to the name of the file
 * also be sure to consider interfaces and abstract classes
 */
public class Food implements Inventory{
	
	/*
	TODO:  Create 3 instance variables:  name, description, and weight
	be sure to select the most appropriate type for each
	Note: that weight can be a decimal
	*/

	private String name;
	private String description;
	private double weight;
	
	
	/**
	 * Food class constructor
	 * it builds a food object with a name, description, and a weigh
	 * @param: a string to set the name of the Food object 
	 * @param: a string to set the description of the Food object 
	 * @param: a double to set the starting weight of the Food object
	*/
	
	//TODO: make the Food constructor according to the description above
	
	public Food(String name, String description, double weight) {
		this.name = name;
		this.description = description;
		this.weight = weight;
	}
	
	/**
	 * Mutator method called "setName"
	 * This method is used to change the name of a Food object
	 * @param: a String to update the name of the Food object
	 */
	
	//TODO: make the setName method

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Mutator method called "setDescription"
	 * This method is used to change the description of a Food object
	 * @param: a String to update the description of the Food object
	 */
	 
	 //TODO: make the setDescription method
	
	public void setDescription(String description) {
		this.description = description;
	}
		
	/**
	 * Mutator method called "setWeight"
	 * This method is used to change the weight of a Food object
	 * @param: a String to update the weight of the Food object
	 * @return 
	*/	
	
	//TODO: make the setWeight method
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/**
	 * Accessor method called "getName"
	 * This method is used to retrieve the name of a Food object
	 * @return: a String that is the name of the Food object
	*/	
	
	//TODO: make the getName method
	
	public String getName() {
		return name; 
	}
	
	/**
	 * Accessor method called "getDescription"
	 * This method is used to retrieve the description of a Food object
	 * @return: a String that is the description of the Food object
	*/	

  //TODO: make the getDescription method	
	
	public String getDescription() {
		return description; 
	}
	
	/**
	 * Accessor method called "getWeight"
	 * This method is used to retrieve the weight of a Food object
	 * @return: a double that is the weight of the Food object
	*/	

  //TODO: make the getWeight method	
	
	public double getWeight() {
		return weight;
	}

	/**
	 * Accessor method called "toString"
	 * This method is used to retrieve all of the characteristics of a Food object
	 * @return: a String that is all of the characteristics of a Food object
	*/		
	
  //TODO: make the toString method
	
	public String toString() {
		return "name: " + name +
				"\ndescription: " + description +
				"\nweight: " + weight;
	}
		
	/**
	 * main method
	 * Tests the constructor and methods in the Food Class
	 */
	//TODO: create a main method to test the class
	
	public static void main(String[] args) {
		Food food = new Food("Apple", "red and tasty", 1.0);
		System.out.println(food.toString());
		
		System.out.println();
		
		food.setName("pear");
		food.setDescription("green and tasty");
		food.setWeight(1.5);
		System.out.println(food.getName());
		System.out.println(food.getDescription());
		System.out.println(food.getWeight());
		System.out.println(food.toString());
	}

}