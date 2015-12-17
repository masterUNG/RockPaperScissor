package appewtc.masterung.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date currentDate = new Date();
        String strTime = myFormat.format(currentDate);

        TextView timeTextView = (TextView) findViewById(R.id.textView3);
        timeTextView.setText(strTime);

    }   // onCreate

    public void clickStart(View view) {

        startActivity(new Intent(MainActivity.this, PlayGameActivity.class));

    }

}   // Main Class
