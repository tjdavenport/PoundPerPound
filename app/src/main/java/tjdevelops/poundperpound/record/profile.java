package tjdevelops.poundperpound.record;

import com.orm.SugarRecord;

/**
 * Created by torrance on 11/27/16.
 */

public class Profile extends SugarRecord {

    String name;
    public static final String KEY_ID = "profile_id";

    public Profile() {

    }

    public Profile(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
