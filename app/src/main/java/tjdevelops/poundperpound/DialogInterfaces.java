package tjdevelops.poundperpound;

import android.content.DialogInterface;

/**
 * Created by torrance on 11/23/16.
 */

interface StringInputDialog {
    public void onStringPositive(DialogInterface dialogInterface, String input);
    public void onStringNegative(DialogInterface dialogInterface, String input);
}
