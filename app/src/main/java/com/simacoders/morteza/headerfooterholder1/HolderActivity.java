package com.simacoders.morteza.headerfooterholder1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class HolderActivity extends AppCompatActivity {

    TextView textViewComment;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holder);

        textViewComment = findViewById(R.id.textViewHLable);
        frameLayout = findViewById(R.id.frameLayout);

        ImageView imageView1 = findViewById(R.id.imageViewF1);
        ImageView imageView2 = findViewById(R.id.imageViewF2);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivity("act1");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivity("act2");
            }
        });
    }

    protected void setTextViewComment(String text){
        textViewComment.setText(text);
    }

    protected void setFrameLayout(int layoutId){
        getLayoutInflater().inflate(layoutId, frameLayout);
    }

    protected void switchActivity(String newAct){
        ((Activity)frameLayout.getChildAt(0).getContext()).finish();
        Intent intent;
        switch (newAct){
            case "act1":
                intent = new Intent(this, FirstActivity.class);
                startActivity(intent);
                break;
            case "act2":
                intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
        }
    }
}
