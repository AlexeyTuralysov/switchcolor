package com.example.windowdialog2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {
    private Button bgButton;
    public RelativeLayout relativelayout;
    Context context;



    //@SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bgButton = (Button) findViewById(R.id.background_button);

        relativelayout = (RelativeLayout) findViewById(R.id.relativelayout);


        context = MainActivity.this;









        bgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final CharSequence[] items = {getText(R.string.red), getText(R.string.yellow), getText(R.string.green)};
                // здесь можно написать код обработки нажатия на кнопку

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle(R.string.message);

                builder.setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int item) {




                        switch (item){
                            case 0:

                                relativelayout.setBackgroundColor(Color.parseColor("#a83432"));
                                break;

                            case 1:
                                relativelayout.setBackgroundColor(Color.parseColor("#bcdb09"));
                                break;

                            case 2:
                                relativelayout.setBackgroundColor(Color.parseColor("#09db1a"));
                                break;




                        }










                    }
                });









                builder.setPositiveButton("Нет", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Действие при нажатии кнопки

                    }
                });





                AlertDialog alertDialog = builder.create();
                alertDialog.show();


            }


        });





    }

}