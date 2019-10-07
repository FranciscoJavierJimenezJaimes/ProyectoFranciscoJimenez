package franciscojavierjimenezjaimes.edu.tesoem.itics.proyectofranciscojimenez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Frm31Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm31);
    }
    public void back(View view) {
        Intent back= new Intent(this, Frm2Activity.class);
        startActivity(back);
        finish();
    }
    public void eastereggandroid8(View view) {
        Intent eastereggandroid8= new Intent(this, Frm32Activity.class);
        startActivity(eastereggandroid8);
        finish();
    }
}
