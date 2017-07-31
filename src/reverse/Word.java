package reverse;

/**
 * Created by Taras on 31.07.2017.
 */
public class Word {
    private String string;
    public static final String TEXT = "abcd!@_ 2n56nnn";

    public Word(String string){
        this.string = string;
    }

    public static void main(String[] args) {
        char[] reverse;
        Word word = new Word("abcd1e");
        reverse = word.reverseArray(word.getWordToArray());
        for (int i = 0; i < reverse.length; i++){
            System.out.print(reverse[i]);
        }
        System.out.println();
        System.out.println(TEXT.replaceAll("[^abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ]", ""));
    }

    private char[] getWordToArray(){
        char[] chars = string.toCharArray();
        return chars;
    }

    private char[] reverseArray(char[] chars){
        char[] result = new char[chars.length];
        for (int i = 0; i < chars.length; i++){
            if (Character.isLetter(chars[i])){
                result[result.length - 1 - i] = chars[i];
            } else {
                result[i] = chars[i];
            }
        }
        return result;
    }
}
