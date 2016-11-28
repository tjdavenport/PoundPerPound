package tjdevelops.poundperpound.record;

import com.orm.dsl.Table;
import com.orm.SugarRecord;

/**
 * Created by torrance on 11/27/16.
 */

@Table
public class Profile extends SugarRecord {

    String name;
    private Long id;

    public Profile(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

}
