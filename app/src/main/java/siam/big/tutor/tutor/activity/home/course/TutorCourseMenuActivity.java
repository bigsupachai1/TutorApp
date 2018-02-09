package siam.big.tutor.tutor.activity.home.course;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import siam.big.tutor.R;
import siam.big.tutor.view.Popups;
import siam.big.tutor.view.Transitions;
import siam.big.tutor.util.Configs;

public class TutorCourseMenuActivity extends AppCompatActivity implements View.OnClickListener {

    private RelativeLayout btnEdit,btnDelete,btnFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_see_course_menu);
        Popups.setUpBottom(this,Popups.HEIGHT_FULL,Popups.WIDTH_FULL);
        init();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Transitions.Activity.toBottom(this);
    }

    @Override
    public void onClick(View view) {
        Intent returnData;
        switch (view.getId()){
            case R.id.btnEdit:
                returnData = new Intent();
                returnData.putExtra(Configs.IntentString.CODE, Configs.Code.CODE_EDIT);
                setResult(Activity.RESULT_OK,returnData);
                finish();
                Transitions.Activity.toBottom(this);
                break;
            case R.id.btnDelete:
                returnData = new Intent();
                returnData.putExtra(Configs.IntentString.CODE, Configs.Code.CODE_DELETE);
                setResult(Activity.RESULT_OK,returnData);
                finish();
                Transitions.Activity.toBottom(this);
                break;
            case R.id.btnFinish:
                finish();
                Transitions.Activity.toBottom(this);
                break;
        }
    }

    private void init(){
        btnEdit = (RelativeLayout)findViewById(R.id.btnEdit);
        btnDelete = (RelativeLayout)findViewById(R.id.btnDelete);
        btnFinish = (RelativeLayout)findViewById(R.id.btnFinish);

        btnEdit.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
        btnFinish.setOnClickListener(this);
    }

}
