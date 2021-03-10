package com.example.material.notes.linsteners;

import com.example.material.notes.entities.Note;

public interface NotesListener {

    void onNoteClicked(Note note, int position);
}
