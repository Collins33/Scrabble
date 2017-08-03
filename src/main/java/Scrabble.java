import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Scrabble {

public Integer calculateScore(String myLetter){
        String[] stuff={"a","e","i","o","u","l","n","r","s","t"};
        String[] stuff2={"d","g"};
        String[] stuff3={"b","c","m","p"};
        String[] stuff4={"f","h","v","w","y"};
        List letter=Arrays.asList(stuff);
        List letter2=Arrays.asList(stuff2);
        List letter3=Arrays.asList(stuff3);
        List letter4=Arrays.asList(stuff4);
        if(letter.contains(myLetter)) {
                return 1;
        }
        else if(letter2.contains(myLetter)) {
                return 2;
        }else if(letter3.contains(myLetter)) {
                return 3;
        }
        else if(letter4.contains(myLetter)){
          return 4;
        }
        else {
                return 30;
        }


}
}
