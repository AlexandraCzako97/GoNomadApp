package com.example.ada.gonomadapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import android.text.method.ScrollingMovementMethod;

import static com.example.ada.gonomadapplication.SearchActivity.EXTRA_CREATOR;
import static com.example.ada.gonomadapplication.SearchActivity.EXTRA_LIKES;
import static com.example.ada.gonomadapplication.SearchActivity.EXTRA_URL;
import static com.example.ada.gonomadapplication.SearchActivity.EXTRA_DESCRIPTION;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        String imageUrl = intent.getStringExtra(EXTRA_URL);
        String creatorName = intent.getStringExtra(EXTRA_CREATOR);
        String likeCount = intent.getStringExtra(EXTRA_LIKES);
        String descript = intent.getStringExtra(EXTRA_DESCRIPTION);

        ImageView imageView = findViewById(R.id.image_view);
        TextView textViewCreator = findViewById(R.id.text_view_name);
        TextView textViewLikes = findViewById(R.id.text_view_votes);
        TextView textViewDesc = findViewById(R.id.text_view_desc);

        Picasso.with(this).load(imageUrl).fit().centerInside().into(imageView);
        textViewCreator.setText(creatorName);
        textViewLikes.setText(likeCount);
        textViewDesc.setText(descript);

        TextView textview= (TextView) findViewById(R.id.text_view_desc);
        textview.setMovementMethod(new ScrollingMovementMethod());
    }
}