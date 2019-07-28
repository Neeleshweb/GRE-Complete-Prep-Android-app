package mega.GRE.Preparation;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Estimatedscore extends AppCompatActivity {
int verb;
    int quant;
    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estimatedscore);
        tv1=(TextView)findViewById(R.id.textView5);
        tv2=(TextView)findViewById(R.id.textView8);
        Intent num=getIntent();
        verb=num.getIntExtra("getit",0);
            if(verb==0) {

                tv1.setText("YOUR ESTIMATED VERBAL SCORE: "+"YOU HAVE NOT BEGUN THE PRACTICE IN THIS SESSION, NEITHER HAVE YOU TAKEN ANY QUIZ, SO WE CANNOT ESTIMATE YOUR SCORE. TO GET YOUR ESTIMATED SCORE TO BE DISPLAYED, YOU NEED TO PRACTICE ATLEAST ONE SET OF ANY SECTION OR TAKE A QUIZ FOR THIS SESSION.");
            }
        else{
                tv1.setText("YOUR ESTIMATED VERBAL SCORE: "+verb);
            }
        if(quant==0){
            tv2.setText("YOUR ESTIMATED QUANT SCORE: "+"YOU HAVE NOT BEGUN THE PRACTICE, NEITHER HAVE YOU TAKEN ANY QUIZ, SO WE CANNOT ESTIMATE YOUR SCORE. TO GET YOUR ESTIMATED SCORE TO BE DISPLAYED, YOU NEED TO PRACTICE ATLEAST ONE SET OF ANY SECTION OR TAKE A QUIZ.");
        }
        else{
            tv2.setText("YOUR ESTIMATED QUANT SCORE: "+quant);
        }

    }
}
