package mydomain.prelo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;

public class LoginActivity extends AppCompatActivity {

    private String response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText et_username = (EditText) findViewById(R.id.username);
        final EditText et_password = (EditText) findViewById(R.id.password);

        final Button login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String username = et_username.getText().toString();
                String password = et_password.getText().toString();

                if (username.length()==0){

                } else if (password.length()<6){

                } else{

                    LoginHandler loginHandler = new LoginHandler(username, password, response);
                    Thread loginThread = new Thread(loginHandler);
                    loginThread.start();
                }

            }
        });

    }



}


