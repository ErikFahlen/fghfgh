package InlämningsUppgift;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExamTest {
    @Test
    public void getCharCountTest() {
        Examination exam = new Examination(6, 2, 3,"hej");
        int expected = 6;

        int actual = exam.getCharCount();

        assertEquals(expected, actual);

    }

    @Test
    public void getLineCountTest() {
        Examination exam = new Examination(15, 5, 3,"hej");
        int expected = 5;

        int actual = exam.getLineCount();

        assertEquals(expected, actual);
    }

    @Test
    public void addLineTest() {
        Examination exam = new Examination(19, 5, 3,"hej");
        int expected = 6;
        exam.addLine();

        int actual = exam.getLineCount();

        assertEquals(expected, actual);
    }

    @Test
    public void addWordTest(){
        Examination exam = new Examination(15, 5, 3, "hej");

        int expected = 7;
        exam.addWords("hej på dig Erik");

        int actual = exam.getWordCount();

        assertEquals(expected, actual);
    }

    @Test
    public void addCharTest(){
        Examination exam = new Examination(15,5,3,"hej");

        int expected = 18;
        exam.addChars("hej".length());

        int actual = exam.getCharCount();

        assertEquals(expected, actual);
    }

    @Test
    public void setLongestWordTest(){
        Examination exam = new Examination(15,5,3,"hej");
        exam.setLongestWord("hejhallå det är soligt idag");
        String expected = "hejhallå";

        String actual = exam.getLongestWord();

        assertEquals(expected, actual);
    }


}
