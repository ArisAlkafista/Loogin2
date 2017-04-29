package com.example.alkafists.login2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.FileInputStream;
import java.io.FileOutputStream;

    public class Login2 extends Activity {

        Button b1, b2;
        EditText ed1, ed2;
        TextView tx1;
        int counter = 3;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login2);

            b1 = (Button) findViewById(R.id.btnLogin);
            b2 = (Button) findViewById(R.id.btnCancel);
            ed1 = (EditText) findViewById(R.id.editUser);
            ed2 = (EditText) findViewById(R.id.editPass);
            tx1 = (TextView) findViewById(R.id.textView2);
            tx1.setVisibility(View.GONE);
            b2.setEnabled(false);

            b1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    //Set default Username dan Password
                    if (ed1.getText().toString().equals("admin") &&
                            ed2.getText().toString().equals("admin"))

                        //Kondisi Jika LOGIN Benar
                    {

                        b2.setEnabled(true);


                    }else{

                        //Kondisi Jika Login Gaga
                        //Toast.makeText(getApplicationContext(), "Username atau Password Anda Salah",Toast.LENGTH_SHORT).show();
                        tx1.setVisibility(View.VISIBLE);
                        tx1.setBackgroundColor(Color.RED);
                        counter--;
                        tx1.setText(Integer.toString(counter));

                    if (counter == 0) {

                        finish();

                    }
                }
            }
            });


            b2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                finish();

            }
            });
    }
}
