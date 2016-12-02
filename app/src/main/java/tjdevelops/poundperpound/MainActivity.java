package tjdevelops.poundperpound;

import java.util.List;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;
import android.view.MenuItem;
import android.widget.ListView;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.Toolbar;
import tjdevelops.poundperpound.record.Profile;
import tjdevelops.poundperpound.ProfileArrayAdapter;

public class MainActivity extends BaseActivity implements StringInputDialog {

    Toolbar mainToolbar;
    ListView profileListView;
    ProfileArrayAdapter profileAdapter;

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void onStringPositive(DialogInterface dialog, String input) {
        Profile profile = new Profile(input);
        profile.save();
        this.profileAdapter.add(profile);
        Context appContext = getApplicationContext();
        Toast.makeText(appContext, R.string.feedback_profile_created, Toast.LENGTH_SHORT).show();
    }

    public void onStringNegative(DialogInterface dialog, String input) {
        dialog.cancel();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemCreateProfile:
                askForString(R.string.prompt_profile_name);
                return true;
            default:
                return true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mainToolbar = (Toolbar) findViewById(R.id.toolbarMain);
        this.profileListView = (ListView) findViewById(R.id.profileList);
        setSupportActionBar(this.mainToolbar);
        List<Profile> profileList = Profile.listAll(Profile.class);
        this.profileAdapter = new ProfileArrayAdapter(this, android.R.layout.simple_selectable_list_item, profileList);
        this.profileListView.setAdapter(this.profileAdapter);
    }

}
