package InlämningsUppgift;


public class Examination {
    private int lineCount;
    private int charCount;
    private int wordCount;
    private String longestWord = "";


    //Konstruktor
    public Examination(int charCount, int lineCount, int wordCount, String longestWord) {
        this.charCount = charCount;
        this.lineCount = lineCount;
        this.wordCount = wordCount;
        this.longestWord = longestWord;
    }

    public Examination() {

    }

    //Returnerar antal rader
    public int getLineCount() {
        return lineCount;
    }

    //Returnerar antal tecken
    public int getCharCount() {
        return charCount;
    }

    //Returnerar antal ord
    public int getWordCount() {
        return wordCount;
    }


    //metod som används för att kolla om användaren skriver stop
    public boolean isStop(String Stop) {
        return Stop.equals("stop");
    }

    //Plussar på en rad
    public void addLine() {
        lineCount++;
    }

    //Plussar på tecken
    public void addChars(int numChar) {
        charCount += numChar;

    }

    //Skapar en array med split-funktionen. Splittar vid blanksteg.
    //Den går igenom och lägger till antal ord.
    public void addWords(String text) {
        String[] wordArray = text.split(" ");

        //För varje blanksteg så adderar vi 1 till wordCount
        for (int i = 0; i < wordArray.length; i++) {
            wordCount++;
        }
    }

    //Array som kollar alla ord i arrayen och jämför vilket som är längst
    public void setLongestWord(String text) {
        String[] words = text.split(" ");
        for (String s : words) {
            if (s.length() > longestWord.length()) {
                longestWord = s;
            }
        }
    }

    //Hämtar det längsta ordet
    public String getLongestWord() {
        return longestWord;
    }
}
