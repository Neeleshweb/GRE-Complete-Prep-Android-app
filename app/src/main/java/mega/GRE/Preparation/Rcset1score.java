package mega.GRE.Preparation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Rcset1score extends AppCompatActivity {
TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcset1score);

tv1=(TextView)findViewById(R.id.textView3);

        Intent get=getIntent();
        int a=get.getIntExtra("first",0);
        int b=get.getIntExtra("second",1);
        int c=get.getIntExtra("third",2);
        int d=get.getIntExtra("fourth",3);
        int f=get.getIntExtra("fifth",4);
        int g=get.getIntExtra("sixth",5);
        int h=get.getIntExtra("seven",6);
        int i=get.getIntExtra("eight",7);
        int j=get.getIntExtra("nine",8);
        int total=a+b+c+d+f+g+h+i+j;
        tv1.setText("your score is" +total);



    }
}
