package siam.big.tutor.all.adapter.search;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import siam.big.tutor.R;
import siam.big.tutor.tutor.listener.ListenerFilter;


/**
 * Created by supaj571 on 03/11/2560.
 */

public class AdapterSelectFilter extends RecyclerView.Adapter<AdapterSelectFilter.ViewHolder>  {
    private static final String TAG = AdapterSelectFilter.class.getSimpleName();

    private Context mContext ;

    private static ArrayList<String> example;
    private ListenerFilter<String> listenerSelect;

    public AdapterSelectFilter(ListenerFilter<String> listenerSelect){
        this.listenerSelect = listenerSelect;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_all_select_filter, parent , false);
        return new AdapterSelectFilter.ViewHolder(itemView,mContext,listenerSelect);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //Set Data of View Here
        holder.tvFilter.setText("Test"+position);
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
        private LinearLayout btnFilter;
        private TextView tvFilter;
        private ListenerFilter<String> listenerSelect;
        public ViewHolder(View itemView,Context mContext,ListenerFilter<String> listenerSelect) {
            super(itemView);
            init(itemView);
            this.mContext = mContext;
            this.listenerSelect = listenerSelect;
        }

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btnFilter:
                    listenerSelect.onListSelected(tvFilter.getText().toString());
                    break;
            }
        }

        private void init(View view){
            tvFilter = (TextView)view.findViewById(R.id.tvFilter);
            btnFilter = (LinearLayout)view.findViewById(R.id.btnFilter);

            btnFilter.setOnClickListener(this);
        }
    }
}
