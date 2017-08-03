import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Scrabble {

public Integer calculateScore(String myLetter){
        String[] stuff={"a","e","i","o","u","l","n","r","s","t"};
        String[] stuff2={"d","g"};
        String[] stuff3={"b","c","m","p"};
        String[] stuff4={"f","h","v","w","y"};
        String[] stuff5={"k"};
        String[] stuff6={"j","x"};
        String[] stuff7={"q","z"};


        List letter=Arrays.asList(stuff);
        List letter2=Arrays.asList(stuff2);
        List letter3=Arrays.asList(stuff3);
        List letter4=Arrays.asList(stuff4);
        List letter5=Arrays.asList(stuff5);
        List letter6=Arrays.asList(stuff6);
        List letter7=Arrays.asList(stuff7);

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
        else if(letter5.contains(myLetter)){
          return 5;
        }
        else if(letter6.contains(myLetter)){
          return 8;
        }
        else if(letter7.contains(myLetter)){
          return 10;
        }
        else {
                return 30;
        }


}
}
