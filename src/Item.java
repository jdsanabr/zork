/*
 * The Item class has been built for you
 */
 
/**
 * This is the Item class.
 * The purpose of this class is to be able to create any object that is not
 * a Food or Key.
 *
 * This class implements the Inventory Interface so that Items
 * can be included in an inventory
 * 
 * 
 * Students that wish to create additional features should consider making
 * more classes that are specific to the plot of their story.
 */
 

 
public class Item implements Inventory{



	/**
	 * Instance variables to hold the name, description, and weight of an Item object
	*/
	private String name;
	private String description;
	private double weight;
	
	
	/**
	 * The Item constructor 
	 * It constructs a new instance of an Item object
	 * @param: a string to set the name of an Item object
	 * @param: a string to set the description of an Item object
	 * @param: a double to set the starting weight of an Item object
	*/
	public Item(String name, String description, double weight){
		this.name = name;
		this.description = description;
		this.weight = weight;
	}
	
	
	/**
	 * setName mutator method
	 * This method is used to change the name of an Item object
	 * @param: a String to update the name of an Item object
	*/
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * setDescription mutator method
	 * This method is used to change the description of an Item object
	 * @param: a String to update the description of an Item object
	*/
	public void setDescription(String description){
		this.description = description;
	}
	
	/**
	 * setWeight mutator method
	 * This method is used to change the weight of an Item object
	 * @param: a double to update the weight of an Item object
	*/	
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	/**
	 * getName accessor method
	 * This method is used to retrieve the name of an Item object
	 * @return: a String that is the name of an Item object
	*/	
	
	public String getName(){
		return this.name;
	}

	/**
	 * getDescription accessor method
	 * This method is used to retrieve the description of an Item object
	 * @return: a String that is the description of an Item object
	*/	
	
	public String getDescription(){
		return this.description;
	}
	
	/**
	 * getWeight accessor method
	 * This method is used to retrieve the weight of an Item object
	 * @return: a double that is the weight of an Item object
	*/	
	
	public double getWeight(){
		return this.weight;
	}
	
	/**
	 * toString accessor method
	 * This method overwrites the default toString method and 
	 * is used to retrieve all of the characteristics of an Item object	 
	 * @return: a String that is all of the characteristics of an Item object
	*/		
	
	public String toString(){
		return "name: " + name +
				"\ndescription: " + description +
				"\nweight: " + weight;
	}
	
	
	/**
	 * main Method that is used to test the class
	 */
	
	
	//To run the test, you must first complete the Interface or
	//comment out the implements Inventory section of the header
	public static void main(String[] args){
		Item i = new Item ("hammer", "hit stuff with it", 2.0);
		System.out.println(i.toString());
		i.setName("toothbrush");
		i.setWeight(0.2);
		i.setDescription("keeps your teeth clean");
		System.out.println(i.getName());
		System.out.println(i.getWeight());
		System.out.println(i.getDescription());
		System.out.println(i.toString());
		
	}
}