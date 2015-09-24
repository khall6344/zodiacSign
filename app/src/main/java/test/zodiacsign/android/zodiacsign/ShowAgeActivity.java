package test.zodiacsign.android.zodiacsign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class ShowAgeActivity extends AppCompatActivity {

    private TextView usersAge;

    private static long daysBetween(Date one, Date two)
    {
        long difference = (one.getTime()-two.getTime())/86400000; return Math.abs(difference);
    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_age);


        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        Date currentDay = Calendar.getInstance().getTime();

        long age = daysBetween(birthday,currentDay)/365;



        usersAge =(TextView)findViewById(R.id.ageTextView);

        usersAge.setText("Your Age is " + String.valueOf(age));


        }
    }

