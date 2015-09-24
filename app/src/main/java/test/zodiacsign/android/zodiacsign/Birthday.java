package test.zodiacsign.android.zodiacsign;

import java.util.Date;

/**
 * Created by Randal on 9/22/2015.
 */
public class Birthday {
    private Date usersBirthday;


    public void BirthdayData(Date usersSelectedBirthday) {
        this.setUsersBirthday(usersSelectedBirthday);

    }

    public Date getUsersBirthday(){
        return usersBirthday;
    }


    public void setUsersBirthday(Date usersBirthday) {
        this.usersBirthday = usersBirthday;
    }


}
