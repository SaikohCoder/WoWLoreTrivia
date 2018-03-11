package com.example.android.wowloretrivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    float score = 0;
    boolean q1 = false;
    boolean q2 = false;
    boolean q3 = false;
    boolean q4 = false;
    boolean q5 = false;
    boolean q6 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClickedQ1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_illidan_q1:
                if (checked)
                    q1 = true;
                break;
            case R.id.radio_guldan_q1:
                if (checked)
                    q1 = false;
                break;
            case R.id.radio_khadgar_q1:
                if (checked)
                    q1 = false;
                break;
            case R.id.radio_thrall_q1:
                if (checked)
                    q1 = false;
                break;
        }
    }

    public void onRadioButtonClickedQ2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_guldan_q2:
                if (checked)
                    q2 = true;
                break;
            case R.id.radio_garrosh_q2:
                if (checked)
                    q2 = false;
                break;
            case R.id.radio_khadgar_q2:
                if (checked)
                    q2 = false;
                break;
            case R.id.radio_thrall_q2:
                if (checked)
                    q2 = false;
                break;
        }
    }

    public void onRadioButtonClickedQ3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_sylvanas_q3:
                if (checked)
                    q3 = true;
                break;
            case R.id.radio_chromie_q3:
                if (checked)
                    q3 = false;
                break;
            case R.id.radio_jaina_q3:
                if (checked)
                    q3 = false;
                break;
            case R.id.radio_valeera_q3:
                if (checked)
                    q3 = false;
                break;
        }
    }

    public void onRadioButtonClickedQ4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_voljin_q4:
                if (checked)
                    q4 = true;
                break;
            case R.id.radio_daakara_q4:
                if (checked)
                    q4 = false;
                break;
            case R.id.radio_hakkar_q4:
                if (checked)
                    q4 = false;
                break;
            case R.id.radio_jindo_q4:
                if (checked)
                    q4 = false;
                break;
        }
    }

    public void onRadioButtonClickedQ5(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_khadgar_q5:
                if (checked)
                    q5 = true;
                break;
            case R.id.radio_anduin_q5:
                if (checked)
                    q5 = false;
                break;
            case R.id.radio_greymane_q5:
                if (checked)
                    q5 = false;
                break;
            case R.id.radio_medivh_q5:
                if (checked)
                    q5 = false;
                break;
        }
    }

    public void onRadioButtonClickedQ6(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_thrall_q6:
                if (checked)
                    q6 = true;
                break;
            case R.id.radio_duratan_q6:
                if (checked)
                    q6 = false;
                break;
            case R.id.radio_garrosh_q6:
                if (checked)
                    q6 = false;
                break;
            case R.id.radio_grom_q6:
                if (checked)
                    q6 = false;
                break;
        }
    }


    public void submitAnswers(View view) {


        // Get the name_view text and save it as a new String
        EditText nameField = findViewById(R.id.name_view);
        String name = nameField.getText().toString();

        // If @onRadioButtonClickedQ1 is true, this will add the correct points to the score.
        if (q1) {
            score += 12.5;
        }
        // If @onRadioButtonClickedQ2 is true, this will add the correct points to the score.
        if (q2) {
            score += 12.5;
        }
        // If @onRadioButtonClickedQ3 is true, this will add the correct points to the score.
        if (q3) {
            score += 12.5;
        }
        // If @onRadioButtonClickedQ4 is true, this will add the correct points to the score.
        if (q4) {
            score += 12.5;
        }
        // If @onRadioButtonClickedQ5 is true, this will add the correct points to the score.
        if (q5) {
            score += 12.5;
        }
        // If @onRadioButtonClickedQ6 is true, this will add the correct points to the score.
        if (q6) {
            score += 12.5;
        }

        /**
         * This section checks the correct checkboxes for question 7 and updates the score accordingly
         */
        // Figure out if the user has checked the Sylvanas answer in question 7
        CheckBox sylvanasCheckbox = findViewById(R.id.checkbox_sylvanas_q7);
        boolean sylvanasChecked7 = sylvanasCheckbox.isChecked();

        // Figure out if the user has checked the Anduin answer in question 7
        CheckBox anduinCheckbox = findViewById(R.id.checkbox_anduin_q7);
        boolean anduinChecked7 = anduinCheckbox.isChecked();

        if (anduinChecked7 && sylvanasChecked7) {
            score += 12.5;
        }

        /**
         * This section checks the correct checkboxes for question 8 and updates the score accordingly
         */
        // Figure out if the user has checked the Varian answer in question 8
        CheckBox varianCheckbox = findViewById(R.id.checkbox_varian_q8);
        boolean varianChecked8 = varianCheckbox.isChecked();

        // Figure out if the user has checked the Vol'Jin answer in question 8
        CheckBox voljinCheckbox = findViewById(R.id.checkbox_voljin_q8);
        boolean voljinChecked8 = voljinCheckbox.isChecked();

        if (varianChecked8 && voljinChecked8) {
            score += 12.5;
        }

        /**
         * This section will display a toast to the user displaying their score.
         */
        if (score == 100) {
            Toast.makeText(this, "Congratulations " + name + "! You answered 100% of the questions correct!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, name + ", you answered " + score + "% of the questions correct. Try again for a better score!", Toast.LENGTH_LONG).show();
        }

        /**
         * Resets the score after the toast has been made, so if they select the submit button
         * multiple times it will not keep adding the scores together after each press.
         */
        score = 0;

    }
}
