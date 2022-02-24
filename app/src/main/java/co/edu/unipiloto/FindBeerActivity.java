package co.edu.unipiloto;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.ArrayList;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }
    public void onClickFindBeer(View view){
        BeerExpert beerExpert = new BeerExpert();
        TextView brands = findViewById(R.id.brands);
        Spinner color =  findViewById(R.id.color);
        String beerType =String.valueOf(color.getSelectedItemId());
        ArrayList<String> beers = beerExpert.getBrands(beerType);
        brands.setText(beers.toString().replace("[","").replace("]",""));
    }
}