package siam.big.tutor.template;

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

public class FragmentTemplate  extends Fragment {

    private static final String TAG = "FragmentTemplate";

    private View view;

    public FragmentTemplate() {
        //Constructor
    }

    public static FragmentTemplate newInstance(int sectionNumber) {
        FragmentTemplate fragment = new FragmentTemplate();
        Bundle args = new Bundle();
        args.putInt(TAG, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        //Step 1
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Step 2
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tutor_tab_home, container, false);
        //Step 3
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