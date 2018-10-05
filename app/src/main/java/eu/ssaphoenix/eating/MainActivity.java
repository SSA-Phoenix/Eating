package eu.ssaphoenix.eating;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final int RC_OCR_CAPTURE = 9003;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View v) {
        // launch Ocr capture activity.
        Intent intent = new Intent(this, GetText.class);
        intent.putExtra(GetText.AutoFocus, true);
        intent.putExtra(GetText.UseFlash, false);

        startActivity(intent);

    }

}
