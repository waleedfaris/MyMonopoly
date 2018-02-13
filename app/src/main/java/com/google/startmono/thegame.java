package com.google.startmono;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class thegame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_thegame);

        Button Br = (Button) findViewById (R.id.rule);
        Br.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                final AlertDialog B = new AlertDialog.Builder (thegame.this).create ();
                B.setTitle ("RULE");
                B.setMessage ("            have fun boy " +
                        "");
                B.setIcon (R.mipmap.monopolygrey);
                B.show ();
            }
        });


    }

    












    
} //    end class