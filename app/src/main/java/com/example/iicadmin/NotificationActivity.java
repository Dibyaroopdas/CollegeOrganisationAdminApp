package com.example.iicadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class NotificationActivity extends AppCompatActivity {

    /*EditText title;
    EditText description;
    TextView post;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        title = findViewById(R.id.notif_title);
        description = findViewById(R.id.notif_desc);
        post = findViewById(R.id.notif_post);


        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uploadNotif();
            }
        });
    }

    private void uploadNotif() {

        final ProgressDialog pd = new ProgressDialog(this);
        pd.setMessage("Uploading");
        pd.show();

        DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Notifications");
        String notifId = ref.push().getKey();

        String notifTitle = title.getText().toString().toLowerCase();
        String notifDesc = description.getText().toString();

        HashMap<String , Object> map = new HashMap<>();

        map.put("title" , notifTitle);
        map.put("desc" , notifDesc);

        map.clear();

        pd.dismiss();
        startActivity(new Intent(NotificationActivity.this , MainActivity.class));
        finish();

    }*/
}