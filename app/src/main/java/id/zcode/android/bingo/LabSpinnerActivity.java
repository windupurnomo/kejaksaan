package id.zcode.android.bingo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class LabSpinnerActivity extends AppCompatActivity {

    private String[] data = {"Pidana Umum", "Pidana Khusus", "Perdata"};
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_spinner);

        // initial view
        spinner = findViewById(R.id.spinner);
        ArrayAdapter adapter =
                new ArrayAdapter(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
