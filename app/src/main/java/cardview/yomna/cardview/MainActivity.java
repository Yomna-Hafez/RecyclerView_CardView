package cardview.yomna.cardview;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("i", "Hello from onCreate!");
        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true); //If you are sure that the size of the RecyclerView won't be changing

        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(llm);

        List<Person> persons;
        persons = new ArrayList<>();
        persons.add(new Person("Yomna Hafez", "23 years old", R.drawable.yomna));
        persons.add(new Person("Yomna Hafez 1", "24 years old", R.drawable.test1));
        persons.add(new Person("Yomna Hafez 2", "25 years old", R.drawable.test2));
        persons.add(new Person("Yomna Hafez 3", "26 years old", R.drawable.test3));
        persons.add(new Person("Yomna Hafez 4", "27 years old", R.drawable.test4));
        persons.add(new Person("Yomna Hafez 5", "28 years old", R.drawable.test5));
        persons.add(new Person("Yomna Hafez 6", "29 years old", R.drawable.test6));
        persons.add(new Person("Yomna Hafez 7", "30 years old", R.drawable.test7));
        persons.add(new Person("Yomna Hafez 8", "31 years old", R.drawable.test8));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(persons);
        rv.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
