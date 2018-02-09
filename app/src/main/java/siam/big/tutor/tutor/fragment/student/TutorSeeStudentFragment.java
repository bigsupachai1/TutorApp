package siam.big.tutor.tutor.fragment.student;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import siam.big.tutor.R;
import siam.big.tutor.tutor.activity.home.student.TutorSeeStudentTotalActivity;
import siam.big.tutor.tutor.adapter.home.student.TutorSeeStudentAdapter;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;

public class TutorSeeStudentFragment extends Fragment implements View.OnClickListener{
    private static String TAG = "TutorSeeTudentActivity";

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private TutorSeeStudentAdapter adapter;

    private ScrollView scrollView;
    private RelativeLayout btnTotal;

    private View view;

    public TutorSeeStudentFragment() {
        //Constructor
    }

    public static TutorSeeStudentFragment newInstance(int sectionNumber) {
        TutorSeeStudentFragment fragment = new TutorSeeStudentFragment();
        Bundle args = new Bundle();
        args.putInt(TAG, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Step 2
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_tutor_see_student, container, false);
        //Step 3
        init(view);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //Step 4
        Toolbars.Fragment.setUp(((AppCompatActivity)getActivity()),this);
        mRecyclerView.setFocusable(false);
        setUpRecycleView();
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_tutor_see_student);
//        init();
//        Toolbars.setUp(this);
//        mRecyclerView.setFocusable(false);
//        setUpRecycleView();
//    }

//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        Transitions.Activity.toLeft(this);
//    }

    @Override
    public void onClick(View view) {
        Intent i ;
        switch (view.getId()){
            case R.id.btnTotal:
                i = new Intent(getContext(),TutorSeeStudentTotalActivity.class);
                startActivity(i);
                Transitions.Fragment.toRight(getActivity());
                break;
        }
    }

    private void setUpRecycleView(){
        mLayoutManager = new GridLayoutManager(getContext(),1 , GridLayoutManager.HORIZONTAL , false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setNestedScrollingEnabled(false);
        mRecyclerView.setAdapter(adapter);

        adapter = new TutorSeeStudentAdapter(null);

        mRecyclerView.setAdapter(adapter);
    }

    private void init(View view){
        mRecyclerView = (RecyclerView)view.findViewById(R.id.recycle_view);

        scrollView = (ScrollView)view.findViewById(R.id.scrollView);

        btnTotal = (RelativeLayout)view.findViewById(R.id.btnTotal);

        btnTotal.setOnClickListener(this);
    }


}
