package com.midterm.ck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.midterm.ck.databinding.ActivityInforBinding;

public class infor extends AppCompatActivity {
    private ActivityInforBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infor);

        binding.btndat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(infor.this, order.class);
                startActivity(intent);
            }
        });
    }
}