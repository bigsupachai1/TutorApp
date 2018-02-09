package siam.big.tutor.student.activity.home.timetable;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import siam.big.tutor.R;
import siam.big.tutor.student.adapter.home.timetable.TimeTableAdapter;
import siam.big.tutor.view.Recycleviews;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;

public class TimeTableActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView mRecyclerView;
    private FloatingActionButton btnAddNewPlan;
    private TimeTableAdapter timeTableAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_time_table);
        init();
        Toolbars.setUp(this);
        setUpRecycleView();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Transitions.Activity.toLeft(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.btnAddNewPlan:
                i = new Intent(this,TimeTableAddActivity.class);
                startActivity(i);
                Transitions.Activity.toRight(this);
                break;
        }
    }

    private void setUpRecycleView(){
        mRecyclerView = Recycleviews.Activity.setUpGridLayout(mRecyclerView,this,1,
                GridLayoutManager.VERTICAL,false,this);
        timeTableAdapter = new TimeTableAdapter();
        mRecyclerView.setAdapter(timeTableAdapter);
    }

    private void init(){
        btnAddNewPlan = (FloatingActionButton)findViewById(R.id.btnAddNewPlan);

        btnAddNewPlan.setOnClickListener(this);
    }


}
