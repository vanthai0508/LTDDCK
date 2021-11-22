package com.midterm.ck;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.midterm.ck.databinding.ActivityGdbookBinding;

public class GDBOOK extends AppCompatActivity {

    private ActivityGdbookBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gdbook);

        ActionBar actionBar = getSupportActionBar();

        Drawable drawable= getResources().getDrawable(R.drawable.ic_launcher_background);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return  true;
            case R.id.tcn:
                Intent intent=new Intent(GDBOOK.this,TCN.class);


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
        getMenuInflater().inflate(R.menu.menutcn, menu);
        return true;
    }
}