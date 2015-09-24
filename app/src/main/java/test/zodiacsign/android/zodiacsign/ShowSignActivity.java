package test.zodiacsign.android.zodiacsign;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;

import java.util.Date;

public class ShowSignActivity extends AppCompatActivity {
    private TextView usersAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_sign);
        usersAge =(TextView)findViewById(R.id.SignTextView);




        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");





        //usersAge.setText("Your Age is " + String.valueOf(age));


    }



  

    }


