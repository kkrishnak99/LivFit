package plkk.developers.com.livfit;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 1200;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedPreferences = getSharedPreferences("loginflag", Context.MODE_PRIVATE);
                int id = sharedPreferences.getInt("id", -45);
                if(id == -45){
                    Intent i = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(i);
                    finish();
                }
                else{
                    Intent i = new Intent(SplashScreen.this, User.class);
                    startActivity(i);
                    finish();
                }
            }
        }, SPLASH_TIME_OUT);
    }
}
