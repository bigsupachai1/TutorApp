package siam.big.tutor.tutor.activity.home.course;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import siam.big.tutor.R;
import siam.big.tutor.tutor.adapter.home.course.TutorSeeCourseAllAdapter;
import siam.big.tutor.view.Recycleviews;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;
import siam.big.tutor.util.Configs;

public class TutorSeeCourseAllActivity extends AppCompatActivity {

    private final static String TAG = "TutorSeeCourseAllActivity";

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private TutorSeeCourseAllAdapter adapter;

    private int layoutPosition = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_see_course_all);
        Toolbars.setUp(this);
        setUpRecycleView();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Transitions.Activity.toLeft(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == Configs.RequestCode.REQUEST_CODE_COURSE) {
            if (resultCode == Activity.RESULT_OK) {
                int code = data.getExtras().getInt(Configs.IntentString.CODE,0);
                Toast.makeText(this,"Position : "+layoutPosition+" | Code : "+code,Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void startPopupCourse(int layoutPosition){
        this.layoutPosition = layoutPosition;
        Intent i = new Intent(this,TutorCourseMenuActivity.class);
        i.putExtra(Configs.IntentString.LAYOUT_POSITION,layoutPosition);
        startActivityForResult(i, Configs.RequestCode.REQUEST_CODE_COURSE);
        Transitions.Activity.toTop(this);
    }

    private void setUpRecycleView(){
        mRecyclerView = Recycleviews.Activity.setUpGridLayout(mRecyclerView,this,1,
                GridLayoutManager.VERTICAL,false,this);
        adapter = new TutorSeeCourseAllAdapter(this);
        mRecyclerView.setAdapter(adapter);
    }

    private void init(){

    }
}
