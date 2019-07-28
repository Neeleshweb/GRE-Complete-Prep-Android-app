package mega.GRE.Preparation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Feedback extends AppCompatActivity {
TextView txt;
    EditText ed;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        txt=(TextView)findViewById(R.id.textView9);
        ed=(EditText)findViewById(R.id.edit);
        btn=(Button)findViewById(R.id.button16);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=ed.getText().toString();
                if(value1.length()==0) {

                    Viewdialog num=new Viewdialog();
                    num.showDialog(Feedback.this,"PLEASE WRITE YOUR VALUABLE FEEDBACK BEFORE SENDING, EMPTY FEEDBACK IS OF NO USE!");
                }
                else  {

                    Viewdialog num2=new Viewdialog();
                    num2.showDialog(Feedback.this,"THANK YOU FOR PROVIDING YOUR FEEDBACK, WE WILL MAKE ALL THE CHANGES SUGGESTED BY YOU IN THE NEXT UPDATE.");
                }
            }
        });

    }
}
