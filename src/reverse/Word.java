package reverse;

/**
 * Created by Taras on 31.07.2017.
 */
public class Word {
    private String string;
    private static final String SEARCH_NONTEXT = "[^abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ]";     //regex для небуквенних символів
    private static final String NOTHING = "";                                                               //для виключення небуквенних символів
    private static final String SEARCH_TEXT = "[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ]";     //regex для буквенних символів (латиниця)
    private static final String GAP = " ";                                                                  //для заміни буквенних символів на пробіли
    private static final char GAP_CHAR = ' ';                                                               //символьний аналог гепа

    public Word(String string){
        this.string = string;
        showReverse();
    }

    private void showReverse() {
        char[] reverse;
        char[] nontext;
        char[] result;

        //ініціюєм масив чарів
        result = new char[this.string.length()];

        //виділяєм з вхідного стрінга лише буквенну частину і розвертаєм її у зворотню сторону
        reverse = this.reverseArray(this.getWordToArray(this.getText(this.string)));

        //виділяєм з вхідного стрінга небуквенну частину, залишаючи небуквенні елементи на свої місцях, а буквенні заміняємо пробілами " "
        nontext = this.getWordToArray(this.getNonText(this.string));


        int k = 0;  //лічильник небуквенних символів в небуквенному масиві nontext
        for (int i = 0; i < result.length; i++){
            if (nontext[i] != GAP_CHAR){
                // якщо в небуквенному масиві nontext на i-й позиціх не пробіл, ставим у результуючий масив цей символ з nontext
                result[i] = nontext[i];
                k++;
            } else {
                // якщо в небуквенному масиві nontext на i-й позиціх пробіл, ставим у результуючий масив символ з буквенного масиву reverse, враховуючи зміщення на k
                result[i] = reverse[i-k];
            }
            System.out.print(result[i]);
        }

    }

    //конвертуєм стрінг в масив чарів
    private char[] getWordToArray(String string){
        char[] chars = string.toCharArray();
        return chars;
    }

    //отримуєм стрінг тільки буквенних символів (небуквенні символи видаляєм)
    private String getText(String string){
       return string.replaceAll(SEARCH_NONTEXT,NOTHING);
    }

    //отримуєм стрінг небуквенних символів, в якому всі буквенні символи замінені на пробіл " "
    private String getNonText(String string){
        return string.replaceAll(SEARCH_TEXT,GAP);
    }

    //розвертає масив чарів у зворотньому напрямку
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
