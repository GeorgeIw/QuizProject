package com.example.android.quizproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int question1Answer;
    int question2Answer;
    int question3Answer;
    int question4AnswerA;
    int question4AnswerB;
    int question5Answer;
    int question6Answer;
    int question7AnswerA;
    int question7AnswerB;
    int question8AnswerA;
    int question8AnswerB;
    int grade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void question1CorrectAnswer() {
        CheckBox checkBox1Q1 = (CheckBox) findViewById(R.id.checkbox1_question1);
        boolean checkBox1Question1 = checkBox1Q1.isChecked();
        CheckBox checkBox2Q1 = (CheckBox) findViewById(R.id.checkbox2_question1);
        boolean checkBox2Question1 = checkBox2Q1.isChecked();
        CheckBox checkBox3Q1 = (CheckBox) findViewById(R.id.checkbox3_question1);
        boolean checkBox3Question1 = checkBox3Q1.isChecked();
        CheckBox checkBox4Q1 = (CheckBox) findViewById(R.id.checkbox4_question1);
        boolean checkBox4Question1 = checkBox4Q1.isChecked();
        //determines the correct and wrong answers
        if (checkBox1Question1 && checkBox2Question1 && checkBox4Question1 && !checkBox3Question1) {
            question1Answer = 1;
        } else {
            question1Answer = 0;
        }
    }

    public void question2CorrectAnswer() {
        RadioButton radioButton2Q2 = (RadioButton) findViewById(R.id.radiobutton2_question2);
        boolean radioButton2Question2 = radioButton2Q2.isChecked();
        //determines the correct and wrong answers
        if (radioButton2Question2) {
            question2Answer = 1;
        } else {
            question2Answer = 0;
        }
    }

    public void question3CorrectAnswer() {
        CheckBox checkBox1Q3 = (CheckBox) findViewById(R.id.checkbox1_question3);
        boolean checkBox1Question3 = checkBox1Q3.isChecked();
        CheckBox checkBox2Q3 = (CheckBox) findViewById(R.id.checkbox2_question3);
        boolean checkBox2Question3 = checkBox2Q3.isChecked();
        CheckBox checkBox3Q3 = (CheckBox) findViewById(R.id.checkbox3_question3);
        boolean checkBox3Question3 = checkBox3Q3.isChecked();
        CheckBox checkBox4Q3 = (CheckBox) findViewById(R.id.checkbox4_question3);
        boolean checkBox4Question3 = checkBox4Q3.isChecked();
        //determines the correct and wrong answers
        if (checkBox3Question3 && !checkBox1Question3 && !checkBox2Question3 && !checkBox4Question3) {
            question3Answer = 1;
        } else {
            question3Answer = 0;
        }
    }

    public void question4CorrectAnswer() {
        //initializes editText field for question 4a
        EditText editText1Q4a = (EditText) findViewById(R.id.editText_question4a);
        String editText1Question4a = editText1Q4a.getText().toString();
        //determines the correct answer for question 4a
        if (editText1Question4a.equalsIgnoreCase(getString(R.string.drawable_question4))) {
            question4AnswerA = 1;
        } else {
            question4AnswerA = 0;
        }
        //initializes editText field for question 4b
        EditText editText2Q4b = (EditText) findViewById(R.id.editText_question4b);
        String editTextQuestion4b = editText2Q4b.getText().toString();
        //determines the correct answer for question 4b
        if (editTextQuestion4b.equalsIgnoreCase(getString(R.string.strings_question4_case1)) || editTextQuestion4b.equalsIgnoreCase(getString(R.string.strings_question4_case2))) {
            question4AnswerB = 1;
        } else {
            question4AnswerB = 0;
        }
    }

    public void question5CorrectAnswer() {
        //initializes radioButton for question 5
        RadioButton radioButton1Q5 = (RadioButton) findViewById(R.id.radioButton1_question5);
        boolean radioButton1Question5 = radioButton1Q5.isChecked();
        //determines the correct answer for question 5
        if (radioButton1Question5) {
            question5Answer = 1;
        } else {
            question5Answer = 0;
        }
    }

    public void question6CorrectAnswer() {
        //initializes checkboxes for question 6
        CheckBox checkBoxIntQ6 = (CheckBox) findViewById(R.id.question6_int);
        boolean checkBoxIntQuestion6 = checkBoxIntQ6.isChecked();
        CheckBox checkBoxDecimalQ6 = (CheckBox) findViewById(R.id.question6_decimal);
        boolean checkBoxDecimalQuestion6 = checkBoxDecimalQ6.isChecked();
        CheckBox checkBoxCharQ6 = (CheckBox) findViewById(R.id.question6_char);
        boolean checkBoxCharQuestion6 = checkBoxCharQ6.isChecked();
        CheckBox checkBoxStringQ6 = (CheckBox) findViewById(R.id.question6_string);
        boolean checkBoxStringQuestion6 = checkBoxStringQ6.isChecked();
        CheckBox checkBoxTextQ6 = (CheckBox) findViewById(R.id.question6_text);
        boolean checkBoxTextQuestion6 = checkBoxTextQ6.isChecked();
        CheckBox checkBoxBoolQ6 = (CheckBox) findViewById(R.id.question6_bool);
        boolean checkBoxBoolQuestion6 = checkBoxBoolQ6.isChecked();
        //determines the correct answers for question 6
        if (checkBoxIntQuestion6 && checkBoxCharQuestion6 && checkBoxStringQuestion6 && !checkBoxDecimalQuestion6 && !checkBoxTextQuestion6 && !checkBoxBoolQuestion6) {
            question6Answer = 1;
        } else if (!checkBoxIntQuestion6 && !checkBoxDecimalQuestion6 && !checkBoxCharQuestion6 && !checkBoxStringQuestion6 && !checkBoxTextQuestion6 && !checkBoxBoolQuestion6) {
            question6Answer = 0;
        }
    }

    public void question7CorrectAnswer() {
        //initializes radioButtons for question 7a
        RadioButton q7correctAnswer = (RadioButton) findViewById(R.id.radioButton1_question7a);
        boolean question7CorrectAnswer = q7correctAnswer.isChecked();
        //determines the correct answer for question 7a
        if (question7CorrectAnswer) {
            question7AnswerA = 1;
        } else {
            question7AnswerA = 0;
        }
        //initializes radioButton for question 7b
        RadioButton q7correctAnswerb = (RadioButton) findViewById(R.id.radioButton2_question7b);
        boolean question7bCorrectAnswer = q7correctAnswerb.isChecked();
        //determines the correct answer for question 7b
        if (question7bCorrectAnswer) {
            question7AnswerB = 1;
        } else {
            question7AnswerB = 0;
        }
    }

    public void question8CorrectAnswer() {
        //initializes editText for question 8a
        EditText editTextQ8a = (EditText) findViewById(R.id.editext_question8a);
        String editTextQuestion8a = editTextQ8a.getText().toString();
        //determines the correct answer for question 8a
        if (editTextQuestion8a.equalsIgnoreCase(getString(R.string.question8a_case1)) ||
                editTextQuestion8a.equalsIgnoreCase(getString(R.string.question8a_case2)) ||
                editTextQuestion8a.equalsIgnoreCase(getString(R.string.question8a_case3)) ||
                editTextQuestion8a.equalsIgnoreCase(getString(R.string.question8a_case4)) ||
                editTextQuestion8a.equalsIgnoreCase(getString(R.string.question8a_case5)) ||
                editTextQuestion8a.equalsIgnoreCase(getString(R.string.question8a_case6)) ||
                editTextQuestion8a.equalsIgnoreCase(getString(R.string.question8a_case7)) ||
                editTextQuestion8a.equalsIgnoreCase(getString(R.string.question8a_case8))) {
            question8AnswerA = 1;
        } else {
            question8AnswerA = 0;
        }
        //initializes editText for question 8b
        EditText editTextQ8b = (EditText) findViewById(R.id.editText_question8b);
        String editTextQuestion8b = editTextQ8b.getText().toString();
        //determines the correct answer for question 8b
        if (editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case1))||
                editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case2))||
                editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case3))||
                editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case4))||
                editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case5))||
                editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case6))||
                editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case7))||
                editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case8))||
                editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case9))||
                editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case10))||
                editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case11))||
                editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case12))||
                editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case13))||
                editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case14))||
                editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case15))||
                editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case16))||
                editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case17))||
                editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case18))||
                editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case19))||
                editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case20))||
                editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case21))||
                editTextQuestion8b.equalsIgnoreCase(getString(R.string.question8b_case22))) {
            question8AnswerB = 1;
        } else {
            question8AnswerB = 0;
        }
    }
    //adds the values of the answers to create the total grade
    //the correct answers have a value of 1 and the wrong answers a value of 0
    public void totalGrade(){
        question1CorrectAnswer();
        question2CorrectAnswer();
        question3CorrectAnswer();
        question4CorrectAnswer();
        question5CorrectAnswer();
        question6CorrectAnswer();
        question7CorrectAnswer();
        question8CorrectAnswer();
        grade = question1Answer + question2Answer + question3Answer + question4AnswerA + question4AnswerB
                + question5Answer + question6Answer + question7AnswerA + question7AnswerB + question8AnswerA + question8AnswerB;
    }
    //this method is called to show a toast message on the screen depending on how many answers are correct
    public void toastGrades(View v) {
        totalGrade();
        if (grade == 11) {                  //for a perfect score
            Toast.makeText(getApplicationContext(),"Congratulations! \nYou have scored a perfect score of "+ grade+"!", Toast.LENGTH_LONG).show();
        } else if (grade == 10) {           //for just 1 wrong answer
            Toast.makeText(getApplicationContext(), "It seems that you have a wrong answer!\nTry again!\nYour score is " + grade+"!", Toast.LENGTH_LONG).show();
        } else if (grade < 10) {            //for more than 1 wrong answers
            Toast.makeText(getApplicationContext(), "It seems that you have more than one wrong answers!\nTry again!\nYour score is " + grade+"!", Toast.LENGTH_LONG).show();
        }
    }
}



