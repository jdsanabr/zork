# Zork - Text-Based Adventure Game

## Introduction
Welcome to Zork, a text-based adventure game inspired by the classic interactive fiction game of the same name. In this game, players navigate through a series of rooms, solve puzzles, and interact with objects to progress through the story. This README will guide you through the setup process and provide an overview of the game's features.

## Installation
To run Zork on your local machine, follow these steps:

1. Make sure you have Java installed on your system. You can download it from [Java's official website](https://www.java.com/en/download/).
2. Clone this repository to your local machine using Git:
   ```
   git clone https://github.com/jdsanabr/zork.git
   ```
3. Navigate to the project directory:
   ```
   cd zork
   ```
4. Compile the Java source files:
   ```
   javac Zork.java
   ```
5. Run the game:
   ```
   java Zork
   ```

## Gameplay
Zork is a command-driven game where players interact with the environment by typing commands. The game provides a series of prompts and responds to player input accordingly. Here are commands to get you started:

- `North`: Allows you to move North.
- `South`: Allows you to move South.
- `East`: Allows you to move East.
- `West`: Allows you to move West.
- `Look`: Provides a detailed descriptoin of the room.
- `take [item]`: Adds an item in a room to your inventory.
- `use [item]`: Use an item from your inventory.
- `drop [item]`: Removes an item from your inventory and leaves it in the room.
- `Inventory`: View items in your inventory.
- `Examine`: Provides a detailed description of the specified item, it must be in your inventory.
- `Eat`: Allows you to eat an edible item.
- `Play message`: Will play message ONLY when in easter egg room.
- `Teleport`: Will teleport you to a random location in the map.
- `Suicide`: Allow you to quit the game by comminting suicide.
- `Quit`: Player quits the game.
- `Help`: Display a list of available commands.

## Features
- **Interactive Storyline**: Immerse yourself in a rich narrative with branching paths and multiple endings.
- **Puzzle Solving**: Explore rooms, collect items, and solve puzzles to progress through the game.
- **Dynamic Environment**: The game world reacts to your actions, providing a dynamic and immersive experience.

## Credits
Zork is created by [Jonathan Sanabria]. Special thanks to [Mr Underwood, my AP Java teacher] for inspiration and guidance.

## Disclaimer
This project is for educational purposes only and is not affiliated with or endorsed by the creators of the original Zork game.

## Context
This was a project I completed for my AP Computer Science A course. All of the background functionalities were already provided while my task was to write the OOP code that was taught to us in the course. This Zork project is a much simpler version of the original game and had the sole purpose of helping me implement the knowledge and skills learned in this course.
