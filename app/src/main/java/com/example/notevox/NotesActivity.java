package com.example.notevox;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NotesActivity extends AppCompatActivity {

    private ImageView settingsIcon, pauseButton, recordButton, stopButton;
    private TextView titleText, noteBanner;
    private EditText inputNote;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Remplacez par votre layout XML

        // Initialisation des vues
        settingsIcon = findViewById(R.id.settings_icon);
        pauseButton = findViewById(R.id.pause_button);
        recordButton = findViewById(R.id.record_button);
        stopButton = findViewById(R.id.stop_button);
        titleText = findViewById(R.id.title_text);
        noteBanner = findViewById(R.id.note_banner);
        inputNote = findViewById(R.id.input_note);

        // Action pour le bouton Paramètres (Settings)
        settingsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implémentation pour ouvrir les paramètres
            }
        });

        // Action pour le bouton Pause
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implémentation pour mettre en pause l'enregistrement
            }
        });

        // Action pour le bouton Enregistrement
        recordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implémentation pour démarrer l'enregistrement
            }
        });

        // Action pour le bouton Stop
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implémentation pour arrêter l'enregistrement
            }
        });
    }
}

