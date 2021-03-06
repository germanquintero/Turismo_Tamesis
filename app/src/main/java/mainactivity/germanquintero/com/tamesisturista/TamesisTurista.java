package mainactivity.germanquintero.com.tamesisturista;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class TamesisTurista extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_tamesisturistica);
    }




    //meni para ir a otras

    public void gohoteles (View view){
        Intent i = new Intent(this, activity_hoteles.class );
        startActivity(i);
    }


    public void gobares (View view){
        Intent i = new Intent(this, activity_bares.class );
        startActivity(i);
    }


    public void gositios (View view){
        Intent i = new Intent(this, activity_sitios.class );
        startActivity(i);
    }

    public void godemografia (View view){
        Intent i = new Intent(this, activity_demografia.class );
        startActivity(i);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tamesis_turista, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        if(id==R.id.menu_hoteles){
            Intent i=new  Intent(this,activity_hoteles.class);
            startActivity(i);
        }
        if(id==R.id.menu_bares){
            Intent i=new  Intent(this,activity_bares.class);
            startActivity(i);
        }
        if(id==R.id.menu_sitios){
            Intent i=new  Intent(this,activity_sitios.class);
            startActivity(i);
        }
        if(id==R.id.menu_demografia){
            Intent i=new  Intent(this,activity_demografia.class);
            startActivity(i);
        }
        if(id==R.id.menu_acercade){
            Intent i=new  Intent(this,activity_acercade.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}
