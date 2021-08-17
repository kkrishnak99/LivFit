package plkk.developers.com.livfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Browse_Cardio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse__cardio);
    }

    public void treadmill(View v){

        Intent intent = new Intent(this, Treadmill.class);
        startActivity(intent);
    }

    public void stationary_bike(View v){

        Intent intent = new Intent(this, Stationary_Bike.class);
        startActivity(intent);
    }

    public void elliptical_trainer(View v){

        Intent intent = new Intent(this, Elliptical_Trainer.class);
        startActivity(intent);
    }

    public void stair_climber(View v){

        Intent intent = new Intent(this, Stair_Climber.class);
        startActivity(intent);
    }

    public void jumping_rope(View v){

        Intent intent = new Intent(this, Jumping_Rope.class);
        startActivity(intent);
    }

    public void hill_running(View v){

        Intent intent = new Intent(this, Hill_Running.class);
        startActivity(intent);
    }
}
