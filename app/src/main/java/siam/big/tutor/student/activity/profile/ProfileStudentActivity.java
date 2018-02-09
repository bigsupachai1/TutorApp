package siam.big.tutor.student.activity.profile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import siam.big.tutor.R;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;

public class ProfileStudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_profile);
        Toolbars.setUp(this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Transitions.Activity.toLeft(this);
    }
}
