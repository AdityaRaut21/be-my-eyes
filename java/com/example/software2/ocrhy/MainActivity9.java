package com.example.software2.ocrhy;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.*;

import java.util.Locale;

public class MainActivity9 extends Activity {

    EditText contact;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        contact = findViewById(R.id.contact);
        textToSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(Locale.US);
                    textToSpeech.speak("Say the name of the contact", TextToSpeech.QUEUE_FLUSH, null);
                    textToSpeech.setSpeechRate(1f);

                    String mynumber = "9881080599";
                    Intent dial = new Intent(Intent.ACTION_CALL, Uri.parse(mynumber));
                }
            }
        });

    }
}
