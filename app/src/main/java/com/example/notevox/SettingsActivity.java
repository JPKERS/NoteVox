package com.example.notevox;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings); // Remplacez par le nom réel de votre fichier XML

        // Initialiser les commutateurs
        Switch voiceCommandsSwitch = findViewById(R.id.voice_commands);
        Switch darkLightModeSwitch = findViewById(R.id.dark_mode);
        Switch notificationsSwitch = findViewById(R.id.notifications);

        // Initialiser les cases à cocher
        CheckBox changeNoteSortingCheckBox = findViewById(R.id.change_note_sorting);
        CheckBox autoSaveNotesCheckBox = findViewById(R.id.auto_save_notes);

        // Configurer les listeners pour les commutateurs
        voiceCommandsSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(SettingsActivity.this,
                        isChecked ? "Voice Commands Enabled" : "Voice Commands Disabled",
                        Toast.LENGTH_SHORT).show();
            }
        });

        darkLightModeSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(SettingsActivity.this,
                        isChecked ? "Dark Mode Enabled" : "Light Mode Enabled",
                        Toast.LENGTH_SHORT).show();
            }
        });

        notificationsSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(SettingsActivity.this,
                        isChecked ? "Notifications Enabled" : "Notifications Disabled",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Configurer les listeners pour les cases à cocher
        changeNoteSortingCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(SettingsActivity.this,
                        isChecked ? "Note Sorting Enabled" : "Note Sorting Disabled",
                        Toast.LENGTH_SHORT).show();
            }
        });

        autoSaveNotesCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(SettingsActivity.this,
                        isChecked ? "Auto-Save Enabled" : "Auto-Save Disabled",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Gérer le bouton "Language" (si nécessaire)
        findViewById(R.id.language).setOnClickListener(v -> {
            // Exemple : changer la langue (fonctionnalité à implémenter)
            Toast.makeText(SettingsActivity.this,
                    "Language Settings Clicked", Toast.LENGTH_SHORT).show();
        });
    }
}

