package siam.big.tutor.tutor.adapter.home.student;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import siam.big.tutor.R;


/**
 * Created by supaj571 on 03/11/2560.
 */

public class TutorSeeStudentAdapter extends RecyclerView.Adapter<TutorSeeStudentAdapter.ViewHolder>  {
    private static final String TAG = "AdapterTemplate";

    private Context mContext ;

    private static ArrayList<String> example;

    public TutorSeeStudentAdapter(ArrayList<String> example){
        this.example = example;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_tutor_activity_see_student, parent , false);
        return new TutorSeeStudentAdapter.ViewHolder(itemView,mContext);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //Set Data of View Here
    }

    @Override
    public int getItemCount() {
//        if(example == null){
//            return 0;
//        }
        return 10;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private Context mContext;

        public ViewHolder(View itemView,Context mContext) {
            super(itemView);
            this.mContext = mContext;

        }

        @Override
        public void onClick(View view) {

        }
    }
}
