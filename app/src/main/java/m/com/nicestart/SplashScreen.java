package m.com.nicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
/**
 * Ventana de bienvenida a la app
 *
 * @author raul garcia sanchez
 * @see LoginActivity
 */

public
class SplashScreen extends AppCompatActivity {

    ImageView logo;
    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_splash_screen );
        getSupportActionBar().hide();

        logo = findViewById( R.id.logo );

        openApp( true );
    }

    private void openApp(boolean locationPermission){
        Handler hnd = new Handler();

        hnd.postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity( i );
                finish();
            }
        },5000 );
    }
}