package com.example.kerbai.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order cafee
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    /**
     * This method called when the order button is clicked
     */

    public void submitOrder(View view){

        int quantityOfCoffee = 5;

        display(quantityOfCoffee);
        displayPrice(quantityOfCoffee*5);
    }

    public void plus (View view){
        int quantity = 2;
        quantity = 1 + quantity;

        display(quantity);
        displayPrice(quantity*5);

    }

    public void minus (View view){
        int quantity = 2;
        quantity = quantity - 1;

        display(quantity);
        displayPrice(quantity*5);
    }

    /**
     * This method displays the given quantity value on screen    *
     */

    private void display(int number){
        TextView quantityTextView = (TextView) findViewById(R.id.jumlah);
        quantityTextView.setText(""+number);
    }

    private void displayPrice(int number){
        TextView priceTextView = (TextView) findViewById(R.id.price);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
