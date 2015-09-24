package test.zodiacsign.android.zodiacsign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Date;

public class BirthdayActivity extends AppCompatActivity {

    private Button showAgeBtn;
    private Button showSignBtn;
    private DatePicker datePicker;
    Birthday myBirthday = new Birthday();




    private Date updateSelectedDate(){
        Date selectedBirthday = new Date  (datePicker.getYear()- 1900,datePicker.getMonth(),datePicker.getDayOfMonth());
        myBirthday.BirthdayData(selectedBirthday);
        return myBirthday.getUsersBirthday();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showAgeBtn = (Button)findViewById(R.id.ageBtn);
        showSignBtn = (Button)findViewById(R.id.signBtn);
        datePicker = (DatePicker)findViewById(R.id.datePicker);

        showAgeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i = new Intent(BirthdayActivity.this, ShowAgeActivity.class);
                Date myDate = updateSelectedDate();
                i.putExtra("TheBirthDay",myDate);
                startActivity(i);


            }
        });

        showSignBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BirthdayActivity.this, ShowSignActivity.class);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
