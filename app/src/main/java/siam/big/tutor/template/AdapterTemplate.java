package siam.big.tutor.template;

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

public class AdapterTemplate extends RecyclerView.Adapter<AdapterTemplate.ViewHolder>  {
    private static final String TAG = AdapterTemplate.class.getSimpleName();

    private Context mContext ;

    private static ArrayList<String> example;

    public AdapterTemplate(){

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.activity_main, parent , false);
        return new AdapterTemplate.ViewHolder(itemView,mContext);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //Set Data of View Here
    }

    @Override
    public int getItemCount() {
        if(example == null){
            return 0;
        }
        return example.size();
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
