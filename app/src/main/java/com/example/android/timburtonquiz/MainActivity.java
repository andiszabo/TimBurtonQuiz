package com.example.android.timburtonquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // When Submit Answers button is clicked...
    public void submitAnswer(View view) {

        // Checks how many good answers were given for question1, each +1 point and at the same time checks how many wrong answers were given, each -1 point - checkBoxes
        CheckBox checkBoxOne = (CheckBox) findViewById(R.id.checkbox1);
        boolean checkedOne = checkBoxOne.isChecked();
        CheckBox checkBoxTwo = (CheckBox) findViewById(R.id.checkbox2);
        boolean checkedTwo = checkBoxTwo.isChecked();
        CheckBox checkBoxThree = (CheckBox) findViewById(R.id.checkbox3);
        boolean checkedThree = checkBoxThree.isChecked();
        CheckBox checkBoxFour = (CheckBox) findViewById(R.id.checkbox4);
        boolean checkedFour = checkBoxFour.isChecked();
        CheckBox checkBoxFive = (CheckBox) findViewById(R.id.checkbox5);
        boolean checkedFive = checkBoxFive.isChecked();
        CheckBox checkBoxSix = (CheckBox) findViewById(R.id.checkbox6);
        boolean checkedSix = checkBoxSix.isChecked();
        // Set up textColors for correct and wrong answers, right shows always, wrong just if its been selected
        if (checkedOne)
            score += 1;
        if (checkedTwo) {
            score -= 1;
            checkBoxTwo.setTextColor(getResources().getColor(R.color.wrongAnswer));
        }
        if (checkedThree)
            score += 1;
        if (checkedFour)
            score += 1;
        if (checkedFive) {
            score -= 1;
            checkBoxFive.setTextColor(getResources().getColor(R.color.wrongAnswer));
        }
        if (checkedSix) {
            score -= 1;
            checkBoxSix.setTextColor(getResources().getColor(R.color.wrongAnswer));
        }
        checkBoxOne.setTextColor(getResources().getColor(R.color.goodAnswer));
        checkBoxThree.setTextColor(getResources().getColor(R.color.goodAnswer));
        checkBoxFour.setTextColor(getResources().getColor(R.color.goodAnswer));

        // Checks question2 is correct - radioButtons
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.radio1);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.radio2);
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.radio3);
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.radio4);
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.radio5);
        boolean RadioOneCorrect = radioButton3.isChecked();
        if (RadioOneCorrect)
            score += 1;
        // Set up textColors for correct and wrong answers, right shows always, wrong just if its been selected
        radioButton3.setTextColor(getResources().getColor(R.color.goodAnswer));
        if (radioButton1.isChecked())
            radioButton1.setTextColor(getResources().getColor(R.color.wrongAnswer));
        if (radioButton2.isChecked())
            radioButton2.setTextColor(getResources().getColor(R.color.wrongAnswer));
        if (radioButton4.isChecked())
            radioButton4.setTextColor(getResources().getColor(R.color.wrongAnswer));
        if (radioButton5.isChecked())
            radioButton5.setTextColor(getResources().getColor(R.color.wrongAnswer));

        // Checks question3 answer is correct - editText
        EditText checkEditTextOne = (EditText) findViewById(R.id.sweeney);
        if (checkEditTextOne.getText().toString().equals(getString(R.string.answer1)) || checkEditTextOne.getText().toString().equals(getString(R.string.answer2))) {
            score += 1;
            checkEditTextOne.setTextColor(getResources().getColor(R.color.goodAnswer));
        } else if (checkEditTextOne.getText().toString().equals("")) {
            checkEditTextOne.setTextColor(getResources().getColor(R.color.wrongAnswer));
            checkEditTextOne.setText("The correct answer is: " + getString(R.string.answer1) + " or " + getString(R.string.answer2));
        } else if (checkEditTextOne.getText().toString().equals(" ")) {
            checkEditTextOne.setTextColor(getResources().getColor(R.color.wrongAnswer));
            checkEditTextOne.setText("The correct answer is: " + getString(R.string.answer1) + " or " + getString(R.string.answer2));
        } else {
            checkEditTextOne.setTextColor(getResources().getColor(R.color.wrongAnswer));
            checkEditTextOne.setText(checkEditTextOne.getText() + " isn\'t a correct answer. What is correct: " + getString(R.string.answer1) + " or " + getString(R.string.answer2));
        }

        // Checks how many good answers were given for question4, each +1 point and at the same time checks how many wrong answers were given, each -1 point - checkBoxes
        CheckBox checkBoxSeven = (CheckBox) findViewById(R.id.checkbox7);
        boolean checkedSeven = checkBoxSeven.isChecked();
        CheckBox checkBoxEight = (CheckBox) findViewById(R.id.checkbox8);
        boolean checkedEight = checkBoxEight.isChecked();
        CheckBox checkBoxNine = (CheckBox) findViewById(R.id.checkbox9);
        boolean checkedNine = checkBoxNine.isChecked();
        CheckBox checkBoxTen = (CheckBox) findViewById(R.id.checkbox10);
        boolean checkedTen = checkBoxTen.isChecked();
        CheckBox checkBoxEleven = (CheckBox) findViewById(R.id.checkbox11);
        boolean checkedEleven = checkBoxEleven.isChecked();
        CheckBox checkBoxTwelve = (CheckBox) findViewById(R.id.checkbox12);
        boolean checkedTwelve = checkBoxTwelve.isChecked();
        CheckBox checkBoxThirteen = (CheckBox) findViewById(R.id.checkbox13);
        boolean checkedThirteen = checkBoxThirteen.isChecked();
        CheckBox checkBoxFourteen = (CheckBox) findViewById(R.id.checkbox14);
        boolean checkedFourteen = checkBoxFourteen.isChecked();
        // Set up textColors for correct and wrong answers, right shows always, wrong just if its been selected
        if (checkedSeven)
            score += 1;
        if (checkedEight) {
            score -= 1;
            checkBoxEight.setTextColor(getResources().getColor(R.color.wrongAnswer));
        }
        if (checkedNine) {
            score -= 1;
            checkBoxNine.setTextColor(getResources().getColor(R.color.wrongAnswer));
        }
        if (checkedTen)
            score += 1;
        if (checkedEleven)
            score += 1;
        if (checkedTwelve) {
            score -= 1;
            checkBoxTwelve.setTextColor(getResources().getColor(R.color.wrongAnswer));
        }
        if (checkedThirteen)
            score += 1;
        if (checkedFourteen) {
            score -= 1;
            checkBoxFourteen.setTextColor(getResources().getColor(R.color.wrongAnswer));
        }
        checkBoxSeven.setTextColor(getResources().getColor(R.color.goodAnswer));
        checkBoxTen.setTextColor(getResources().getColor(R.color.goodAnswer));
        checkBoxEleven.setTextColor(getResources().getColor(R.color.goodAnswer));
        checkBoxThirteen.setTextColor(getResources().getColor(R.color.goodAnswer));

        // Checks question5 is correct - radioButtons
        RadioButton radioButton6 = (RadioButton) findViewById(R.id.radio6);
        RadioButton radioButton7 = (RadioButton) findViewById(R.id.radio7);
        RadioButton radioButton8 = (RadioButton) findViewById(R.id.radio8);
        RadioButton radioButton9 = (RadioButton) findViewById(R.id.radio9);
        RadioButton radioButton10 = (RadioButton) findViewById(R.id.radio10);
        RadioButton radioButton11 = (RadioButton) findViewById(R.id.radio11);
        boolean RadioGroupTwoCorrect = radioButton9.isChecked();
        if (RadioGroupTwoCorrect)
            score += 1;
        // Set up textColors for correct and wrong answers, right shows always, wrong just if its been selected
        radioButton9.setTextColor(getResources().getColor(R.color.goodAnswer));
        if (radioButton6.isChecked())
            radioButton6.setTextColor(getResources().getColor(R.color.wrongAnswer));
        if (radioButton7.isChecked())
            radioButton7.setTextColor(getResources().getColor(R.color.wrongAnswer));
        if (radioButton8.isChecked())
            radioButton8.setTextColor(getResources().getColor(R.color.wrongAnswer));
        if (radioButton10.isChecked())
            radioButton10.setTextColor(getResources().getColor(R.color.wrongAnswer));
        if (radioButton11.isChecked())
            radioButton11.setTextColor(getResources().getColor(R.color.wrongAnswer));

        // Makes Submit Answers button clickable just only once to do not add up points.
        Button submitButton = (Button) findViewById(R.id.submit);
        submitButton.setClickable(false);

        // Shows results on the screen in 3 different toast message, depending on how many point has been scored + 1 for "negative" points to do not show negative points.
        if (score < 0) {
            Toast.makeText(getApplicationContext(), "You have 0 points out of 10. Could be better, try again!", Toast.LENGTH_LONG).show();
        } else if (score < 5) {
            Toast.makeText(getApplicationContext(), "You have " + score + " points out of 10. Could be better, try again!", Toast.LENGTH_LONG).show();
        } else if (score < 9) {
            Toast.makeText(getApplicationContext(), "You have " + score + " points out of 10. Well done!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "You have " + score + " points out of 10. You are brilliant!", Toast.LENGTH_LONG).show();
        }

    }

    // Restarts the application when the Restart Quiz button is pressed.
    public void restartQuiz(View view) {
        score = 0;
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

