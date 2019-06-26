package Zihao.quizapp;

public class Question
{
    private int mTextResID;
    private boolean mAnswer

    public Question(int textResID, boolean answer) {
        mTextResID = textResID;
        mAnswer = answer;
    }

    public int getTextResID() {
        return mTextResID;
    }

    public void setTextResID(int textResID) {
        mTextResID = textResID;
    }

    public boolean getAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
