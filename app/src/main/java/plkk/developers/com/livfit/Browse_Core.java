package plkk.developers.com.livfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Browse_Core extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse__core);
    }

    public void plank(View v) {

        Intent intent = new Intent(this, Plank.class);
        startActivity(intent);
    }

    public void diagonal_ball(View v) {

        Intent intent = new Intent(this, Diagonal_Ball.class);
        startActivity(intent);
    }

    public void torso_rotation(View v) {

        Intent intent = new Intent(this, Torso_Rotation.class);
        startActivity(intent);
    }

    public void prone_plank(View v) {

        Intent intent = new Intent(this, Prone_Plank.class);
        startActivity(intent);
    }
}

