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

        if (birthday.compareTo(ariesStart()) >= 0 && birthday.compareTo(ariesEnd())<=0)
        {
            return "You are an Aries symbol of the Ram";
        }
        else if (birthday.compareTo(taurusStart()) >= 0 && birthday.compareTo(taurusEnd())<=0)
        {
            return "You are a Taurus symbol of the Bull";
        }
        else if (birthday.compareTo(geminiStart()) >= 0 && birthday.compareTo(geminiEnd())<=0)
        {
            return "You are a Gemini symbol of the Twins";
        }
        else if (birthday.compareTo(cancerStart()) >= 0 && birthday.compareTo(cancerEnd())<=0)
        {
            return "You are a Cancer symbol of the Crab";
        }
        else if(birthday.compareTo(leoStart()) >= 0 && birthday.compareTo(leoEnd())<=0)
        {
            return "You are a Leo symbol of the Lion";
        }
        else if (birthday.compareTo(virgoStart()) >= 0 && birthday.compareTo(virgoEnd())<=0)
        {
            return "You are a Virgo symbol of the Virgin";
        }
        else if (birthday.compareTo(libraStart()) >= 0 && birthday.compareTo(libraEnd())<=0)
        {
            return "You are a Libra symbol of the Scales";
        }
        else if (birthday.compareTo(scorpioStart()) >= 0 && birthday.compareTo(scorpioEnd())<=0)
        {
            return "You are a Scorpio symbol of the Scorpion";
        }
        else if (birthday.compareTo(sagittariusStart()) >= 0 && birthday.compareTo(sagittariusEnd())<=0)
        {
            return "You are Sagittarius symbol of the Archer";
        }
        else if (birthday.compareTo(capricornStartDecember()) >= 0 && birthday.compareTo(capricornEndDecember())<= 0)
        {
            return "You are Capricorn symbol of the Goat";
        }
        else if (birthday.compareTo(capricornStartJanuary()) >= 0 && birthday.compareTo(capricornEndJanuary())<= 0)
        {
            return "You are Capricorn symbol of the Goat";
        }
        else if (birthday.compareTo(aquariusStart()) >= 0 && birthday.compareTo(aquariusEnd())<=0)
        {
            return "You are Aquarius symbol of the Water Bearer";
        }
        else if (birthday.compareTo(piscesStart()) >= 0 && birthday.compareTo(piscesEnd())<=0)
        {
            return "You are Pisces symbol of the Fishes";
        }
        else
        {
            return"Couldn't locate your sign";
        }

    }


    //ask professor about the off by one day thing. even though it works I would like to know reasoning. could be just that im tired, and its really something in front of my face.

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
        cal.set(birthdayYear, Calendar.APRIL, 19);
        Date ariesEnd = cal.getTime();
        return ariesEnd;
    }
    private Date taurusStart()//this is one day off so that it register on the exact day. for some reason it wouldnt.
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.APRIL, 19);
        Date taurusStart = cal.getTime();
        return taurusStart;
    }
    private Date taurusEnd()
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.MAY, 20);
        Date taurusEnd = cal.getTime();
        return taurusEnd;
    }
    private Date geminiStart() //this is one day off so that it register on the exact day. for some reason it wouldnt.
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.MAY, 20);
        Date geminiStart = cal.getTime();
        return geminiStart;
    }
    private Date geminiEnd()
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.JUNE, 20);
        Date geminiEnd = cal.getTime();
        return geminiEnd;
    }
    private Date cancerStart() //this is one day off so that it register on the exact day. for some reason it wouldnt.
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.JUNE, 20);
        Date cancerStart = cal.getTime();
        return cancerStart;
    }
    private Date cancerEnd()
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.JULY, 22);
        Date cancerEnd = cal.getTime();
        return cancerEnd;
    }
    private Date leoStart() //this is one day off so that it register on the exact day. for some reason it wouldnt.
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.JULY, 22);
        Date leoStart = cal.getTime();
        return leoStart;
    }
    private Date leoEnd()
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.AUGUST, 22);
        Date leoEnd = cal.getTime();
        return leoEnd;
    }
    private Date virgoStart()//this is one day off so that it register on the exact day. for some reason it wouldnt.
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.AUGUST, 22);
        Date virgoStart = cal.getTime();
        return virgoStart;
    }
    private Date virgoEnd()
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.SEPTEMBER, 22);
        Date virgoEnd = cal.getTime();
        return virgoEnd;
    }
    private Date libraStart() //this is one day off so that it register on the exact day. for some reason it wouldnt.
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.SEPTEMBER, 22);
        Date libraStart = cal.getTime();
        return libraStart;
    }
    private Date libraEnd()
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.OCTOBER, 22);
        Date libraEnd = cal.getTime();
        return libraEnd;
    }
    private Date scorpioStart()//this is one day off so that it register on the exact day. for some reason it wouldnt.
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.OCTOBER, 22);
        Date scorpioStart = cal.getTime();
        return scorpioStart;
    }
    private Date scorpioEnd()
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.NOVEMBER, 21);
        Date scorpioEnd = cal.getTime();
        return scorpioEnd;
    }
    private Date sagittariusStart()//this is one day off so that it register on the exact day. for some reason it wouldnt.
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.NOVEMBER, 21);
        Date sagittariusStart = cal.getTime();
        return sagittariusStart;
    }
    private Date sagittariusEnd()
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.DECEMBER, 21);
        Date sagittariusEnd = cal.getTime();
        return sagittariusEnd;
    }
    private Date capricornStartDecember()//this is one day off so that it register on the exact day. for some reason it wouldnt.
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.DECEMBER, 21);
        Date capricornStart = cal.getTime();
        return capricornStart;
    }
    private Date capricornEndDecember()
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.DECEMBER, 31);
        Date capricornEnd = cal.getTime();
        return capricornEnd;
    }
    private Date capricornStartJanuary()//this is one day off so that it register on the exact day. for some reason it wouldnt.
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.JANUARY, 0);
        Date capricornStart = cal.getTime();
        return capricornStart;
    }
    private Date capricornEndJanuary()
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.JANUARY, 19);
        Date capricornEnd = cal.getTime();
        return capricornEnd;
    }
    private Date aquariusStart()//this is one day off so that it register on the exact day. for some reason it wouldnt.
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.JANUARY, 19);
        Date aquariusStart = cal.getTime();
        return aquariusStart;
    }
    private Date aquariusEnd()
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.FEBRUARY, 18);
        Date aquariusEnd = cal.getTime();
        return aquariusEnd;
    }
    private Date piscesStart()//this is one day off so that it register on the exact day. for some reason it wouldnt.
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.FEBRUARY, 18);
        Date piscesStart = cal.getTime();
        return piscesStart;
    }
    private Date piscesEnd()
    {
        Date birthday = (Date) this.getIntent().getExtras().get("TheBirthDay");
        int birthdayYear = birthday.getYear() + 1900;
        Calendar cal = Calendar.getInstance();
        cal.set(birthdayYear, Calendar.MARCH, 20);
        Date piscesEnd = cal.getTime();
        return piscesEnd;
    }

}





