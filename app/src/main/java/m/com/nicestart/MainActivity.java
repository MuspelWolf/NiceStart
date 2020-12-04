package m.com.nicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * Ventana principal
 *
 * @author raulgarcia
 * @see SignupActivity
 */


public
class MainActivity extends AppCompatActivity {

    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main);
    }
}