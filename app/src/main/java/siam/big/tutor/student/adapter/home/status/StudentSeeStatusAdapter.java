package siam.big.tutor.student.adapter.home.status;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

import siam.big.tutor.R;


/**
 * Created by supaj571 on 03/11/2560.
 */

public class StudentSeeStatusAdapter extends RecyclerView.Adapter<StudentSeeStatusAdapter.ViewHolder>  {
    private static final String TAG = StudentSeeStatusAdapter.class.getSimpleName();

    private Context mContext ;

    private static ArrayList<String> example;

    public StudentSeeStatusAdapter(){

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_tutor_activity_see_status, parent , false);
        return new StudentSeeStatusAdapter.ViewHolder(itemView,mContext);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //Set Data of View Here
        clearAllLayout(holder);
        switch (position){
            case 1:
                visibleLayoutAccept(holder);
                break;
            case 2:
                visibleLayoutPayment(holder);
                break;
            case 3:
                visibleLayoutConfirmed(holder);
                break;
            case 4:
                visibleLayoutWaitForResponse(holder);
                break;
            default:
                visibleLayoutConfirmed(holder);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    private void visibleLayoutAccept(ViewHolder holder){
        holder.layoutAccept.setVisibility(View.VISIBLE);
    }

    private void visibleLayoutPayment(ViewHolder holder){
        holder.layoutPayment.setVisibility(View.VISIBLE);
    }

    private void visibleLayoutConfirmed(ViewHolder holder){
        holder.layoutConfirmed.setVisibility(View.VISIBLE);
    }

    private void visibleLayoutWaitForResponse(ViewHolder holder){
        holder.layoutWatiForResponse.setVisibility(View.VISIBLE);
    }

    private void clearAllLayout(ViewHolder holder){
        holder.layoutAccept.setVisibility(View.GONE);
        holder.layoutPayment.setVisibility(View.GONE);
        holder.layoutConfirmed.setVisibility(View.GONE);
        holder.layoutWatiForResponse.setVisibility(View.GONE);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private Context mContext;
        private LinearLayout layoutAccept,layoutPayment,layoutConfirmed,layoutWatiForResponse;
        public ViewHolder(View itemView,Context mContext) {
            super(itemView);
            init(itemView);
            this.mContext = mContext;
        }

        @Override
        public void onClick(View view) {

        }

        private void init(View view){
            layoutAccept =(LinearLayout)view.findViewById(R.id.layoutAccept);
            layoutPayment =(LinearLayout)view.findViewById(R.id.layoutPayment);
            layoutConfirmed =(LinearLayout)view.findViewById(R.id.layoutConfirmed);
            layoutWatiForResponse =(LinearLayout)view.findViewById(R.id.layoutWatiForResponse);
        }
    }
}
