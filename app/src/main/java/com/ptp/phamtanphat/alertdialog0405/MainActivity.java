package com.ptp.phamtanphat.alertdialog0405;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtThongbao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtThongbao = findViewById(R.id.textview);

        txtThongbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder hopthoai = new AlertDialog.Builder(MainActivity.this);
                hopthoai.setTitle("Ban co muon xoa khong?");
                hopthoai.setMessage("Xac nhan ben duoi");
                hopthoai.setIcon(R.mipmap.ic_launcher);

                hopthoai.setPositiveButton("Co", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                hopthoai.setNegativeButton("Khong", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Ban da chon khong", Toast.LENGTH_SHORT).show();
                    }
                });
                hopthoai.setNeutralButton("Huy", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Ban da chon huy!!!", Toast.LENGTH_SHORT).show();
                    }
                });
                hopthoai.show();
            }
        });
    }

}
