package com.example.crowdhazard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        this.setTitle("About Us");

        TextView linkTextView = findViewById(R.id.githublink);
        linkTextView.setText("@Copyright CrowdHazard");
        linkTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the link click event
                // For example, open a web browser to the specified URL
                String url = "https://github.com/kaaz01/ICT602GroupProject-CrowdHazard.git";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}