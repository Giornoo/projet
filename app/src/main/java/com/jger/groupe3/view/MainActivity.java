package com.jger.groupe3.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.jger.groupe3.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boutonNouvellePartie = findViewById(R.id.bouton_nouvelle_partie);
        Button boutonScoreboard = findViewById(R.id.scoreboard);
        boutonNouvellePartie.setOnClickListener(view -> lanceNouvellePartie() );
        boutonScoreboard.setOnClickListener(view -> lanceScoreboard());

    }

    private void lanceNouvellePartie() {
        Intent i = new Intent(this, NouvellePartie.class);
        startActivity(i);
    }

    private void lanceScoreboard() {
        Intent i = new Intent(this, NouvellePartie.class);
        startActivity(i);
    }
}