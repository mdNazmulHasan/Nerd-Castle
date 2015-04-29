package org.bd.basis.personnameapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private ArrayList<Student> studentList;
	EditText nameEditText ;
	EditText regEditText ;
	EditText emailEditText;
	private ListView studentListView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initialization();
	}
	public void initialization(){
		 nameEditText =(EditText) findViewById(R.id.nameEditText);
		 regEditText =(EditText) findViewById(R.id.regEditText);
		 emailEditText =(EditText) findViewById(R.id.emailEditText);
		studentList=new ArrayList<Student>();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void addButton(View view){
		Toast.makeText(getApplicationContext(),"dfjds;f",Toast.LENGTH_SHORT).show();

		String name=nameEditText.getText().toString();
		String reg=regEditText.getText().toString();
		String email=emailEditText.getText().toString();

		Student student=new Student(name,reg,email);
        studentList.add(student);
	}
	public void showButton_Clicked(View aView)
    {
		CustomAdapter adapter = new CustomAdapter(
				MainActivity.this, studentList);
		studentListView = (ListView) findViewById(R.id.listView);
		studentListView.setAdapter(adapter);
		Toast.makeText(getApplicationContext(),""+studentList.size(),Toast.LENGTH_SHORT).show();

	}

}
