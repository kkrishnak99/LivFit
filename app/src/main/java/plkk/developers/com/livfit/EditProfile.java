package plkk.developers.com.livfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditProfile extends AppCompatActivity {

    DatabaseHelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        myDb = new DatabaseHelper(this,null,null,1);
        Intent intent = getIntent();
        int id = intent.getIntExtra("id",0);
        onClickEdit(id);
    }

    public void onClickEdit(final int id){
        Button save = (Button)findViewById(R.id.edit_save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText height,weight;
                height =(EditText)findViewById(R.id.edit_height);
                weight =(EditText)findViewById(R.id.edit_weight);
                myDb.UpdateValues(id,Float.valueOf(height.getText().toString()), Float.valueOf(weight.getText().toString()));
                Toast.makeText(EditProfile.this, "Successfully Updated", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}
