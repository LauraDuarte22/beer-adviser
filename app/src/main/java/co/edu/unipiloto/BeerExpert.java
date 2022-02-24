package co.edu.unipiloto;


import java.util.ArrayList;

public class BeerExpert {

    public ArrayList<String> getBrands(String brand) {
        ArrayList<String> beers= new ArrayList<>();
        switch (brand) {
            case "0":
                beers.add(0,"Corona");
                beers.add(1,"Tiger");
                break;
            case "1":
                beers.add(0," platense Astor Birra");
                beers.add(1," Cuatro Cerros");
                break;
            case "2":
                beers.add(0,"Porter");
                beers.add(1,"Red ale");
                break;
            case "3":
                beers.add(0,"Delirium");
                beers.add(1,"Kaiserdom");
                break;
        }
        return beers;
    }
}

