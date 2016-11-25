package tjdevelops.poundperpound;

import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    public void askForString(int titleId) {
        StringInputDialogFragment frag = StringInputDialogFragment.newInstance(titleId);
        frag.show(getFragmentManager(), "dialog");
    }
}
