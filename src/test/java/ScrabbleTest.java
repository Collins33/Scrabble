import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest{
  @Test
  public void calculateScore_returnScoreForSingleLetter_1(){
    Scrabble testScrabble = new Scrabble();
    Integer expected=1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }
  @Test
  public void calculateScore_returnScoreForSingleLetterInArray_1(){
    Scrabble testScrabble=new Scrabble();
    Integer expected=1;
    assertEquals(expected, testScrabble.calculateScore("e"));
  }
}
