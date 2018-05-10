package siam.big.tutor.tutor.activity.register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import siam.big.tutor.R;
import siam.big.tutor.view.Toolbars;
import siam.big.tutor.view.Transitions;

public class TutorRegisterPageThreeActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tvNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_register_page_three);
        Toolbars.setUp(this);
        init();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Transitions.Activity.toLeft(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tvNext:
                Intent i = new Intent(this,TutorRegisterPageFourActivity.class);
                startActivity(i);
                break;
        }
    }

    private void init(){
        tvNext = (TextView)findViewById(R.id.tvNext);

        tvNext.setOnClickListener(this);
    }
}
