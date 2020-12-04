package m.com.nicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

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
    }
}