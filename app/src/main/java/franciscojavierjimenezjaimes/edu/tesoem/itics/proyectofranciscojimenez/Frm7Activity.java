package franciscojavierjimenezjaimes.edu.tesoem.itics.proyectofranciscojimenez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Frm7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm7);
    }
    public void back(View view) {
        Intent back = new Intent(this, Frm2Activity.class);
        startActivity(back);
    }
    public void sig(View view) {
        Intent sig = new Intent(this, Frm8Activity.class);
        startActivity(sig);
    }
}
