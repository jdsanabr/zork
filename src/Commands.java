/*
 * 
 * In Checkpoint 4, students will add an inventory and update their map to their own world.  
 *
 * This will be submitted and teachers will have to test student code manually because each world will be different.  
 * It is recommended that teachers have students submit a walkthrough so that teachers can expedite testing. 
 * 
 * Below is sample solution code for checkpoint 4.  
 *
 * Note, this is not the only way to code the game.  Some of steps are broken up just to reinforce understanding of concepts.  Students may find other ways to make this work.  It a student finds another way to solve a problem, they should not be penalized.
 */


/*
 * CLASS CONTAINS: 4 tasks
 * 
 * All green comments are tasks for this checkpoint
 * 
 */


import java.util.*;

/**
 * Creates the class Commands, 
 * There will only be one instance used by the game
 * therefore all of its methods are static to prevent multiple
 */
public class Commands {

/**
 * Variable to end the game
 */
 
  public static boolean quit;

/**
 * Class level variables that need to be accessible throughout the code
 **/
 
  public static Room[][] map;
  public static int row;
  public static int column;
  public static Room currentRoom;

/* 
 * TODO: Checkpoint 4 Task
 * 
 * Declare an ArrayList called "inventory".  
 * This should be type Inventory
 * This ArrayList will be needed to carry your various objects
 */

  public static ArrayList<Inventory> playerInventory;
	
/**
 * runGame method
 * method responsible for running a console version of the game
 * this method returns nothing and has no parameters
 * it contains the while loop that is used to run the game
 */
	public static void runGame(){
	  

/* 
 * TODO: Checkpoint 4 Tasks 
 * 
 * Declare and Construct the objects for your game.
 * 
 */
 
	Item teleporationDevice = new Item("teleportation device", "takes you to any coordinate in the map. Use at own risk", 2.0);
	Item hologramDevice = new Item("hologram","has a message for you", 5.0);
	Key key = new Key("key","gives access to all doors", 0.2);
	Item computer = new Item("computer","a highly advanced (portable) computer that you can use to hack into the system and use as a key to open some doors. Small enough to keep in a pocket", 2.0);
	Item healingDrug = new Item("drug", "heals you after having taken damage", 0.5);
	Item rifle = new Item("assault rifle","shoot to kill", 6.0);
	Item flashG = new Item("flash grenade","blinds the enemy for a brief period of time", 1.0);
	Item table = new Item("table","used for stuff", 80.0);
	Item chair = new Item("chair","you sit on it", 7.0);
	Item bed = new Item("bed","sleep on it", 100.0);
	Food chicken = new Food("chicken","warm and tender", 1.0);
		
/*
 * TODO: Checkpoint 4 Task
 * 
 * Update the map values for the rows and columns to the size required for your world
 * your world might not be 3 rows and 3 columns as noted below
 */
 
    map = new Room[5][5]; //updated
    
/*
 * TODO: Checkpoint 4 Task
 * 
 * Update the Room constructors to match the Rooms in your world and add constructors
 * for additional Rooms.
 * 
 * Be sure to construct every Room in your map (especially if you changed the size of 
 * the map)
 * 
 * If the space on the map is not actually a Room, use the default constructor
 *
 * Finally, construct Rooms that have objects by using the new 7 parameter 
 * constructor you made in the Room class.
 */    
    
   /* 
    * Checkpoint 4 alternate solution to adding items to Rooms for teacher reference
    * 
    * (optional) TODO: add items to desired Rooms if not done with constructors
    */
    ArrayList<Inventory> bridge = new ArrayList<>();//Bridge
    bridge.add(key);
     
    ArrayList<Inventory> controlRoom = new ArrayList<>();//Control Room
     
    ArrayList<Inventory> quarters = new ArrayList<>();//Officers living sector
    quarters.add(bed);
     
    ArrayList<Inventory> corridor = new ArrayList<>();//hall
    
    ArrayList<Inventory> crewQuarters = new ArrayList<>();//Crew living sector
    crewQuarters.add(bed);
     
    ArrayList<Inventory> gameOverRoom = new ArrayList<>();//garbage/disposal room
    
    ArrayList<Inventory> eEInventory = new ArrayList<>();//easter egg room
    eEInventory.add(teleporationDevice);
    eEInventory.add(hologramDevice);
	
	ArrayList<Inventory> armoryInventory = new ArrayList<>();//armory
	armoryInventory.add(rifle);
	armoryInventory.add(flashG);
    
	ArrayList<Inventory> conferenceRoomInventory = new ArrayList<>();//conference room
	conferenceRoomInventory.add(table);
	conferenceRoomInventory.add(chair);
	conferenceRoomInventory.add(computer);
	 
	ArrayList<Inventory> messHallInventory = new ArrayList<>();//mess hall
	messHallInventory.add(table);
	messHallInventory.add(chair);
	messHallInventory.add(chicken);
	
	ArrayList<Inventory> winningRoom = new ArrayList<>();
	//make list for every single room
    
    //Room nameOfRoom = new Room(north, south, east, west, name of room, description, inventory "item" or array list);
    map[1][2] = new Room(false, false, true, true, "Bridge", "In this room, there are computers and radars used for navigation.", bridge);//empty list
	map[1][3] = new Room(false, true, false, true, "Control Room", "As you enter, you notice that there are a lot stationery computers being operated by officers", controlRoom);//empty list
	map[1][1] = new Room(false, true, true, false, "Conference room", "Once inside, you see that there is a large round table surrounded by chairs.\nThere seems to be portable computers docked on one of the walls. No one else is there", conferenceRoomInventory);
	map[0][2] = new Room(false, true, false, false, "Easter Egg room", "As you enter, you notice that the room is mostly empty. There is a teleportation device sitting on a table. Next to the table is a hologram with a message", eEInventory);
	map[2][1] = new Room(true, true, true, false, "Mess Hall", "this is a big room used as the cafeteria of the space ship. Tables and chairs are everywhere", messHallInventory);
	map[2][2] = new Room(true, true, true, true, "Officers living sector", "this is a private room for officers to sleep, beds are everywhere", quarters);
	map[2][3] = new Room(true, true, false, true, "Training/fitness center", "this is another big room used for working out and training hand to hand, weight machines everywhere");//empty list
	map[3][1] = new Room(true, true, true, false, "Corridor", "This is just a corridor, move along", corridor);//"Corridor"
	map[3][2] = new Room(true, false, true, true, "Crew living sector", "Another large room for the crew to sleep, beds everywhere", crewQuarters);
	map[3][3] = new Room(true, true, false, true, "Armory.", "As you enter, you notice the room is full of artillery and explosives ready for action, it houses:\nassault rifles, pistols, flash grenades, grenades, mines, jetpacks, and ammo", armoryInventory);
	map[4][1] = new Room(true, true, false, false, "Garbage/disposal room", "You notice that there is a horrid smell and you are standing on top of a lake of garbage and disposed machinery parts.\nThe door closes behind you and the walls start to retract and you use your last breathes to curse the Soviets for this. You die the death of a nacikomoye (bug).", gameOverRoom);
	map[4][3] = new Room(true, true, false, false, "Hangar", "As you enter, you see dozens of assault shuttles to pick. You choose the assault shuttles that have a hyperdrive included to hop into hyperspace and escape", winningRoom);//winning room
	map[0][1] = new Room(false, false, false, false, "Space", "Game Over");
	map[0][3] = new Room(false, false, false, false, "Space", "Game Over");
	map[4][2] = new Room(false, false, false, false, "Space", "Game Over");
	map[0][0] = new Room(false, false, false, false, "Space", "Game Over");
	map[1][0] = new Room(false, false, false, false, "Space", "Game Over");
	map[2][0] = new Room(false, false, false, false, "Space", "Game Over");
	map[3][0] = new Room(false, false, false, false, "Space", "Game Over");
	map[4][0] = new Room(false, false, false, false, "Space", "Game Over");
	map[0][4] = new Room(false, false, false, false, "Space", "Game Over");
	map[1][4] = new Room(false, false, false, false, "Space", "Game Over");
	map[2][4] = new Room(false, false, false, false, "Space", "Game Over");
	map[3][4] = new Room(false, false, false, false, "Space", "Game Over");
	map[4][4] = new Room(false, false, false, false, "Space", "Game Over");
	
/*
 * TODO: Checkpoint 4 Task
 * 
 * Change the values of row and column to match the starting locations of your world
 * 
 */
	
    row = 1;
    column = 2;//done 
    //Informational: initializes the currentRoom to the starting location 
    currentRoom = map[row][column];

/*
 * TODO: Checkpoint 4 Task
 * 
 * initialize the player's inventory
 */
 
    playerInventory = new ArrayList<Inventory>();//done
    playerInventory.add(healingDrug);
 //   playerInventory.add(key);
    
		/* Informational: Variables for the command, the command broken up, 
		*  the scanner, and boolean for game over
		*/ 
		String userInput = "";
		String command = "";
		String item = "";
		Scanner s = new Scanner(System.in);
		boolean done = false; //updated
		quit = false;
		
		/* Informational:  
		 *  get the intro to the game and print
		 */
		String output = gameIntro();
		System.out.println(output);

		/* Informational:  
		 * run the game until it is over
		 */
		while(!done){
			//Informational: get the user input
			System.out.print("\n\n>>");       //Informational: note this is for readability
			userInput = s.nextLine().toLowerCase();
			
			//Informational: get the command from the user input
			command = getFirstWord(userInput);
			
			//Informational: get the rest of the string after the first word if available
			
			item = getRestOfSentence(userInput);
			
			//Informational: use the command and item to determine the proper output
			
			output = executeCommand(command, item);


			
			
			//Informational: print the output for the user
			if( ( command.equals("north")||command.equals("south")||command.equals("west")||command.equals("east") ) ){//if it's true: north, south, west, east
				System.out.println(output + "\n" + currentRoom.getName()+"\n"+currentRoom.getDescription());
			} else {//everything else
				System.out.println(output);
			}

/*
 * TODO: Checkpoint 4 Task
 * 
 * Update the win condition to match your winning Room or scenario
 * if the player is in the winning room, provide the Room Name and
 * the Room description
 * then end the game
 *
 * Optional --
 * add losing conditions
 */
			if(currentRoom.getName().equals("Hangar")){ //DONE
				//System.out.println(currentRoom.getName());
				//System.out.println(currentRoom.getDescription());
				System.out.println("You have won the game.");
				done = true;
			}
			if(currentRoom.getName().equals("Garbage/disposal room")){
				//System.out.println(currentRoom.getName());
				//System.out.println(currentRoom.getDescription());
				lost();
//				System.out.println("You have lost.");
				done = true; //lose the game
			}
		  	if(command.equals("quit")||(command.equals("kill") && item.equals("myself"))||command.equals("lost")||(currentRoom.getName().toLowerCase().equals("space"))){//done
		  		if(command.equals("kill")&&item.equals("myself")){
//		  			System.out.println("I have failed you, Supreme Leader Trump.");
//		  			System.out.println("You have lost.");
		  			done = true;
		  		}
		  		if(currentRoom.getName().toLowerCase().equals("space")){
//		  			System.out.println(currentRoom.getName());//debugging
		  			System.out.println("It is beyond miserably cold and dark.");
//		  			System.out.println("You have lost.");
		  			done = true;
		  		}
//		  		lost();
//		  		System.out.println("You have lost.");
		  		done = true;
		  	}
		
		}
		
		s.close();
	
	}
	
/**
 * gameIntro method 
 * used to set the scene to the opening of your game 
 * @return: a String that is the opening description to your game, 
 *          be sure to note the help option 
 *          (i.e. "type help for a list of commands").  
 */

/*
 * TODO: Checkpoint 4 Task
 * 
 * Update this to the Intro for your game.  You should be able to copy it
 * from checkpoint 3
 */
	public static String gameIntro(){ //done
		return "Welcome to ZORK.\n" + "This is the bridge of an enemy space battleship that you have infiltrated.\nYou must find a way to escape the ship and deliver us the data you have for us. In this room, there are computers and radars."
				+ "\n (Type \"help\" to see a list of commands)"; //done
	}
	
/**
 * getFirstWord method
 * pulls the first word out of any phrase (1 or more words)
 * @param a string that contains the commands from the user
 * @return a string that is only the first word, 
 *         returns a blank string "" if nothing entered, 
 *         do not use print or println
 */
	public static String getFirstWord(String input){
		int spaceLocation = input.indexOf(" ");
		if(spaceLocation > 0)
			return input.substring(0,spaceLocation);
		if(input.length() >0)
			return input;
		return "";
	}

/**
 * getRestOfSentence 
 * pulls everything after the first word and the space behind it
 * @param a string that contains the commands from the user
 * @return a string that returns everything after the first word 
 *         and the space behind it, returns a blank string "" if 1 word entry 
 *         or nothing entered. 
 *         Do not use print or println
 */	
	public static String getRestOfSentence(String input){
		int spaceLocation = input.indexOf(" ");
		if(spaceLocation >= 0)
			return input.substring(spaceLocation+1);
		return "";
	}	

	
/**
 * north method
 * Method to state that you moved north, you will add movement functionality
 * in checkpoint 3
 * @return a string that states you moved North, do not use print or println	
 */

	public static String north(){
	  if(currentRoom.getCanGoNorth()){
	    row-=1;
	    updateRoom();
	    return "You moved North.";  
	  } else {
	    return "You cannot move North.";
	  }
		
	}



/**
 * south method
 * Method to state that you moved south, you will add movement functionality
 * in checkpoint 3
 * @return a string that states you moved South, do not use print or println
 */		

	public static String south(){
	  if(currentRoom.getCanGoSouth()){
	    row++;
	    updateRoom();
	    return "You moved South.";
	  } else {
	    return "You cannot move South.";  
	  }
		
	}

/**
 * east method
 * Method to state the you moved East,  you will add movement functionality in 
 * checkpoint 3
 * @return a string that states you moved East, do not use print or println
 */
	

	public static String east(){
	  if(currentRoom.getCanGoEast()){
	    column++;
	    updateRoom();
	    return "You moved East";
	  } else {
		  return "You cannot move East.";
	  }
	}

/**
 * west method
 * Method to state the you moved West, you will add movement functionality in 
 * checkpoint 3
 * @return a string that states you moved West, do not use print or println
 */
	
	public static String west(){
	  if(currentRoom.getCanGoWest()){
	    column--;
	    updateRoom();
	    return "You moved West";
	  } else {
	    return "You cannot move West.";   
	  }
	}

/**  
 * updateRoom method
 * Method to update the room you are in (currentRoom)
 * this method uses the row and column values to 
 * update the currentRoom location
 * no parameters or return values
 */

	public static void updateRoom(){
		currentRoom = map[row][column];
	}	
	
	
	
/**
 * take method
 * Method to allow you to take an item, for now you will just state that 
 * "You took the <itemName>." where <itemName> is the actual name of the item.
 * 
 * example return statement:
 * "You took the apple." 
 * 
 * You will actually pick up items in checkpoint 4
 * 
 * @param takes in a String to determine what object was picked up
 * @return a String that states "You took the <itemName>", do not use print or println
 */
	
/*
 * TODO: Checkpoint 4 Task
 * 
 * Update the "take" method to pick up an object specified only if it is in the room.
 * This should add the object to your inventory if it is in the room.
 * @param name of the object to pick up
 * @return a String stating the you either picked up or cannot pick up the object as
 * appropriate
 */

	public static String take(String item){
		if( (item.toLowerCase().equals("bed")) || (item.toLowerCase().equals("table")) ){
			return "This item is too heavy to pick up.";
		}
		String a = "";
		if(currentRoom.hasObject(item)){
			playerInventory.add(currentRoom.removeObject(item));
			return "You took the " + item +".";
		}
			if(item.toLowerCase().equals("hologram")){
				a = "The device is installed onto the wall. ";
			}
			return a + "You cannot pick up "+item+".";
	}
	
/** 
 * drop method
 * Method to allow you to drop an item, for now you will just state that 
 * "You dropped the <itemName>." where <itemName> is the actual name of the item.
 * 
 * example return statement:
 * "You dropped the apple."
 * 
 * You will actually drop items in checkpoint 4
 * @param takes in a string to determine what object was dropped
 * @return a string that states "You dropped the <itemName>", do not use print or println 
 */
	
/*
 * TODO: Checkpoint 4 Task
 * 
 * Update the "drop" method to drop an object only if it is in the player inventory. 
 * The object should be added to the room inventory.
 * @param name of the object to drop
 * @return a String stating the you either dropped or cannot drop the object as 
 * appropriate
 */
 
	public static String drop(String objectName){
		for(int i = 0; i< playerInventory.size(); i++){
			if(playerInventory.get(i).getName().equals(objectName)){
				playerInventory.remove(objectName);
				currentRoom.addObject(playerInventory.remove(i));
				return "You dropped the " + objectName +".";
			}
		}
		return "You cannot drop "+objectName+".";
	}
	
/** 
 * look method
 * Method to allow you to look around the room
 * In checkpoint3, this will change to the room description
 *  @return a string that states "You looked around the room", do not use print or println
 */	
 
/* 
 * TODO: Checkpoint 4 task
 * 
 * add a new line with the names of the objects that can be picked up in the Room
 */
 
	public static String look(){
		return currentRoom.toString() + "\n" + currentRoom.getNamesOfObjectsInRoom();
	}
	
/** 
 * inventory method
 * Method to display the items in your inventory, for now state
 * "The current items in your inventory are:"
 * 
 * In checkpoint 4 you will create a String that consists of all of the 
 * items in your inventory
 *  @return the "The current items in your inventory are:", do not use print or println
 */
 
/*
 * TODO: Checkpoint 4 Task
 * 
 * Update the "inventory" method to state the items and their description from your inventory. 
 * @return a String that is all of the items in your inventory with descriptions, ideally on new lines
 */
	public static String inventory(){//done
		if(playerInventory.size()==0){
			return "You have no items in your inventory.";
		}
		String a = "";
		for(int i = 0; i < playerInventory.size(); i++){
			a = a + playerInventory.get(i).getName().toLowerCase()+", "+playerInventory.get(i).getDescription().toLowerCase()+".\n";
		}
		return "The current items in your inventory are:\n" + a;
	}	
	
/**
 * examine method
 * Method that returns the description on an item in your inventory, for now state:
 * "Description of <itemName>" where <itemName> is the itemName
 * 
 * example return statement:
 * "Description of apple"
 * 
 * In checkpoint 4 you will return the description of the object you are examining
 * @param takes in a string to determine what item you want the description of
 * @return a string that is the description of the item, do not use print or println
 */

/*
 * TODO: Checkpoint 4 Task
 * 
 * Update the "examine" method to check if the item is in the player's Inventory
 * If it is in the inventory, return the description of the item
 * If it is not in the player's inventory (even if it is in the room), state that
 * the player does not have that item
 */
	public static String examine(String item){//done
		for(int i = 0; i < playerInventory.size(); i++){
			if(playerInventory.get(i).getName().toLowerCase().equals(item))
				return playerInventory.get(i).getDescription()+ ".\n" + "You examined the " + item + ".";
		}
		return "You cannot examine that item because it is not in your inventory.";
	}	

/**
 * eat method
 * Method that allows you to eat a Food object, for now state:
 * "You ate the <itemName>" where <itemName> is the name of the itemName
 * 
 * example return statement:
 * "You ate the apple."
 * 
 * In checkpoint 4, you will update this method to remove it from your inventory, 
 * but not drop it in the room.  Advanced: this could be useful for a health system
 * 
 * 
 * @param takes in a string to determine what item you want to eat
 * @return a string that states you ate the item, do not use print or println
 */	
 
/*
 * TODO: Checkpoint 4 Task
 * Update the Eat method to allow the player to eat an Item only if
 * the item is in the player's inventory and is a food.
 * If it is in the player's inventory and not a food, state that you cannot eat the item
 * If it is not in the player's inventory, state that you do not have the item
 */
	public static String eat(String item){
		for(int i = 0; i < playerInventory.size(); i++){
			if(playerInventory.get(i).getName().toLowerCase().equals(item)){
				if(playerInventory.get(i) instanceof Food)
				return "You ate the " + item + ".";
			}else{
				return item+" is not a food.";
			}
		}
		return "You do not have that item in your inventory.";
	}

/**  
 * use method
 * Method that allows you to use an item it, for now state:
 * "You used the <itemName>", where <itemName> is the name of the item.
 * 
 * example return statement:
 * "You used the apple."
 * 
 * In checkpoint 4 this will be updated to only allow the player to use a Key
 * in the room where the key can open a door
 * 
 * @param takes in a string to determine what item you want to use
 * @return a string that You used the item, do not use print or println
 */

/* 
 * TODO: Checkpoint 4 Task
 * 
 * Update the "use" method to make a Key open the door of a specific Room
 * if the player is in the Room that the door should be opened and has the key 
 * to open the door, then update the Room to allow the player to move into and out 
 * of the room
 * If the player is not in the correct Room, state that the key will not work here
 * If the item noted by the player cannot be used ever, then state that the player cannot use that item
 * If the player does not have the item, state that the player does not have the item.
 */
 
		public static String use(String item){
			if(playerInventory.size() == 0){
				return "You do not have "+ item + " in your inventory.";
			}
			for(int i = 0; i < playerInventory.size(); i++){
//				if( !(playerInventory.get(i).getName().toLowerCase().equals(item)) ){
//					return "You cannot use that item.";
//				}
				if(playerInventory.get(i) instanceof Key && currentRoom.getName().toLowerCase().equals("bridge")){
					currentRoom.setCanGoNorth(true);
					currentRoom.setCanGoSouth(true);
				}
				if(playerInventory.get(i).getName().toLowerCase().equals("teleportation device")){
					teleport();
				}
				if(item.toLowerCase().equals("drug")){
					playerInventory.remove(i);
				}
			}
			return "You used the " + item + ".";
		}
	
/**
 * help method
 * Method that returns all of the commands and what they do
 * 
 * example return output:
 * "Command      Example      Description
 *  take         take apple   used to pick up objects"
 * 
 * @return a String that contains all the command names, an example of use, and a description of what they do.  Be sure to consider readability of the player.  Do not use print or println.
 */
	public static String help(){
		return "The following commands are used to play the game\n"
				+ "Command    Example      Description\n"
				+ "North      North        Allows you to move North\n"
				+ "South      south        Allows you to move South\n"
				+ "East       east         allows you to move East\n"
				+ "West       west         allows you to move West\n"
				+ "Look       Look         provides a detailed descriptoin of the room\n"
				+ "Take       take key     adds an item in a room to your inventory\n"
				+ "Drop       drop key     removes an item from your inventory and leaves it in the room\n"
				+ "Inventory  inventory    displays the names of items in your inventory\n"
				+ "Examine    examine key  provides a detailed description of the specified item, it must be in your inventory\n"
				+ "Eat        eat apple    Allows you to eat an edible item\n"
				+ "Use        use key      Allows you to use the item\n"
				+ "Help       help         displays the help menu\n"
				+ "Play message   play message   Will play message ONLY when in easter egg room\n"
				+ "Teleport   teleport     will teleport you to a random location in the map\n"
				+ "Suicide    kill myself  Allow you to quit the game by comminting suicide\n"
				+ "Quit       quit         player initiated end of game\n";
	}

/**
 * quit Method
 * Method that states "You have decided to quit the game"
 * @return a message saying You have decided to quit the game, do not use print or println
 */
	public static String quit(){
		return "You have decided to quit the game.";
	}
	
/**
 * invalid method
 * Method called when a player tries a command that is not used in the game
 * @return message "I do not understand", do not use print or println
 */
		public static String invalid(){
			return "I do not understand.";
		}

		
/**
 * getCurrentRoom method
 * @return the currentRoom of the player
 */
		public static Room getCurrentRoom(){
			return currentRoom;
		}	
		
		
/**
 * executeCommand method
 * This method uses the first word to call the appropriate method that you
 * made above.  Basically, this method manages complexity by hosting the 
 * logic to detemine which method should be used.
 * (for example, if the command is north, call the north() method). 
 * @param the String command used to check which method to call
 * @param the String item used for methods that interact with objects 
 * @return a String that is passed back from the appropriate method, 
 *         do not use print or println
 */
	public static String executeCommand(String command, String item){
		if(command.equals("north")||command.equals("go north"))
			return north();
		if(command.equals("south")||command.equals("go sourth"))
			return south();
		if(command.equals("east")||command.equals("go east"))
			return east();
		if(command.equals("west")||command.equals("go west"))
			return west();
		if(command.equals("inventory"))
			return inventory();
		if(command.equals("look"))
			return look();
		if(command.equals("take"))
			return take(item);
		if(command.equals("drop"))
			return drop(item);
		if(command.equals("examine"))
			return examine(item);
		if(command.equals("eat"))
			return eat(item);
		if(command.equals("use"))
			return use(item);
		if(command.equals("help"))
			return help();
		if(command.equals("quit"))
			return quit();
		if(command.equals("play")&&item.equals("message"))//for easter egg
			return playMessage();
		if(command.equals("teleport"))
			return teleport();
		if(command.equals("kill")&&item.equals("myself"))
			return suicide();
		return invalid();
				
	}
	
	public static String playMessage() {
		updateRoom();
		if(currentRoom.getName().toLowerCase().equals("easter egg room") || (row == 0 && column == 2)) {
			return "This is Mr. Underwood. Good job on dicovering this easter egg. Finish the game.";
		}else{
			return "There is no message to play.";
		}
	}
	
	public static String teleport(){
		int x, y;
		x = (int) (Math.random()*5);
		y = (int) (Math.random()*5);
		row = x;
		column = y;
		updateRoom();
		System.out.println(x + " " + y);
		if(currentRoom.getName().toLowerCase().equals("space")){
			return lost() + "\nYou have been teleported to: "+ "\n" + currentRoom.getName() + ", " + currentRoom.getDescription();
		}else{
			return "You have been teleported. " + currentRoom.getName() + ", " + currentRoom.getDescription();
		}
	}
	
	public static String lost() {
		return "**GASPING**";
	}
	
	public static String suicide(){
		return "I have failed you, Supreme Leader Trump. "+ lost() + "\nYou have lost";
	}
	
}
