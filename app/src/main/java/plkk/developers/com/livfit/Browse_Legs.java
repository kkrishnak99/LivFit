package plkk.developers.com.livfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Browse_Legs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse__legs);
    }

    public void deadlift(View v){

        Intent intent = new Intent(this, Deadlift.class);
        startActivity(intent);
    }

    public void dumbbell_lunges(View v){

        Intent intent = new Intent(this, Lunges.class);
        startActivity(intent);
    }

    public void barbell_squats(View v){

        Intent intent = new Intent(this, Squats.class);
        startActivity(intent);
    }

    public void leg_curl(View v){

        Intent intent = new Intent(this, Leg_Curl.class);
        startActivity(intent);
    }

    public void leg_extension(View v){

        Intent intent = new Intent(this, Leg_Extension.class);
        startActivity(intent);
    }

    public void calf_raise(View v){

        Intent intent = new Intent(this, Calf_Raise.class);
        startActivity(intent);
    }
}
