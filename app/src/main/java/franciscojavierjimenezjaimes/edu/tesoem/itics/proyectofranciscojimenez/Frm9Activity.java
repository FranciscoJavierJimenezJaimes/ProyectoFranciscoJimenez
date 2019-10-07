package franciscojavierjimenezjaimes.edu.tesoem.itics.proyectofranciscojimenez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Frm9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm9);
    }
    public void nexus(View view) {
        Intent nexus = new Intent(this, Frm10Activity.class);
        startActivity(nexus);
        finish();
    }
    public void back(View view) {
        Intent back = new Intent(this, Frm2Activity.class);
        startActivity(back);
        finish();
    }
}
