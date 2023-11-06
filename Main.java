package InlämningsUppgift;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //skapar nytt objekt
        Examination exam = new Examination();
        //skapar ny String
        String input;
        System.out.println("Skriv in text:");
        //While loop för att köra oändligt fram tills användaren
        //skriver in "stop"
        while (true) {
            //Ger Stringen en scanner så att användaren kan skriva in text
            input = scan.nextLine();
            if (exam.isStop(input)) {
                //break för att avsluta programmet
                break;
            }
            //Kallar på metoderna för att addera rader och tecken
            exam.addLine();
            exam.addChars(input.length());
            exam.addWords(input);
            exam.setLongestWord(input);

        }
        //Hämtar och skriver ut antalet rader och tecken
        System.out.println("Antal rader: " + exam.getLineCount());
        System.out.println("Antal tecken: " + exam.getCharCount());
        System.out.println("Antal ord: " +exam.getWordCount());
        System.out.println("Längsta ordet: " +exam.getLongestWord());

    }
}
