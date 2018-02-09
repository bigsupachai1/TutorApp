package siam.big.tutor.tutor.adapter.home.course;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import siam.big.tutor.R;
import siam.big.tutor.tutor.activity.home.course.TutorSeeCourseAllActivity;


/**
 * Created by supaj571 on 03/11/2560.
 */

public class TutorSeeCourseAllAdapter extends RecyclerView.Adapter<TutorSeeCourseAllAdapter.ViewHolder>  {
    private static final String TAG = "TutorSeeCourseAllAdapter";

    private Context mContext ;
    private TutorSeeCourseAllActivity tutorSeeCourseAllActivity;

    private static ArrayList<String> example;

    public TutorSeeCourseAllAdapter(TutorSeeCourseAllActivity tutorSeeCourseAllActivity){
        this.tutorSeeCourseAllActivity = tutorSeeCourseAllActivity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_tutor_activity_see_course_all, parent , false);
        return new TutorSeeCourseAllAdapter.ViewHolder(itemView,mContext,tutorSeeCourseAllActivity);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //Set Data of View Here

    }

    @Override
    public int getItemCount() {

        return 10;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private Context mContext;
        private ImageView imgMenu;
        private TutorSeeCourseAllActivity tutorSeeCourseAllActivity;

        public ViewHolder(View itemView,Context mContext,TutorSeeCourseAllActivity tutorSeeCourseAllActivity) {
            super(itemView);
            this.mContext = mContext;
            this.tutorSeeCourseAllActivity = tutorSeeCourseAllActivity;

            imgMenu = (ImageView) itemView.findViewById(R.id.imgMenu);

            imgMenu.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.imgMenu:
                    tutorSeeCourseAllActivity.startPopupCourse(getLayoutPosition());
                    break;
            }
        }
    }
}
