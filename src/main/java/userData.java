import java.io.Serializable;

// Serializable is implemented to allow objects of this class to be easily converted
// to a stream for network communication
public class userData implements Serializable {

    String currentWordStatus; // Current state of the word, e.g., "_i___"
    String category; // Category of the word
    boolean wordComplete; // Flag indicating if the word is complete
    boolean letterExists; // Flag indicating if the chosen letter exists in the word
    char letterChosen; // The letter chosen by the client
    String gameState; // Current state of the game

    // Constructor we use initialize the shared data
    userData(String aCurrentWordStatus, String aCategory, boolean aWordComplete, boolean aLetterExists,
             char aLetterChosen, String aGameState) {
        currentWordStatus = aCurrentWordStatus;
        category = aCategory;
        wordComplete = aWordComplete;
        letterExists = aLetterExists;
        letterChosen = aLetterChosen;
        gameState = aGameState;
    }

    // Default constructor to create an instance with default values
    userData() {
        currentWordStatus = "";
        category = "none";
        wordComplete = false;
        letterExists = true;
        letterChosen = ' ';
        gameState = "none";
    }
}