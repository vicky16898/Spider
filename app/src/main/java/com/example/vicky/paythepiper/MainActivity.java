package com.example.vicky.paythepiper;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView randomnumber;
    private static final Random rand = new Random();
    private int paid = 0;
    private TextView paidamount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout mainlayout=(LinearLayout)findViewById(R.id.mainlayout);
        randomnumber = (TextView) findViewById(R.id.randomnumber);
        paidamount = (TextView) findViewById(R.id.paidamount);
        final int number = rand.nextInt(200) + 1;
        randomnumber.setText("Amount Due: ₹" + String.valueOf(number));

        Button one = (Button) findViewById(R.id.one);
        Button two = (Button) findViewById(R.id.two);
        Button five = (Button) findViewById(R.id.five);
        Button ten = (Button) findViewById(R.id.ten);
        Button reset = (Button) findViewById(R.id.reset);


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paid=0;
                paidamount.setText("Amount Paid: ₹"+String.valueOf(paid));
                mainlayout.setBackgroundColor(getResources().getColor(R.color.WHITE));
            }
        });


            one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                        paid = paid + 1;
                        if(paid<=number)
                            paidamount.setText("Amount Paid: ₹"+String.valueOf(paid));
                        else
                            paid=paid-1;
                        if(paid==number)
                            mainlayout.setBackgroundColor(getResources().getColor(R.color.colorAccent));



                }
            });

            two.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                        paid = paid + 2;
                        if(paid<=number)
                            paidamount.setText("Amount Paid: ₹"+String.valueOf(paid));
                        else
                            paid=paid-2;
                    if(paid==number)
                        mainlayout.setBackgroundColor(getResources().getColor(R.color.colorAccent));

                }
            });

            five.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                        paid = paid + 5;
                        if(paid<=number)
                            paidamount.setText("Amount Paid: ₹"+String.valueOf(paid));
                        else
                            paid=paid-5;
                    if(paid==number)
                        mainlayout.setBackgroundColor(getResources().getColor(R.color.colorAccent));

                }
            });

            ten.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                        paid = paid + 10;
                        if(paid<=number)
                        paidamount.setText("Amount Paid: ₹"+String.valueOf(paid));
                        else
                            paid=paid-10;
                    if(paid==number)
                        mainlayout.setBackgroundColor(getResources().getColor(R.color.colorAccent));

                }
            });





    }

}
