package com.example.android.questionnaire.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static com.example.android.questionnaire.data.Options.CHECKBOX;
import static com.example.android.questionnaire.data.Options.RADIOBUTTON;

public class QuestionSet {

    public static ArrayList<Question> getAllQuestions() {
        ArrayList<Question> questions = new ArrayList<>();

        Question question1 = new Question("Which famous person does Phoebe believe is her grandfather?", RADIOBUTTON, new String[]{"Albert Einstein", "Isaac Newton", "Winston Churchill", "Beethoven"}, Collections.singletonList(0));
        questions.add(question1);

        Question question2 = new Question("Who among the following belong to the Targaryen family?", Options.CHECKBOX, new String[]{"Aemon", "Rhaegar", "Ned", "Robb"}, Arrays.asList(0, 1));
        questions.add(question2);

        Question question3 = new Question("What is Sheldon's middle name in The Big Bang Theory?", Options.EDITTEXT, "Lee");
        questions.add(question3);

        Question question4 = new Question("In the Television series Silicon Valley, what is Pied Piper?", RADIOBUTTON, new String[]{"A book", "A scary story", "A song", "A company", "A bank"}, Collections.singletonList(3));
        questions.add(question4);

        Question question5 = new Question("Which of the following are the names of fictional characters from Dan Brown novels?", CHECKBOX, new String[]{"Sophie Neveu", "Vittoria Vetra", "Nick Adams", "Robert Langdon"}, Arrays.asList(0, 1, 3));
        questions.add(question5);

        Question question6 = new Question("What color is \"The Incredible Hulk\"?", RADIOBUTTON, new String[]{"Purple", "Green", "Blue", "Grey"}, Collections.singletonList(1));
        questions.add(question6);

        Question question7 = new Question("How many seasons are there in the TV series Breaking Bad?", Options.EDITTEXT, "5");
        questions.add(question7);

        return questions;
    }
}
