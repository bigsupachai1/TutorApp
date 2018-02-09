package siam.big.tutor.view;

import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Gravity;

/**
 * Created by supaj571 on 29/12/2560.
 */

public class Popups {

    public static final double WIDTH_HALF = 0.5;
    public static final double HEIGHT_HALF = 0.5;
    public static final double WIDTH_FULL = 1;
    public static final double HEIGHT_FULL = 1;

    public static void setUpBottom(AppCompatActivity activity,double height ,double width) {
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        activity.getWindow().setLayout((int)(dm.widthPixels*width),(int)(dm.heightPixels*height));
        activity.getWindow().setGravity(Gravity.BOTTOM);
    }
}
