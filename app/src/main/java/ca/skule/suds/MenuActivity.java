package ca.skule.suds;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MenuActivity extends ActionBarActivity {
    int numDrinks = 5;
    Drink keg = newDrink("keg", "green", 2.25);
    Drink domestic = newDrink("domestic", "red", 3.25);
    Drink premium = newDrink("premium", "purple", 3.50);
    Drink importLiquor = newDrink("import", "blue", 4.00);
    Drink special = newDrink("special", "yellow", 3.50);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public Drink newDrink(String category, String colour, double price) {
        Drink drink = new Drink();
        drink.category = category;
        drink.price = price;
        return drink;
    }
}
