package mega.GRE.Preparation;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Rcset1 extends AppCompatActivity {


  RadioGroup rg1,rg2,rg3,rg4,rg5,rg7,rg8,rg9,rg10;
    Button btn;
    int value,value1,value2,value3,value4;
    int valu,valu1,valu2,valu3,valu4;
    int val,val1,val2,val3,val4;
    int va,va1,va2,va3,va4;
    int vas,vas1,vas2,vas3,vas4;
    int com,com1,com2,com3,com4;
    int coma,coma1,coma2,coma3,coma4;
    int co,co1,co2,co3,co4;
    int last,last1,last2,last3,last4;
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12;
    Boolean clicked=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcset1);

        rg1=(RadioGroup)findViewById(R.id.r1);
        rg2=(RadioGroup)findViewById(R.id.r2);
        rg3=(RadioGroup)findViewById(R.id.r3);
        rg4=(RadioGroup)findViewById(R.id.r4);
        rg5=(RadioGroup)findViewById(R.id.r5);
        rg7=(RadioGroup)findViewById(R.id.r7);
        rg8=(RadioGroup)findViewById(R.id.r8);
        rg9=(RadioGroup)findViewById(R.id.r9);
        rg10=(RadioGroup)findViewById(R.id.r10);

        tv1=(TextView)findViewById(R.id.textView24);
        tv2=(TextView)findViewById(R.id.textView);
        tv3=(TextView)findViewById(R.id.t2);
        tv4=(TextView)findViewById(R.id.t3);
        tv5=(TextView)findViewById(R.id.textView25);

        tv6=(TextView)findViewById(R.id.textView26);

        tv7=(TextView)findViewById(R.id.textview27);

        tv8=(TextView)findViewById(R.id.textView28);
        tv9=(TextView)findViewById(R.id.textView29);
        tv10=(TextView)findViewById(R.id.textView30);
        tv11=(TextView)findViewById(R.id.textview31);
        tv12=(TextView)findViewById(R.id.textView32);



btn=(Button)findViewById(R.id.submit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked=true;
                int ids1=rg1.getCheckedRadioButtonId();
switch (ids1) {
    case R.id.radioButton :
value=0;
        int get1=this.calculate(value);
        Intent send=new Intent(Rcset1.this,Rcset1score.class);
        send.putExtra("first",get1);
        startActivity(send);
    case R.id.radioButton2 :
        value=0;
        int get2=this.calculate(value);
        Intent send2=new Intent(Rcset1.this,Rcset1score.class);
        send2.putExtra("first",get2);
        startActivity(send2);

    case R.id.radioButton3 :
        value=0;
        int get3=this.calculate(value);
        Intent send3=new Intent(Rcset1.this,Rcset1score.class);
        send3.putExtra("first",get3);
        startActivity(send3);
    case R.id.radioButton4 :
        value=1;
        int get4=this.calculate(value);
        Intent send4=new Intent(Rcset1.this,Rcset1score.class);
        send4.putExtra("first",get4);
        startActivity(send4);
    case R.id.radioButton5 :

value=0;
        int get5=this.calculate(value);
        Intent send5=new Intent(Rcset1.this,Rcset1score.class);
        send5.putExtra("first",get5);
        startActivity(send5);

}
                int ids2=rg2.getCheckedRadioButtonId();
                switch(ids2) {
                    case R.id.radioButton6 :
                        valu=0;
                        int get2=this.calculate1(valu);
                        Intent send1=new Intent(Rcset1.this,Rcset1score.class);
                        send1.putExtra("second",get2);
                        startActivity(send1);
                    case R.id.radioButton7 :
                        valu=1;
                        int get3=this.calculate1(valu);
                        Intent send3=new Intent(Rcset1.this,Rcset1score.class);
                        send3.putExtra("second",get3);
                        startActivity(send3);
                    case R.id.radioButton8 :
                        valu=0;
                        int get4=this.calculate1(valu);
                        Intent send4=new Intent(Rcset1.this,Rcset1score.class);
                        send4.putExtra("second",get4);
                        startActivity(send4);
                    case R.id.radioButton9 :
                        valu=0;
                        int get5=this.calculate1(valu);
                        Intent send5=new Intent(Rcset1.this,Rcset1score.class);
                        send5.putExtra("second",get5);
                        startActivity(send5);
                    case R.id.radioButton10 :
                        valu=0;
                        int get6=this.calculate1(valu);
                        Intent send6=new Intent(Rcset1.this,Rcset1score.class);
                        send6.putExtra("second",get6);
                        startActivity(send6);
                }

int ids3=rg3.getCheckedRadioButtonId();
                switch(ids3) {
                    case R.id.radioButton11 :
                        val=0;
                        int get3=this.calculate2(val);
                        Intent send3=new Intent(Rcset1.this,Rcset1score.class);
                        send3.putExtra("third",get3);
                        startActivity(send3);
                    case R.id.radioButton12 :
                        val=0;
                        int get4=this.calculate2(val);
                        Intent send4=new Intent(Rcset1.this,Rcset1score.class);
                        send4.putExtra("third",get4);
                        startActivity(send4);
                    case R.id.radioButton13 :
                        val=0;
                        int get5=this.calculate2(val);
                        Intent send5=new Intent(Rcset1.this,Rcset1score.class);
                        send5.putExtra("third",get5);
                        startActivity(send5);
                    case R.id.radioButton14 :
                        val=0;
                        int get6=this.calculate2(val);
                        Intent send6=new Intent(Rcset1.this,Rcset1score.class);
                        send6.putExtra("third",get6);
                        startActivity(send6);
                    case R.id.radioButton15 :
                        val=1;
                        int get8=this.calculate2(val);
                        Intent send8=new Intent(Rcset1.this,Rcset1score.class);
                        send8.putExtra("third",get8);
                        startActivity(send8);
                }
                int ids4=rg4.getCheckedRadioButtonId();
                switch(ids4) {
                    case R.id.radioButton16 :
                        va=1;
                        int get5=this.calculate3(va);
                        Intent send5=new Intent(Rcset1.this,Rcset1score.class);
                        send5.putExtra("fourth",get5);
                        startActivity(send5);
                    case R.id.radioButton17 :
                        va=0;
                        int get6=this.calculate3(va);
                        Intent send6=new Intent(Rcset1.this,Rcset1score.class);
                        send6.putExtra("fourth",get6);
                        startActivity(send6);
                    case R.id.radioButton18 :
                        va=0;
                        int get7=this.calculate3(va);
                        Intent send7=new Intent(Rcset1.this,Rcset1score.class);
                        send7.putExtra("fourth",get7);
                        startActivity(send7);
                    case R.id.radioButton19 :
                        va=0;
                        int get8=this.calculate3(va);
                        Intent send8=new Intent(Rcset1.this,Rcset1score.class);
                        send8.putExtra("fourth",get8);
                        startActivity(send8);
                    case R.id.radioButton20 :
                        va=1;
                        int get9=this.calculate3(va);
                        Intent send9=new Intent(Rcset1.this,Rcset1score.class);
                        send9.putExtra("fourth",get9);
                        startActivity(send9);
                }

                int id5=rg5.getCheckedRadioButtonId();
                switch (id5) {
                    case R.id.radioButton21 :
                        vas=0;
                        int get=this.calculate4(vas);
                        Intent send=new Intent(Rcset1.this,Rcset1score.class);
                        send.putExtra("fifth",get);
                        startActivity(send);
                    case R.id.radioButton22 :
                        vas=0;
                        int get1=this.calculate4(vas);
                        Intent send1=new Intent(Rcset1.this,Rcset1score.class);
                        send1.putExtra("fifth",get1);
                        startActivity(send1);
                    case R.id.radioButton23 :
                        vas=1;
                        int get2=this.calculate4(vas);
                        Intent send2=new Intent(Rcset1.this,Rcset1score.class);
                        send2.putExtra("fifth",get2);
                        startActivity(send2);
                    case R.id.radioButton24 :
                        vas=0;
                        int get3=this.calculate4(vas);
                        Intent send3=new Intent(Rcset1.this,Rcset1score.class);
                        send3.putExtra("fifth",get3);
                        startActivity(send3);
                    case R.id.radioButton25 :
                        vas=0;
                        int get4=this.calculate4(vas);
                        Intent send4=new Intent(Rcset1.this,Rcset1score.class);
                        send4.putExtra("fifth",get4);
                        startActivity(send4);
                }


                int ids6=rg7.getCheckedRadioButtonId();
                switch (ids6) {
                    case R.id.radioButton26 :
                        com=0;
                        int get4=this.calculate4(vas);
                        Intent send4=new Intent(Rcset1.this,Rcset1score.class);
                        send4.putExtra("sixth",get4);
                        startActivity(send4);
                    case R.id.radioButton27 :
                        com=1;
                        int get5=this.calculate4(vas);
                        Intent send5=new Intent(Rcset1.this,Rcset1score.class);
                        send5.putExtra("sixth",get5);
                        startActivity(send5);
                    case R.id.radioButton28 :
                        com=0;
                        int get6=this.calculate4(vas);
                        Intent send6=new Intent(Rcset1.this,Rcset1score.class);
                        send6.putExtra("sixth",get6);
                        startActivity(send6);
                    case R.id.radioButton29 :
                        com=0;
                        int get7=this.calculate4(vas);
                        Intent send7=new Intent(Rcset1.this,Rcset1score.class);
                        send7.putExtra("sixth",get7);
                        startActivity(send7);
                    case R.id.radioButton30 :
                        com=0;
                        int get8=this.calculate4(vas);
                        Intent send8=new Intent(Rcset1.this,Rcset1score.class);
                        send8.putExtra("sixth",get8);
                        startActivity(send8);
                }


                int ids7=rg8.getCheckedRadioButtonId();
                switch (ids7) {
                    case R.id.radioButton31 :
                        coma=0;
                        int c=this.calculate6(coma);
                        Intent i=new Intent(Rcset1.this,Rcset1score.class);
                        i.putExtra("seven",c);
                        startActivity(i);
                    case R.id.radioButton32 :
                        coma=1;
                        int c1=this.calculate6(coma);
                        Intent i1=new Intent(Rcset1.this,Rcset1score.class);
                        i1.putExtra("seven",c1);
                        startActivity(i1);
                    case R.id.radioButton33 :
                        coma=0;
                        int c2=this.calculate6(coma);
                        Intent i2=new Intent(Rcset1.this,Rcset1score.class);
                        i2.putExtra("seven",c2);
                        startActivity(i2);
                    case R.id.radioButton34 :
                        coma=0;
                        int c3=this.calculate6(coma);
                        Intent i3=new Intent(Rcset1.this,Rcset1score.class);
                        i3.putExtra("seven",c3);
                        startActivity(i3);
                    case R.id.radioButton35 :
                        coma=0;
                        int c4=this.calculate6(coma);
                        Intent i4=new Intent(Rcset1.this,Rcset1score.class);
                        i4.putExtra("seven",c4);
                        startActivity(i4);
                }

                int ids8=rg9.getCheckedRadioButtonId();
                switch(ids8) {
                    case R.id.radioButton36 :
                        co=0;
                       int c1= this.calculate7(co);
                        Intent in=new Intent(Rcset1.this,Rcset1score.class);
                        in.putExtra("eight",c1);
                        startActivity(in);

                    case R.id.radioButton37 :
                        co=0;
                        int c2= this.calculate7(co);
                        Intent in2=new Intent(Rcset1.this,Rcset1score.class);
                        in2.putExtra("eight",c2);
                        startActivity(in2);
                    case R.id.radioButton38 :
                        co=0;
                        int c3= this.calculate7(co);
                        Intent in3=new Intent(Rcset1.this,Rcset1score.class);
                        in3.putExtra("eight",c3);
                        startActivity(in3);
                    case R.id.radioButton39 :
                        co=1;
                        int c4= this.calculate7(co);
                        Intent in4=new Intent(Rcset1.this,Rcset1score.class);
                        in4.putExtra("eight",c4);
                        startActivity(in4);
                    case R.id.radioButton40 :
                        co=0;
                        int c5= this.calculate7(co);
                        Intent in5=new Intent(Rcset1.this,Rcset1score.class);
                        in5.putExtra("eight",c5);
                        startActivity(in5);
                }

               int ids9=rg10.getCheckedRadioButtonId();
                switch (ids9) {
                    case R.id.radioButton41 :
                        last=0;
                        int c=this.calculate8(last);
                        Intent i=new Intent(Rcset1.this,Rcset1score.class);
                        i.putExtra("nine",c);
                        startActivity(i);
                    case R.id.radioButton42 :
                        last=1;
                        int c1=this.calculate8(last);
                        Intent i1=new Intent(Rcset1.this,Rcset1score.class);
                        i1.putExtra("nine",c1);
                        startActivity(i1);
                    case R.id.radioButton43 :
                        last=0;
                        int c2=this.calculate8(last);
                        Intent i2=new Intent(Rcset1.this,Rcset1score.class);
                        i2.putExtra("nine",c2);
                        startActivity(i2);
                    case R.id.radioButton44 :
                        last=0;
                        int c3=this.calculate8(last);
                        Intent i3=new Intent(Rcset1.this,Rcset1score.class);
                        i3.putExtra("nine",c3);
                        startActivity(i3);
                    case R.id.radioButton45 :
                        last=0;
                        int c4=this.calculate8(last);
                        Intent i4=new Intent(Rcset1.this,Rcset1score.class);
                        i4.putExtra("nine",c4);
                        startActivity(i4);
                }


            }

            private int calculate8(int last) {
                int total9=last;
                return total9;
            }

            private int calculate7(int co) {
                int total8=co;
            return total8;

            }

            private int calculate6(int coma) {
                int total7=coma;
            return total7;

            }

            private int calculate5(int com) {
                int total6=com;
            return total6;

            }

            private int calculate4(int vas) {
                int total5=vas;
                return total5;
            }

            private int calculate3(int va){
                int total4=va;
return total4 ;}
            private int calculate2(int val) {
                int total3=val;
  return  total3;}

            private int calculate1(int valu) {

                int total2=valu;
                return total2;
            }

            private int calculate(int value) {
                int total1=value;
return total1;

            }
        });


        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(R.id.radioButton==checkedId) {
                    value3=0;




                }
                else if(R.id.radioButton2==checkedId) {
                    value1=0;

                }
                else if(R.id.radioButton3==checkedId) {
                    value2=0;

                }
                else if(R.id.radioButton4==checkedId) {
                    value=1;


                }
                else if(R.id.radioButton5==checkedId) {
                    value4=0;


                }
            }
        });

rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if(R.id.radioButton6==checkedId) {
            valu1=0;




        }
        else if(R.id.radioButton7==checkedId) {
            valu=1;

        }
        else if(R.id.radioButton8==checkedId) {
            valu2=0;

        }
        else if(R.id.radioButton9==checkedId) {
            valu3=0;


        }
        else if(R.id.radioButton10==checkedId) {
            valu4=0;


        }
    }
});

rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if(R.id.radioButton11==checkedId) {
            val1=0;




        }
        else if(R.id.radioButton12==checkedId) {
            val2=0;

        }
        else if(R.id.radioButton13==checkedId) {
            val3=0;

        }
        else if(R.id.radioButton14==checkedId) {
            val4=0;


        }
        else if(R.id.radioButton15==checkedId) {
            val=1;


        }
    }
});


        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(R.id.radioButton16==checkedId) {
                    va=1;




                }
                else if(R.id.radioButton17==checkedId) {
                    va1=0;

                }
                else if(R.id.radioButton18==checkedId) {
                    va2=0;

                }
                else if(R.id.radioButton19==checkedId) {
                    va3=0;


                }
                else if(R.id.radioButton20==checkedId) {
                    va4=0;


                }
            }
        });
rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if(R.id.radioButton21==checkedId) {
            vas1=0;




        }
        else if(R.id.radioButton22==checkedId) {
            vas2=0;

        }
        else if(R.id.radioButton23==checkedId) {
            vas=1;

        }
        else if(R.id.radioButton24==checkedId) {
            vas3=0;


        }
        else if(R.id.radioButton25==checkedId) {
            vas4=0;


        }
    }
});


        rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(R.id.radioButton26==checkedId) {
                    com1=0;




                }
                else if(R.id.radioButton27==checkedId) {
                    com=1;

                }
                else if(R.id.radioButton28==checkedId) {
                    com2=0;

                }
                else if(R.id.radioButton29==checkedId) {
                    com3=0;


                }
                else if(R.id.radioButton30==checkedId) {
                    com4=0;


                }
            }
        });


        rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(R.id.radioButton31==checkedId) {
                    coma1=0;




                }
                else if(R.id.radioButton32==checkedId) {
                    coma=1;

                }
                else if(R.id.radioButton33==checkedId) {
                    coma2=0;

                }
                else if(R.id.radioButton34==checkedId) {
                    coma3=0;


                }
                else if(R.id.radioButton35==checkedId) {
                    coma4=0;


                }
            }
        });

        rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(R.id.radioButton36==checkedId) {
                    co1=0;




                }
                else if(R.id.radioButton37==checkedId) {
                    co2=0;

                }
                else if(R.id.radioButton38==checkedId) {
                    co3=0;

                }
                else if(R.id.radioButton39==checkedId) {
                    co=1;


                }
                else if(R.id.radioButton40==checkedId) {
                    co4=0;


                }
            }
        });

        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(R.id.radioButton41==checkedId) {
                    last1=0;




                }
                else if(R.id.radioButton42==checkedId) {
                    last=1;

                }
                else if(R.id.radioButton43==checkedId) {
                    last2=0;

                }
                else if(R.id.radioButton44==checkedId) {
                    last3=0;


                }
                else if(R.id.radioButton45==checkedId) {
                    last4=0;


                }
            }
        });
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == android.view.KeyEvent.KEYCODE_BACK) {
            exitByBackKey();


            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    protected void exitByBackKey() {

        AlertDialog.Builder make = new AlertDialog.Builder(Rcset1.this);
        make.setTitle("SORRY !!");
        make.setMessage("You cannot go back once you have started the practice questions,attempt all the questions and then submit. Please dont waste your time.You have few mins left hurry up!");
        make.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


            }
        });

        AlertDialog alert = make.create();
        alert.show();
    }

}
