package com.example.crowdhazard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class DataAdapter extends ArrayAdapter<CrowdInfo> {
    private Context context;
    private List<CrowdInfo> crowdInfos;

    public DataAdapter(Context context, List<CrowdInfo> crowdInfos) {
        super(context, 0, crowdInfos);
        this.context = context;
        this.crowdInfos = crowdInfos;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        CrowdInfo crowdInfo = crowdInfos.get(position);

        TextView typeTextView = convertView.findViewById(R.id.txttype);
        TextView descTextView = convertView.findViewById(R.id.txtdesc);
        TextView timeTextView = convertView.findViewById(R.id.txttime);

        typeTextView.setText(crowdInfo.getHazard_loc() + " - " +crowdInfo.getHazard_type());
        descTextView.setText(crowdInfo.getHazard_desc());
        timeTextView.setText(crowdInfo.getReport_timestamp());

        return convertView;
    }
}

