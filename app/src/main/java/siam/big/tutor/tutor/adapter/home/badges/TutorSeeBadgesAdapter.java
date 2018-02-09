package siam.big.tutor.tutor.adapter.home.badges;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import siam.big.tutor.R;
import siam.big.tutor.tutor.listener.ListenerBadges;


/**
 * Created by supaj571 on 03/11/2560.
 */

public class TutorSeeBadgesAdapter extends RecyclerView.Adapter<TutorSeeBadgesAdapter.ViewHolder>  {
    private static final String TAG = "TutorSeeBadgesAdapter";

    private Context mContext ;
    private ListenerBadges listenerBadges;

    private static ArrayList<String> example;

//    public TutorSeeBadgesAdapter(TutorSeeBadgesActivity tutorSeeBadgesActivity){
//        this.tutorSeeBadgesActivity = tutorSeeBadgesActivity;
//    }

    public TutorSeeBadgesAdapter(ListenerBadges listenerBadges){
        this.listenerBadges = listenerBadges;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_tutor_activity_see_badges, parent , false);
        return new TutorSeeBadgesAdapter.ViewHolder(itemView,mContext,listenerBadges);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //Set Data of View Here
    }

    @Override
    public int getItemCount() {
        return 60;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private Context mContext;
        private ListenerBadges listenerBadges;
        private ImageView imgMenu;
        public ViewHolder(View itemView,Context mContext,ListenerBadges listenerBadges) {
            super(itemView);
            this.mContext = mContext;
            this.listenerBadges = listenerBadges;

            imgMenu = (ImageView)itemView.findViewById(R.id.imgMenu);

            imgMenu.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.imgMenu:
                    listenerBadges.onListSelected(getLayoutPosition());
                    break;
            }
        }

    }
}
