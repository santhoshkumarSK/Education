package com.mobilesol.education;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends Activity {
EditText email,password;
Button Login;
    SharedPreferences login;
    String mail,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email=(EditText)findViewById(R.id.email);
        password=(EditText)findViewById(R.id.password);
        Login=(Button)findViewById(R.id.sign_up_button);
        login = getApplicationContext().getSharedPreferences("loginpref", 0);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mail=email.getText().toString();
                pass=password.getText().toString();
                SharedPreferences.Editor editor = login.edit();
                editor.putString("mail", mail);
                editor.commit();

//                editor.putString("password", pass);


                Intent S=new Intent(Login.this,Navigation.class);
                startActivity(S);
            }
        });
    }
}
