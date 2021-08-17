package plkk.developers.com.livfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Browse_Functional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse__functional);
    }

    public void hiit(View v){

        Intent intent = new Intent(this,Hiit.class);
        startActivity(intent);
    }

    public void medicine_squat(View v){

        Intent intent = new Intent(this,Medicine_Squat.class);
        startActivity(intent);
    }

    public void stairclimb_bicep(View v){

        Intent intent = new Intent(this,Stairclimb_Bicep.class);
        startActivity(intent);
    }

    public void lunge_backrow(View v){

        Intent intent = new Intent(this,Lunge_Backrow.class);
        startActivity(intent);
    }

    public void pushup_hip(View v){

        Intent intent = new Intent(this,Pushup_Hip.class);
        startActivity(intent);
    }

    public void power_clean(View v){

        Intent intent = new Intent(this,Power_Clean.class);
        startActivity(intent);
    }

    public void front_squat(View v){

        Intent intent = new Intent(this,Front_Squat.class);
        startActivity(intent);
    }
}
