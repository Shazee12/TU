package shahzaib.com.letschat01.Models;

import java.io.Serializable;

/**
 * Created by mac on 27/01/2018.
 */

public class User implements Serializable {
    public Profile profile = new Profile();
    public String uid;
    public boolean online = true;
    public Location location = new Location();

    @Override
    public String toString() {
        return profile.name;
    }
}
