package com.heegu.singup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView name_id;
    private Button btn_board;

    @Override
    protected void onCreate(Bundle savedlnstanceState) {
        super.onCreate(savedlnstanceState);
        setContentView(R.layout.activity_community);

        name_id = findViewById(R.id.name_id);
        btn_board = findViewById(R.id.btn_board);

        btn_board.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intents = new Intent(MainActivity.this, BoardActivity.class);
                startActivity(intents);
            }
        });

        Intent intent = getIntent();
        String userID = intent.getStringExtra("userID");
        name_id.setText(userID);
    }
}
