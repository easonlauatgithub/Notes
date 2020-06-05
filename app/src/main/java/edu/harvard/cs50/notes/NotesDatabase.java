package edu.harvard.cs50.notes;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Note.class}, version = 1)
public abstract class NotesDatabase extends RoomDatabase { //collect all data access object
    public abstract NoteDao noteDao(); //get access to instance of dao
}
