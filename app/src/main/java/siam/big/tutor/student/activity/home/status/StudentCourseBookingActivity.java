package siam.big.tutor.student.activity.home.status;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import siam.big.tutor.R;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;

public class StudentCourseBookingActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnAcceptAndBooking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_course_booking);
        Toolbars.setUp(this);
        init();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Transitions.Activity.toLeft(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = null;
        switch (v.getId()){
            case R.id.btnAcceptAndBooking:
                i = new Intent(this , StudentCourseBookingDetailActivity.class);
                break;
        }
        if(i != null){
            startActivity(i);
            Transitions.Activity.toRight(this);
        }
    }

    private void init(){
        btnAcceptAndBooking = findViewById(R.id.btnAcceptAndBooking);

        btnAcceptAndBooking.setOnClickListener(this);
    }


}
