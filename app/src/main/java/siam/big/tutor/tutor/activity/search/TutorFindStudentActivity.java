package siam.big.tutor.tutor.activity.search;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import siam.big.tutor.R;
import siam.big.tutor.student.activity.search.StudentFindTutorActivity;
import siam.big.tutor.tutor.adapter.search.TutorFindStudentAdapter;
import siam.big.tutor.view.Recycleviews;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;

public class TutorFindStudentActivity extends AppCompatActivity {

    private static final String TAG = StudentFindTutorActivity.class.getSimpleName();

    private RecyclerView mRecyclerView;
    private TutorFindStudentAdapter tutorFindStudentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_find_student);
        Toolbars.setUp(this);
        init();
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
        tutorFindStudentAdapter = new TutorFindStudentAdapter();
        mRecyclerView.setAdapter(tutorFindStudentAdapter);
    }

    private void init(){

    }
}
