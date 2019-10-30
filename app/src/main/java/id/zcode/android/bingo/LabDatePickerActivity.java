package id.zcode.android.bingo;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class LabDatePickerActivity extends AppCompatActivity
        implements DatePickerDialog.OnDateSetListener {

    private DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_date_picker);

        // init view
        datePickerDialog = new DatePickerDialog(this);
        datePickerDialog.setOnDateSetListener(this);
    }

    public void showDatePicker(View view) {
        datePickerDialog.show();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String message = "Tanggal yang dipilih: " + dayOfMonth + "/" + (month + 1) + "/" + year;
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }
}
