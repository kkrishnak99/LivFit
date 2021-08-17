package plkk.developers.com.livfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BrowseWorkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_workout);
    }

    public void browseChest(View v){

        Intent intent = new Intent(this, Browse_Chest.class);
        startActivity(intent);

    }

    public void browseShoulder(View v){

        Intent intent = new Intent(this, Browse_Shoulder.class);
        startActivity(intent);
    }

    public void browseBack(View v){

        Intent intent = new Intent(this,Browse_Back.class);
        startActivity(intent);
    }

    public void browseBiceps(View v){

        Intent intent = new Intent(this,Browse_Biceps.class);
        startActivity(intent);
    }

    public void browseTriceps(View v){

        Intent intent = new Intent(this, Browse_Triceps.class);
        startActivity(intent);
    }

    public void browseLegs(View v){

        Intent intent = new Intent(this, Browse_Legs.class);
        startActivity(intent);

    }

    public void browseCardio(View v){

        Intent intent = new Intent(this, Browse_Cardio.class);
        startActivity(intent);
    }

    public void browseFunctional(View v){

        Intent intent = new Intent(this, Browse_Functional.class);
        startActivity(intent);
    }

    public void browseCore(View v){

        Intent intent = new Intent(this, Browse_Core.class);
        startActivity(intent);
    }
}
