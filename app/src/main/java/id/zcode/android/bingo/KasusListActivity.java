package id.zcode.android.bingo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import id.zcode.android.bingo.adapter.KasusAdapter;
import id.zcode.android.bingo.model.Kasus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KasusListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KasusAdapter adapter;
    private List<Kasus> kasuses = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kasus_list);

        //init view
        adapter = new KasusAdapter(kasuses);
        recyclerView = findViewById(R.id.recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);

        initData();
    }

    private void initData() {
        for (int i = 0; i < 20; i++) {
            kasuses.add(new Kasus("Kasus ke-" + (i + 1), new Date()));
        }
        adapter.notifyDataSetChanged();
    }
}
