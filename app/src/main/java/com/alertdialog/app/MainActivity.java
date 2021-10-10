package com.alertdialog.app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Kode Menambahkan alert dialog ketika tombol back ditekan
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this);
        AlertDialog dialog = new AlertDialog.Builder(this, R.style.theme)
                .setTitle(R.string.app_name)
                .setMessage("apakah ingin keluar dari aplikasi ini?")
                .setIcon(R.drawable.icon_contoh)
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("Tidak", null)
                .show();
    }
}