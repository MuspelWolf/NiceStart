package m.com.nicestart;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public
class MainActivity2 extends AppCompatActivity {

    BottomNavigationView btnNav;

    AlertDialog alertDiag;

    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );

        btnNav = findViewById( R.id.btt_nav );
        btnNav.setOnNavigationItemSelectedListener(navListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public
        boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()){

                case R.id.searchNav:

                    Toast.makeText(getApplicationContext(),
                            getString( R.string.toast_search ), Toast.LENGTH_LONG ).show();
                    break;

                case  R.id.heartNav:
                    Toast.makeText( getApplicationContext(),
                            getString( R.string.toast_heartnav) , Toast.LENGTH_LONG ).show();
                    break;
                    
                case R.id.gun:
                    showAlertDialog();
            }


            return true;
        }
    };

    private
    void showAlertDialog() {

        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);
        alertBuilder.setView( getLayoutInflater().inflate( R.layout.alert_dialog, null ) );

        alertBuilder.create().show();


    }
}