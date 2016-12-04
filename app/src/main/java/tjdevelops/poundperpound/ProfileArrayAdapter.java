package tjdevelops.poundperpound;

import java.util.List;
import android.view.View;
import android.content.Intent;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.view.View.OnClickListener;
import tjdevelops.poundperpound.record.Profile;
import tjdevelops.poundperpound.JournalActivity;

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
        this.bindClickListener(profileLabel, profile);
        profileLabel.setText(profile.getName());
        profileLabel.setWidth(parent.getWidth());

        return convertView;
    }

    private void bindClickListener(View itemView, final Profile profile) {
        final Context parentContext = this.context;

        itemView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(parentContext, JournalActivity.class);
                intent.putExtra(Profile.KEY_ID, profile.getId());
                parentContext.startActivity(intent);
            }
        });
    }

}
