package siam.big.tutor.all.adapter.announce;

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
import siam.big.tutor.all.activity.announce.AnnounceDetailActivity;
import siam.big.tutor.view.Transitions;


/**
 * Created by supaj571 on 03/11/2560.
 */

public class AnnounceAdapter extends RecyclerView.Adapter<AnnounceAdapter.ViewHolder>  {
    private static final String TAG = "AnnounceAdapter";

    private Context mContext ;

    private static ArrayList<String> example;

    public AnnounceAdapter(){

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_all_activity_announce, parent , false);
        return new AnnounceAdapter.ViewHolder(itemView,mContext);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //Set Data of View Here
    }

    @Override
    public int getItemCount() {
        return 50;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private Context mContext;
        private LinearLayout linearLayout;
        public ViewHolder(View itemView,Context mContext) {
            super(itemView);
            this.mContext = mContext;
            init(itemView);
        }

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.linearLayout:
                    Intent i = new Intent(mContext, AnnounceDetailActivity.class);
                    mContext.startActivity(i);
                    Transitions.Activity.toRight((AppCompatActivity) mContext);
                    break;
            }
        }

        private void init(View view){
            linearLayout = view.findViewById(R.id.linearLayout);

            linearLayout.setOnClickListener(this);
        }
    }
}
