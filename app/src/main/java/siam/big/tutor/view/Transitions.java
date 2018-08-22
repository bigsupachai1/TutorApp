package siam.big.tutor.view;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;

import siam.big.tutor.R;

/**
 * Created by supaj571 on 22/12/2560.
 */

public class Transitions {
    public static class Activity {
        public static void toLeft(AppCompatActivity activity){
            activity.overridePendingTransition(R.anim.scale_up,R.anim.left_in);
        }

        public static void toRight(AppCompatActivity activity){
            activity.overridePendingTransition(R.anim.right_in,R.anim.scale_down);
        }

        public static void toTop(AppCompatActivity activity){
            activity.overridePendingTransition(R.anim.to_top,R.anim.no_anim);
        }

        public static void toBottom(AppCompatActivity activity){
            activity.overridePendingTransition(R.anim.no_anim,R.anim.to_bottom);
        }
    }

    public static class Fragment {
        public static void toLeft(FragmentActivity activity){
            activity.overridePendingTransition(R.anim.scale_up,R.anim.left_in);
        }

        public static void toRight(FragmentActivity activity){
            activity.overridePendingTransition(R.anim.right_in,R.anim.scale_down);
        }

        public static void toTop(FragmentActivity activity){
            activity.overridePendingTransition(R.anim.to_top,R.anim.no_anim);
        }

        public static void toBottom(FragmentActivity activity){
            activity.overridePendingTransition(R.anim.no_anim,R.anim.to_bottom);
        }
    }


}
