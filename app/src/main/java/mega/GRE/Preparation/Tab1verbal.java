package mega.GRE.Preparation;

/**
 * Created by Neelesh Singh(web) on 3/15/2017.
 */

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;

import android.widget.TextView;

public class Tab1verbal extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main_activitytab, container, false);
Button btn2=(Button)rootView.findViewById(R.id.button5);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent num2=new Intent(Tab1verbal.this.getActivity(),Rcscroll.class);
                startActivity(num2);
            }


        });
Button btn=(Button)rootView.findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Intent num=new Intent(Tab1verbal.this.getActivity(),Vocabscroll.class);
                startActivity(num);
            }
        });
        return rootView;
    }



    }

