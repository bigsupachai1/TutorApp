package siam.big.tutor.tutor.adapter.home.course;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;

import siam.big.tutor.R;
import siam.big.tutor.tutor.activity.home.course.TutorSeeCourseActivity;
import siam.big.tutor.tutor.activity.home.course.TutorSeeCourseAllActivity;
import siam.big.tutor.view.Transitions;


/**
 * Created by supaj571 on 03/11/2560.
 */

public class TutorSeeCourseAdapter extends RecyclerView.Adapter<TutorSeeCourseAdapter.ViewHolder>  {
    private static final String TAG = "TutorSeeCourseAdapter";

    private Context mContext ;
    private TutorSeeCourseActivity tutorSeeCourseActivity;

    private static ArrayList<String> example;

    public TutorSeeCourseAdapter(TutorSeeCourseActivity tutorSeeCourseActivity){
        this.tutorSeeCourseActivity = tutorSeeCourseActivity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_tutor_activity_see_course, parent , false);
        return new TutorSeeCourseAdapter.ViewHolder(itemView,mContext,tutorSeeCourseActivity);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //Set Data of View Here
        if(position%2 == 0){
            holder.btnCourse.setBackgroundResource(R.drawable.home_right_bottom);
            holder.layoutMain.setPadding(20,0,0,0);
        }else{
            holder.btnCourse.setBackgroundResource(R.drawable.home_left_bottom);
            holder.layoutMain.setPadding(0,0,20,0);
        }

    }

    @Override
    public int getItemCount() {

        return 10;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private Context mContext;
        private RelativeLayout btnCourse;
        private LinearLayout layoutMain;
        private TutorSeeCourseActivity tutorSeeCourseActivity;

        public ViewHolder(View itemView,Context mContext,TutorSeeCourseActivity tutorSeeCourseActivity) {
            super(itemView);
            this.mContext = mContext;
            this.tutorSeeCourseActivity = tutorSeeCourseActivity;

            btnCourse = (RelativeLayout) itemView.findViewById(R.id.btnCourse);
            layoutMain = (LinearLayout) itemView.findViewById(R.id.layoutMain);

            btnCourse.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent i;
            switch (view.getId()){
                case R.id.btnCourse:
                    i = new Intent(mContext , TutorSeeCourseAllActivity.class);
                    mContext.startActivity(i);
                    Transitions.Activity.toRight(tutorSeeCourseActivity);
                    break;
            }
        }
    }
}
