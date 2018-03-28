package siam.big.tutor.tutor.activity.profile.badges;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import siam.big.tutor.R;
import siam.big.tutor.tutor.adapter.profile.badges.TutorSeeBadgesAdapter;
import siam.big.tutor.tutor.listener.ListenerBadges;
import siam.big.tutor.view.Recycleviews;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;
import siam.big.tutor.util.Configs;

public class TutorSeeBadgesActivity extends AppCompatActivity implements ListenerBadges{

    private static String TAG = "TutorSeeTudentActivity";

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private TutorSeeBadgesAdapter adapter;

    private ScrollView scrollView;
    private RelativeLayout btnTotal;

    private int layoutPosition = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_see_badges);
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
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == Configs.RequestCode.REQUEST_CODE_BADGES) {
            if (resultCode == Activity.RESULT_OK) {
                int code = data.getExtras().getInt(Configs.IntentString.CODE,0);
                Toast.makeText(this,"Position : "+layoutPosition+" | Code : "+code,Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void setUpRecycleView(){
        mRecyclerView = Recycleviews.Activity.setUpGridLayout(mRecyclerView,this,1,
                GridLayoutManager.VERTICAL,false,this);
        adapter = new TutorSeeBadgesAdapter(this);
        mRecyclerView.setAdapter(adapter);
    }

    private void init(){

    }

    @Override
    public void onListSelected(int position) {
        this.layoutPosition = position;
        Intent i = new Intent(this,TutorBadgesMenuActivity.class);
        i.putExtra(Configs.IntentString.LAYOUT_POSITION,layoutPosition);
        startActivityForResult(i, Configs.RequestCode.REQUEST_CODE_BADGES);
        Transitions.Activity.toTop(this);
    }
}
