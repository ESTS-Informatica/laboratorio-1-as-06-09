import java.util.Scanner;

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
    
    private InputReader reader;

    public WordGuessingGame()
    {
        this.hiddenWord = "abc";
        this.guessedWord = "___";
        this.numberOfTries = 0;
        
        this.reader = new InputReader();
    }
    
    public String getHiddenWord() {
        return hiddenWord;
    }
    
    public String getGuessedWord() {
        System.out.println("");
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
    
    public void showWelcome(){
        System.out.println("Welcome to the Guessing Game!!");
        System.out.println("Let's have fun");
        System.out.println("");
    }
    
    public void guess(){
        int i;
        char value = reader.getChar(guessedWord);
        
        if (hiddenWord.contains(String.valueOf(value)) == true){
            i = hiddenWord.indexOf(String.valueOf(value));
            guessedWord = guessedWord.substring(0, i) + value + guessedWord.substring(i + 1);
            System.out.println(i);
        } else {
            System.out.println("Oops... try again!");
            System.out.println("");
        }
        System.out.println(guessedWord);
        numberOfTries++;
        
    }
    
    public void play(){
        showWelcome();
        getGuessedWord();
         while(guessedWord != hiddenWord){
            guess();
            if (guessedWord == hiddenWord)
                break;
            }
        getNumberOfTries();
    }

}
