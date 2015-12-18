package appewtc.masterung.rockpaperscissors;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by masterUNG on 12/18/15 AD.
 */
public class ManageTABLE {

    //Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String TABLE_SCORE = "scoreTABLE";
    public static final String COLUME_id = "_id";
    public static final String COLUME_Date = "Date";
    public static final String COLUME_Score = "Score";

    public ManageTABLE(Context context) {
        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();
    }   // Constructor

    public long addValueToSQLite(String strData, String strScore) {

        ContentValues objContentValues = new ContentValues();
        objContentValues.put(COLUME_Date, strData);
        objContentValues.put(COLUME_Score, strScore);
        return writeSqLiteDatabase.insert(TABLE_SCORE, null, objContentValues);
    }

}   // Main Class
