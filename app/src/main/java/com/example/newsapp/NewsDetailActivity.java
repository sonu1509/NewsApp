package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class NewsDetailActivity extends AppCompatActivity {

    String title,desc,content,imageUrl,url;
    private TextView titleNewsDetails,subDecNewsDetails,contentNewsDetails;
    private ImageView imgNewsDetails;
    private Button readFullNews;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);
        title = getIntent().getStringExtra("title");
        desc = getIntent().getStringExtra("desc");
        content = getIntent().getStringExtra("content");
        imageUrl = getIntent().getStringExtra("image");
        url = getIntent().getStringExtra("url");


        titleNewsDetails = findViewById(R.id.idTVTitleDetails);
        subDecNewsDetails = findViewById(R.id.idTVSubDesc);
        contentNewsDetails = findViewById(R.id.idTVContent);
        imgNewsDetails = findViewById(R.id.IVNewsDetail);
        readFullNews = findViewById(R.id.idBtnReadNews);

        titleNewsDetails.setText(title);
        subDecNewsDetails.setText(desc);
        contentNewsDetails.setText(content);
        Picasso.get().load(imageUrl).into(imgNewsDetails);

        readFullNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new  Intent(Intent.ACTION_VIEW);
                startActivity(i);
            }
        });

    }
}