package david.viernes.com.recipeat;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t= (TextView) findViewById(R.id.hometext);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/Raleway-Black.ttf");
        t.setTypeface(myCustomFont);

        t= (TextView) findViewById(R.id.homeictext);
        Typeface homeictext=Typeface.createFromAsset(getAssets(),"fonts/Raleway-Black.ttf");
        t.setTypeface(homeictext);

        t= (TextView) findViewById(R.id.labictext);
        Typeface labictext=Typeface.createFromAsset(getAssets(),"fonts/Raleway-Black.ttf");
        t.setTypeface(labictext);

        t= (TextView) findViewById(R.id.recipeictext);
        Typeface recipeictext=Typeface.createFromAsset(getAssets(),"fonts/Raleway-Black.ttf");
        t.setTypeface(recipeictext);

        t= (TextView) findViewById(R.id.stockictext);
        Typeface stockictext=Typeface.createFromAsset(getAssets(),"fonts/Raleway-Black.ttf");
        t.setTypeface(stockictext);

        t= (TextView) findViewById(R.id.morningtext);
        Typeface morningtext=Typeface.createFromAsset(getAssets(),"fonts/Raleway-Black.ttf");
        t.setTypeface(morningtext);

        t= (TextView) findViewById(R.id.lunchtext);
        Typeface lunchtext=Typeface.createFromAsset(getAssets(),"fonts/Raleway-Black.ttf");
        t.setTypeface(lunchtext);

        t= (TextView) findViewById(R.id.dinnertext);
        Typeface dinnertext=Typeface.createFromAsset(getAssets(),"fonts/Raleway-Black.ttf");
        t.setTypeface(dinnertext);

    }
}
