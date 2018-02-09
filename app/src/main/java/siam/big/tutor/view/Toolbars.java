package siam.big.tutor.view;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import siam.big.tutor.R;

/**
 * Created by supaj571 on 14/12/2560.
 */

public class Toolbars {

    public static void setUp(final AppCompatActivity activity){
        Toolbar toolbar = (Toolbar)activity.findViewById(R.id.toolbar);
        activity.setSupportActionBar(toolbar);
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        activity.getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.finish();
                Transitions.Activity.toLeft(activity);
            }
        });
    }

    public static class Fragment{
        public static void setUp(final AppCompatActivity activity, final android.support.v4.app.Fragment fragment){
            Toolbar toolbar = (Toolbar)activity.findViewById(R.id.toolbar);
            activity.setSupportActionBar(toolbar);
            activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            activity.getSupportActionBar().setDisplayShowHomeEnabled(true);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    fragment.getFragmentManager()
                            .popBackStack();
                    Transitions.Activity.toLeft(activity);
                }
            });
        }
    }
}
