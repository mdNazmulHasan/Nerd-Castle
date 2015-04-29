package org.bd.basis.personnameapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nazmulHasan on 4/30/2015.
 */
public class CustomAdapter extends ArrayAdapter<Student> {
    private ArrayList<Student> studentList;
    Activity context;
    private LayoutInflater inflater;

    public CustomAdapter(Activity context, ArrayList<Student> studentList) {

        super(context, R.layout.each_row,  studentList);
        this.context=context;
        this.studentList=studentList;

    }
    static class ViewHolder {
        public TextView name, reg, email;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = convertView;

        if (convertView == null) {

            inflater = context.getLayoutInflater();
            rowView = inflater.inflate(R.layout.each_row, parent,
                    false);

            ViewHolder viewHolder = new ViewHolder();

            viewHolder.name = (TextView)rowView
                    .findViewById(R.id.nameTextView);

            viewHolder.reg = (TextView) rowView.findViewById(R.id.regTextView);

            viewHolder.email = (TextView) rowView
                    .findViewById(R.id.emailTextView);

            rowView.setTag(viewHolder);
        }
        ViewHolder holder = (ViewHolder) rowView.getTag();

        holder.name.setText(studentList.get(position).getName());

        holder.reg.setText(studentList.get(position).getRegNo());
        holder.email.setText(studentList.get(position).getEmail());

        return rowView;
    }

}
