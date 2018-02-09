package siam.big.tutor.tutor.activity.home.course;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import siam.big.tutor.R;
import siam.big.tutor.tutor.adapter.home.course.TutorSeeCourseAdapter;
import siam.big.tutor.view.Recycleviews;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;

public class TutorSeeCourseActivity extends AppCompatActivity {

    private final static String TAG = "TutorSeeCourseActivity";

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private TutorSeeCourseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_see_course);
        Toolbars.setUp(this);
        setUpRecycleView();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Transitions.Activity.toLeft(this);
    }

    private void setUpRecycleView(){
        mRecyclerView = Recycleviews.Activity.setUpGridLayout(mRecyclerView,this,2,
                GridLayoutManager.VERTICAL,false,this);
        adapter = new TutorSeeCourseAdapter(this);
        mRecyclerView.setAdapter(adapter);
    }

    private void init(){

    }
}
