package siam.big.tutor.student.activity.home.status;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import siam.big.tutor.R;
import siam.big.tutor.student.adapter.home.status.StudentSeeStatusAdapter;
import siam.big.tutor.view.Recycleviews;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;

public class StudentSeeStatusActivity extends AppCompatActivity {
    private static String TAG = StudentSeeStatusActivity.class.getSimpleName();

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private StudentSeeStatusAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_see_status);
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
        adapter = new StudentSeeStatusAdapter();
        mRecyclerView.setAdapter(adapter);
    }

    private void init(){

    }
}
