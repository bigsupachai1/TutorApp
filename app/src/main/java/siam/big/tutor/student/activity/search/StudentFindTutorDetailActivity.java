package siam.big.tutor.student.activity.search;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import siam.big.tutor.R;
import siam.big.tutor.tutor.adapter.home.student.TutorSeeStudentAdapter;
import siam.big.tutor.view.Recycleviews;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;

public class StudentFindTutorDetailActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private TutorSeeStudentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_find_tutor_detail);
        init();
        setUpRecycleView();
        Toolbars.setUp(this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Transitions.Activity.toLeft(this);
    }

    private void init(){

    }

    private void setUpRecycleView(){
        mRecyclerView = Recycleviews.Activity.setUpGridLayout(mRecyclerView,this,1,
                GridLayoutManager.HORIZONTAL,false,this);
        adapter = new TutorSeeStudentAdapter(null);
        mRecyclerView.setAdapter(adapter);
    }
}
