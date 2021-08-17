package plkk.developers.com.livfit;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class User extends AppCompatActivity {

    DatabaseHelper myDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        SharedPreferences sharedPreferences = getSharedPreferences("loginflag", Context.MODE_PRIVATE);
        int _id = sharedPreferences.getInt("id", -45);
        int id;
        if(_id == -45){
            Intent intent = getIntent();
            id = intent.getIntExtra("id", 0);
        }
        else
            id=_id;

        myDB = new DatabaseHelper(this,null,null,1);

        float height = myDB.get_height(Integer.toString(id));
        float weight = myDB.get_weight(Integer.toString(id));
        int gender = myDB.get_gender(Integer.toString(id));
        final float bmi= generateBMI(weight,height);

        TextView textView = (TextView)findViewById(R.id.Welcome);
        textView.setText("Welcome " + myDB.get_name(Integer.toString(id)));
        textView.setTextSize(20);

        onClickWorkout(bmi, gender);
        onClickDiet(bmi);
        onClickMyProfile(id);
    }

    public void onClickBrowse(View view){
        Intent intent = new Intent(this, Browse.class);
        startActivity(intent);
    }

    public float generateBMI(float wgt,float hgt){
        hgt=hgt/100;
        float bmi = wgt/(hgt*hgt);
        return bmi;
    }
    public void onClickWorkout(final float BMI, final int GENDER){
        Button WORKOUT = (Button)findViewById(R.id.button_RecommendedWorkouts);
        WORKOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent("plkk.developers.com.livfit.RecommendedWorkouts");
                intent.putExtra("bmi", BMI);
                intent.putExtra("gender", GENDER);
                startActivity(intent);
            }
        });
    }
    public void onClickDiet(final float BMI){
        Button DIETS = (Button)findViewById(R.id.button_RecommendedDiets);
        DIETS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(BMI<18.5) {
                    Intent intent = new Intent("plkk.developers.com.livfit.Mass_Up");
                    startActivity(intent);
                }
                else if (BMI>=18.5 && BMI<=24.9){
                    Intent intent = new Intent("plkk.developers.com.livfit.Muscular");
                    startActivity(intent);
                }
                else{
                    Intent intent = new Intent("plkk.developers.com.livfit.Shredded");
                    startActivity(intent);
                }
            }
        });
    }
    public void onClickMyProfile(final int id){
        Button MyProfile = (Button)findViewById(R.id.MyProfile);
        MyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MyProfile.class);
                intent.putExtra("id",id);
                startActivity(intent);
            }
        });
    }

    public void onClickLogout(View view){
        SharedPreferences sharedPreferences = getSharedPreferences("loginflag", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        if(sharedPreferences.getInt("id",-45)!=-45){
            editor.clear();
            editor.apply();
            Intent intent = new Intent(view.getContext(), MainActivity.class);
            startActivity(intent);
        }
        finish();
    }

}




