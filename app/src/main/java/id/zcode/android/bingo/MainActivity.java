package id.zcode.android.bingo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private List<Map> users = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDataUsers();
    }

    private void initDataUsers() {
        Map u1 = new HashMap();
        u1.put("email", "windu@gmail.com");
        u1.put("password", "abcdef");

        Map u2 = new HashMap();
        u2.put("email", "zara@gmail.com");
        u2.put("password", "abcdef");

        users.add(u1);
        users.add(u2);
    }

    public void onLogin(View view) {
        // ambil text dari EditText
        EditText etEmail = findViewById(R.id.et_email);
        String email = etEmail.getText().toString();

        EditText etPassword = findViewById(R.id.et_password);
        String password = etPassword.getText().toString();

        // bandingkan data dari EditText dengan data yang sudah kita siapkan
        Map user = null;
        for (Map u : users) {
            String e = (String) u.get("email");
            if (e.equals(email)) {
                user = u;
                break;
            }
        }

        // evaluasi apakah data nya valid atau tidak
        if (user != null) {
            // cek apakah password nya benar
            if (password.equals((String) user.get("password"))) {
                // klo valid pindah ke activity home
                Intent intent = new Intent(this, ForgotPasswordActivity.class);
                startActivity(intent);
            } else {
                // klo tidak valid tampilkan pesan error
                Toast.makeText(this, "Password salah", Toast.LENGTH_SHORT).show();
            }
        } else {
            // klo tidak valid tampilkan pesan error
            Toast.makeText(this, "Email tidak ditemukan", Toast.LENGTH_SHORT).show();
        }
    }

    public void onForgot(View view) {
        Intent intent = new Intent(this, ForgotPasswordActivity.class);
        startActivity(intent);
    }

    public void onRegister(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
