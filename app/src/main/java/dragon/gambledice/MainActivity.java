package dragon.gambledice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random random = new Random();
    private int userScore = 0;
    private int userTurnScore = 0;
    private int compScore = 0;
    private int compTurnScore = 0;
    private int userTurn = 1;
    ImageView imageView;
    TextView userView;
    TextView turnView;
    TextView compView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.DiceFace);
        userView = (TextView) findViewById(R.id.UserScore);
        turnView = (TextView) findViewById(R.id.turnScore);
        compView = (TextView) findViewById(R.id.CompScore);
    }

    public void roll(View view) {
        int i = random.nextInt(6)+1;
        if(userTurn == 1)
        {
            switch (i)
            {
                case 1: imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice1));
                    userTurnScore = 0;
                    userTurn = 0;
                    turnView.setText(String.valueOf(userTurnScore));
                    break;
                case 2: imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice2));
                    userTurnScore += 2;
                    turnView.setText(String.valueOf(userTurnScore));
                    break;
                case 3: imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice3));
                    userTurnScore += 3;
                    turnView.setText(String.valueOf(userTurnScore));
                    break;
                case 4: imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice4));
                    userTurnScore += 4;
                    turnView.setText(String.valueOf(userTurnScore));
                    break;
                case 5: imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice5));
                    userTurnScore += 5;
                    turnView.setText(String.valueOf(userTurnScore));
                    break;
                case 6: imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice6));
                    userTurnScore += 6;
                    turnView.setText(String.valueOf(userTurnScore));
                    break;
            }
        }
        else
        {
            switch (i)
            {
                case 1: imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice1));
                    compTurnScore = 0;
                    userTurn = 1;
                    turnView.setText(String.valueOf(compTurnScore));
                    break;
                case 2: imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice2));
                    compTurnScore += 2;
                    turnView.setText(String.valueOf(compTurnScore));
                    break;
                case 3: imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice3));
                    compTurnScore += 3;
                    turnView.setText(String.valueOf(compTurnScore));
                    break;
                case 4: imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice4));
                    compTurnScore += 4;
                    turnView.setText(String.valueOf(compTurnScore));
                    break;
                case 5: imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice5));
                    compTurnScore += 5;
                    turnView.setText(String.valueOf(compTurnScore));
                    break;
                case 6: imageView.setImageDrawable(getResources().getDrawable(R.drawable.dice6));
                    compTurnScore += 6;
                    turnView.setText(String.valueOf(compTurnScore));
                    break;
            }
        }
    }
    public void hold(View view) {
        if(userTurn == 1)
        {
            addUserScore();
            userTurn = 0;
        }
        else
        {
            addCompScore();
            userTurn = 1;
        }
    }

    public void addCompScore()
    {
        compScore += compTurnScore;
        compView.setText(String.valueOf(compScore));
        compTurnScore = 0;
    }
    public void reset(View view) {
        userTurnScore = 0;
        userScore = 0;
        compTurnScore = 0;
        compScore = 0;
    }
    protected void addUserScore()
    {
        userScore += userTurnScore;
        userView.setText(String.valueOf(userScore));
        userTurnScore = 0;
    }
}
