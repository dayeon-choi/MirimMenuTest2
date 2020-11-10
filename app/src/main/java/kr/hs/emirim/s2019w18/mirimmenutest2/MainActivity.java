package kr.hs.emirim.s2019w18.mirimmenutest2;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.MenuInflater;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText editDegree;
    ImageView imgOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editDegree = findViewById(R.id.edit_degree);
        imgOne = findViewById(R.id.one);
/*
        setTitle("image menu");
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab=findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"create image menu",Snackbar.LENGTH_LONG).setAction("Action",null).show();
            }
        });
*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_rotate:
                imgOne.setRotation(Float.parseFloat(editDegree.getText().toString()));
                return true;
            case R.id.item_one:
                imgOne.setImageResource(R.drawable.one);
                return true;
            case R.id.item_two:
                imgOne.setImageResource(R.drawable.two);
                return true;
            case R.id.item_three:
                imgOne.setImageResource(R.drawable.three);
                return true;
        }
        return false;
    }
}