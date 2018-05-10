package siam.big.tutor;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import siam.big.tutor.student.activity.TabStudentActivity;
import siam.big.tutor.student.activity.register.StudentRegisterPageOneActivity;
import siam.big.tutor.tutor.activity.TabTutorActivity;
import siam.big.tutor.tutor.activity.register.TutorRegisterPageOneActivity;
import siam.big.tutor.view.Keyboard;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "LoginActivity";

    private Button btnLogin;
    private Button btnFacebook;
    private Button btnSignUp;

    private EditText etUsername;
    private EditText etPassword;

    private TextView tvClickHere;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        Keyboard.hideKeyboard(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnLogin:
                Keyboard.dismissKeyboard(this);
                testLogin(etUsername.getText().toString(),etPassword.getText().toString());
                break;
            case R.id.btnSignUp:
                testRegister(etUsername.getText().toString());
                break;
            case R.id.tvClickHere:

                break;
        }
    }

    private void testLogin(String username , String pw){
        Intent intent = null;
        if(username.equals("tutor") && pw.equals("1234")){
            intent = new Intent(this , TabTutorActivity.class);
        }else if (username.equals("student") && pw.equals("1234")){
            intent = new Intent(this , TabStudentActivity.class);
        }else {
            Toast.makeText(this,"Username or Password Incorrect!",Toast.LENGTH_LONG).show();
        }

        if(intent != null){
            startActivity(intent);
        }
    }

    private void testRegister(String username){
        Intent intent = null ;
        if(username.equals("tutor")){
            intent = new Intent(this, TutorRegisterPageOneActivity.class);
        }else if(username.equals("student")){
            intent = new Intent(this, StudentRegisterPageOneActivity.class);
        }

        if (intent != null){
            startActivity(intent);
        }
    }

    private void init(){
        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnFacebook = (Button)findViewById(R.id.btnFacebook);
        btnSignUp = (Button)findViewById(R.id.btnSignUp);

        etUsername = (EditText)findViewById(R.id.etUsername);
        etPassword = (EditText)findViewById(R.id.etPassword);

        tvClickHere = (TextView)findViewById(R.id.tvClickHere);

        btnLogin.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);

        tvClickHere.setOnClickListener(this);
    }

}
