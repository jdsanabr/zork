/*
 * TODO: Create the class here, be sure to pay attention to the name of the file
 * also be sure to consider interfaces and abstract classes
 */
public class Key implements Inventory{
	
	/*
	TODO:  Create 3 instance variables:  name, description, and weight
	be sure to select the most appropriate type for each
	Note: that weight can be a decimal
	*/

	private String name;
	private String description;
	private double weight;
	
	/**
	 * Key class constructor
	 * it builds a key with a name, description, and a weight of 0.2
	 * @param: a string to set the name of a Key ojbect
	 * @param: a string to set the description of a Key ojbect
	 */
	
	//TODO: make the Key constructor according to the description above
	
	public Key(String name, String description, double weight) {
		this.name = name;
		this.description = description;
		this.weight = weight;
	}
	
	/**
	 * Mutator method called "setName"
	 * 	This method is used to change the name of a Key ojbect
	 * 	@param: a String to update the name of a Key ojbect
	*/
	
	//TODO: make the setName method

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 	Mutator method called "setDescription"
	 * 	This method is used to change the description of a Key ojbect
	 * 	@param: a String to update the description of a Key ojbect
	*/
	
	//TODO: make the setDescription method

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Mutator method called "setWeight"
	 * This method is used to change the weight of a Key ojbect
	 * @param: a String to update the weight of a Key ojbect
	*/	
	
	//TODO: make the setWeight method
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/**
	 * Accessor method called "getName"
	 * This method is used to retrieve the name of a Key ojbect
	 * @return: a String that is the name of a Key ojbect
	*/
	
	//TODO: make the getName method

	public String getName() {
		return name;
	}

	/**
	 * Accessor method called "getDescription"
	 * This method is used to retrieve the description of a Key ojbect
	 * @return: a String that is the description of a Key ojbect
	*/	

	//TODO: make the getDescription method

	public String getDescription() {
		return description;
	}
	
	/**
	 * Accessor method called "getWeight"
	 * This method is used to retrieve the weight of a Key ojbect
	 * @return: a double that is the weight of a Key ojbect
	*/	

	//TODO: make the getWeight method

	public double getWeight() {
		return weight;
	}
	
	/**
	 * Accessor method called "toString", overwrites the default toString method
	 * This method is used to retrieve all of the characteristics of a Key ojbect
	 * @return: a String that is all of the characteristics of a Key ojbect
	*/		
	
	//TODO: make the toString method

	public String toString() {
		return "name: " + name +
				"\ndescription: " + description +
				"\nweight: " + weight;
	}

	/**
	 * main method
	 * Tests the constructor and methods in the Key Class
	 */
	//TODO: create a main method to test the class

	public static void main(String[] args) {
		Key key = new Key("Command sector key", "small emough to fit in one of your pockets", 0.2);
		System.out.println(key.toString());
		
		System.out.println();
		
		key.setName("random key");
		key.setDescription("random description");
		key.setWeight(1.0);
		System.out.println(key.getName());
		System.out.println(key.getDescription());
		System.out.println(key.getWeight());
		System.out.println(key.toString());
	}

}