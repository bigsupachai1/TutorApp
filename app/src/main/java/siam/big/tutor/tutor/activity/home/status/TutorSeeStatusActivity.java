package siam.big.tutor.tutor.activity.home.status;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import siam.big.tutor.R;
import siam.big.tutor.tutor.adapter.home.status.TutorSeeStatusAdapter;
import siam.big.tutor.view.Recycleviews;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;

public class TutorSeeStatusActivity extends AppCompatActivity {
    private static String TAG = TutorSeeStatusActivity.class.getSimpleName();

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private TutorSeeStatusAdapter adapter;

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
        adapter = new TutorSeeStatusAdapter();
        mRecyclerView.setAdapter(adapter);
    }

    private void init(){

    }
}
