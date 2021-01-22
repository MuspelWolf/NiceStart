package m.com.nicestart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.material.snackbar.Snackbar;

import java.lang.invoke.ConstantCallSite;

/**
 * Ventana principal
 *
 * @author raulgarcia
 * @see SignupActivity
 */


public
class MainActivity extends AppCompatActivity {

    ImageView soldierImg;
    Button proBtn;

    private SwipeRefreshLayout swipeLayout;

    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main);


        soldierImg = findViewById( R.id.imageView2 );
        proBtn = findViewById( R.id.proBtn );

        Glide.with(this)
                .load(R.drawable.soldier_fixed)

                .centerCrop().circleCrop().into(soldierImg);

        proBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public
            void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity( i );
            }
        } );

        registerForContextMenu( soldierImg );

        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.swipeLo);
        swipeLayout.setOnRefreshListener(mOnRefreshListener);


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){

        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.edit:
                Toast toast = Toast.makeText(this, "going CONTEXT CAMERA", Toast.LENGTH_LONG);
                toast.show();
                break;
            case R.id.delete:
                Toast toast2 = Toast.makeText(this, "going CONTEXT SETTINGS", Toast.LENGTH_LONG);
                toast2.show();
                break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.appbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {// Handle action bar item clicks here. The action bar will// automatically handle clicks on the Home/Up button, so long// as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) return true;
        if (id == R.id.search){
            Toast toast = Toast.makeText(this,"going APPBAR CAMERA",Toast.LENGTH_LONG );
        toast.show();
        }

        return super.onOptionsItemSelected(item);
    }

    protected SwipeRefreshLayout.OnRefreshListener mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {

            final ConstraintLayout cLayout = findViewById( R.id.mainLo );
            Snackbar snackbar = Snackbar.make
                    ( cLayout, "Refreshing?", Snackbar.LENGTH_SHORT )
                    .setAction( "UNDO", new View.OnClickListener() {
                        @Override
                        public
                        void onClick(View view) {
                            Snackbar snbar = Snackbar
                                    .make( cLayout,"Restored!",Snackbar.LENGTH_SHORT  );
                            snbar.show();
                        }
                    } );
            snackbar.show();
            swipeLayout.setRefreshing(false);
        }
    };

}