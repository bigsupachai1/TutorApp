package siam.big.tutor.student.activity.register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import siam.big.tutor.R;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;

public class StudentRegisterPageTwoActivity extends AppCompatActivity {
    private static final String TAG = StudentRegisterPageTwoActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_register_page_two);
        Toolbars.setUp(this);
        init();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Transitions.Activity.toLeft(this);
    }

    private void init(){

    }
}
