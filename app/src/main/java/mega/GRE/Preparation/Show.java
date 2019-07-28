package mega.GRE.Preparation;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Show extends AppCompatActivity {
TextView tx,tx2,tx3;
    Button btn;
    int predicted;
    int get;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Intent in=getIntent();
        int total=in.getIntExtra("final",0);
        tx=(TextView)findViewById(R.id.textView6);
        tx2=(TextView)findViewById(R.id.textView7);
        btn=(Button)findViewById(R.id.button15);

        tx3=(TextView)findViewById(R.id.te);
        tx.setText("your score is: "+total);
         predicted=130+(40*total)/9;
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent in=new Intent(Show.this,Estimatedscore.class);
        in.putExtra("getit",predicted);
        startActivity(in);
        finish();

    }
});




    }
}
