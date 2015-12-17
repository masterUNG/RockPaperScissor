package appewtc.masterung.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayGameActivity extends AppCompatActivity {

    //Explicit
    private TextView scoreTextView;
    private ImageView userImageView, androidImageView;
    private int userChooseAnInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);

        bindWidget();

    }   // onCreate

    public void clickRock(View view) {

        userChooseAnInt = R.drawable.rock;
        changeUserImage();

    }

    private void changeUserImage() {
        userImageView.setImageResource(userChooseAnInt);
    }

    public void clickPaper(View view) {
        userChooseAnInt = R.drawable.paper;
        changeUserImage();
    }

    public void clickScissor(View view) {
        userChooseAnInt = R.drawable.scissors;
        changeUserImage();
    }

    private void bindWidget() {
        scoreTextView = (TextView) findViewById(R.id.textView2);
        userImageView = (ImageView) findViewById(R.id.imageView5);
        androidImageView = (ImageView) findViewById(R.id.imageView6);
    }

}   // Main Class
