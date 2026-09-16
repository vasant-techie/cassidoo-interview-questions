package cassidy.y2026.september16;

/**
 * Given a sentence, return the longest word whose letters appear in alphabetical order.
 *
 */
public class LongestAlphabeticWord {
    public static void main(String[] args) {
        longestSorted("The autumn leaves almost glow.");
        longestSorted("A cool sheep sleeps.");
        longestSorted("I'm good!");
    }

    private static void longestSorted(String sentence) {
        String selectedWord = "";
        sentence = sentence.toLowerCase();
        sentence = sentence.replaceAll("[^A-Za-z ]+", "");
        String[] words = sentence.split(" ");
        for (String word: words) {
            char[] characters = word.toCharArray();
            char firstChar = characters[0];
            for (int i = 1; i < characters.length; i++) {
                int currCharNo = characters[i];
                if (currCharNo <= firstChar) {
                    continue;
                } else {
                    firstChar = characters[i];
                }
                if (i == characters.length - 1) {
                    if(word.length() > selectedWord.length())
                        selectedWord = word;
                }
            }
        }

        System.out.println(selectedWord);
    }
}