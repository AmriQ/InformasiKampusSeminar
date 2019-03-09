package com.example.informasikampusseminar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText email, password;
    public Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.submit);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data1 = email.getText().toString().trim();
                String data2 = password.getText().toString().trim();

                if (data1.equals("admin") && data2.equals("123456")){
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(), "gagal login",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
