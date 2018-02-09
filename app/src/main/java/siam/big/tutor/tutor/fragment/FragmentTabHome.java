package siam.big.tutor.tutor.fragment;

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
import siam.big.tutor.tutor.activity.home.badges.TutorSeeBadgesActivity;
import siam.big.tutor.tutor.activity.home.course.TutorSeeCourseActivity;
import siam.big.tutor.tutor.activity.home.student.TutorSeeStudentActivity;
import siam.big.tutor.view.Transitions;

/**
 * Created by user on 9/12/2560.
 */

public class FragmentTabHome extends Fragment implements View.OnClickListener {

    private static final String TAG = "FragmentTemplate";

    private RelativeLayout btnStudent,btnCourse,btnStatus,btnBadges;

    public FragmentTabHome() {
        //Constructor
    }

    public static FragmentTabHome newInstance(int sectionNumber) {
        FragmentTabHome fragment = new FragmentTabHome();
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
        View view = inflater.inflate(R.layout.fragment_tutor_tab_home, container, false);
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
        Intent i ;
        switch (view.getId()){
            case R.id.btnStudent:
                i = new Intent(getContext(), TutorSeeStudentActivity.class);
                getContext().startActivity(i);
                Transitions.Fragment.toRight(getActivity());
//                getChildFragmentManager().beginTransaction()
//                        .setCustomAnimations(R.anim.fade_in,R.anim.scale_down,R.anim.scale_up,R.anim.fade_out)
//                        .replace(R.id.container, TutorSeeStudentFragment.newInstance(123))
//                        .addToBackStack(null)
//                        .commit();
                break;
            case R.id.btnCourse:
                i = new Intent(getContext() , TutorSeeCourseActivity.class);
                getContext().startActivity(i);
                Transitions.Fragment.toRight(getActivity());
                break;
            case R.id.btnBadges:
                i = new Intent(getContext() , TutorSeeBadgesActivity.class);
                getContext().startActivity(i);
                Transitions.Fragment.toRight(getActivity());
                break;
        }

    }

    private void init(View view){
        //findViewById Here
        btnStudent = (RelativeLayout)view.findViewById(R.id.btnStudent);
        btnCourse = (RelativeLayout)view.findViewById(R.id.btnCourse);
        btnBadges = (RelativeLayout)view.findViewById(R.id.btnBadges);
        btnStatus = (RelativeLayout)view.findViewById(R.id.btnStatus);

        btnStudent.setOnClickListener(this);
        btnBadges.setOnClickListener(this);
        btnCourse.setOnClickListener(this);
    }

}