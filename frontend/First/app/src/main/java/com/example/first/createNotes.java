package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class createNotes extends AppCompatActivity {

    private EditText inputTitle, noteSubtitle, inputNote;
    private TextView textDateTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_notes);

        ImageView imageSave = findViewById(R.id.imageSave);
        imageSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), TakeNotes.class));
            }
        });

        ImageView imageBack = findViewById(R.id.imageback);
        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                onBackPressed();
            }
        });

        inputTitle = findViewById(R.id.inputTitle);
        noteSubtitle = findViewById(R.id.noteSubtitle);
        inputNote = findViewById(R.id.inputNote);
        textDateTime = findViewById(R.id.textDateTime);

        textDateTime.setText(
                new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm a", Locale.getDefault())
                        .format(new Date())
        );

    }

    private void saveNotes()
    {
        if(inputTitle.getText().toString().trim().isEmpty())
        {
            Toast.makeText(this, "Note title can't be empty!", Toast.LENGTH_SHORT).show();
            return;
        }

        else if(noteSubtitle.getText().toString().trim().isEmpty()
                && inputNote.getText().toString().trim().isEmpty())
        {
            Toast.makeText(this, "Note can't be empty!", Toast.LENGTH_SHORT).show();
            return;
        }

        setTitle(inputTitle.getText().toString());
        // setSubtitle(noteSubtitle.getText().toString());
       //  setNoteText(inputNote.getText().toString());
       // setDateTime(textDateTime.getText().toString());

    }
}