package siam.big.tutor.student.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import siam.big.tutor.R;
import siam.big.tutor.student.fragment.FragmentTabFindTutor;
import siam.big.tutor.student.fragment.FragmentTabHome;
import siam.big.tutor.student.fragment.FragmentTabNotification;
import siam.big.tutor.student.fragment.FragmentTabProfile;

public class TabStudentActivity extends AppCompatActivity {
    private final static String TAG = TabStudentActivity.class.getSimpleName();

    private final static int TAB_HOME = 0;
    private final static int TAB_FIND_TUTOR = 1;
    private final static int TAB_NOTIFICATION = 2;
    private final static int TAB_PROFILE = 3;

    private final static int TAB_SIZE = 4; // have 4 tab

    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    private boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_tab);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setOffscreenPageLimit(4);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

    }

    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        private SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
          switch (position){
              case TAB_HOME :
                  return FragmentTabHome.newInstance();
              case TAB_FIND_TUTOR :
                  return FragmentTabFindTutor.newInstance();
              case TAB_NOTIFICATION :
                  return FragmentTabNotification.newInstance(3);
              case TAB_PROFILE :
                  return FragmentTabProfile.newInstance(4);
          }
            return null;
        }

        @Override
        public int getCount() {
            return TAB_SIZE;
        }
    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, ""+getResources().getString(R.string.text_press_agian_to_exit), Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}
