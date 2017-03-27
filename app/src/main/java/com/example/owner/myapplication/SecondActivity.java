package com.example.owner.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //TextView textView=(TextView)findViewById(R.id.textView3);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.meny,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int itemThatWasClicked = item.getItemId();
        switch (itemThatWasClicked) {
            case R.id.one_item:
                Intent intent1 = new Intent(SecondActivity.this, SecondActivity.class);
                startActivity(intent1);
                break;

            case R.id.two_item:
                Intent intent2 = new Intent(SecondActivity.this, ThirdActivity.class);
                onPause();
                startActivity(intent2);
                break;

            case R.id.three_item:
                Intent intent3 = new Intent(SecondActivity.this, ForthActivity.class);
                onPause();
                startActivity(intent3);
                break;

            case R.id.four_item:
                Intent intent4=new Intent(SecondActivity.this,FifthActivity.class);
                onPause();
                startActivity(intent4);
                break;

            case R.id.fifth_item:
                Intent intent5=new Intent(SecondActivity.this,SixthActivity.class);
                onPause();
                startActivity(intent5);
                break;

            case R.id.last_item:
                finish();
                onResume();
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
