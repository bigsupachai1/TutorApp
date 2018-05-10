package siam.big.tutor.tutor.fragment;

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
import siam.big.tutor.tutor.activity.search.TutorFindStudentActivity;
import siam.big.tutor.util.Configs;
import siam.big.tutor.view.Transitions;

/**
 * Created by user on 9/12/2560.
 */

public class FragmentTabFindStudent extends Fragment implements View.OnClickListener {

    private static final String TAG = FragmentTabFindStudent.class.getSimpleName();

    private Button btnSearch;
    private RelativeLayout btnSubject;
    private RelativeLayout btnCourse;
    private RelativeLayout btnProvince;
    private RelativeLayout btnCity;

    private TextView tvSubjectSelect;
    private TextView tvCourseSelect;
    private TextView tvProvinceSelect;
    private TextView tvCitySelect;

    public FragmentTabFindStudent() {
        //Constructor
    }

    public static FragmentTabFindStudent newInstance(int sectionNumber) {
        FragmentTabFindStudent fragment = new FragmentTabFindStudent();
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
        View view = inflater.inflate(R.layout.fragment_tutor_tab_find_student, container, false);
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
                intent = new Intent(getContext(), TutorFindStudentActivity.class);
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
        }

    }

    private void init(View view){
        //findViewById Here
        btnSearch = (Button)view.findViewById(R.id.btnSearch);
        btnSubject = (RelativeLayout)view.findViewById(R.id.btnSubject);
        btnCourse = (RelativeLayout)view.findViewById(R.id.btnCourse);
        btnProvince = (RelativeLayout)view.findViewById(R.id.btnProvince);
        btnCity = (RelativeLayout)view.findViewById(R.id.btnCity);

        tvSubjectSelect = (TextView)view.findViewById(R.id.tvSubjectSelect);
        tvCourseSelect = (TextView)view.findViewById(R.id.tvCourseSelect);
        tvProvinceSelect = (TextView)view.findViewById(R.id.tvProvinceSelect);
        tvCitySelect = (TextView)view.findViewById(R.id.tvCitySelect);

        btnSearch.setOnClickListener(this);
        btnSubject.setOnClickListener(this);
        btnCourse.setOnClickListener(this);
        btnProvince.setOnClickListener(this);
        btnCity.setOnClickListener(this);
    }

}