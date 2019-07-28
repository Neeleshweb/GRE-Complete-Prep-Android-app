package mega.GRE.Preparation;

import android.app.Activity;
import android.app.Dialog;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Vocabscroll extends ListActivity {

    private TextView text;

    private List<String> listValues;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_vocabscroll);



        text = (TextView) findViewById(R.id.mainText);



        listValues = new ArrayList<String>();

        listValues.add("SET 1(1-500 WORDS)");
        listValues.add("SET 2(501-1000 WORDS)");

        listValues.add("SET 3(1001-1500 WORDS)");

        listValues.add("SET 4(1501-2000 WORDS)");

        listValues.add("SET 5(2001-2500 WORDS)");

        listValues.add("SET 6(2501-3000 WORDS)");





        // initiate the listadapter

        ArrayAdapter<String> myAdapter = new ArrayAdapter <String>(this,

                R.layout.row_layoutlist, R.id.listText, listValues);



        // assign the list adapter

        setListAdapter(myAdapter);



    }



            // when an item of the list is clicked

    @Override

    protected void onListItemClick(ListView list, View view, int position, long id) {

        super.onListItemClick(list, view, position, id);



        String selectedItem = (String) getListView().getItemAtPosition(position);

        //String selectedItem = (String) getListAdapter().getItem(position);

int pos=position;
        if(pos==0) {
                    this.showDialog(Vocabscroll.this,"Now you are about to view TOP 500 most Frequently asked words in the GRE Exam.You can view the word along with it's meaning in a box and you can also view the example of the word in a sentence by clicking on the box.So click OK to continue!!");



        }
        else if(pos==1) {
            this.showDialog(Vocabscroll.this,"We assume you have mastered the previous 500 words, so now you can view next 500 most Frequently asked words in the GRE Exam.You can view the word along with it's meaning in a box and you can also view the example of the word in a sentence by clicking on the box.So click OK to continue!!");
        }
        else if(pos==2) {
            this.showDialog(Vocabscroll.this,"After covering the top 1000 words, now is the time to view some general words which are also asked but less frequently.You can view the word along with it's meaning in a box and you can also view the example of the word in a sentence by clicking on the box.So click OK to continue!!");
        }
        else if(pos==3) {
            this.showDialog(Vocabscroll.this,"If you have gone through the above 3 sections then you have mastered major vocab for GRE, but still few words remain.You can view the word along with it's meaning in a box and you can also view the example of the word in a sentence by clicking on the box.So click OK to continue!!");
        }
        else if(pos==4) {
            this.showDialog(Vocabscroll.this,"This section is OPTIONAL to attempt if you have completed the above words.You can view the word along with it's meaning in a box and you can also view the example of the word in a sentence by clicking on the box.So click OK to continue!!");
        }
        else if(pos==5) {
            this.showDialog(Vocabscroll.this,"This section is also OPTIONAL to attempt if you have completed the above words.You can view the word along with it's meaning in a box and you can also view the example of the word in a sentence by clicking on the box.So click OK to continue!!");
        }



        text.setText("You clicked " + selectedItem + " at position " + position);

    }

    public void showDialog(Activity activity, String msg){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog);

        TextView text = (TextView) dialog.findViewById(R.id.text_dialog);
        text.setText(msg);
final String get=msg;
        Button dialogButton = (Button) dialog.findViewById(R.id.btn_dialog);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (get.equals("Now you are about to view TOP 500 most Frequently asked words in the GRE Exam.You can view the word along with it's meaning in a box and you can also view the example of the word in a sentence by clicking on the box.So click OK to continue!!")) {
                    Intent intent = new Intent(Vocabscroll.this, Top500wordslist.class);
                    startActivity(intent);
                    finish();
                } else if (get.equals("We assume you have mastered the previous 500 words, so now you can view next 500 most Frequently asked words in the GRE Exam.You can view the word along with it's meaning in a box and you can also view the example of the word in a sentence by clicking on the box.So click OK to continue!!")) {
                    Intent intent1 = new Intent(Vocabscroll.this, Top500to1000wordslist.class);
                    startActivity(intent1);
                    finish();
                } else if (get.equals("After covering the top 1000 words, now is the time to view some general words which are also asked but less frequently.You can view the word along with it's meaning in a box and you can also view the example of the word in a sentence by clicking on the box.So click OK to continue!!")) {
                    Intent intent1 = new Intent(Vocabscroll.this, Top1001to1500wordslist.class);
                    startActivity(intent1);
                    finish();
                } else if (get.equals("If you have gone through the above 3 sections then you have mastered major vocab for GRE, but still few words remain.You can view the word along with it's meaning in a box and you can also view the example of the word in a sentence by clicking on the box.So click OK to continue!!")) {
                    Intent intent1 = new Intent(Vocabscroll.this, Top1501to2000wordslist.class);
                    startActivity(intent1);
                    finish();
                } else if (get.equals("This section is OPTIONAL to attempt if you have completed the above words.You can view the word along with it's meaning in a box and you can also view the example of the word in a sentence by clicking on the box.So click OK to continue!!")) {
                    Intent intent1 = new Intent(Vocabscroll.this, Top2001to2500wordslist.class);
                    startActivity(intent1);
                    finish();
                } else if (get.equals("This section is also OPTIONAL to attempt if you have completed the above words.You can view the word along with it's meaning in a box and you can also view the example of the word in a sentence by clicking on the box.So click OK to continue!!")) {
                    Intent intent1 = new Intent(Vocabscroll.this, Top2501to3000wordslist.class);
                    startActivity(intent1);
                    finish();
                }


            }
        });

        dialog.show();

    }

}
