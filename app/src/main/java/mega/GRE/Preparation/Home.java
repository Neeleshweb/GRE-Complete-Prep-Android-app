package mega.GRE.Preparation;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
Button btn2,btn3,dem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
btn2=(Button)findViewById(R.id.button);
        btn3=(Button)findViewById(R.id.button3);
        dem=(Button)findViewById(R.id.demo);
        dem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,MainActivitytab.class);
                startActivity(i);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Home.this,University.class);
                startActivity(i1);

            }
        });
        SQLiteDatabase database = openOrCreateDatabase("Greprep", MODE_APPEND, null);
        database.execSQL("create table if not exists predictedscoresquant(Quant INTEGER)");
        database.execSQL("create table if not exists predictedscoresverbal(Verbal INTEGER)");

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
Intent intent=new Intent(Home.this,Settings.class);
            startActivity(intent);

            return true;
        }
        if(id == R.id.Exit) {
            finish();
            return true ;

        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.feedback) {
            Intent i1=new Intent(Home.this,Feedback.class);
            startActivity(i1);
            // Handle the camera action
        } else if (id == R.id.faqs) {
            Intent i2=new Intent(Home.this,Faqs.class);
            startActivity(i2);
        } else if (id == R.id.features) {
            Intent i3=new Intent(Home.this,Features.class);
            startActivity(i3);
        } else if (id == R.id.scores) {
            Intent i4=new Intent(Home.this,Scores.class);
            startActivity(i4);
        }
        else if (id == R.id.universities) {
            Intent i5=new Intent(Home.this,University.class);
            startActivity(i5);
        }
        else if (id == R.id.terms) {
            Viewdialog alert1 = new Viewdialog();
            String msg="Please read these Terms and Conditions carefully before using the GRE COMPLETE PREP APP operated by HOMEFILESCENTER.Your access to and use of the Service is conditioned on your acceptance of and compliance with these Terms. These Terms apply to all visitors, users and others who access or use the Service.\n" +
                    "By accessing or using the Service you agree to be bound by these Terms. If you disagree with any part of the terms then you may not access the Service.\n" +
                    "LINKS TO OTHER WEBSITES\n" +
                    "                       \n" +
                    "Our Service may contain links to third-party web sites or services that are not owned or controlled by GRE COMPLETE PREP.\n" +
                    "                       \n" +
                    "GRE COMPLETE PREP has no control over, and assumes no responsibility for, the content, privacy policies, or practices of any third party web sites or services. You further acknowledge and agree that HOMEFILESCENTER shall not be responsible or liable, directly or indirectly, for any damage or loss caused or alleged to be caused by or in connection with use of or reliance on any such content, goods or services available on or through any such web sites or services.\n" +
                    "                      \n" +
                    "We strongly advise you to read the terms and conditions and privacy policies of any third-party web sites or services that you visit.\n" +
                    "                    \n" +
                    "TERMINATION\n" +
                    "                     \n" +
                    "We may terminate or suspend access to our Service immediately, without prior notice or liability, for any reason whatsoever, including without limitation if you breach the Terms.\n" +
                    "                        \n" +
                    "All provisions of the Terms which by their nature should survive termination shall survive termination, including, without limitation, ownership provisions, warranty disclaimers, indemnity and limitations of liability.\n" +
                    "                      \n" +
                    "GOVERNING LAW\n" +
                    "                       \n" +
                    "These Terms shall be governed and construed in accordance with the laws of Uttar Pradesh, India, without regard to its conflict of law provisions.\n" +
                    "                      \n" +
                    "Our failure to enforce any right or provision of these Terms will not be considered a waiver of those rights. If any provision of these Terms is held to be invalid or unenforceable by a court, the remaining provisions of these Terms will remain in effect. These Terms constitute the entire agreement between us regarding our Service, and supersede and replace any prior agreements we might have between us regarding the Service.\n" +
                    "                      \n" +
                    "CHANGES\n" +
                    "                      \n" +
                    "We reserve the right, at our sole discretion, to modify or replace these Terms at any time. If a revision is material we will try to provide at least 30 days notice prior to any new terms taking effect. What constitutes a material change will be determined at our sole discretion.\n" +
                    "                      \n" +
                    "By continuing to access or use our Service after those revisions become effective, you agree to be bound by the revised terms. If you do not agree to the new terms, please stop using the Service.\n" +
                    "                       \n" +
                    "CONTACT US\n" +
                    "                      \n" +
                    "If you have any questions about these Terms, please contact us";
            alert1.showDialog(Home.this,msg);
        } else if (id == R.id.privacy) {
            Viewdialog alert = new Viewdialog();
            String msg2="PERSONAL IDENTIFICATION INFORMATION\n" +
                    "\" +\n" +
                    "                    \"\\\" +\\n\" +\n" +
                    "                    We may collect personal identification information from Users in a variety of ways in connection with activities, services, features or resources we make available on our Site. . Users may visit our Site anonymously. We will collect personal identification information from Users only if they voluntarily submit such information to us. Users can always refuse to supply personally identification information, except that it may prevent them from engaging in certain Site related activities.\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"\\\\n\\\" +\\n\" +\n" +
                    "                   NON-PERSONAL IDENTIFICATION INFORMATION\\\\n\\\" +\\n\" +\n" +
                    "                   We may collect non-personal identification information about Users whenever they interact with our Site. Non-personal identification information may include the browser name, the type of computer and technical information about Users means of connection to our Site, such as the operating system and the Internet service providers utilized and other similar information.\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"\\\\n\\\" +\\n\" +\n" +
                    "                   WEB BROWSER COOKIES\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"Our Site may use \\\\\\\"cookies\\\\\\\" to enhance User experience. User's web browser places cookies on their hard drive for record-keeping purposes and sometimes to track information about them. User may choose to set their web browser to refuse cookies, or to alert you when cookies are being sent. If they do so, note that some parts of the Site may not function properly.\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"\\\\n\\\" +\\n\" +\n" +
                    "                   HOW WE USE COLLECTED INFORMATION\\\\n\\\" +\\n\" +\n" +
                    "                  GRE COMPLETE PREP may collect and use Users personal information for the following purposes:\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"To run and operate our Site\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"We may need your information display content on the Site correctly.\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"HOW WE PROTECT YOUR INFORMATION\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"We adopt appropriate data collection, storage and processing practices and security measures to protect against unauthorized access, alteration, disclosure or destruction of your personal information, username, password, transaction information and data stored on our Site.\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"THIRED PARTY WEBSITES\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"Users may find advertising or other content on our Site that link to the sites and services of our partners, suppliers, advertisers, sponsors, licencors and other third parties. We do not control the content or links that appear on these sites and are not responsible for the practices employed by websites linked to or from our Site. In addition, these sites or services, including their content and links, may be constantly changing. These sites and services may have their own privacy policies and customer service policies. Browsing and interaction on any other website, including websites which have a link to our Site, is subject to that website's own terms and policies.\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"ADVERTISING\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"Ads appearing on our site may be delivered to Users by advertising partners, who may set cookies. These cookies allow the ad server to recognize your computer each time they send you an online advertisement to compile non personal identification information about you or others who use your computer. This information allows ad networks to, among other things, deliver targeted advertisements that they believe will be of most interest to you. This privacy policy does not cover the use of cookies by any advertisers.\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"GOOGLE ADSENSE\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"Some of the ads may be served by Google. Google's use of the DART cookie enables it to serve ads to Users based on their visit to our Site and other sites on the Internet. DART uses \\\\\\\"non personally identifiable information\\\\\\\" and does NOT track personal information about you, such as your name, email address, physical address, etc. You may opt out of the use of the DART cookie by visiting the Google ad and content network privacy policy at http://www.google.com/privacy_ads.html\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"CHANGES TO THIS PRIVACY POLICY\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"GRE COMPLETE PREP has the discretion to update this privacy policy at any time. When we do, we will post a notification on the main page of our Site. We encourage Users to frequently check this page for any changes to stay informed about how we are helping to protect the personal information we collect. You acknowledge and agree that it is your responsibility to review this privacy policy periodically and become aware of modifications.\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"YOUR ACCEPTANCE OF THESE TERMS\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"By using this Site, you signify your acceptance of this policy. If you do not agree to this policy, please do not use our Site. Your continued use of the Site following the posting of changes to this policy will be deemed your acceptance of those changes. This policy was generated using PrivacyPolicies.Com\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"CONTACTING US\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"If you have any questions about this Privacy Policy, the practices of this site, or your dealings with this site, please contact us.\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \\\"\\\\n\\\" +\\n\" +\n" +
                    "                    \"                        \"This document was last updated on june 4th, 2017" ;
            alert.showDialog(Home.this, msg2);
        }
        else if (id == R.id.reasons) {
            Intent i8=new Intent(Home.this,Reasons.class);
            startActivity(i8);
        }
        else if (id == R.id.contact) {
            Intent i9=new Intent(Home.this,Contactus.class);
            startActivity(i9);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
