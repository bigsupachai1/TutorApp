package siam.big.tutor.all.adapter.announce;

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

        public ViewHolder(View itemView,Context mContext) {
            super(itemView);
            this.mContext = mContext;

        }

        @Override
        public void onClick(View view) {

        }
    }
}
