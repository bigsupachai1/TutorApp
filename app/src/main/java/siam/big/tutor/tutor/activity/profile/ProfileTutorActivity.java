package siam.big.tutor.tutor.activity.profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import siam.big.tutor.R;
import siam.big.tutor.tutor.activity.profile.timetable.TutorTimeTableAddActivity;
import siam.big.tutor.tutor.adapter.profile.timetable.TutorTimeTableAdapter;
import siam.big.tutor.view.Recycleviews;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;

public class ProfileTutorActivity extends AppCompatActivity implements View.OnClickListener{
    private RecyclerView mRecyclerView;
    private TutorTimeTableAdapter tutorTimeTableAdapter;
    private ImageView imgAddTimeTable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_profile);
        Toolbars.setUp(this);
        init();
        setUpRecycleView();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Transitions.Activity.toLeft(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imgAddTimeTable:
                Intent i = new Intent(this, TutorTimeTableAddActivity.class);
                startActivity(i);
                break;
        }
    }

    private void setUpRecycleView(){
        mRecyclerView = Recycleviews.Activity.setUpGridLayout(mRecyclerView,this,1,
                GridLayoutManager.VERTICAL,false,this);
        tutorTimeTableAdapter = new TutorTimeTableAdapter();
        mRecyclerView.setAdapter(tutorTimeTableAdapter);
    }

    private void init(){
        imgAddTimeTable = (ImageView)findViewById(R.id.imgAddTimeTable);

        imgAddTimeTable.setOnClickListener(this);
    }


}
