package in.co.officevcan.stg1.ovkksapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

/**
 * Created by admin on 9/23/2016.
 */
public class WelcomeActivity extends AppCompatActivity {
    Toolbar app_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        app_bar = (Toolbar) findViewById(R.id.app_bar);
        app_bar.setLogo(R.mipmap.main_logo);

        setSupportActionBar(app_bar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            getSupportActionBar().setDisplayShowHomeEnabled(false);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
}