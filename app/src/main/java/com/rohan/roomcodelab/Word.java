package com.rohan.roomcodelab;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;

@Entity(tableName = "word table")
public class Word {
    @ColumnInfo(name = "word")
    private String Word;
}
