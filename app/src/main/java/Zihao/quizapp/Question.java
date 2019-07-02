package Zihao.quizapp;

public class Question {
    private int mTextResId;
    private boolean mAnswer;
    private int mHintTextResId;


    public Question(int textResId, boolean answer, int hintTextResId) {
        mTextResId = textResId;
        mAnswer = answer;
        mHintTextResId = hintTextResId;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean getAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }

    public int getmHintTextResId() {
        return mHintTextResId;
    }

}
