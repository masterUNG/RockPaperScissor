package appewtc.masterung.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class PlayGameActivity extends AppCompatActivity {

    //Explicit
    private TextView scoreTextView;
    private ImageView userImageView, androidImageView;
    private int userChooseAnInt, androidAnInt, userAnInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);

        bindWidget();

    }   // onCreate

    public void clickRock(View view) {

        userChooseAnInt = R.drawable.rock;
        userAnInt = 1;
        changeUserImage();
        changeAndroidImage();

    }

    private void changeAndroidImage() {

        Random objRandom = new Random();
        androidAnInt = objRandom.nextInt(3) + 1;
        Log.d("game", "myRandom ==> " + Integer.toString(androidAnInt));
        androidImageView.setImageResource(findImage(androidAnInt));

    }

    private int findImage(int androidAnInt) {

        int intResult = R.drawable.rock;

        switch (androidAnInt) {
            case 1:
                intResult = R.drawable.rock;
                break;
            case 2:
                intResult = R.drawable.paper;
                break;
            case 3:
                intResult = R.drawable.scissors;
                break;
        }

        return intResult;
    }

    private void changeUserImage() {
        userImageView.setImageResource(userChooseAnInt);
    }

    public void clickPaper(View view) {
        userChooseAnInt = R.drawable.paper;
        userAnInt = 2;
        changeUserImage();
        changeAndroidImage();
    }

    public void clickScissor(View view) {
        userChooseAnInt = R.drawable.scissors;
        userAnInt = 3;
        changeUserImage();
        changeAndroidImage();
    }

    private void bindWidget() {
        scoreTextView = (TextView) findViewById(R.id.textView2);
        userImageView = (ImageView) findViewById(R.id.imageView5);
        androidImageView = (ImageView) findViewById(R.id.imageView6);
    }

}   // Main Class
