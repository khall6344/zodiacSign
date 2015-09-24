package test.zodiacsign.android.zodiacsign;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ShowSignActivity extends AppCompatActivity {
    private TextView usersAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_sign);
        usersAge = (TextView) findViewById(R.id.SignTextView);


        usersAge.setText(getSign());


    }
    private String getSign() {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");

        if (birthday.compareTo( ariesStart()) >= 0 && birthday.compareTo(ariesEnd())<=0)
        {
            return "Aries";
        }

        return"couldn't locate your sign";
    }


    private Date ariesStart()//this is one day off so that it register on the exact day. for some reason it wouldnt.
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.MARCH, 20); //Year, month and day of month
        Date ariesStart = cal.getTime();
        return ariesStart;
    }
    private Date ariesEnd()
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.APRIL, 19); //Year, month and day of month
        Date ariesEnd = cal.getTime();
        return ariesEnd;
    }

}





