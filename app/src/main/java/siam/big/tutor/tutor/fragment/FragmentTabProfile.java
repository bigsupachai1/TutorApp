package siam.big.tutor.tutor.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import siam.big.tutor.R;
import siam.big.tutor.tutor.activity.profile.ProfileTutorActivity;
import siam.big.tutor.view.Transitions;

/**
 * Created by user on 9/12/2560.
 */

public class FragmentTabProfile extends Fragment implements View.OnClickListener{
    private static final String TAG = "FragmentTabProfile";

    private ImageView imgEditProfile;

    public FragmentTabProfile() {
        //Constructor
    }

    public static FragmentTabProfile newInstance(int sectionNumber) {
        FragmentTabProfile fragment = new FragmentTabProfile();
        Bundle args = new Bundle();
        args.putInt(TAG, sectionNumber);
        fragment.setArguments(args);
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
        View view = inflater.inflate(R.layout.fragment_tutor_tab_profile, container, false);
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
        imgEditProfile = view.findViewById(R.id.imgEditProfile);
        imgEditProfile.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.imgEditProfile:
                i = new Intent(getContext(), ProfileTutorActivity.class);
                startActivity(i);
                Transitions.Fragment.toRight(getActivity());
                break;
        }
    }
}