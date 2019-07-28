package mega.GRE.Preparation;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Rcset1first extends AppCompatActivity {

    RadioGroup rg;
    TextView tv1,tv2;
    Button btn;
    int value,value1,value2,value3,value4;
    Boolean clicked=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcset1first);
        rg=(RadioGroup)findViewById(R.id.rgs1);
        tv1=(TextView)findViewById(R.id.textView34);
        tv2=(TextView)findViewById(R.id.textView35);
        btn=(Button)findViewById(R.id.butt1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked=true;


                int ids = rg.getCheckedRadioButtonId();
                switch (ids) {
                    case R.id.radio1 :
                        value = 0;


                        Scorescollection num = new Scorescollection();



                        Intent send = new Intent(Rcset1first.this,Rcset1second.class);
                        send.putExtra("val1",num.calculatescore1(value));

                        startActivity(send);
                        finish();
                        break;
                    case R.id.radio2 :
                        int  value=0;

                        Scorescollection num4=new Scorescollection();


                        Intent send1=new Intent(Rcset1first.this,Rcset1second.class);
                        send1.putExtra("val1",num4.calculatescore1(value));
                        startActivity(send1);
                        finish();
                        break ;
                    case R.id.radio3 :
                        value=0;

                        Scorescollection num2=new Scorescollection();


                        Intent send2=new Intent(Rcset1first.this,Rcset1second.class);
                        send2.putExtra("val1",num2.calculatescore1(value));
                        startActivity(send2);
                        finish();
                        break ;
                    case R.id.radio4 :
                        value=1;

                        Scorescollection num6=new Scorescollection();


                        Intent send8=new Intent(Rcset1first.this,Rcset1second.class);
                        send8.putExtra("val1",num6.calculatescore1(value));
                        startActivity(send8);
                        finish();
                        break ;

                    case R.id.radio5 :
                        value=0;

                        Scorescollection num7=new Scorescollection();


                        Intent send9=new Intent(Rcset1first.this,Rcset1second.class);
                        send9.putExtra("val1",num7.calculatescore1(value));
                        startActivity(send9);
                        finish();
                        break ;


                }


            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(R.id.radio1==checkedId) {
                    value3=0;




                }
                else if(R.id.radio2==checkedId) {
                    value1=0;

                }
                else if(R.id.radio3==checkedId) {
                    value2=0;

                }
                else if(R.id.radio4==checkedId) {
                    value=1;


                }
                else if(R.id.radio5==checkedId) {
                    value4=0;


                }

            }
        });


        Thread timer=new Thread() {
            public void run() {
                try {
                    sleep(300000);
                } catch(Exception ee) {
                    ee.printStackTrace();
                } finally {
                    if(clicked) {

                    }
                    else {
                        Intent bol=new Intent(Rcset1first.this,Times.class);

                        int v=0;

                        bol.putExtra("thread",v);

                        startActivity(bol);
                        finish();

                    } }
            }
        };
        timer.start();

    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == android.view.KeyEvent.KEYCODE_BACK) {
            exitByBackKey();


            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    protected void exitByBackKey() {

        AlertDialog.Builder make = new AlertDialog.Builder(this);
        make.setTitle("SORRY !!");
        make.setMessage("You cannot go back once you have started the process,please do not waste your time,you have few mins left hurry");
        make.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


            }
        });

        AlertDialog alert = make.create();
        alert.show();
    } }

