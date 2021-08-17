package plkk.developers.com.livfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Browse_Shoulder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse__shoulder);
    }

    public void chinup(View v){

        Intent intent = new Intent(this, Chinup.class);
        startActivity(intent);
    }

    public void military_press(View v){

        Intent intent = new Intent(this, Military_Press.class);
        startActivity(intent);
    }

    public void overhead_press(View v){

        Intent intent = new Intent(this, Overhead_Press.class);
        startActivity(intent);
    }

    public void arnold_press(View v){

        Intent intent = new Intent(this, Arnold_Press.class);
        startActivity(intent);
    }

    public void front_press(View v){

        Intent intent = new Intent(this, Front_Press.class);
        startActivity(intent);
    }

    public void cable_rear_delt(View v){

        Intent intent = new Intent(this, Cable_Rear_Delt.class);
        startActivity(intent);
    }

    public void upright_row(View v){

        Intent intent = new Intent(this, Upright_Row.class);
        startActivity(intent);
    }

    public void shrugs(View v){

        Intent intent = new Intent(this, Shrugs.class);
        startActivity(intent);
    }
}
