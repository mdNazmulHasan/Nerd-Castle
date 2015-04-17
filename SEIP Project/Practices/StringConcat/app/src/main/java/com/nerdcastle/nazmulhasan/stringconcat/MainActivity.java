package com.nerdcastle.nazmulhasan.stringconcat;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    EditText firstNameEditText;
    EditText middleNameEditText;
    EditText lastNameEditText;
    TextView fullNameView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
    public void showButton_Clicked(View aView)
    {
        firstNameEditText =(EditText) findViewById(R.id.firstNameEditText);
        middleNameEditText =(EditText) findViewById(R.id.middleNameEditText);
        lastNameEditText =(EditText) findViewById(R.id.lastNameEditText);
        fullNameView =(TextView) findViewById(R.id.fullName);

        String firstName = firstNameEditText.getText().toString();
        String middleName = middleNameEditText.getText().toString();
        String lastName = lastNameEditText.getText().toString();

        String fullName = firstName+" "+middleName+" "+lastName;


        fullNameView.setText(fullName);

    }
}
