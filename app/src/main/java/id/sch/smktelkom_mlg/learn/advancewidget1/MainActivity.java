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
        final LinearLayout lMain = (LinearLayout) findViewById(R.id.LinearLayoutMain);

        addEditText(lMain);
        


        Button bProses = new Button(this);
        bProses.setText("Proses");
        lMain.addView(bProses);
        final TextView tvhasil = new TextView(this);
        lMain.addView(tvhasil);

        bProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doProses(lMain);
            }
        });
    }

    private void doProses(LinearLayout lMain) {
        String hasil = "";
        for (int i = 1; i <= 5; i++) {
            EditText etNama = (EditText) lMain.getChildAt(0);
            EditText etUmur = (EditText) lMain.getChildAt(1);

            String nama = etNama.getText().toString();
            String umur = etUmur.getText().toString();

            if (umur.isEmpty())
                umur = "0";
            if (!nama.isEmpty())
                hasil += "Anak ke-" + (i) + ": " + nama + " Umur " + umur + " tahun\n";
        }

        TextView tvhasil = (TextView) lMain.getChildAt(11);
        tvhasil.setText(hasil);
    }

    private void addEditText(LinearLayout lMain) {
        for (int i = 1; i <= 5; i++) {
            final EditText etNama = new EditText(this);
            lMain.addView(etNama);
            etNama.setHint("Ketikkan Nama Anak" + i);

            final EditText etUmur = new EditText(this);
            lMain.addView(etUmur);
            etUmur.setHint("Ketikkan Umur Anak" + i);
            etUmur.setInputType(InputType.TYPE_CLASS_NUMBER);
        }
    }
}
