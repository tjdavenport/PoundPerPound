package tjdevelops.poundperpound;

import android.os.Bundle;
import android.app.Dialog;
import android.app.DialogFragment;
import android.view.LayoutInflater;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;

/**
 * Created by torrance on 11/23/16.
 */

public class StringInputDialogFragment extends DialogFragment {

    public static StringInputDialogFragment newInstance(int titleId) {
        StringInputDialogFragment frag = new StringInputDialogFragment();
        Bundle args = new Bundle();
        args.putInt("title", titleId);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Builder builder = new Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();

        builder.setView(inflater.inflate(R.layout.dialog_string_prompt, null));
        builder.setTitle(getArguments().getInt("title"));
        builder.setPositiveButton(R.string.done, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                ((StringInputDialog)getActivity()).onStringPositive(dialog);
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                ((StringInputDialog)getActivity()).onStringNegative(dialog);
            }
        });
        return builder.create();
    }

}
