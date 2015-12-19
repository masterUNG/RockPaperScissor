package appewtc.masterung.rockpaperscissors;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class ScoreListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_list_view);

        //Create ListView
        createListView();

    }   // Main Method

    private void createListView() {

        SQLiteDatabase objSqLiteDatabase = openOrCreateDatabase(MyOpenHelper.DATABASE_NAME, MODE_PRIVATE, null);
        Cursor objCursor = objSqLiteDatabase.rawQuery("SELECT * FROM " + ManageTABLE.TABLE_SCORE, null);

        String[] strDate = null;
        String[] strScore = null;

        if (objCursor != null) {

            strDate = new String[objCursor.getCount()];
            strScore = new String[objCursor.getCount()];

            objCursor.moveToFirst();
            for (int i = 0; i < objCursor.getCount(); i++) {

                strDate[i] = objCursor.getString(objCursor.getColumnIndex(ManageTABLE.COLUME_Date));
                strScore[i] = objCursor.getString(objCursor.getColumnIndex(ManageTABLE.COLUME_Score));
                objCursor.moveToNext();

            }   // for
            objCursor.close();

        }   // if
        MyAdapter objMyAdapter = new MyAdapter(ScoreListView.this, strDate, strScore);
        ListView objListView = (ListView) findViewById(R.id.listView);
        objListView.setAdapter(objMyAdapter);


    }   // createListView

}   // Main Class
