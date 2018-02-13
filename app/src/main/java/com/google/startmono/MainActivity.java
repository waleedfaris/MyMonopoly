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
    private Player[] PLgame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circleMenu = (CircleMenu) findViewById(R.id.circle_menu);
        final AlertDialog[] Dilog = new AlertDialog[1];
        final Integer StartMoney=1000;
        int i= 0 ;
        PLgame=new Player[6];
        for(;i<6;i++)
        {
            PLgame[i]=new Player (null,i,StartMoney);
        }
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
                                                                if(PLgame[0].GetN ()==null||PLgame[0].GetN ()=="") {
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
                                                                    PLgame[0].SetN (Mname.getText ().toString ());
                                                                    Mbuilder.setView (Mview);
                                                                    Dilog[0] = Mbuilder.create ();
                                                                    Dilog[0].show ();
                                                                }else
                                                                {
                                                                    Toast.makeText (MainActivity.this, getString(R.string.entered_name), Toast.LENGTH_SHORT).show ();

                                                                }
                                                             break;
                                                         case 1:
                                                             if(PLgame[1].GetN ()==null||PLgame[1].GetN ()=="") {
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
                                                                 PLgame[1].SetN (cname.getText ().toString ());
                                                                 Mbuilder.setView (Mview);
                                                                 Dilog[0] = Mbuilder.create ();
                                                                 Dilog[0].show ();
                                                             }else{
                                                                 Toast.makeText (MainActivity.this, getString(R.string.entered_name), Toast.LENGTH_SHORT).show ();

                                                             }
                                                             break;
                                                         case 2:
                                                             if(PLgame[2].GetN ()==null||PLgame[2].GetN ()=="") {
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
                                                                 PLgame[2].SetN (xname.getText ().toString ());
                                                                 Mbuilder.setView (Mview);
                                                                 Dilog[0] = Mbuilder.create ();
                                                                 Dilog[0].show ();
                                                             }else{
                                                                 Toast.makeText (MainActivity.this, getString(R.string.entered_name), Toast.LENGTH_SHORT).show ();

                                                             }
                                                             break;
                                                         case 3:
                                                             if(PLgame[3].GetN ()==null||PLgame[3].GetN ()=="") {
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
                                                                 PLgame[3].SetN (vname.getText ().toString ());
                                                                 Mbuilder.setView (Mview);
                                                                 Dilog[0] = Mbuilder.create ();
                                                                 Dilog[0].show ();
                                                             }else{
                                                                 Toast.makeText (MainActivity.this, getString(R.string.entered_name), Toast.LENGTH_SHORT).show ();

                                                             }
                                                             break;
                                                         case 4:
                                                             if(PLgame[4].GetN ()==null||PLgame[4].GetN ()=="") {
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
                                                                 PLgame[4].SetN (bname.getText ().toString ());
                                                                 Mbuilder.setView (Mview);
                                                                 Dilog[0] = Mbuilder.create ();
                                                                 Dilog[0].show ();
                                                             }else{
                                                                 Toast.makeText (MainActivity.this, getString(R.string.entered_name), Toast.LENGTH_SHORT).show ();

                                                             }
                                                             break;
                                                         case 5:
                                                             if(PLgame[5].GetN ()==null||PLgame[5 ].GetN ()=="") {
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
                                                                 PLgame[5].SetN (hname.getText ().toString ());
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
                    if(PLgame[i].GetN ()!=null)
                    {
                        count++;
                    }
                }
                if(count>=2 && count<=6) {
                    Intent Game = new Intent (MainActivity.this, thegame.class);
                    finish ();
                    startActivity (Game);
                }else {
                    Toast.makeText (MainActivity.this, "This game are made for 2-6 players", Toast.LENGTH_SHORT).show ();

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
