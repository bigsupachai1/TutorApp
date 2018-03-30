package siam.big.tutor.tutor.activity.profile.timetable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import java.util.Calendar;

import siam.big.tutor.R;
import siam.big.tutor.view.Dialogs;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;

public class TutorTimeTableAddActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener , View.OnClickListener {
    private final static String TAG = "TutorTimeTableAddActivity";
    private DatePickerDialog datePickerDialog;
    private RelativeLayout btnCalendar;
    private TextView tvCalendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_time_table_add);
        init();
        Toolbars.setUp(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        datePickerDialog = (DatePickerDialog) getFragmentManager().findFragmentByTag(Dialogs.TAG_DATE);
        if(datePickerDialog != null) datePickerDialog.setOnDateSetListener(TutorTimeTableAddActivity.this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Transitions.Activity.toLeft(TutorTimeTableAddActivity.this);
    }

    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
        // ****** ส่ง ข้อมูลไปเซิฟเวอร์เป็น Format  Yyyy-mm-dd (ยังไม่ได้ทำ)********
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,monthOfYear,dayOfMonth);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String dayOfWeekText ;
        switch (dayOfWeek){
            case Calendar.SUNDAY:
                dayOfWeekText = getResources().getString(R.string.text_sunday);
                break;
            case Calendar.MONDAY:
                dayOfWeekText = getResources().getString(R.string.text_monday);
                break;
            case Calendar.TUESDAY:
                dayOfWeekText = getResources().getString(R.string.text_tuesday);
                break;
            case Calendar.WEDNESDAY:
                dayOfWeekText = getResources().getString(R.string.text_wednesday);
                break;
            case Calendar.THURSDAY:
                dayOfWeekText = getResources().getString(R.string.text_thursday);
                break;
            case Calendar.FRIDAY:
                dayOfWeekText = getResources().getString(R.string.text_friday);
                break;
            case Calendar.SATURDAY:
                dayOfWeekText = getResources().getString(R.string.text_saturday);
                break;
            default:
                dayOfWeekText = "";
                break;
        }
        int month = calendar.get(Calendar.MONTH);
        String monthText ;
        switch (month){
            case Calendar.JANUARY:
                monthText = getResources().getString(R.string.text_january);
                break;
            case Calendar.FEBRUARY:
                monthText = getResources().getString(R.string.text_february);
                break;
            case Calendar.MARCH:
                monthText = getResources().getString(R.string.text_march);
                break;
            case Calendar.APRIL:
                monthText = getResources().getString(R.string.text_april);
                break;
            case Calendar.MAY:
                monthText = getResources().getString(R.string.text_may);
                break;
            case Calendar.JUNE:
                monthText = getResources().getString(R.string.text_june);
                break;
            case Calendar.JULY:
                monthText = getResources().getString(R.string.text_july);
                break;
            case Calendar.AUGUST:
                monthText = getResources().getString(R.string.text_august);
                break;
            case Calendar.SEPTEMBER:
                monthText = getResources().getString(R.string.text_september);
                break;
            case Calendar.OCTOBER:
                monthText = getResources().getString(R.string.text_october);
                break;
            case Calendar.NOVEMBER:
                monthText = getResources().getString(R.string.text_november);
                break;
            case Calendar.DECEMBER:
                monthText = getResources().getString(R.string.text_december);
                break;
            default:
                monthText = "";
                break;
        }
        tvCalendar.setText(dayOfWeekText + " "+dayOfMonth+"-"+monthText+"-"+year);

        String date = "You picked the following date:  "+dayOfWeek+" "+dayOfMonth+"/"+(++monthOfYear)+"/"+year;
        Toast.makeText(getApplicationContext(),date+"",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCalendar:
                    Dialogs.getDate(datePickerDialog, getFragmentManager(), TutorTimeTableAddActivity.this);
                break;
        }
    }

    private void init(){
        tvCalendar = (TextView)findViewById(R.id.tvCalendar);
        btnCalendar = (RelativeLayout)findViewById(R.id.btnCalendar);
        btnCalendar.setOnClickListener(this);
    }


}
