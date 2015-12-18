package appewtc.masterung.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private String strTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date currentDate = new Date();
        strTime = myFormat.format(currentDate);

        TextView timeTextView = (TextView) findViewById(R.id.textView3);
        timeTextView.setText(strTime);

    }   // onCreate

    public void clickStart(View view) {

        Intent objIntent = new Intent(MainActivity.this, PlayGameActivity.class);
        objIntent.putExtra("Date", strTime);
        startActivity(objIntent);
        finish();

    }

}   // Main Class
