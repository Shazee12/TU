package shahzaib.com.letschat01.Models;

import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;

/**
 * Created by mac on 27/01/2018.
 */
@IgnoreExtraProperties
public class Profile implements Serializable {

    public String avatar = "N/A";
    public String name = "Name";
    public String gender = "Select Gender";
    public String status = "Status";

    public Profile()
    {
    }


    @Override
    public String toString() {
        return name;
    }
}
