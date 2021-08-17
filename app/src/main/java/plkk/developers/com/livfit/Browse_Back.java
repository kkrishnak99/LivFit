package plkk.developers.com.livfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Browse_Back extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse__back);
    }

    public void deadlift(View v){

        Intent intent = new Intent(this, Deadlift.class);
        startActivity(intent);
    }

    public void lat_pulldown(View v){

        Intent intent = new Intent(this, Lat_Pulldown.class);
        startActivity(intent);
    }

    public void tbar_row(View v){

        Intent intent = new Intent(this, Tbar_Row.class);
        startActivity(intent);
    }

    public void seatedcable_row(View v){

        Intent intent = new Intent(this, Seated_Cable.class);
        startActivity(intent);
    }

    public void widegrip_pullup(View v){

        Intent intent = new Intent(this, Widegrip_Pullup.class);
        startActivity(intent);
    }

    public void singlearm_row(View v){

        Intent intent = new Intent(this, Singlearm_Row.class);
        startActivity(intent);
    }

    public void bentover_row(View v){

        Intent intent = new Intent(this, Bentover_Row.class);
        startActivity(intent);
    }
}
