package siam.big.tutor.all.activity.announce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import siam.big.tutor.R;
import siam.big.tutor.tutor.adapter.home.announce.AnnounceAdapter;
import siam.big.tutor.view.Recycleviews;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;

public class AnnounceActivity extends AppCompatActivity implements View.OnClickListener {

    private final static String TAG = "AnnounceActivity";

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private AnnounceAdapter adapter;
    private ImageView imgAddAnnounce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_announce);
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
        Intent i = null;
        switch (view.getId()){
            case R.id.imgAddAnnounce:
                i = new Intent(this,AnnounceAddActivity.class);
                break;
        }
        if(i != null){
            startActivity(i);
            Transitions.Activity.toRight(this);
        }
    }

    private void setUpRecycleView(){
        mRecyclerView = Recycleviews.Activity.setUpGridLayout(mRecyclerView,this,1,
                GridLayoutManager.VERTICAL,false,this);
        adapter = new AnnounceAdapter();
        mRecyclerView.setAdapter(adapter);
    }

    private void init(){
        imgAddAnnounce = (ImageView)findViewById(R.id.imgAddAnnounce);

        imgAddAnnounce.setOnClickListener(this);
    }


}
