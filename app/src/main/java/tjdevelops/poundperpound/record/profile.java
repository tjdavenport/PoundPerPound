package tjdevelops.poundperpound.record;

import com.orm.SugarRecord;

/**
 * Created by torrance on 11/27/16.
 */

public class Profile extends SugarRecord {

    String name;

    public Profile() {

    }

    public Profile(String name) {
        this.name = name;
    }

}
