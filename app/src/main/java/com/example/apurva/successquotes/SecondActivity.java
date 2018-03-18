package com.example.apurva.successquotes;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    ListView myListView;
    int[] images={R.drawable.share_this,R.drawable.copy};
    String[] myArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        //for back home button
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        //
        myListView=findViewById(R.id.myListView);
        myArray=getResources().getStringArray(R.array.myarray);

        CustomAdapter customAdapter=new CustomAdapter();
        myListView.setAdapter(customAdapter);



    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 10;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView=getLayoutInflater().inflate(R.layout.custom_layout,null);
            ImageView img1=convertView.findViewById(R.id.img1);
            ImageView img2=convertView.findViewById(R.id.img2);
            TextView quotes=convertView.findViewById(R.id.textView);

            img1.setImageResource(images[0]);
            img2.setImageResource(images[1]);
            quotes.setText(myArray[position]);


            return convertView;
        }
    }


    //for back home button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
    //
}
