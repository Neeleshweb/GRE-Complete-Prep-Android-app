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

public class Rcset1sixth extends AppCompatActivity {

    RadioGroup rg;
    TextView tv1,tv2;
    Button btn;
    int value,value1,value2,value3,value4;
    Boolean clicked=false;
    int a,b,sum;
    Intent get;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcset1sixth);
        rg=(RadioGroup)findViewById(R.id.rgs6);
        tv1=(TextView)findViewById(R.id.textView44);
        tv2=(TextView)findViewById(R.id.textView45);



        btn=(Button)findViewById(R.id.butt6);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int ids = rg.getCheckedRadioButtonId();
                switch (ids) {
                    case R.id.radio26:
                        value = 0;

                        Scorescollection num = new Scorescollection();
                        get = getIntent();
                        a = get.getIntExtra("val5", 0);
                        b = num.calculatescore1(value);
                        sum = a + b;


                        Intent send = new Intent(Rcset1sixth.this, Rcset1seven.class);
                        send.putExtra("val6", sum);

                        startActivity(send);
                        finish();
                        break;
                    case R.id.radio27:
                        value = 1;

                        Scorescollection num4 = new Scorescollection();
                        get = getIntent();
                        a = get.getIntExtra("val5", 0);
                        b = num4.calculatescore1(value);
                        sum = a + b;


                        Intent send1 = new Intent(Rcset1sixth.this, Rcset1seven.class);
                        send1.putExtra("val6", sum);
                        startActivity(send1);
                        finish();
                        break;
                    case R.id.radio28:
                        value = 0;

                        Scorescollection num2 = new Scorescollection();
                        get = getIntent();
                        a = get.getIntExtra("val5", 0);
                        b = num2.calculatescore1(value);
                        sum = a + b;


                        Intent send2 = new Intent(Rcset1sixth.this, Rcset1seven.class);
                        send2.putExtra("val6", sum);
                        startActivity(send2);
                        finish();
                        break;
                    case R.id.radio29:
                        value = 0;

                        Scorescollection num6 = new Scorescollection();
                        get = getIntent();
                        a = get.getIntExtra("val5", 0);
                        b = num6.calculatescore1(value);
                        sum = a + b;


                        Intent send8 = new Intent(Rcset1sixth.this, Rcset1seven.class);
                        send8.putExtra("val6", sum);
                        startActivity(send8);
                        finish();
                        break;

                    case R.id.radio30:
                        value = 0;

                        Scorescollection num9 = new Scorescollection();
                        get = getIntent();
                        a = get.getIntExtra("val5", 0);
                        b = num9.calculatescore1(value);
                        sum = a + b;


                        Intent fuck = new Intent(Rcset1sixth.this, Rcset1seven.class);
                        fuck.putExtra("val6", sum);
                        startActivity(fuck);
                        finish();
                        break;


                }
            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(R.id.radio26==checkedId) {
                    value4=0;



                }
                else if(R.id.radio27==checkedId) {
                    value=1;

                }
                else if(R.id.radio28==checkedId) {
                    value1=0;

                }
                else if(R.id.radio29==checkedId) {
                    value3=0;


                }
                else if(R.id.radio30==checkedId) {
                    value2=0;


                }
            }
        }); }





    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == android.view.KeyEvent.KEYCODE_BACK) {
            exitByBackKey();


            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    protected void exitByBackKey() {

        AlertDialog.Builder make = new AlertDialog.Builder(Rcset1sixth.this);
        make.setTitle("SORRY !!");
        make.setMessage("You cannot go back once you have started the process,please do not waste your time,you have few mins left hurry");
        make.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


            }
        });

        AlertDialog alert = make.create();
        alert.show();

    }

}

