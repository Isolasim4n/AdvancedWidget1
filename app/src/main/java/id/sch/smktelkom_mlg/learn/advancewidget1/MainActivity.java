package id.sch.smktelkom_mlg.learn.advancewidget1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout lMain = (LinearLayout) findViewById(R.id.LinearLayoutMain);
        final EditText etNama = new EditText(this);
        lMain.addView(etNama);
        etNama.setHint("Ketikkan Nama Anak");

        final EditText etUmur = new EditText(this);
        lMain.addView(etUmur);
        etUmur.setHint("Ketikkan Umur Anak");
        etUmur.setInputType(InputType.TYPE_CLASS_NUMBER);

        Button bProses = new Button(this);
        bProses.setText("Proses");
        lMain.addView(bProses);
        final TextView tvhasil = new TextView(this);
        lMain.addView(tvhasil);

        bProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = etNama.getText().toString();
                String umur = etUmur.getText().toString();

                tvhasil.setText(nama + " umur " + umur + " tahun");
            }
        });
    }
}
