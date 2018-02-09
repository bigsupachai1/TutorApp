package siam.big.tutor.tutor.activity.home.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import siam.big.tutor.R;
import siam.big.tutor.tutor.adapter.home.student.TutorSeeStudentTotalAdapter;
import siam.big.tutor.view.Recycleviews;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;

public class TutorSeeStudentTotalActivity extends AppCompatActivity {
    private static String TAG = "TutorSeeStudentTotalActivity";

    private RecyclerView mRecyclerView;
    private TutorSeeStudentTotalAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_see_student_total);
        init();
        Toolbars.setUp(this);
        setUpRecycleView();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Transitions.Activity.toLeft(this);
    }

    private void setUpRecycleView(){
        mRecyclerView = Recycleviews.Activity.setUpGridLayout(mRecyclerView,this,1,
                 GridLayoutManager.VERTICAL,false,this);
        adapter = new TutorSeeStudentTotalAdapter(null);
        mRecyclerView.setAdapter(adapter);
    }

    private void init(){

    }
}
