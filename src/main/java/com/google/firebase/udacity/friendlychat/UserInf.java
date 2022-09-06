package com.google.firebase.udacity.friendlychat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

public class UserInf extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_user_info);
        Button back = (Button)this.findViewById(R.id.depart);
        back.setOnClickListener((View.OnClickListener) new View.OnClickListener() {
            public final void onClick(View it) {
                UserInf.this.finish();
            }
        });
    }
}
