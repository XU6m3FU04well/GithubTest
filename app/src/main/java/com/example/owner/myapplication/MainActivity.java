package com.example.owner.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.meny,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int itemThatWasClicked=item.getItemId();
        switch (itemThatWasClicked){
            case R.id.one_item:
                Intent intent1=new Intent(MainActivity.this,SecondActivity.class);
                onPause();
                startActivity(intent1);
                break;

            case R.id.two_item:
                Intent intent2=new Intent(MainActivity.this,ThirdActivity.class);
                onPause();
                startActivity(intent2);
                break;

            case R.id.three_item:
                Intent intent3=new Intent(MainActivity.this,ForthActivity.class);
                onPause();
                startActivity(intent3);
                break;

            case R.id.four_item:
                Intent intent4=new Intent(MainActivity.this,FifthActivity.class);
                onPause();
                startActivity(intent4);
                break;

            case R.id.fifth_item:
                Intent intent5=new Intent(MainActivity.this,SixthActivity.class);
                onPause();
                startActivity(intent5);
                break;

            case R.id.last_item:
                finish();
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
}
}
