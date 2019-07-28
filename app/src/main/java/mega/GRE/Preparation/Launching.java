package mega.GRE.Preparation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Launching extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launching);
        Thread timer=new Thread() {
            public void run() {
                try {
                    sleep(7000);
                } catch(Exception ee) {
                    ee.printStackTrace();
                } finally {
                    Intent bol=new Intent(Launching.this,Home.class);
                    startActivity(bol);
                    finish();
                }
            }
        };
        timer.start();

    }
}
