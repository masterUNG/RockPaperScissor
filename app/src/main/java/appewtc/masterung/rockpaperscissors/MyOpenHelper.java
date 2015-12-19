package appewtc.masterung.rockpaperscissors;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by masterUNG on 12/18/15 AD.
 */
public class MyOpenHelper extends SQLiteOpenHelper{

    //Explicit
    public static final String DATABASE_NAME = "Game.db";
    private static final int DATABASE_VERSION = 1;
    private static final String CREATE_SCORE_TABLE = "create table scoreTABLE (" +
            "_id integer primary key, " +
            "Date text," +
            " Score text);";

    public MyOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    } // Constructor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_SCORE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}   // Main Class
