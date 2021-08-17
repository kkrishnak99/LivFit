package plkk.developers.com.livfit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Browse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);
    }

    public void browseWorkout( View v){

        Intent intent = new Intent(this,BrowseWorkout.class);
        startActivity(intent);
    }

    public void browseDiet (View V) {
        Intent intent = new Intent(this,BrowseDiet.class);
        startActivity(intent);
    }
}
