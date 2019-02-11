import java.lang.StringBuilder;
import java.util.ArrayList;
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue += valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String reverse = new StringBuilder(valueToBeReversed).reverse().toString();
        return reverse;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        char middleChar;
        if(word.length()/2 ==0) {
            middleChar = word.charAt((word.length()/2));
        } else {
            middleChar = word.charAt((word.length()-1)/2);
        }
        return middleChar;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        int indexOf = value.indexOf(charToRemove);
        if(indexOf==-1) 
        return value;
        String front = value.substring(0, indexOf);
        String back = value.substring(indexOf+1, value.length());
        return front+back;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String result = sentence.substring(sentence.lastIndexOf(" ") + 1);
        return result;
    }
}
