package edu.upc.eetac.dsa;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private List<Tracks> data;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView text;
        public TextView text2;
        public TextView text3;

        public ViewHolder(View v) {
            super(v);
            text = (TextView) v.findViewById(R.id.text_title);
            text2 = (TextView) v.findViewById(R.id.text_singer);
            text3 = (TextView) v.findViewById(R.id.text_id);
        }
    }
    public RecyclerViewAdapter(List<Tracks> data) {
        this.data = data;
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
        Tracks tracks = ((Tracks) data.get(position));
        holder.text.setText(tracks.title);
        holder.text2.setText(tracks.singer);
        holder.text3.setText(""+tracks.id);
        holder.itemView.setTag(""+tracks.id);
        //getText
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

}
