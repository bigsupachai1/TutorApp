package siam.big.tutor.tutor.adapter.home.status;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

import siam.big.tutor.R;
import siam.big.tutor.tutor.activity.home.status.TutorCourseBookingDetailActivity;
import siam.big.tutor.view.Transitions;


/**
 * Created by supaj571 on 03/11/2560.
 */

public class TutorSeeStatusAdapter extends RecyclerView.Adapter<TutorSeeStatusAdapter.ViewHolder>  {
    private static final String TAG = TutorSeeStatusAdapter.class.getSimpleName();

    private Context mContext ;

    private static ArrayList<String> example;

    public TutorSeeStatusAdapter(){

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_tutor_activity_see_status, parent , false);
        return new TutorSeeStatusAdapter.ViewHolder(itemView,mContext);
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
            Intent i = null;
            switch (view.getId()){
                case R.id.layoutAccept:
                    i = new Intent(mContext, TutorCourseBookingDetailActivity.class);
                    break;
                case R.id.layoutPayment:
                    i = new Intent(mContext, TutorCourseBookingDetailActivity.class);
                    break;
                case R.id.layoutConfirmed:
                    i = new Intent(mContext, TutorCourseBookingDetailActivity.class);
                    break;
                case R.id.layoutWatiForResponse:
                    i = new Intent(mContext, TutorCourseBookingDetailActivity.class);
                    break;
            }
            if(i != null){
                mContext.startActivity(i);
                Transitions.Activity.toRight((AppCompatActivity) mContext);
            }
        }

        private void init(View view){
            layoutAccept =(LinearLayout)view.findViewById(R.id.layoutAccept);
            layoutPayment =(LinearLayout)view.findViewById(R.id.layoutPayment);
            layoutConfirmed =(LinearLayout)view.findViewById(R.id.layoutConfirmed);
            layoutWatiForResponse =(LinearLayout)view.findViewById(R.id.layoutWatiForResponse);

            layoutAccept.setOnClickListener(this);
            layoutPayment.setOnClickListener(this);
            layoutConfirmed.setOnClickListener(this);
            layoutWatiForResponse.setOnClickListener(this);
        }
    }
}
