package siam.big.tutor.student.activity.register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import siam.big.tutor.R;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;

public class StudentRegisterPageOneActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = StudentRegisterPageOneActivity.class.getSimpleName();

    private ImageView imgNext;

    private TextView tvNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_register_page_one);
        Toolbars.setUp(this);
        init();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Transitions.Activity.toLeft(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imgNext:

                break;
            case R.id.tvNext:
                Intent i = new Intent(this,StudentRegisterPageTwoActivity.class);
                startActivity(i);
                break;
        }
    }

    private void init(){
        imgNext = (ImageView)findViewById(R.id.imgNext);

        tvNext = (TextView)findViewById(R.id.tvNext);

        imgNext.setOnClickListener(this);
        tvNext.setOnClickListener(this);
    }


}
