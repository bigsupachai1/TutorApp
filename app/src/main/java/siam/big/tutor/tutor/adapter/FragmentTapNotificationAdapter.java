package siam.big.tutor.tutor.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import siam.big.tutor.R;
import siam.big.tutor.tutor.model.FragmentTabNotificationDao;
import siam.big.tutor.tutor.model.FragmentTabNotificationDao.FragmentTabNotificationItemDao;

/**
 * Created by supaj571 on 03/11/2560.
 */

public class FragmentTapNotificationAdapter extends RecyclerView.Adapter<FragmentTapNotificationAdapter.ViewHolder>  {
    private static final String TAG = "FragmentTapNotificationAdapter";

    private Context mContext ;

    private static FragmentTabNotificationDao dao;

    public FragmentTapNotificationAdapter(FragmentTabNotificationDao dao){
        this.dao = dao;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_tutor_tab_notification, parent , false);
        return new FragmentTapNotificationAdapter.ViewHolder(itemView,mContext);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //Set Data of View Here
        FragmentTabNotificationItemDao itemDao = dao.getData().get(position);
        holder.tvDate.setText(itemDao.getDate());
        holder.tvTitle.setText(itemDao.getTitle());
        holder.tvDetail.setText(itemDao.getDetail());
    }

    @Override
    public int getItemCount() {
        if(dao == null){
            return 0;
        }
        return dao.getData().size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private Context mContext;
        private TextView tvDate;
        private TextView tvTitle;
        private TextView tvDetail;
        public ViewHolder(View view,Context mContext) {
            super(view);
            this.mContext = mContext;
            tvDate = (TextView) view.findViewById(R.id.tvDate);
            tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            tvDetail = (TextView) view.findViewById(R.id.tvDetail);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
