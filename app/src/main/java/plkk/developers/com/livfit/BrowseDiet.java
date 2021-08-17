package plkk.developers.com.livfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BrowseDiet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_diet);
    }

    public void carbs(View v){

        Intent intent = new Intent(this, Carbohydrates.class);
        startActivity(intent);
    }

    public void protein(View v){

        Intent intent = new Intent(this, Protein.class);
        startActivity(intent);
    }

    public void fats(View v){

        Intent intent = new Intent(this, Fats.class);
        startActivity(intent);
    }

    public void supplements(View v){

        Intent intent = new Intent(this, Supplements.class);
        startActivity(intent);
    }
}
