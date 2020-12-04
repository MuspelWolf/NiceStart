package m.com.nicestart;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 *  Ventana de registro de la app, te permite registrarte y pasar a la main activity
 *
 * @author raul garcia sanchez
 * @see MainActivity
 */


public class SignupActivity extends AppCompatActivity {

    protected Button mCancelButton;
    protected Button mSignupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().hide();

        mCancelButton = findViewById(R.id.cancelbutton);
        mCancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

        mSignupButton = findViewById(R.id.signupbutton);
        mSignupButton   .setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SignupActivity.this, MainActivity.class);
                startActivity(intent);


            }
        });
    }
}