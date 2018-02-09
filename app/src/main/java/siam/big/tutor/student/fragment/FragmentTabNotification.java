package siam.big.tutor.student.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import siam.big.tutor.R;
import siam.big.tutor.student.adapter.FragmentTapNotificationAdapter;
import siam.big.tutor.student.model.FragmentTabNotificationDao;
import siam.big.tutor.student.model.FragmentTabNotificationDao.FragmentTabNotificationItemDao;
/**
 * Created by user on 9/12/2560.
 */

public class FragmentTabNotification extends Fragment {
    private static final String TAG = "FragmentTemplate";

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;

    private FragmentTapNotificationAdapter adapter;

    public FragmentTabNotification() {
        //Constructor
    }

    public static FragmentTabNotification newInstance(int sectionNumber) {
        FragmentTabNotification fragment = new FragmentTabNotification();
        Bundle args = new Bundle();
        args.putInt(TAG, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        //Do Something before onCreate.
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Do Something before onCreateView.
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_student_tab_notification, container, false);
        //Do Something with view
        init(view);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setUpRecycleView();
    }

    private void setUpRecycleView(){
        mLayoutManager = new GridLayoutManager(getContext(), 1);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setNestedScrollingEnabled(false);
        mRecyclerView.setAdapter(adapter);

        adapter = new FragmentTapNotificationAdapter(mockUp());

        mRecyclerView.setAdapter(adapter);
    }

    private void init(View view){
        //findViewById Here
        mRecyclerView = view.findViewById(R.id.recycle_view);
    }

    private FragmentTabNotificationDao mockUp(){
        FragmentTabNotificationDao dao = new FragmentTabNotificationDao();
        for(int i = 0 ; i < 10 ; i ++){
            FragmentTabNotificationItemDao itemDao =
                    new FragmentTabNotificationItemDao(1+i,"30 Des 2017" , "Title" , "My question is specific to Java. I have a Get and Set method that will get and set the data. I would like to add this into an arraylist. How can I do this ?");
            dao.addData(itemDao);
        }
        return dao;
    }
}