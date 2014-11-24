package com.project.ec327.studybreak;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.studyapp.R;


public class MainActivity extends Activity {
TextView t;
TextView minutes;
    TextView num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.question_time);
        minutes = (TextView) findViewById(R.id.minute_label);
        num = (TextView) findViewById(R.id.display_time);


        Typeface myCustom = Typeface.createFromAsset(getAssets(), "fonts/Hand_Of_Sean_Demo.ttf");
        t.setTypeface(myCustom);
        minutes.setTypeface(myCustom);
        num.setTypeface(myCustom);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
/**
    public class handSean extends TextView{
        private Context c;
        public handSean(Context c) {
            super(c);
            this.c = c;
            Typeface tfs = createFromAsset(c.getAssets(), "font/Hand_Of_Sean_Demo.fft");
            setTypeface(tfs);
        }
    }

**/
}

