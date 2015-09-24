package test.zodiacsign.android.zodiacsign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Date;

public class ShowAgeActivity extends AppCompatActivity {

    private TextView usersAge;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_age);


        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
          Date currentDay = Calendar.getInstance().getTime();


          usersAge =(TextView)findViewById(R.id.ageTextView);


          Long time= currentDay.getTime() / 1000 - birthday.getTime() / 1000;
          int years = Math.round(time) / 31536000;


        if (birthday.compareTo(currentDay) == 0 )
        {
            usersAge.setText("It is your birthday, and your Age is " + String.valueOf(years));
        }

        usersAge.setText("Your Age is " + String.valueOf(years));


        }

}

//I am using an older jdk I belive on Jdk 8 the results would have been easier. could have used chronounit.

/*
long age = daysBetween(birthday, currentDay)/365;

    private static long daysBetween(Date one, Date two)
    {
        long difference = (one.getTime()-two.getTime())/86400000; return Math.abs(difference);
    }*/


/*
    private Date getCurrentForBirthday()
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.MONTH, Calendar.DAY_OF_MONTH);
        Date current = cal.getTime();
        return current;
    }*/
