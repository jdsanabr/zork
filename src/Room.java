//This is the solution file for the teacher reference

/*
 * Contains Checkpoint 4 Tasks 
 * 
 */
 
/*
 * TODO: import the utilities need to add an ArrayList
 */
import java.util.*;


/**
 * Room Class
 * Each room represents a spot in the world
 * Room's have names, descriptions, inventories, and 
 * passages or lack there of to the N,S,E, and W
 */
public class Room{

	//Informational: Fields for the Room class 
	
	private boolean canGoNorth;
	private boolean canGoSouth;
	private boolean canGoEast;
	private boolean canGoWest;
	private String description;
	private String name;

/*
 * TODO: Checkpoint 4 Task 
 * 
 * Add an instance variable that gives the Room an Inventory
 * This is an ArrayList that only the Room can access
 * the type is Inventory.
 * Be sure to use encapsulation
 */
	
	private ArrayList<Inventory> roomInventory;
	
/**
 * default Room constructor
 * it populates all of the instance variables with default values of false for movement
 * it also adds a description that this is not actually a room
 */
	public Room(){
		this.canGoNorth = false;
		this.canGoSouth = false;
		this.canGoEast = false;
		this.canGoWest = false;
		this.name = "Not a room";
		this.description = "This is not a room, you shouldn't be here!!!";
	}
	
/**
 * custom Room constructor 
 * use to build an instance of a Room object 
 * the client populates all of the instance variables by
 * passing the following parameters in this order
 * 
 * @param canGoNorth
 * @param canGoSouth
 * @param canGoEast
 * @param canGoWest
 * @param name
 * @param description
 */
	public Room(boolean canGoNorth, boolean canGoSouth, boolean canGoEast, boolean canGoWest, String name, String description){
		this.canGoNorth = canGoNorth;
		this.canGoSouth = canGoSouth;
		this.canGoEast = canGoEast;
		this.canGoWest = canGoWest;
		this.name = name;
		this.description = description;
		
		
/*
 * TODO: Checkpoint 4 Task
 * 
 * initialize the inventory ArrayList
 */
    
		roomInventory = new ArrayList<Inventory>();
    
	}


	
/**
 * custom Room constructor with 7 parameters 
 * use to build an instance of a Room object 
 * the client populates all of the instance variables by
 * passing the following parameters in this order
 * 
 * @param canGoNorth
 * @param canGoSouth
 * @param canGoEast
 * @param canGoWest
 * @param name
 * @param description
 * @param item  -- this is type Inventory
 */
/*
 * TODO: Checkpoint 4 Task 
 * 
 * create the new Room constructor noted above
 * Hint: you can call the custom constructor above with the "this" key word
 * 
 */
	
	public Room(boolean canGoNorth, boolean canGoSouth, boolean canGoEast, boolean canGoWest, String name, String description, Inventory item) {
		this(canGoNorth, canGoSouth, canGoEast, canGoWest, name, description);
		roomInventory.add(item);
	}

/**
 * optional custom Room constructor with 7 parameters 
 * use to build an instance of a Room object 
 * the client populates all of the instance variables by
 * passing the following parameters in this order
 * 
 * @param canGoNorth
 * @param canGoSouth
 * @param canGoEast
 * @param canGoWest
 * @param name
 * @param description
 * @param item  -- this is an ArrayList of type Inventory
 */
/*
 * TODO: Checkpoint 4 Optional Task
 * 
 * create the optional constructor as noted above
 */
 
	public Room(boolean canGoNorth, boolean canGoSouth, boolean canGoEast, boolean canGoWest, String name, String description, ArrayList<Inventory> items) {
		this(canGoNorth, canGoSouth, canGoEast, canGoWest, name, description);
		roomInventory.addAll(items);
	}
	
/**
 * getDescription accessor method
 * gets the room description
 * @return the description
 */

	public String getDescription(){
		return this.description;
	}
	
/**
 * getName accessor method
 * It gets the room name
 * @return the name
 */

	public String getName(){
		return this.name;
	}
	
/**
 * setDescription mutator method
 * It sets the room description
 * @param d is the description of the room
 */

	public void setDescription(String d){
		description = d;
	}
	
/**
 * setName mutator method
 * It sets the room name
 * @param n is the name you want the room to have
 */

	public void setName(String n){
		name = n;
	}
	
	
/**
 * getCanGoNorth accessor method
 * used to determine if the player can move North
 * @return the value of canGoNorth
 */

	public boolean getCanGoNorth(){
		return this.canGoNorth;
	}
	
/**
 * getCanGoSouth accessor method
 * used to determine if the player can move South
 * @return the value of canGoSouth
 */

	public boolean getCanGoSouth(){
		return this.canGoSouth;
	}
	
/**
 * getCanGoEast accessor method
 * used to determine if the player can move East
 * @return the value of canGoEast
 */

	public boolean getCanGoEast(){
		return this.canGoEast;
	}
	
/**
 * getCanGoWest accessor method
 * used to determine if the player can move West
 * @return the value of canGoWest
 */

	public boolean getCanGoWest(){
		return this.canGoWest;
	}
	
/**
 * setCanGoNorth mutator method
 * used to update if the player can move North
 * @param a value to change the canGoNorth field
 */

	public void setCanGoNorth(boolean b){
		this.canGoNorth = b;
		
	}

/**
 * setCanGoSouth mutator method
 * used to update if the player can move South
 * @param a value to change the canGoSouth field
 */

	public void setCanGoSouth(boolean b){
		this.canGoSouth = b;
		
	}
	
/**
 * setCanGoEast mutator method
 * used to update if the player can move East
 * @param a value to change the canGoEast field
 */

	public void setCanGoEast(boolean b){
		this.canGoEast = b;
		
	}
	
/**
 * setCanGoWest mutator method
 * used to update if the player can move West
 * @param a value to change the canGoWest field
 */

	public void setCanGoWest(boolean b){
		this.canGoWest = b;		
	}
	
/**
 * toString accessor method
 * used to retrieve the state of the room you are in
 * 
 * example output: 
 * Kitchen 
 * A room with a table and fridge  
 * GoNorth: True GoSouth:False GoEast: True GoWest: True
 * 
 * @return a String with the Room Name, Description, and the ability to move each direction 
 */
	
	public String toString(){
		return name + "\n" + description + "\nGoNorth: " + canGoNorth + " Go South: " + canGoSouth + " Go East: " + canGoEast + " Go West: " +canGoWest;
	}
	
/**
 * hasObject accessor method
 * uses a String to search through the objects in the Room to 
 * determine if the object is present
 * 
 * @param objectName - a String that is the name of the object
 * @return a boolean that is true if the object is in the Room
 *         and false if it is not
 */
/* 
 * TODO: Checkpoint 4 Task
 * make the hasObject method
 *  
 */
 	
	public boolean hasObject(String objectName) {
		for(int i = 0; i < roomInventory.size(); i++) {
			if(roomInventory.get(i).getName().equals(objectName)) {
				return true;
			}
		}
		return false;
	}
 
  /**
   * addObject mutator method
   * used to pass an Object to the room 
   * 
   * @param objectName - a Inventory object to be added to the room inventory
   */
  /* 
   * TODO: Checkpoint 4 Task
   * make the addObject method
   *  
   */
	
	public void addObject(Inventory objectName) {
		roomInventory.add(objectName);
	}
		
/**
 * removeObject mutator method
 * used to remove an Object from the room and
 * pass it to the client code 
 * 
 * @param objName - a String that is the name of the object to pull from the room
 * @return an Inventory object that is the object to be pulled from the room
 * 
 */
/* 
 * TODO: Checkpoint 4 Task
 * make the removeObject method
 *  
 */	

	public Inventory removeObject(String objName) {
		for(int i = 0; i < roomInventory.size(); i++){
			if(roomInventory.get(i).getName().toLowerCase().equals(objName)){
				return roomInventory.remove(i);
			}
		}
		return null;
	}

/**
 * getNamesOfObjectsInRoom accessor method
 * used to get the names of all of the Objects in the Room Inventory
 * 
 * @return returns "Items in room are : " followed by the items in the room. 
 *         If not items are in the room, then return "No items are in the room"
 */
/* 
 * TODO: Checkpoint 4 Task
 * make the getNamesOfObjectsInRoom method
 *  
 */		
	
	public String getNamesOfObjectsInRoom() {
		String a = "";
		if(roomInventory.size()>0){
			System.out.println("The items in this room are: ");
			for(int i = 0; i < roomInventory.size(); i++) {
				a = a + roomInventory.get(i).toString();
			}
			return a;
		}else{
			return "No items are in the room.";
		}
	}
	
}
