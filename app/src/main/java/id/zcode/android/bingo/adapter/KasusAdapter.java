package id.zcode.android.bingo.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import id.zcode.android.bingo.R;
import id.zcode.android.bingo.model.Kasus;

import java.util.ArrayList;
import java.util.List;

public class KasusAdapter extends RecyclerView.Adapter<KasusAdapter.KasusViewHolder> {
    List<Kasus> kasuses = new ArrayList<>();

    public KasusAdapter(List<Kasus> kasuses) {
        this.kasuses = kasuses;
    }

    @NonNull
    @Override
    public KasusViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_kasus, viewGroup, false);
        return new KasusViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KasusViewHolder kasusViewHolder, int i) {
        Kasus kasus = kasuses.get(i);
        kasusViewHolder.tvName.setText(kasus.name);
        kasusViewHolder.tvDate.setText("tanggal");
    }

    @Override
    public int getItemCount() {
        return kasuses.size();
    }

    public class KasusViewHolder extends RecyclerView.ViewHolder {
        public TextView tvName, tvDate;

        public KasusViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            tvDate = itemView.findViewById(R.id.tv_date);
        }
    }
}
