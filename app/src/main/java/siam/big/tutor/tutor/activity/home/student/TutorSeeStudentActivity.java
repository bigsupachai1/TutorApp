package siam.big.tutor.tutor.activity.home.student;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import siam.big.tutor.R;
import siam.big.tutor.tutor.adapter.home.student.TutorSeeStudentAdapter;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;

public class TutorSeeStudentActivity extends AppCompatActivity implements View.OnClickListener{
    private static String TAG = "TutorSeeTudentActivity";

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private TutorSeeStudentAdapter adapter;

    private ScrollView scrollView;
    private RelativeLayout btnTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_see_student);
        init();
        Toolbars.setUp(this);
        mRecyclerView.setFocusable(false);
        setUpRecycleView();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Transitions.Activity.toLeft(this);
    }

    @Override
    public void onClick(View view) {
        Intent i ;
        switch (view.getId()){
            case R.id.btnTotal:
                i = new Intent(this,TutorSeeStudentTotalActivity.class);
                startActivity(i);
                Transitions.Activity.toRight(this);
                break;
        }
    }

    private void setUpRecycleView(){
        mLayoutManager = new GridLayoutManager(this,1 , GridLayoutManager.HORIZONTAL , false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setNestedScrollingEnabled(false);
        mRecyclerView.setAdapter(adapter);

        adapter = new TutorSeeStudentAdapter(null);

        mRecyclerView.setAdapter(adapter);
    }

    private void init(){
        mRecyclerView = (RecyclerView)findViewById(R.id.recycle_view);

        scrollView = (ScrollView)findViewById(R.id.scrollView);

        btnTotal = (RelativeLayout)findViewById(R.id.btnTotal);

        btnTotal.setOnClickListener(this);
    }


}
