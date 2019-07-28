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

public class Rcscroll extends ListActivity {
    private TextView text;

    private List<String> listValues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcscroll);
        text = (TextView) findViewById(R.id.mainText);


        listValues = new ArrayList<String>();

        listValues.add("SET 1(3 PARAGRAPHS)");
        listValues.add("SET 2(3 PARAGRAPHS)");

        listValues.add("SET 3(3 PARAGRAPHS)");

        listValues.add("SET 4(3 PARAGRAPHS)");

        listValues.add("SET 5(3 PARAGRAPHS)");


        // initiate the listadapter

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,

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

        int pos = position;
        if (pos == 0) {

            this.showDialog(Rcscroll.this, "The first set consists of 5 paragraphs with about 5-6 questions in each paragraph for your practice.Read the paragraph carefully and answer the questions accordingly.Click OK to start the SET 1.");


        } else if (pos == 1) {
            this.showDialog(Rcscroll.this, "The second set consists of 5 paragraphs with about 5-6 questions in each paragraph for your practice.Read the paragraph carefully and answer the questions accordingly.Click OK to start the SET 2.");
        } else if (pos == 2) {
            this.showDialog(Rcscroll.this, "The third set consists of 5 paragraphs with about 5-6 questions in each paragraph for your practice.Read the paragraph carefully and answer the questions accordingly.Click OK to start the SET 3.");
        } else if (pos == 3) {
            this.showDialog(Rcscroll.this, "The fourth set consists of 5 paragraphs with about 5-6 questions in each paragraph for your practice.Read the paragraph carefully and answer the questions accordingly.Click OK to start the SET 4.");
        } else if (pos == 4) {
            this.showDialog(Rcscroll.this, "The last set consists of 5 paragraphs with about 5-6 questions in each paragraph for your practice.Read the paragraph carefully and answer the questions accordingly.Click OK to start the SET 5.");
        }


        text.setText("You clicked " + selectedItem + " at position " + position);

    }

    public void showDialog(Activity activity, String msg) {
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog2);

        TextView text = (TextView) dialog.findViewById(R.id.text_dialog);
        text.setText(msg);
        final String get = msg;
        Button dialogButton = (Button) dialog.findViewById(R.id.dialog);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (get.equals("The first set consists of 5 paragraphs with about 5-6 questions in each paragraph for your practice.Read the paragraph carefully and answer the questions accordingly.Click OK to start the SET 1.")) {
                    Intent intent = new Intent(Rcscroll.this, Rcset1first.class);

                    startActivity(intent);
                    finish();


                } else if (get.equals("The second set consists of 5 paragraphs with about 5-6 questions in each paragraph for your practice.Read the paragraph carefully and answer the questions accordingly.Click OK to start SET 2.")) {
                    Intent intent1 = new Intent(Rcscroll.this, Faqs.class);

                    startActivity(intent1);

                } else if (get.equals("The third set consists of 5 paragraphs with about 5-6 questions in each paragraph for your practice.Read the paragraph carefully and answer the questions accordingly.Click OK to start SET 3.")) {
                    Intent intent2 = new Intent(Rcscroll.this, Faqs.class);

                    startActivity(intent2);

                } else if (get.equals("The fourth set consists of 5 paragraphs with about 5-6 questions in each paragraph for your practice.Read the paragraph carefully and answer the questions accordingly.Click OK to start SET 4.")) {
                    Intent intent3 = new Intent(Rcscroll.this, Faqs.class);

                    startActivity(intent3);

                } else if (get.equals("The last set consists of 5 paragraphs with about 5-6 questions in each paragraph for your practice.Read the paragraph carefully and answer the questions accordingly.Click OK to start SET 5.")) {
                    Intent intent4 = new Intent(Rcscroll.this, Faqs.class);

                    startActivity(intent4);

                }

            }
        });

        dialog.show();


    }

}
