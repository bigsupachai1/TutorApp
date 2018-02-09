package siam.big.tutor.view;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import siam.big.tutor.R;

/**
 * Created by supaj571 on 18/12/2560.
 */

public class Recycleviews {

    public static class Activity{
        public static RecyclerView setUpGridLayout(RecyclerView recyclerView , Context context, int spanCount,
                                                   int oreintation, boolean reverseLayout , AppCompatActivity activity){
            recyclerView = (RecyclerView)activity.findViewById(R.id.recycle_view);
            RecyclerView.LayoutManager layoutManager = new GridLayoutManager(context,spanCount , oreintation , reverseLayout);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setNestedScrollingEnabled(false);

            return recyclerView;
        }
    }

    public static class Fragment{
        public static RecyclerView setUpGridLayout(RecyclerView recyclerView , Context context, int spanCount,
                                                   int oreintation, boolean reverseLayout , View activity){
            recyclerView = (RecyclerView)activity.findViewById(R.id.recycle_view);
            RecyclerView.LayoutManager layoutManager = new GridLayoutManager(context,spanCount , oreintation , reverseLayout);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setNestedScrollingEnabled(false);

            return recyclerView;
        }
    }
}
