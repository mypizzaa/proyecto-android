package cat.proven.view.mypizza;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView userTv, passwordTv, registerTv;
    private EditText user, password;
    private Button loginB;
    private View.OnClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initListener();
        initComponents();
    }

    private void initListener() {
        listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };
    }

    private void initComponents() {
        Typeface typeFace=Typeface.createFromAsset(getAssets(),"fonts/texgyreschola-regular.otf");

        userTv = (TextView) findViewById(R.id.userTv);
        userTv.setTypeface(typeFace);
        passwordTv = (TextView) findViewById(R.id.passwordTv);
        passwordTv.setTypeface(typeFace);

        user = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.password);

        loginB = (Button) findViewById(R.id.loginB);
        loginB.setOnClickListener(listener);

        registerTv = (TextView) findViewById(R.id.registerTv);
        registerTv.setTypeface(typeFace);
        registerTv.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
