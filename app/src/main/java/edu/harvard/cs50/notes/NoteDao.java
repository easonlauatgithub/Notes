package edu.harvard.cs50.notes;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface NoteDao { //define method to access table
    @Query("INSERT INTO notes (contents) VALUES ('New note')")
    void create();

    @Query("SELECT * FROM notes")
    List<Note> getAllNotes();

    @Query("UPDATE notes SET contents=:contents WHERE id = :id")
    void save(String contents, int id);
}
