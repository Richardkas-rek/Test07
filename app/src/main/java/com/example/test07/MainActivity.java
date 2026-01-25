package com.example.test07;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private ImageView iVone;

    private ImageButton btniv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iVone = findViewById(R.id.iVone);
        btniv = findViewById(R.id.btniv);
    }
    int x = 1;

    public void clicked(View view) {
        x = (int) (Math.random() * 3 + 1);
        if (x == 1) {
            iVone.setImageResource(R.drawable.pip);
            btniv.setImageResource(R.drawable.lil1);
        } else if (x == 2) {
            iVone.setImageResource(R.drawable.dog);
            btniv.setImageResource(R.drawable.lil2);
        } else {
            iVone.setImageResource(R.drawable.sum);
            btniv.setImageResource(R.drawable.lil3);
        }
    }

}