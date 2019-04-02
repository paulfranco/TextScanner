package co.paulfran.paulfranco.textscanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;
    String txt;
    final int RequestCameraPermissionID = 1001;

    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.btn);
        mTextView = findViewById(R.id.tv);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(intent);
            }
        });

        Bundle b = getIntent().getExtras();
        if (b != null) {
            txt = b.getString("key");
            mTextView.setText(txt);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
