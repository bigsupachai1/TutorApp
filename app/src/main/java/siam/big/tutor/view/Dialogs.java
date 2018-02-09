package siam.big.tutor.view;

import android.app.Dialog;
import android.app.FragmentManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;

import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import java.util.Calendar;


/**
 * Created by supaj571 on 17/01/2561.
 */

public class Dialogs {
    public static final String TAG_DATE = "Datepickerdialog";
    public static final String TAG_GET_DIALOG = "Get Dialogs";
    public static void getDate(DatePickerDialog datePickerDialog, FragmentManager fragment, DatePickerDialog.OnDateSetListener callBack){

        Calendar now = Calendar.getInstance();
        if (datePickerDialog == null) {
            datePickerDialog = DatePickerDialog.newInstance(
                    callBack,
                    now.get(Calendar.YEAR),
                    now.get(Calendar.MONTH),
                    now.get(Calendar.DAY_OF_MONTH)
            );
        } else {
            datePickerDialog.initialize(
                    callBack,
                    now.get(Calendar.YEAR),
                    now.get(Calendar.MONTH),
                    now.get(Calendar.DAY_OF_MONTH)
            );
        }
        datePickerDialog.setThemeDark(false);
        datePickerDialog.vibrate(false);
        datePickerDialog.dismissOnPause(false);
        datePickerDialog.showYearPickerFirst(false);
        datePickerDialog.setVersion(DatePickerDialog.Version.VERSION_1);
        if (false) {
            datePickerDialog.setAccentColor(Color.parseColor("#9C27B0"));
        }
        if (false) {
            datePickerDialog.setTitle("DatePicker Title");
        }
        if (false) {
            Calendar date1 = Calendar.getInstance();
            Calendar date2 = Calendar.getInstance();
            date2.add(Calendar.WEEK_OF_MONTH, -1);
            Calendar date3 = Calendar.getInstance();
            date3.add(Calendar.WEEK_OF_MONTH, 1);
            Calendar[] days = {date1, date2, date3};
            datePickerDialog.setHighlightedDays(days);
        }
        if (false) {
            Calendar[] days = new Calendar[13];
            for (int i = -6; i < 7; i++) {
                Calendar day = Calendar.getInstance();
                day.add(Calendar.DAY_OF_MONTH, i * 2);
                days[i + 6] = day;
            }
            datePickerDialog.setSelectableDays(days);
        }
        if (false) {
            if (datePickerDialog.getVersion() == DatePickerDialog.Version.VERSION_1) {
                datePickerDialog.setScrollOrientation(DatePickerDialog.ScrollOrientation.HORIZONTAL);
            } else {
                datePickerDialog.setScrollOrientation(DatePickerDialog.ScrollOrientation.VERTICAL);
            }
        }
        datePickerDialog.show(fragment, TAG_DATE);
    }

    public static Dialog getDialog(Context context, int layout) {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(layout);
        dialog.setCancelable(true);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        return dialog;
    }
}
