package m.com.nicestart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Ventana de logueo a la app, lleva a la main activity
 * o a la ventana de registro.
 *
 * @author raul garcia sanchez
 * @see MainActivity
 * @see SignupActivity
 */


public class LoginActivity extends AppCompatActivity {

    protected TextView mSignUpTextview;
    protected Button mLoginButton;
    protected Button mGuestButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        mLoginButton = findViewById(R.id.logInBtn);
        mGuestButton = findViewById( R.id.guestBtn );
        mLoginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);


            }
        });

        mGuestButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);


            }
        });

        mSignUpTextview = findViewById(R.id.signup_text);
        mSignUpTextview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);


            }
        });
    }
}
