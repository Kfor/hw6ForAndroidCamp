package com.example.mytodolist;

import android.graphics.Color;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class NoteViewHolder extends RecyclerView.ViewHolder {

    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("EEE,d/MMM/YYYY HH:mm:ss", Locale.ENGLISH);
    private final NoteOperator operator;

    private CheckBox checkBox;
    private TextView contentText;
    private TextView dateText;
    private View deleteBtn;


    public NoteViewHolder(@NonNull View itemView,NoteOperator operator) {
        super(itemView);
        this.operator = operator;

        checkBox = itemView.findViewById(R.id.checkbox);
        contentText = itemView.findViewById(R.id.text_content);
        dateText = itemView.findViewById(R.id.text_date);
        deleteBtn = itemView.findViewById(R.id.btn_delete);
    }
    public void bind(final Note note){
        contentText.setText(note.getContent());
        dateText.setText(SIMPLE_DATE_FORMAT.format(note.getDate()));
        checkBox.setOnCheckedChangeListener(null);
        checkBox.setChecked(note.getState()==State.DONE);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                note.setState(b?State.DONE:State.TODO);
                operator.updateNote(note);
            }
        });
        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator.deleteNote(note);
            }
        });

        if(note.getState()==State.DONE){
            contentText.setTextColor(Color.GRAY);
            contentText.setPaintFlags(contentText.getPaintFlags());
        }else {
            contentText.setTextColor(Color.BLACK);
            contentText.setPaintFlags(contentText.getPaintFlags());
        }
        itemView.setBackgroundColor(note.getPriority().color);
    }
}
