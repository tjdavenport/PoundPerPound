package tjdevelops.poundperpound;

import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import tjdevelops.poundperpound.record.Profile;

/**
 * Created by torrance on 11/29/16.
 */

public class ProfileArrayAdapter extends ArrayAdapter<Profile> {

    int layoutId;
    Context context;

    public ProfileArrayAdapter(Context context, int layoutId, List<Profile> data) {
        super(context, layoutId, data);
        this.context = context;
        this.layoutId = layoutId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Profile profile = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(this.layoutId, parent, false);
        }

        TextView profileLabel = (TextView) convertView.findViewById(android.R.id.text1);
        profileLabel.setText(profile.getName());
        profileLabel.setWidth(parent.getWidth());

        return convertView;
    }

}
