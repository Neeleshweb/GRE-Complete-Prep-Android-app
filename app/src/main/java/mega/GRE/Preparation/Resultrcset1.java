package mega.GRE.Preparation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultrcset1 extends AppCompatActivity {

    Button btn;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultrcset1);

        btn=(Button)findViewById(R.id.button14);
        txt=(TextView)findViewById(R.id.textView4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=getIntent();
                int total=i.getIntExtra("val9",0);
                Intent in=new Intent(Resultrcset1.this,Show.class);
                in.putExtra("final",total);
                startActivity(in);
                finish();
            }
        });

    }
}
