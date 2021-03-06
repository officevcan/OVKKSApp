package in.co.officevcan.stg1.ovkksapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.rey.material.app.ThemeManager;
import com.rey.material.widget.Button;

/**
 * Created by admin on 29-Sep-16.
 */
public class LoginActivity extends AppCompatActivity
{
    Toolbar app_bar;
    Context context;
    Button btnlogin;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ThemeManager.init(this, 1, 0, null);
        btnlogin=(Button)findViewById(R.id.btnlogin);

        app_bar = (Toolbar) findViewById(R.id.app_bar);
        app_bar.setTitle("Login");

        setSupportActionBar(app_bar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        btnlogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                  Intent i=new Intent(getApplicationContext(),UserDashboardActivity.class);
                   startActivity(i);

            }


        } );
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent ii = new Intent(getApplicationContext(), NavigationActivity.class);
        startActivity(ii);
        return super.onOptionsItemSelected(item);
    }
}
