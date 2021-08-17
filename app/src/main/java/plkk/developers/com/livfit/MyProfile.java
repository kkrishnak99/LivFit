package plkk.developers.com.livfit;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyProfile extends AppCompatActivity {

    DatabaseHelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        Intent intent = getIntent();
        myDb = new DatabaseHelper(this,null,null,1);
        int id = intent.getIntExtra("id",0);
        TextView t1,t2,t3;
        t1=(TextView)findViewById(R.id.myprofile_fullname);
        t2=(TextView)findViewById(R.id.myprofile_height);
        t3=(TextView)findViewById(R.id.myprofile_weight);
        t1.setText("Name : " + myDb.get_name(Integer.toString(id)));
        t2.setText("Height : " + myDb.get_height(Integer.toString(id)) + " cm");
        t3.setText("Weight : " + myDb.get_weight(Integer.toString(id)) + " kg");
        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/simplificia.ttf");
        t1.setTypeface(typeface);
        t2.setTypeface(typeface);
        t3.setTypeface(typeface);
        onEditClick(id);
    }

    public void onEditClick(final int id){
        Button btn = (Button)findViewById(R.id.myprofile_edit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), EditProfile.class);
                intent.putExtra("id",id);
                startActivity(intent);
            }
        });
    }
}
