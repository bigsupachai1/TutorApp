package siam.big.tutor.student.adapter.search;

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

public class StudentFindTutorAdapter extends RecyclerView.Adapter<StudentFindTutorAdapter.ViewHolder>  {
    private static final String TAG = StudentFindTutorAdapter.class.getSimpleName();

    private Context mContext ;

    private static ArrayList<String> example;

    public StudentFindTutorAdapter(){

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_student_activity_find_tutor, parent , false);
        return new StudentFindTutorAdapter.ViewHolder(itemView,mContext);
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
        return 50;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private Context mContext;

        public ViewHolder(View itemView,Context mContext) {
            super(itemView);
            init(itemView);
            this.mContext = mContext;

        }

        @Override
        public void onClick(View view) {

        }

        private void init(View view){

        }
    }
}
