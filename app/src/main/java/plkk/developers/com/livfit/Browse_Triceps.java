package plkk.developers.com.livfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Browse_Triceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse__triceps);
    }

    public void diamond_Dips(View v){

        Intent intent = new Intent(this,Diamond_Dips.class);
        startActivity(intent);
    }
    public void close_bench(View v){

        Intent intent = new Intent(this,Close_Bench.class);
        startActivity(intent);
    }
    public void skull_crusher(View v){

        Intent intent = new Intent(this,Skull_Crusher.class);
        startActivity(intent);
    }
    public void tricep_extension(View v){

        Intent intent = new Intent(this,Tricep_Extension.class);
        startActivity(intent);
    }
    public void rope_pulldown(View v){

        Intent intent = new Intent(this,Rope_Pulldown.class);
        startActivity(intent);
    }
}
