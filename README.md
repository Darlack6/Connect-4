<h3 align="center">Connect-4</h3>

  <p align="center">
    A Java Swing-based Connect-4 game with network multiplayer support and customizable themes.
  </p>
</div>

## Table of Contents

<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#key-features">Key Features</a></li>
      </ul>
    </li>
    <li><a href="#architecture">Architecture</a></li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>

## About The Project

This project is a Java-based implementation of the classic Connect-4 game. It features a graphical user interface (GUI) built with Swing, enabling interactive gameplay. The game supports network multiplayer, allowing two players to compete against each other over a network connection. Additionally, it offers customizable themes, providing a personalized visual experience.

### Key Features

- **Network Multiplayer:** Play against another person over a network using SuperSocketMaster for easy socket communication.
- **Customizable Themes:** Offers different visual themes (Day, Night, Cave, Custom) with selectable backgrounds, boards, and pieces.
- **GUI with Swing:** Implemented using Java Swing for a desktop application experience.
- **Win Condition Check:** Detects win conditions (horizontal, vertical, diagonal) and draw conditions.
- **Falling Checker Animation:** Uses a timer to animate the checkers falling into the board.
- **Chat Functionality:** Includes a simple chat area for communication between players.

## Architecture
The project is structured as follows:

- **`SuperSocketMaster.java`:** Handles network socket connections, sending and receiving text data. It uses threads for listening to incoming data and managing client connections in server mode.
- **`connect4.java`:** Contains the core game logic, including methods for placing moves, checking win conditions, and determining valid moves.
- **`mainGame.java`:** The main class that sets up the GUI, manages game states, handles user input, and coordinates network communication. It implements `ActionListener`, `ChangeListener`, `MouseMotionListener`, and `MouseListener` to handle various events.
- **`playpanel.java`, `homepanel.java`, `helppanel.java`, `themepanel.java`, `endpanel.java`:** These classes define the different panels used in the GUI, such as the game board, home screen, help screen, theme selection screen, and end game screen. They handle the visual representation of the game.
- **`themes.csv`:** A CSV file that stores the theme configurations, including background images, board images, and piece images for different themes.

The application uses Java Swing for the GUI, `java.net` for networking, and utilizes timers for animation. The `SuperSocketMaster` class abstracts the complexities of socket programming, providing a simple interface for sending and receiving text-based messages.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher

### Installation

1.  Clone the repository:
   ```sh
   git clone https
