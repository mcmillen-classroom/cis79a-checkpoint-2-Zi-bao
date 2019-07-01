package Zihao.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTextView;

    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;

    private Question[] mQuestions;
    private int mIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTrueButton = (Button) findViewById(R.id.true_button);
        mFalseButton = (Button) findViewById(R.id.false_button);
        mNextButton = (Button) findViewById(R.id.next_button);

        mTrueButton.setOnClickListener(this);
        mFalseButton.setOnClickListener(this);
        mNextButton.setOnClickListener(this);

        mTextView = (TextView) findViewById(R.id.text_view);
        //Initialize an array of questions
        mQuestions = new Question[5];
        mIndex = 0;

        //initialize each slot in the array
        mQuestions[0] = new Question(R.string.question_1, true);
        mQuestions[1] = new Question(R.string.question_2, false);
        mQuestions[2] = new Question(R.string.question_3, true);
        mQuestions[3] = new Question(R.string.question_4, true);
        mQuestions[4] = new Question(R.string.question_5, false);
        mTextView.setText(mQuestions[mIndex].getTextResID());
    }

    @Override
    public void onClick(View view) {
        TextView myTextView = (TextView) view;

        if (view.getId() == R.id.true_button && mQuestions[mIndex].getAnswer() == true) {
            Toast myToast = Toast.makeText(this, "You are correct", Toast.LENGTH_SHORT);
            myToast.show();
        } else if (view.getId() == R.id.false_button && mQuestions[mIndex].getAnswer() == false) {
            Toast myToast = Toast.makeText(this, "You are correct", Toast.LENGTH_SHORT);
            myToast.show();
        }
        else if (view.getId() ==R.id.next_button)
        {

        }
        else{
            Toast myToast = Toast.makeText(this, "You are incorrect", Toast.LENGTH_SHORT);
            myToast.show();
        }
    }
}