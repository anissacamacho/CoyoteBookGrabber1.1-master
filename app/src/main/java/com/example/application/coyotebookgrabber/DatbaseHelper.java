package com.example.application.coyotebookgrabber;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Dell on 10/13/2017.
 * Database helper class that extends SQLite open helper
 * SQLiteOpenHelper is the main class for handling SQLite
 */

public class DatbaseHelper extends SQLiteOpenHelper {

    //assign database name to variable DATABASE_NAME
    public static final String DATABASE_NAME = "student.db";

    //table users
    public static final String TABLE_USERS = "users";

    //columns of the users table
    public static final String COLUMN_USERS_ID = "_id";
    public static final String COLUMN_USERS_FNAME_LNAME = "fname_lname";
    public static final String COLUMN_USERS_COYOTE_EMAIL = "coyote_email";
    public static final String COLUMN_USERS_PASSWORD = "password";
    public static final String COLUMN_USERS_CONTACT_NUMBER = "contact_number";
    public static final String COLUMN_USERS_ADDRESS = "address";

    //table posts
    public static final String TABLE_POSTS = "posts";

    //columns of the posts table
    public static final String COLUMN_POSTS_POSTID = "_postId";
    public static final String COLUMN_POSTS_USERID = COLUMN_USERS_ID;
    public static final String COLUMN_POSTS_AUTHOR = COLUMN_USERS_FNAME_LNAME;
    public static final String COLUMN_POSTS_BOOK_TITLE = "book_title";
    public static final String COLUMN_POSTS_ISBN = "ISBN";
    public static final String COLUMN_POSTS_SUBJECT = "subject";
    public static final String COLUMN_POSTS_COURSE_NUMBER = "course_number";
    public static final String COLUMN_POSTS_COURSE_NAME = "course_name";
    public static final String COLUMN_POSTS_CONDITION = "condition";
    public static final String COLUMN_POSTS_DESCRIPTION = "description";
    public static final String COLUMN_POSTS_MEETING_OPTION = "meeting_option";

    /*This is the constructor. It includes a function that creates student.db database*/
    public DatbaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }
    /*method*/
    @Override
    public void onCreate(SQLiteDatabase db) {

    }
    /*method*/
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
