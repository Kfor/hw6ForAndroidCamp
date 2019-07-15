package com.example.mytodolist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NoteListAdapter extends RecyclerView.Adapter<NoteViewHolder> {
    private final NoteOperator operator;
    private final List<Note> notes = new ArrayList<>();

    public NoteListAdapter(NoteOperator operator){
        this.operator = operator;
    }

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note,parent,false);
        return new NoteViewHolder(itemView,operator);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
        holder.bind(notes.get(position));
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }
    public void refresh(List<Note> newNotes){
        notes.clear();
        if(newNotes!=null){
            notes.addAll(newNotes);
        }
        notifyDataSetChanged();
    }

}
