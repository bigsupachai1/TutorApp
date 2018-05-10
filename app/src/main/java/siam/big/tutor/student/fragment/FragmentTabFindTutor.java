package siam.big.tutor.student.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import siam.big.tutor.R;
import siam.big.tutor.all.activity.search.SelectFilterActivity;
import siam.big.tutor.student.activity.search.StudentFindTutorActivity;
import siam.big.tutor.tutor.fragment.FragmentTabFindStudent;
import siam.big.tutor.util.Configs;
import siam.big.tutor.view.Transitions;

/**
 * Created by user on 9/12/2560.
 */

public class FragmentTabFindTutor extends Fragment implements View.OnClickListener{

    private static final String TAG = FragmentTabFindStudent.class.getSimpleName();

    private Button btnSearch;
    private RelativeLayout btnSubject;
    private RelativeLayout btnCourse;
    private RelativeLayout btnProvince;
    private RelativeLayout btnCity;
    private RelativeLayout btnStudyMode;

    private TextView tvSubjectSelect;
    private TextView tvCourseSelect;
    private TextView tvProvinceSelect;
    private TextView tvCitySelect;
    private TextView tvStudyModeSelect;

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

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == Configs.RequestCode.REQUEST_CODE_FILTER){
            if(resultCode == Activity.RESULT_OK){
                int code = data.getExtras().getInt(Configs.IntentString.CODE,0);
                String dataFilter = data.getExtras().getString(Configs.IntentString.FILTER_DATA,"");
                setDataFilter(code,dataFilter);
            }
        }
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.btnSearch:
                intent = new Intent(getContext(), StudentFindTutorActivity.class);
                break;
            case R.id.btnSubject:
                intent = new Intent(getContext(), SelectFilterActivity.class);
                intent.putExtra(Configs.IntentString.CODE , Configs.Code.CODE_SUBJECT);
                break;
            case R.id.btnCourse:
                intent = new Intent(getContext(), SelectFilterActivity.class);
                intent.putExtra(Configs.IntentString.CODE , Configs.Code.CODE_COURSE);
                break;
            case R.id.btnProvince:
                intent = new Intent(getContext(), SelectFilterActivity.class);
                intent.putExtra(Configs.IntentString.CODE , Configs.Code.CODE_PROVINCE);
                break;
            case R.id.btnCity:
                intent = new Intent(getContext(), SelectFilterActivity.class);
                intent.putExtra(Configs.IntentString.CODE , Configs.Code.CODE_CITY);
                break;
            case R.id.btnStudyMode:
                intent = new Intent(getContext(), SelectFilterActivity.class);
                intent.putExtra(Configs.IntentString.CODE , Configs.Code.CODE_STUDY_MODE);
                break;
        }
        if(intent != null){
            startActivityForResult(intent,Configs.RequestCode.REQUEST_CODE_FILTER);
            Transitions.Fragment.toRight(getActivity());
        }
    }

    private void setDataFilter(int code,String data){
        switch (code){
            case Configs.Code.CODE_SUBJECT:
                tvSubjectSelect.setText(data);
                break;
            case Configs.Code.CODE_COURSE:
                tvCourseSelect.setText(data);
                break;
            case Configs.Code.CODE_PROVINCE:
                tvProvinceSelect.setText(data);
                break;
            case Configs.Code.CODE_CITY:
                tvCitySelect.setText(data);
                break;
            case Configs.Code.CODE_STUDY_MODE:
                tvStudyModeSelect.setText(data);
                break;
        }

    }

    private void init(View view){
        //findViewById Here
        btnSearch = (Button)view.findViewById(R.id.btnSearch);
        btnSubject = (RelativeLayout)view.findViewById(R.id.btnSubject);
        btnCourse = (RelativeLayout)view.findViewById(R.id.btnCourse);
        btnProvince = (RelativeLayout)view.findViewById(R.id.btnProvince);
        btnCity = (RelativeLayout)view.findViewById(R.id.btnCity);
        btnStudyMode = (RelativeLayout)view.findViewById(R.id.btnStudyMode);

        tvSubjectSelect = (TextView)view.findViewById(R.id.tvSubjectSelect);
        tvCourseSelect = (TextView)view.findViewById(R.id.tvCourseSelect);
        tvProvinceSelect = (TextView)view.findViewById(R.id.tvProvinceSelect);
        tvCitySelect = (TextView)view.findViewById(R.id.tvCitySelect);
        tvStudyModeSelect = (TextView)view.findViewById(R.id.tvStudyModeSelect);

        btnSearch.setOnClickListener(this);
        btnSubject.setOnClickListener(this);
        btnCourse.setOnClickListener(this);
        btnProvince.setOnClickListener(this);
        btnCity.setOnClickListener(this);
        btnStudyMode.setOnClickListener(this);
    }


}