package plkk.developers.com.livfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Browse_Biceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse__biceps);
    }

    public void dumbbell_curl(View v){

        Intent intent = new Intent(this,Bicep_Curl.class);
        startActivity(intent);
    }

    public void incline_innerbicep(View v){

        Intent intent = new Intent(this,Incline_Innerbicep.class);
        startActivity(intent);
    }

    public void barbell_curl(View v){

        Intent intent = new Intent(this,Barbell_Curl.class);
        startActivity(intent);
    }

    public void hammer_curl(View v){

        Intent intent = new Intent(this,Hammer_Curl.class);
        startActivity(intent);
    }

    public void concentration(View v){

        Intent intent = new Intent(this,Concentration.class);
        startActivity(intent);
    }
}
