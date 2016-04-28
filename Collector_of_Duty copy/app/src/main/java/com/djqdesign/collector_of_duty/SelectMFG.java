package com.djqdesign.collector_of_duty;

import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.ImageButton;
import android.app.Activity;

public class SelectMFG extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_mfg);
        android.app.Fragment frag = (android.app.Fragment)getFragmentManager().findFragmentById(R.id.mfgNameFragment);
        frag.setMfgId(1);
    }//end onCreate
    /*

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_select_mfg, menu);
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
    }*/
    public void onClickAtari(View view) {
        ImageButton Atari = (ImageButton) findViewById(R.id.Atari_Logo);
        if (view == Atari) {
            Intent intent = new Intent(SelectMFG.this, atari_consoles.class);
            startActivity(intent);
        }// end ifAtari

    }// end onClickAtari

}
