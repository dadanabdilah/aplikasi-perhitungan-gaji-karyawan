package universitaskuningan.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int gajiStatus, gajiGologan;
    RadioGroup golongan;
    CheckBox status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hitung (View v){
        EditText nama = (EditText) findViewById(R.id.nama);
        TextView outputNama = (TextView) findViewById(R.id.outputNama);
        String name = nama.getText().toString();
        outputNama.setText("Total Gasji Anda " + name);

        status = (CheckBox) findViewById(R.id.menikah);
        if(status.isChecked()){
            gajiStatus = 500000;
        } else {
            gajiStatus = 0;
        }

        golongan = (RadioGroup) findViewById(R.id.rgGolongan);
        int gol = golongan.getCheckedRadioButtonId();
        if(gol == R.id.rbGolongan1){
            gajiGologan = 1000000;
        } else if(gol == R.id.rbGolongan2) {
            gajiGologan = 2000000;
        }

        int totalGaji = gajiStatus+gajiGologan;
        TextView total = (TextView) findViewById (R.id.outputGaji);
        total.setText(String.valueOf(totalGaji));
    }
}
