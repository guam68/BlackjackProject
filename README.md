# BlackjackProject
Week 4 Skill Distillery Project

## Overview

This project was to create a blackjack simulator using an Object-Oriented design structure. The basic requirements were to have a dealer and a player be dealt two cards at the beginning of the game. If either player's cards totaled to 21, the game ends with the result printed. If not, the player is able to hit until they chose to stay or the player's card values total over 21 (bust). Once the player's turn has concluded, the dealer automatically plays out it's turn as defined by the rules of blackjack. The game state is then checked for a winner which is output to the screen.

## Structure
### Common
These are all components that aren't necessarily directly tied to the game of blackjack, but are made use of in the game.
- Card class
- Deck class
- Hand abstract classs
- Rank enum
- Suit enum

### Blackjack
- BlackjackDealer class: Contains dealer specific logic.
- BlackjackHand class: Extends hand and contains blackjack specific logic.
- BlackjackPlayer abstract class: Contains general participant logic. Extended by dealer and player.
- Player class: Contains player specific logic
- BlackjackTable class (main)

## Objectives

- Getting comfortable building classes in an Object-Oriented manner
- Building classes whose fields are Objects
- Practice writing methods
- Use collection types to organize and manage data
- Use conditionals to create game logic


## Technologies

- Java
- Eclipse
