package plkk.developers.com.livfit;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText user_name,pass_word;
    private Button Login_btn;
    private int attempts = 3;
    DatabaseHelper myDB;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textView = (TextView)findViewById(R.id.LivFit_login);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/ExpletusSans-Medium.ttf");
        textView.setTypeface(typeface);
        myDB = new DatabaseHelper(this,null,null,1);
        loginAuthenticator();
    }

    public void loginAuthenticator(){
        user_name=(EditText)findViewById(R.id.editText_username);
        pass_word=(EditText)findViewById(R.id.editText_password);
        Login_btn=(Button) findViewById(R.id.login_button);
        Login_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(myDB.checkUser(user_name.getText().toString().trim(),pass_word.getText().toString().trim())){
                            Toast.makeText(LoginActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
                            int id = myDB.getID(user_name.getText().toString(), pass_word.getText().toString());
                            SharedPreferences sharedPreferences = getSharedPreferences("loginflag", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putInt("id",id);
                            editor.apply();
                            Intent intent = new Intent("plkk.developers.com.livfit.User");
                            intent.putExtra("id",id);
                            startActivity(intent);
                            finish();
                        }else {
                            Toast.makeText(LoginActivity.this,"Incorrect username or password.",Toast.LENGTH_SHORT).show();
                            attempts--;
                            if(attempts==0){
                                Toast.makeText(LoginActivity.this,"\nAttempts limit reached.",Toast.LENGTH_SHORT).show();
                                Login_btn.setEnabled(false);
                            }
                        }
                    }
                }
        );

    }
}
