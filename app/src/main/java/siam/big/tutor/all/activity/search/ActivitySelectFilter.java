package siam.big.tutor.all.activity.search;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import siam.big.tutor.R;
import siam.big.tutor.all.adapter.search.AdapterSelectFilter;
import siam.big.tutor.tutor.listener.ListenerFilter;
import siam.big.tutor.util.Configs;
import siam.big.tutor.view.Recycleviews;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;

public class ActivitySelectFilter extends AppCompatActivity implements ListenerFilter<String>{

    private static final String TAG = ActivitySelectFilter.class.getSimpleName();

    private RecyclerView recycle_view;
    private AdapterSelectFilter adapterTutorSelectFilter;

    private TextView tvToolbarFilter;

    private int code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_select_filter);
        Toolbars.setUp(this);
        init();
        setUpData();
        setUpToolbar();
        setUpRecycleview();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Transitions.Activity.toBottom(this);
    }

    @Override
    public void onListSelected(String data) {
        Intent returnData = new Intent();
        returnData.putExtra(Configs.IntentString.CODE,code);
        returnData.putExtra(Configs.IntentString.FILTER_DATA,data);
        setResult(Activity.RESULT_OK,returnData);
        finish();
        Transitions.Activity.toBottom(this);
    }

    private void setUpData(){
        code = getIntent().getExtras().getInt(Configs.IntentString.CODE,0);
    }

    private void setUpToolbar(){
        String data = null;
        switch (code){
            case Configs.Code.CODE_SUBJECT:
                data = getResources().getString(R.string.text_select_subject);
                break;
            case Configs.Code.CODE_COURSE:
                data = getResources().getString(R.string.text_select_course);
                break;
            case Configs.Code.CODE_PROVINCE:
                data = getResources().getString(R.string.text_select_province);
                break;
            case Configs.Code.CODE_CITY:
                data = getResources().getString(R.string.text_select_city);
                break;
        }
        if(data != null){
            tvToolbarFilter.setText(data);
        }

    }

    private void setUpRecycleview(){
        recycle_view = Recycleviews.Activity.setUpGridLayout(recycle_view,this,1,
                GridLayoutManager.VERTICAL,false,this);
        adapterTutorSelectFilter = new AdapterSelectFilter(this);
        recycle_view.setAdapter(adapterTutorSelectFilter);
    }

    private void init(){
        tvToolbarFilter = (TextView)findViewById(R.id.tvToolbarFilter);
    }


}
