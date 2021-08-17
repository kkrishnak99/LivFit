package plkk.developers.com.livfit;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static Button login_button;
    private static Button sign_up_button;
    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListener();
        tv1 = (TextView)findViewById(R.id.LivFit);
        tv2 = (TextView)findViewById(R.id.TagLine);
        Typeface f1 = Typeface.createFromAsset(getAssets(),"fonts/ExpletusSans-Medium.ttf");
        Typeface f2 = Typeface.createFromAsset(getAssets(),"fonts/simplificia.ttf");
        tv1.setTypeface(f1);
        tv2.setTypeface(f2);
    }
    public void OnClickButtonListener() {
        login_button = (Button)findViewById(R.id.button2);
        sign_up_button = (Button)findViewById(R.id.button);
        login_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1 = new Intent("plkk.developers.com.livfit.LoginActivity");
                        startActivity(intent1);
                    }
                }
        );
        sign_up_button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent2 = new Intent("plkk.developers.com.livfit.Sign_up");
                        startActivity(intent2);
                    }
                 }
        );
    }
    public void skipClick(View v)
    {
        Intent intent3 = new Intent(this, Browse.class);
        startActivity(intent3);
    }

}
