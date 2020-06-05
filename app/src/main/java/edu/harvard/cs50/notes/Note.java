package edu.harvard.cs50.notes;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "notes")
public class Note { //Model, define table
    @PrimaryKey
    public int id;

    @ColumnInfo(name = "contents")
    public String contents;
}
