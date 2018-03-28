package siam.big.tutor.student.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import siam.big.tutor.R;
import siam.big.tutor.all.announce.AnnounceActivity;
import siam.big.tutor.student.activity.home.timetable.TimeTableActivity;
import siam.big.tutor.view.Transitions;

/**
 * Created by user on 9/12/2560.
 */

public class FragmentTabHome extends Fragment implements View.OnClickListener {

    private static final String TAG = "FragmentTabHome";

    private RelativeLayout btnTimeTable;
    private RelativeLayout btnAnnounce;
    private RelativeLayout btnStatus;
    private RelativeLayout btnLocation;

    public FragmentTabHome() {
        //Constructor
    }

    public static FragmentTabHome newInstance() {
        FragmentTabHome fragment = new FragmentTabHome();
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        //Do Something before onCreate.
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Do Something before onCreateView.
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_student_tab_home, container, false);
        //Do Something with view
        init(view);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //Step 4
    }

    @Override
    public void onClick(View view) {
        Intent i = null;
        switch (view.getId()){
            case R.id.btnTimeTable :
                i = new Intent(getContext(), TimeTableActivity.class);
                break;
            case R.id.btnAnnounce :
                i = new Intent(getContext(), AnnounceActivity.class);
                break;
            case R.id.btnStatus :

                break;
            case R.id.btnLocation :

                break;
        }
        if(i != null){
            startActivity(i);
            Transitions.Fragment.toRight(getActivity());
        }
    }

    private void init(View view){
        //findViewById Here
        btnTimeTable = (RelativeLayout) view.findViewById(R.id.btnTimeTable);
        btnAnnounce = (RelativeLayout) view.findViewById(R.id.btnAnnounce);
        btnStatus = (RelativeLayout) view.findViewById(R.id.btnStatus);
        btnLocation = (RelativeLayout) view.findViewById(R.id.btnLocation);

        btnTimeTable.setOnClickListener(this);
        btnAnnounce.setOnClickListener(this);
        btnStatus.setOnClickListener(this);
        btnLocation.setOnClickListener(this);
    }



}