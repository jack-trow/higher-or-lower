import java.util.Scanner;
import java.util.Random;

public class MyProgram
{
    public static void main(String[] args)
    {
        // System Objects
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        boolean running = true;
        
        BEGINNING:
        while(running) {
            START:
            while(running) {
            // Start screen
            System.out.println("\n\tWelcome to Video Game Higher or Lower!\n");
            System.out.println("Type \"About\" to find out what this game is about.");
            System.out.println("Type \"Play\" to find out how to play the game.");
            String startInput = input.nextLine();
            
            // Shows about page if input is "About"
            if(startInput.equals("About")) {
                System.out.println("\n\t>This is a game where you guess which");
                System.out.println("\tvideo game has sold more copies. If you");
                System.out.println("\tguess incorrectly, you lose. Try to beat");
                System.out.println("\tyour previous scores!\n");
                System.out.println("Press enter to start!");
                String aboutInput = input.nextLine();
                // Goes back to start screen
                if(startInput.equals("Hello")) {
                    continue START;
                }
                else {
                    System.out.println("");
                }
            }
            // Goes to the game
            else if(startInput.equals("Play")) {
                break;
            }
            else {
                System.out.println("Invalid Input");
                continue START;
            }
        break;
        }
        
        int highscore = 0;
        int score = 0;
        GAME:
        while(running) {
            while(running) {
                // List of games with the numbers at the end showing how many copies were sold
                String[] gamesAndCopies = {"The Last of Us 17", "Red Dead Redemption 2 43", "GTA V 160", 
                "God of War 20", "Destiny 50", "Assassin's Creed 140", "COD: Black Ops 3 26",
                "Apex Legends 50", "Rocket League 10", "Rainbow Six Siege 10", "Halo 3 14", 
                "Borderlands 2 22", "Gears of War 27", "Super Smash Bros 25", "Need for Speed 150"};
                
                //Strings to start
                String currentGame;
                String opposingGame;
                String currentGameCopies;
                String opposingGameCopies;
                
                // Gets random game from the array
                int randCurGame = (int)(Math.random() * gamesAndCopies.length);
                int randOppGame = (int)(Math.random() * gamesAndCopies.length);
                
                // Picks random games to start out
                currentGame = gamesAndCopies[randCurGame];
                opposingGame = gamesAndCopies[randOppGame];
                
                // Finds out how many copies the games have
                currentGameCopies = currentGame.substring(currentGame.length()-3, currentGame.length());
                opposingGameCopies = opposingGame.substring(opposingGame.length()-3, opposingGame.length());
                // Finds out the name of the game
                currentGame = currentGame.substring(0, currentGame.length()-3);
                opposingGame = opposingGame.substring(0, opposingGame.length()-3);
                
                // Game starts here
                System.out.println("\t\nWhich game has sold more copies?\n");
                System.out.println("1. " + currentGame + "   or   2. " + opposingGame);
                
                // Player chooses which game they think has more copies
                System.out.println("Type \"1\" or \"2\"");
                int choice = input.nextInt();
                // Correct choice #1
                if(choice == 1 && currentGameCopies.compareTo(opposingGameCopies) >= 0) {
                    System.out.println("\tSince " + currentGame + " has " + currentGameCopies +
                                       " million copies sold,\n and " + opposingGame + " has " + opposingGameCopies +
                                       " million copies sold,\n you are correct!\n\n");
                    score++;
                    System.out.println("Score = " + score);
                    continue GAME;
                }
                // Incorrect choice #1
                else if(choice == 1 && currentGameCopies.compareTo(opposingGameCopies) < 0) {
                    System.out.println("\tSince " + currentGame + " has " + currentGameCopies +
                                       " million copies sold,\n and " + opposingGame + " has " + opposingGameCopies +
                                       " million copies sold,\n you are unfortunately incorrect!\n\n");
                    System.out.println("Score = " + score);
                    break;
                }
                // Correct choice #2
                else if(choice == 2 && currentGameCopies.compareTo(opposingGameCopies) <= 0) {
                    System.out.println("\tSince " + opposingGame + " has " + opposingGameCopies +
                                       " million copies sold,\n and " + currentGame + " has " + currentGameCopies +
                                       " million copies sold,\n you are correct!\n\n");
                    score++;
                    System.out.println("Score = " + score);
                    continue GAME;
                }
                // Incorrect choice #2
                else if(choice == 2 && currentGameCopies.compareTo(opposingGameCopies) > 0) {
                    System.out.println("\tSince " + opposingGame + " has " + opposingGameCopies +
                                       " million copies sold,\n and " + currentGame + " has " + currentGameCopies +
                                       " million copies sold,\n you are unfortunately incorrect!\n\n");
                    System.out.println("Score = " + score);
                    break;
                }
                else {
                    System.out.println("Invalid Input");
                }
            }
            // Says if you got a new high score
            if(score > highscore) {
                highscore = score;
                System.out.println("\n\tNew High Score of " + highscore + "!");
            }
            else {
                System.out.println("\n\tAlmost a new high score!");
            }
            score = 0;
            // Starts new game
            System.out.println("----------------------------------------------");
            System.out.println("New game starting...");
            System.out.println("Loading...");
            System.out.println("Loading...");
            System.out.println("Start!");
            System.out.println();
            System.out.println("\n\tVideo Game Higher or Lower!\n");
        }
        }
    }
}
