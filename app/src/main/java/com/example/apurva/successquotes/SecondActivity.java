package com.example.apurva.successquotes;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
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
import android.widget.Toast;

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
        switch (MainActivity.count){
            case 0:
                myArray=getResources().getStringArray(R.array.myarray);
                break;
            case 1:
                myArray=getResources().getStringArray(R.array.array2);
                break;
            case 2:
                myArray=getResources().getStringArray(R.array.array3);
                break;
            case 3:
                myArray=getResources().getStringArray(R.array.array4);
                break;
            case 4:
                myArray=getResources().getStringArray(R.array.array5);
                break;
            case 5:
                myArray=getResources().getStringArray(R.array.array6);
                break;
            case 6:
                myArray=getResources().getStringArray(R.array.array7);
                break;
            case 7:
                myArray=getResources().getStringArray(R.array.array8);
                break;
            case 8:
                myArray=getResources().getStringArray(R.array.array9);
                break;
            case 9:
                myArray=getResources().getStringArray(R.array.array10);
                break;
        }


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
            final TextView quotes=convertView.findViewById(R.id.textView);

            img1.setImageResource(images[0]);
            img2.setImageResource(images[1]);
            quotes.setText(myArray[position]);

            img2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ClipboardManager myClipboard;
                    myClipboard= (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);

                    ClipData myclip;

                    String text=quotes.getText().toString();
                    myclip=ClipData.newPlainText("text",text);
                    myClipboard.setPrimaryClip(myclip);
                    Toast.makeText(SecondActivity.this, "कॉपी हो गया ", Toast.LENGTH_SHORT).show();
                }
            });

            img1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ClipboardManager myClipboard;
                    myClipboard= (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);

                    ClipData myclip;

                    String text=quotes.getText().toString();
                    myclip=ClipData.newPlainText("text",text);
                    myClipboard.setPrimaryClip(myclip);

                    Intent sharingIntent=new Intent(android.content.Intent.ACTION_SEND);
                    sharingIntent.setType("text/plain");
                    String shareBody=text;
                    sharingIntent.putExtra(Intent.EXTRA_SUBJECT,"Subject here");
                    sharingIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                    startActivity(Intent.createChooser(sharingIntent,"Share via"));
                }
            });


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
