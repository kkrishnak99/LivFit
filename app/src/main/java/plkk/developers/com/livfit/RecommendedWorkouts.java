package plkk.developers.com.livfit;

import android.content.Intent;
import android.graphics.Color;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import static plkk.developers.com.livfit.R.drawable.ripple_effect;

public class RecommendedWorkouts extends AppCompatActivity {

    int i;
    Intent intent[] = new Intent[32];
    final String ActivityIdWomen[] ={ "Deadlift", "Pushups", "Dumbbell_Bench", "Lat_Pulldown", "Overhead_Press", "Plank", "Treadmill",
            "Stairclimb_Bicep", "Treadmill", "Elliptical_Trainer",
            "Medicine_Squat","Lunge_Backrow", "Stairclimb_Bicep", "Prone_Plank", "Treadmill",
            "Stationary_Bike", "Jumping_Rope", "Elliptical_Trainer", "Dumbbell_Bench", "Prone_Plank", "Diagonal_Ball"

    };
    final String ActivityTextWomen[]={
            "Deadlift", "Pushups", "Dumbbell_Bench", "Lat_Pulldown", "Overhead_Press", "Plank", "Treadmill",
            "Stairclimb_Bicep", "Treadmill", "Elliptical_Trainer",
            "Medicine_Squat","Lunge_Backrow", "Stairclimb_Bicep", "Prone_Plank", "Treadmill",
            "Stationary_Bike", "Jumping_Rope", "Elliptical_Trainer", "Dumbbell_Bench", "Prone_Plank", "Diagonal_Ball"

    };
    final String ActivityIdMen[] = { "Deadlift", "Pushups", "Barbell_Bench", "Military_Press", "Barbell_Curl", "Close_Bench", "Seated_Cable", "Chinup", "Overhead_Press",
            "Power_Clean", "Jumping_Rope", "Hiit", "Barbell_Bench", "Deadlift", "Lat_Pulldown", "Barbell_Curl", "Skull_Crusher", "Diamond_Dips", "Squats",
            "Hill_Running", "Jumping_Rope", "Stationary_Bike", "Hiit", "Chinup", "Torso_Rotation", "Prone_Plank", "Medicine_Squat", "Front_Squat"
    };
    final String ActivityTextMen[] = { "Deadlift", "Pushups", "Barbell_Bench", "Military_Press", "Barbell_Curl", "Close_Bench", "Seated_Cable", "Chinup", "Overhead_Press",
            "Power_Clean", "Jumping_Rope", "Hiit", "Barbell_Bench", "Deadlift", "Lat_Pulldown", "Barbell_Curl", "Skull_Crusher", "Diamond_Dips", "Squats",
            "Hill_Running", "Jumping_Rope", "Stationary_Bike", "Hiit", "Chinup", "Torso_Rotation", "Prone_Plank", "Medicine_Squat", "Front_Squat"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommended_workouts);
        Intent intent = getIntent();
        float bmi = intent.getFloatExtra("bmi",0);
        int gender = intent.getIntExtra("gender", 0);
        showRecommendedWorkout(bmi,gender);
    }

    public void showRecommendedWorkout(float BMI, int GENDER){

        ScrollView ss = (ScrollView)findViewById(R.id.ss);
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        if(GENDER==1){
            if(BMI<18.5) {
                for (i = 0; i <= 8; i++) {
                    final Button btn = new Button(this);
                    btn.setTag(i);
                    LinearLayout.LayoutParams P = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    P.weight = 1;
                    btn.setLayoutParams(P);
                    btn.setText(ActivityTextMen[i]);
                    btn.setTextColor(Color.BLACK);
                    btn.setPadding(4,4,4,4);
                    btn.setBackgroundDrawable(getResources().getDrawable(ripple_effect));
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Class clas = null;
                            try {
                                clas = Class.forName("plkk.developers.com.livfit." + ActivityIdMen[Integer.parseInt("" + btn.getTag())]);
                            } catch (ClassNotFoundException c) {
                                c.printStackTrace();
                            }
                            if (clas != null) {
                                intent[i] = new Intent(view.getContext(), clas);
                                startActivity(intent[i]);
                            }
                        }
                    });
                    ll.addView(btn);
                }
            }
            else if(BMI>=18.5 && BMI<=24.9){
                for(i=9;i<=18;i++) {
                    final Button btn = new Button(this);
                    btn.setTag(i);
                    LinearLayout.LayoutParams P = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    P.weight = 1;
                    btn.setLayoutParams(P);
                    btn.setText(ActivityTextMen[i]);
                    btn.setTextColor(Color.BLACK);
                    btn.setPadding(4,4,4,4);
                    btn.setBackgroundDrawable(getResources().getDrawable(ripple_effect));
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Class clas = null;
                            try{
                                clas = Class.forName("plkk.developers.com.livfit."+ActivityIdMen[Integer.parseInt(""+btn.getTag())]);
                            }catch (ClassNotFoundException c){
                                c.printStackTrace();
                            }
                            if (clas!=null) {
                                intent[i] = new Intent(view.getContext(), clas);
                                startActivity(intent[i]);
                            }
                        }
                    });
                    ll.addView(btn);
                }
            }
            else{
                for(i=19;i<=27;i++) {
                    final Button btn = new Button(this);
                    btn.setTag(i);
                    LinearLayout.LayoutParams P = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    P.weight = 1;
                    btn.setLayoutParams(P);
                    btn.setText(ActivityTextMen[i]);
                    btn.setTextColor(Color.BLACK);
                    btn.setPadding(4,4,4,4);
                    btn.setBackgroundDrawable(getResources().getDrawable(ripple_effect));
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Class clas = null;
                            try{
                                clas = Class.forName("plkk.developers.com.livfit."+ActivityIdMen[Integer.parseInt(""+btn.getTag())]);
                            }catch (ClassNotFoundException c){
                                c.printStackTrace();
                            }
                            if (clas!=null) {
                                intent[i] = new Intent(view.getContext(), clas);
                                startActivity(intent[i]);
                            }
                        }
                    });
                    ll.addView(btn);
                }
            }
            ss.addView(ll);
        }
        else{
            if(BMI<18.5){
                for(i=0;i<=7;i++) {
                    final Button btn = new Button(this);
                    btn.setTag(i);
                    LinearLayout.LayoutParams P = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    P.weight = 1;
                    btn.setLayoutParams(P);
                    btn.setText(ActivityTextWomen[i]);
                    btn.setTextColor(Color.BLACK);
                    btn.setPadding(4,4,4,4);
                    btn.setBackgroundDrawable(getResources().getDrawable(ripple_effect));

                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Class clas = null;
                            try{
                                clas = Class.forName("plkk.developers.com.livfit."+ActivityIdWomen[Integer.parseInt(""+btn.getTag())]);
                            }catch (ClassNotFoundException c){
                                c.printStackTrace();
                            }
                            if (clas!=null) {
                                intent[i] = new Intent(view.getContext(), clas);
                                startActivity(intent[i]);
                            }
                        }
                    });
                    ll.addView(btn);
                }
            }
            else if(BMI>=18.5 && BMI<=24.9){
                for(i=8;i<=13;i++) {
                    final Button btn = new Button(this);
                    btn.setTag(i);
                    LinearLayout.LayoutParams P = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    P.weight = 1;
                    btn.setLayoutParams(P);
                    btn.setText(ActivityTextWomen[i]);
                    btn.setTextColor(Color.BLACK);
                    btn.setPadding(4,4,4,4);
                    btn.setBackgroundDrawable(getResources().getDrawable(ripple_effect));
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Class clas = null;
                            try{
                                clas = Class.forName("plkk.developers.com.livfit."+ActivityIdWomen[Integer.parseInt(""+btn.getTag())]);                            }catch (ClassNotFoundException c){
                                c.printStackTrace();
                            }
                            if (clas!=null) {
                                intent[i] = new Intent(view.getContext(), clas);
                                startActivity(intent[i]);
                            }
                        }
                    });
                    ll.addView(btn);
                }
            }
            else{
                for(i=14;i<=20;i++) {
                    final Button btn = new Button(this);
                    btn.setTag(i);
                    LinearLayout.LayoutParams P = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    P.weight = 1;
                    btn.setLayoutParams(P);
                    btn.setText(ActivityTextWomen[i]);
                    btn.setTextColor(Color.BLACK);
                    btn.setPadding(4,4,4,4);
                    btn.setBackgroundDrawable(getResources().getDrawable(ripple_effect));
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Class clas = null;
                            try{
                                clas = Class.forName("plkk.developers.com.livfit."+ActivityIdWomen[Integer.parseInt(""+btn.getTag())]);
                            }catch (ClassNotFoundException c){
                                c.printStackTrace();
                            }
                            if (clas!=null) {
                                intent[i] = new Intent(view.getContext(), clas);
                                startActivity(intent[i]);
                            }
                        }
                    });
                    ll.addView(btn);
                }
            }
            ss.addView(ll);
        }
    }

}
