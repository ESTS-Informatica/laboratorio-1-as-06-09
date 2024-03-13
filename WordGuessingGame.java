
/**
 * Write a description of class WordGuessingGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordGuessingGame
{
    // instance variables - replace the example below with your own
    private String hiddenWord, guessedWord;
    private int numberOfTries;

    public WordGuessingGame()
    {
        this.hiddenWord = "abc";
        this.guessedWord = "___";
        this.numberOfTries = 0;
    }
    
    public String getHiddenWord() {
        return hiddenWord;
    }
    
    public String getGuessedWord() {
        return guessedWord;
    }
    
    public int getNumberOfTries() {
        return numberOfTries;
    }
    
    public void setHiddenWord(String inputHidden){
        this.hiddenWord = inputHidden;
    }
    
    public void setGuessedWord(String inputGuess){
        this.guessedWord = inputGuess;
    }
    
    public void showGuessed(){
        System.out.println("Guessed word ---> " + this.guessedWord);
    }

}
