package plkk.developers.com.livfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Sign_up extends AppCompatActivity {
    DatabaseHelper myDB;
    EditText fullname,username,height,weight,password,verify_password;
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button signupbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        myDB = new DatabaseHelper(this, null, null, 1);
        fullname=(EditText)findViewById(R.id.editText_fullname);
        username=(EditText)findViewById(R.id.editText_username);
        height=(EditText)findViewById(R.id.editText_height);
        weight=(EditText)findViewById(R.id.editTextWieght);
        password=(EditText)findViewById(R.id.editText_password);
        verify_password=(EditText)findViewById(R.id.editText_verifypassword);
        radioGroup =(RadioGroup)findViewById(R.id.radioGroup);

    }
    public int RadioClick(View view){
        int selectedId = radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton)findViewById(selectedId);
        int gender;
        if(radioButton.getText().toString().equals("Male")) {
            gender = 1;//1 for male
        }
        else {
            gender = 0;//0 for female
        }
        return gender;
    }
    public void DoSignup(View view) {
        if (nullChecker()) {
            if (password.getText().toString().equals(verify_password.getText().toString())) {

                if (myDB.checkUser(username.getText().toString()) == false) {
                    int gender = RadioClick(view);
                    Users user = new Users(fullname.getText().toString(),
                            username.getText().toString(),
                            password.getText().toString(),
                            Float.valueOf(height.getText().toString()),
                            Float.valueOf(weight.getText().toString()),
                            gender);
                    myDB.addData(user);
                    Toast.makeText(Sign_up.this, "Successfully signed up", Toast.LENGTH_LONG).show();
                   // Intent intent = new Intent(this, MainActivity.class);
                   // startActivity(intent);
                    finish();
                } else
                    Toast.makeText(Sign_up.this, "Username already occupied", Toast.LENGTH_LONG).show();
            } else
                Toast.makeText(Sign_up.this, "Passwords Do no match", Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(Sign_up.this, "Please fill all the fields.", Toast.LENGTH_SHORT).show();
    }

    public boolean nullChecker(){
        if(fullname.getText().toString().isEmpty())
            return false;
        if(username.getText().toString().isEmpty())
            return false;
        if(password.getText().toString().isEmpty())
            return false;
        if(verify_password.getText().toString().isEmpty())
            return false;
        if(height.getText().toString().isEmpty())
            return false;
        if(weight.getText().toString().isEmpty())
            return false;
        int selectedId = radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton)findViewById(selectedId);
        if(radioButton.getText().toString().isEmpty())
            return false;
        return true;
    }


    }

