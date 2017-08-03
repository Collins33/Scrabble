import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Scrabble {

public Integer calculateScore(String myLetter){
  String[] stuff={"a","e","i","o","u","l","n","r","s","t"};
  List letter=Arrays.asList(stuff);
        if(letter.contains(myLetter)){
          return 1;
        }
        else if(myLetter.equals("d")){
          return 2;
        }
        else{
          return 20;
        }

}
}
