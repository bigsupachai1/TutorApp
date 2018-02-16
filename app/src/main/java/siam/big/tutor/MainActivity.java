package siam.big.tutor;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import siam.big.tutor.student.activity.TabStudentActivity;
import siam.big.tutor.tutor.activity.TabTutorActivity;

/**
 * Created by user on 9/12/2560.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Intent i = new Intent(this , TabTutorActivity.class);
//        startActivity(i);
////
//        Intent i1 = new Intent(this , TabStudentActivity.class);
//        startActivity(i1);

        Intent i2 = new Intent(this,LoginActivity.class);
        startActivity(i2);
        finish();
    }
}
