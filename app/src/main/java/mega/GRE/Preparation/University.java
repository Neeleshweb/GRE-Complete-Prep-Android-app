package mega.GRE.Preparation;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class University extends ListActivity {
    private TextView text1,text2,text3,text4,text5;

    private List<String> listValues1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);



        text1 = (TextView) findViewById(R.id.txt);



        listValues1 = new ArrayList<String>();


listValues1.add("Massachusetts Institute of Technology: www.mit.edu");

        listValues1.add("Stanford University: www.stanford.edu");
        listValues1.add("University of California- Berkeley: www.berkeley.edu");
        listValues1.add("University of Illinois – Urbana Champaign: www.uiuc.edu");
        listValues1.add("University of Texas at Austin: www.utexas.edu");
        listValues1.add("University of California – San Diego: www.ucsd.edu");
        listValues1.add("University of Maryland – College park: www.umd.edu");
        listValues1.add("University of California Los Angles: www.ucla.edu");
        listValues1.add("Harvard University: www.harvard.edu");
        listValues1.add("Carnegie Mellon University: www.cmu.edu");

        listValues1.add("Princeton University: www.princeton.edu");
        listValues1.add("Pennsylvania State University –Univ Park: www.psu.edu");
        listValues1.add("Georgia Institute of Technology: www.gatech.edu");
        listValues1.add("University of Washington – Seattle: www.washington.edu");
        listValues1.add("Columbia University: www.columbia.edu");
        listValues1.add("Yale University: www.yale.edu");
        listValues1.add("North Carolina State University: www.ncsu.edu");
        listValues1.add("University of Pittsburgh: www.pitt.edu");
        listValues1.add("Arizona State University: ");
        listValues1.add("University of Virginia: www.virginia.edu");
        listValues1.add("University of Pennsylvania: www.upenn.edu");
        listValues1.add("Boston University: www.bu.edu");
        listValues1.add("Michigan State University: www.msu.edu");
        listValues1.add("University of Chicago: www.uchicago.edu");
        listValues1.add("University of Delaware: www.udel.edu");

        listValues1.add("University of Missouri – Rolla: www.umr.edu");
        listValues1.add("University of Nebraska Lincoln: www.unl.edu");
        listValues1.add("University of Connecticut: www.uconn.edu");
        listValues1.add("University of Utah: www.utah.edu");
        listValues1.add("West Virginia University: www.wvu.edu");
        listValues1.add("University of Kansas: www.ku.edu");
        listValues1.add("University of Georgia: www.uga.edu");
        listValues1.add("Oklahoma State University: www.okstate.edu");
        listValues1.add("University of South Carolina: www.sc.edu");
        listValues1.add("Indiana University - Bloomington: www.indiana.edu");
        listValues1.add("University of Kentucky: www.uky.edu");
        listValues1.add("George Washington University: www.gwu.edu");
        listValues1.add("University of Houston –Houston: www.uh.edu");
        listValues1.add("University of Miami: www.miami.edu");
        listValues1.add("University of Texas – Dallas: www.utdallas.edu");
        listValues1.add("Louisiana State University-Baton Rouge: www.lsu.edu");


        listValues1.add("Texas Tech University: www.ttu.edu");
        listValues1.add("Wayne State University: www.wayne.edu");
        listValues1.add("California State University, Sacramento: www.csus.edu");
        listValues1.add("Missouri State University: www.missouristate.edu");
        listValues1.add("New Mexico State University: www.nmsu.edu");
        listValues1.add("North Dakota State University: www.ndsu.edu");
        listValues1.add("Wright State University: www.wright.edu");
        listValues1.add("University of Tulsa: www.utulsa.edu");
        listValues1.add("University of Vermont: www.uvm.edu");
        listValues1.add("Baylor University, Texas: www.baylor.edu");
        listValues1.add("University of Tampa: www.utampa.edu");
        listValues1.add("University of Mississippi: www.olemiss.edu");
        listValues1.add("Pace University, NY: www.pace.edu");


        listValues1.add("Northwest Missouri State University: www.nwmissouri.edu");
        listValues1.add("Lamar University: www.lamar.edu");
        listValues1.add("University of Louisville: www.louisville.edu");
        listValues1.add("Western Kentucky University: www.wku.edu");
        listValues1.add("Cleveland State University: www.csuohio.edu");
        listValues1.add("Eastern Michigan University: www.emich.edu");
        listValues1.add("Montana State University, Bozeman: www.montana.edu");
        listValues1.add("University of Hawaii: www.hawai.edu");
        listValues1.add("Ball State University: www.bsu.edu");
        listValues1.add("Columbus State University: www.colstate.edu");
        listValues1.add("Arkansas State University: www.astate.edu");
        listValues1.add("North Dakota State University: www.ndsu.edu");
        listValues1.add("St Cloud State University: www.stcloudstate.edu");

        ArrayAdapter<String> myAdapter1 = new ArrayAdapter <String>(this,

                R.layout.row_layoutlist, R.id.listText, listValues1);



        // assign the list adapter

        setListAdapter(myAdapter1);








    }
}
