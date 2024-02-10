import java.util.ArrayList;

public class dataForQuizzes {
    // video
    String Question1 ;
    String correctAnswer1;
    ArrayList<String> Question1Choices;
    String Question2 ;
    String correctAnswer2 ;
    ArrayList<String> Question2Choices;
    String Question3;
    String correctAnswer3;
    ArrayList<String> Question3Choices;
    public dataForQuizzes(String question1, String correctAnswer1, ArrayList<String> question1Choices,
                          String question2, String correctAnswer2, ArrayList<String> question2Choices,
                          String question3, String correctAnswer3, ArrayList<String> question3Choices) {
        Question1= question1;
        this.correctAnswer1 = correctAnswer1;
        Question1Choices = question1Choices;
        Question2 = question2;
        this.correctAnswer2 = correctAnswer2;
        Question2Choices = question2Choices;
        Question3 = question3;
        this.correctAnswer3 = correctAnswer3;
       Question3Choices = question3Choices;
    }
}
