package plkk.developers.com.livfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Browse_Chest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse__chest);
    }

    public void bench_press(View v){

        Intent intent = new Intent(this, Barbell_Bench.class);
        startActivity(intent);
    }

    public void dumbbell_fly(View v){

        Intent intent = new Intent(this, Dumbbell_Fly.class);
        startActivity(intent);
    }

    public void incline_bench(View v){

        Intent intent = new Intent(this, Incline_Bench.class);
        startActivity(intent);

    }

    public void decline_press(View v){

        Intent intent = new Intent(this, Decline_Chest.class);
        startActivity(intent);
    }

    public void pushups(View v){

        Intent intent = new Intent(this, Pushups.class);
        startActivity(intent);
    }

    public void incline_fly(View v){

        Intent intent = new Intent(this, Incline_Fly.class);
        startActivity(intent);
    }

    public void dumbbell_bench(View v){

        Intent intent = new Intent(this, Dumbbell_Bench.class);
        startActivity(intent);
    }
}
