package com.midterm.ck;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class TCN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tcn);


        ActionBar actionBar = getSupportActionBar();

        Drawable drawable= getResources().getDrawable(R.drawable.ic_launcher_background);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return  true;
            case R.id.gd:
                Intent intent=new Intent(TCN.this,GDBOOK.class);


                setResult(RESULT_OK,intent);
                startActivity(intent);
                finish();
                return   true;
            default:break;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menugd, menu);
        return true;
    }
}