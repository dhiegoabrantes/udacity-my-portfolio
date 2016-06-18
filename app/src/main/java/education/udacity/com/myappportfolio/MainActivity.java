package education.udacity.com.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting up the buttons!
        setupButtonActions();

    }

    private void setupButtonActions(){

        //Setting up click event on 'Popular Movies' button
        Button buttonPopularMovies = (Button) findViewById(R.id.buttonPopularMovies);
        buttonPopularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.button_popular_movies_msg, Toast.LENGTH_LONG).show();
            }
        });

        //Setting up click event on 'Stock Hawk' button
        Button buttonStockHawk = (Button) findViewById(R.id.buttonStockHawk);
        buttonStockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.button_stock_hawk_msg, Toast.LENGTH_LONG).show();
            }
        });

        //Setting up click event on 'Build it Bigger' button
        Button buttonBuildItBigger = (Button) findViewById(R.id.buttonBuildItBigger);
        buttonBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.button_build_it_bigger_msg, Toast.LENGTH_LONG).show();
            }
        });

        //Setting up click event on 'Make Your App Material' button
        Button buttonMakeYourAppMaterial = (Button) findViewById(R.id.buttonMakeYourAppMaterial);
        buttonMakeYourAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.button_make_your_app_material_msg, Toast.LENGTH_LONG).show();
            }
        });

        //Setting up click event on 'Go Ubiquitous' button
        Button buttonGoUbiquitous = (Button) findViewById(R.id.buttonGoUbiquitous);
        buttonGoUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.button_go_ubiquitous_msg, Toast.LENGTH_LONG).show();
            }
        });

        //Setting up click event on 'Capstone' button
        Button buttonCapstone = (Button) findViewById(R.id.buttonCapstone);
        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.button_capstone_msg, Toast.LENGTH_LONG).show();
            }
        });
    }
}
