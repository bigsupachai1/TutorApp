package siam.big.tutor.student.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import siam.big.tutor.R;

/**
 * Created by user on 9/12/2560.
 */

public class FragmentTabFindTutor extends Fragment {

    private static final String TAG = "FragmentTabFindTutor";

    public FragmentTabFindTutor() {
        //Constructor
    }

    public static FragmentTabFindTutor newInstance() {
        FragmentTabFindTutor fragment = new FragmentTabFindTutor();
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
        View view = inflater.inflate(R.layout.fragment_student_tab_find_tutor, container, false);
        //Do Something with view
        init(view);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //Step 4
    }

    private void init(View view){
        //findViewById Here
    }


}