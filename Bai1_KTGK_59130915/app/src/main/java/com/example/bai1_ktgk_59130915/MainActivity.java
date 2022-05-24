package com.example.bai1_ktgk_59130915;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Hàm xử lý
    void Xuly_DienTich(View v){
        EditText dk_soA = (EditText) findViewById(R.id.edtA);
        int soA = Integer.parseInt(dk_soA.getText().toString());
        EditText dk_soB = (EditText) findViewById(R.id.edtB);
        int soB = Integer.parseInt(dk_soB.getText().toString());
        EditText dk_soH = (EditText) findViewById(R.id.edtH);
        int soH = Integer.parseInt(dk_soH.getText().toString());
        int KetQua = soA * soH;
        TextView dk_KQ = (TextView) findViewById(R.id.tvResult);
        dk_KQ.setText(String.valueOf(KetQua));
    }
    void Xuly_ChuVi(View v) {
        EditText dk_soA = (EditText) findViewById(R.id.edtA);
        int soA = Integer.parseInt(dk_soA.getText().toString());
        EditText dk_soB = (EditText) findViewById(R.id.edtB);
        int soB = Integer.parseInt(dk_soB.getText().toString());
        int KetQua = 2 * (soA + soB);
        TextView dk_KQ = (TextView) findViewById(R.id.tvResult);
        dk_KQ.setText(String.valueOf(KetQua));
    }
}