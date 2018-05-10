package siam.big.tutor.student.activity.search;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import siam.big.tutor.R;
import siam.big.tutor.student.adapter.home.timetable.StudentTimeTableAdapter;
import siam.big.tutor.student.adapter.search.StudentFindTutorAdapter;
import siam.big.tutor.view.Recycleviews;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;

public class StudentFindTutorActivity extends AppCompatActivity {

    private static final String TAG = StudentFindTutorActivity.class.getSimpleName();

    private RecyclerView mRecyclerView;
    private StudentFindTutorAdapter studentFindTutorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_find_tutor);
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
        studentFindTutorAdapter = new StudentFindTutorAdapter();
        mRecyclerView.setAdapter(studentFindTutorAdapter);
    }

    private void init(){

    }
}
