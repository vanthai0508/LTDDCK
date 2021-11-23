package com.midterm.ck;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.midterm.ck.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View viewRoot = binding.getRoot();
        setContentView(viewRoot);

//        Handler handler=new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                nextActivity();
//            }
//        },2000);

        binding.btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivity();
            }
        });

        binding.btAccount.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(MainActivity.this,CreateNewAccount.class);
            startActivity(intent);
        }
    });

    }

    private void nextActivity() {
        FirebaseUser user=FirebaseAuth.getInstance().getCurrentUser();
        if(user==null)
        {
            Intent intent=new Intent(MainActivity.this,CreateNewAccount.class);
            startActivity(intent);
        }
        else {
            Intent intent=new Intent(MainActivity.this,GDBOOK.class);
            startActivity(intent);
        }

    }
}