package siam.big.tutor.template;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import siam.big.tutor.R;
import siam.big.tutor.tutor.adapter.home.course.TutorSeeCourseAdapter;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;

public class ActivityAdapterTemplate extends AppCompatActivity {

    private final static String TAG = "TutorSeeCourseActivity";

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private TutorSeeCourseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_see_course);
        Toolbars.setUp(this);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Transitions.Activity.toLeft(this);
    }

    private void setUpRecycleView(){
//        mRecyclerView = Recycleviews.Activity.setUpGridLayout(mRecyclerView,this,1,
//                GridLayoutManager.VERTICAL,false,this);
//        adapter = new TutorSeeCourseAdapter();
//        mRecyclerView.setAdapter(adapter);
    }

    private void init(){

    }
}
