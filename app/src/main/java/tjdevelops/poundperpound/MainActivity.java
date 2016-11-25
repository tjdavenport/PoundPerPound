package tjdevelops.poundperpound;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.DialogInterface;
import android.support.v7.widget.Toolbar;

public class MainActivity extends BaseActivity implements StringInputDialog {

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void onStringPositive(DialogInterface dialog) {

    }

    public void onStringNegative(DialogInterface dialog) {
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
        Toolbar main = (Toolbar) findViewById(R.id.toolbarMain);
        setSupportActionBar(main);
    }

}
