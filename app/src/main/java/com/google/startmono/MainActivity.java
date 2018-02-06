package com.google.startmono;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;

public class MainActivity extends AppCompatActivity {

    CircleMenu circleMenu;
    private String[] m_Text ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circleMenu = (CircleMenu) findViewById(R.id.circle_menu);
        final AlertDialog[] Dilog = new AlertDialog[1];

        m_Text=new String[6];
        circleMenu.setMainMenu(Color.parseColor("#000000"), R.mipmap.monopoly, R.mipmap.monopoly);
        circleMenu.measure (500,500);
        circleMenu.addSubMenu(Color.parseColor("#0000ff"), R.mipmap.icon1)
                .addSubMenu(Color.parseColor("#0000ff"), R.mipmap.icon2)
                .addSubMenu(Color.parseColor("#0000ff"), R.mipmap.icon3)
                .addSubMenu(Color.parseColor("#0000ff"), R.mipmap.icon4)
                .addSubMenu(Color.parseColor("#0000ff"), R.mipmap.icon5)
                .addSubMenu(Color.parseColor("#0000ff"), R.mipmap.icon6);



        circleMenu.setOnMenuSelectedListener(new OnMenuSelectedListener () {

                                                 @Override
                                                 public void onMenuSelected(int index) {
                                                     switch (index) {
                                                         case 0:
                                                                if(m_Text[0]==null) {
                                                                    AlertDialog.Builder Mbuilder = new AlertDialog.Builder (MainActivity.this);
                                                                    View Mview = getLayoutInflater ().inflate (R.layout.customalertdialog, null);
                                                                    final EditText Mname = (EditText) Mview.findViewById (R.id.name);
                                                                    Button Mdone = (Button) Mview.findViewById (R.id.done);
                                                                    Mdone.setOnClickListener (new View.OnClickListener () {
                                                                        @Override
                                                                        public void onClick(View view) {
                                                                            if (!Mname.getText ().toString ().isEmpty ()) {
                                                                                Toast.makeText (MainActivity.this, R.string.success_name, Toast.LENGTH_SHORT).show ();

                                                                            } else {
                                                                                Toast.makeText (MainActivity.this, R.string.fails_name, Toast.LENGTH_SHORT).show ();

                                                                            }


                                                                        }


                                                                    });
                                                                    m_Text[0] = Mname.getText ().toString ();
                                                                    Mbuilder.setView (Mview);
                                                                    Dilog[0] = Mbuilder.create ();
                                                                    Dilog[0].show ();
                                                                }else
                                                                {
                                                                    Toast.makeText (MainActivity.this, getString(R.string.entered_name), Toast.LENGTH_SHORT).show ();

                                                                }
                                                             break;
                                                         case 1:
                                                             if(m_Text[1]==null) {
                                                                 AlertDialog.Builder Mbuilder = new AlertDialog.Builder (MainActivity.this);
                                                                 View Mview = getLayoutInflater ().inflate (R.layout.customalertdialog, null);
                                                                 final EditText cname = (EditText) Mview.findViewById (R.id.name);
                                                                 Button Mdone = (Button) Mview.findViewById (R.id.done);
                                                                 Mdone.setOnClickListener (new View.OnClickListener () {
                                                                     @Override
                                                                     public void onClick(View view) {
                                                                         if (!cname.getText ().toString ().isEmpty ()) {
                                                                             Toast.makeText (MainActivity.this, R.string.success_name, Toast.LENGTH_SHORT).show ();

                                                                         } else {
                                                                             Toast.makeText (MainActivity.this, R.string.fails_name, Toast.LENGTH_SHORT).show ();

                                                                         }
                                                                     }
                                                                 });
                                                                 m_Text[1] = cname.getText ().toString ();
                                                                 Mbuilder.setView (Mview);
                                                                 Dilog[0] = Mbuilder.create ();
                                                                 Dilog[0].show ();
                                                             }else{
                                                                 Toast.makeText (MainActivity.this, getString(R.string.entered_name), Toast.LENGTH_SHORT).show ();

                                                             }
                                                             break;
                                                         case 2:
                                                             if(m_Text[2]==null) {
                                                                 AlertDialog.Builder Mbuilder = new AlertDialog.Builder (MainActivity.this);
                                                                 View Mview = getLayoutInflater ().inflate (R.layout.customalertdialog, null);
                                                                 final EditText xname = (EditText) Mview.findViewById (R.id.name);
                                                                 Button Mdone = (Button) Mview.findViewById (R.id.done);
                                                                 Mdone.setOnClickListener (new View.OnClickListener () {
                                                                     @Override
                                                                     public void onClick(View view) {
                                                                         if (!xname.getText ().toString ().isEmpty ()) {
                                                                             Toast.makeText (MainActivity.this, R.string.success_name, Toast.LENGTH_SHORT).show ();

                                                                         } else {
                                                                             Toast.makeText (MainActivity.this, R.string.fails_name, Toast.LENGTH_SHORT).show ();

                                                                         }
                                                                     }
                                                                 });
                                                                 m_Text[2] = xname.getText ().toString ();
                                                                 Mbuilder.setView (Mview);
                                                                 Dilog[0] = Mbuilder.create ();
                                                                 Dilog[0].show ();
                                                             }else{
                                                                 Toast.makeText (MainActivity.this, getString(R.string.entered_name), Toast.LENGTH_SHORT).show ();

                                                             }
                                                             break;
                                                         case 3:
                                                             if(m_Text[3]==null) {
                                                                 AlertDialog.Builder Mbuilder = new AlertDialog.Builder (MainActivity.this);
                                                                 View Mview = getLayoutInflater ().inflate (R.layout.customalertdialog, null);
                                                                 final EditText vname = (EditText) Mview.findViewById (R.id.name);
                                                                 Button Mdone = (Button) Mview.findViewById (R.id.done);
                                                                 Mdone.setOnClickListener (new View.OnClickListener () {
                                                                     @Override
                                                                     public void onClick(View view) {
                                                                         if (!vname.getText ().toString ().isEmpty ()) {
                                                                             Toast.makeText (MainActivity.this, R.string.success_name, Toast.LENGTH_SHORT).show ();

                                                                         } else {
                                                                             Toast.makeText (MainActivity.this, R.string.fails_name, Toast.LENGTH_SHORT).show ();

                                                                         }
                                                                     }
                                                                 });
                                                                 m_Text[3] = vname.getText ().toString ();
                                                                 Mbuilder.setView (Mview);
                                                                 Dilog[0] = Mbuilder.create ();
                                                                 Dilog[0].show ();
                                                             }else{
                                                                 Toast.makeText (MainActivity.this, getString(R.string.entered_name), Toast.LENGTH_SHORT).show ();

                                                             }
                                                             break;
                                                         case 4:
                                                             if(m_Text[4]==null) {
                                                                 AlertDialog.Builder Mbuilder = new AlertDialog.Builder (MainActivity.this);
                                                                 View Mview = getLayoutInflater ().inflate (R.layout.customalertdialog, null);
                                                                 final EditText bname = (EditText) Mview.findViewById (R.id.name);
                                                                 Button Mdone = (Button) Mview.findViewById (R.id.done);
                                                                 Mdone.setOnClickListener (new View.OnClickListener () {
                                                                     @Override
                                                                     public void onClick(View view) {
                                                                         if (!bname.getText ().toString ().isEmpty ()) {
                                                                             Toast.makeText (MainActivity.this, R.string.success_name, Toast.LENGTH_SHORT).show ();

                                                                         } else {
                                                                             Toast.makeText (MainActivity.this, R.string.fails_name, Toast.LENGTH_SHORT).show ();

                                                                         }
                                                                     }
                                                                 });
                                                                 m_Text[4] = bname.getText ().toString ();
                                                                 Mbuilder.setView (Mview);
                                                                 Dilog[0] = Mbuilder.create ();
                                                                 Dilog[0].show ();
                                                             }else{
                                                                 Toast.makeText (MainActivity.this, getString(R.string.entered_name), Toast.LENGTH_SHORT).show ();

                                                             }
                                                             break;
                                                         case 5:
                                                             if(m_Text[5]==null) {
                                                                 AlertDialog.Builder Mbuilder = new AlertDialog.Builder (MainActivity.this);
                                                                 View Mview = getLayoutInflater ().inflate (R.layout.customalertdialog, null);
                                                                 final EditText hname = (EditText) Mview.findViewById (R.id.name);
                                                                 Button Mdone = (Button) Mview.findViewById (R.id.done);
                                                                 Mdone.setOnClickListener (new View.OnClickListener () {
                                                                     @Override
                                                                     public void onClick(View view) {
                                                                         if (!hname.getText ().toString ().isEmpty ()) {
                                                                             Toast.makeText (MainActivity.this, R.string.success_name, Toast.LENGTH_SHORT).show ();

                                                                         } else {
                                                                             Toast.makeText (MainActivity.this, R.string.fails_name, Toast.LENGTH_SHORT).show ();

                                                                         }
                                                                     }
                                                                 });
                                                                 m_Text[5] = hname.getText ().toString ();
                                                                 Mbuilder.setView (Mview);
                                                                 Dilog[0] = Mbuilder.create ();
                                                                 Dilog[0].show ();
                                                             }else{
                                                                 Toast.makeText (MainActivity.this, getString(R.string.entered_name), Toast.LENGTH_SHORT).show ();

                                                             }
                                                             break;
                                                     }
                                                 }
                                             }

        );

        circleMenu.setOnMenuStatusChangeListener(new OnMenuStatusChangeListener () {

                                                     @Override
                                                     public void onMenuOpened() {
                                                     }

                                                     @Override
                                                     public void onMenuClosed() {
                                                     }
                                                 }
        );

        Button startgame=(Button)findViewById (R.id.bDONE);
        startgame.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Integer i = 0,count=0 ;
                for(;i<6;i++)
                {
                    if(m_Text[i]!=null)
                    {
                        count++;
                    }
                }
                if(count>=2 && count<=6) {
                    Intent Game = new Intent (MainActivity.this, thegame.class);
                    startActivity (Game);
                }else {
                    Toast.makeText (MainActivity.this, "This Game are made for 2-6 players", Toast.LENGTH_SHORT).show ();

                }
            }
        });

    }// end main function


    @Override
    public void onBackPressed() {
        if (circleMenu.isOpened())
            circleMenu.closeMenu();
        else
            finish();
    }





}
