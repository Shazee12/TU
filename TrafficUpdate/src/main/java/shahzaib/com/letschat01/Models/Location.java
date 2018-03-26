package shahzaib.com.letschat01.Models;

import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;

/**
 * Created by mac on 27/01/2018.
 */
@IgnoreExtraProperties
public class Location implements Serializable {
    public double lat = 00.00;
    public double lng = 00.00;
    public Location()
    {}
}
