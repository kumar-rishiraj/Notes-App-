package com.example.todolist;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName = "my_notes")

public class Note {
    private String title;

    public String getTitle() {
        return title;
    }

    private String disp;

    public String getDisp() {return disp;}



    @PrimaryKey(autoGenerate = true)
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Note(String title, String disp) {
        this.title = title;
        this.disp = disp;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDisp(String disp) {
        this.disp = disp;
    }




}
