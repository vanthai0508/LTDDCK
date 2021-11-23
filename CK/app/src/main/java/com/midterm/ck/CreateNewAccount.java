package com.midterm.ck;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.midterm.ck.databinding.ActivityCreateNewAccountBinding;
import com.midterm.ck.databinding.ActivityMainBinding;

public class CreateNewAccount extends AppCompatActivity {

    private ActivityCreateNewAccountBinding binding;

    private String email,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_account);

        binding = ActivityCreateNewAccountBinding.inflate(getLayoutInflater());
        View viewRoot = binding.getRoot();
        setContentView(viewRoot);

        binding.btDk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                DangKy();
            }
        });

    }

    private void DangKy() {
        email=binding.etEmail.getText().toString().trim();
        pass=binding.etPass.getText().toString().trim();

        FirebaseAuth auth=FirebaseAuth.getInstance();


        auth.createUserWithEmailAndPassword(email, pass)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information

                            Intent intent=new Intent(CreateNewAccount.this,GDBOOK.class);
                            startActivity(intent);

                        } else {
                            // If sign in fails, display a message to the user.

                            Toast.makeText(CreateNewAccount.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();

                        }
                    }
                });


    }

}