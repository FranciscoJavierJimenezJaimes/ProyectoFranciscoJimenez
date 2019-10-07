package franciscojavierjimenezjaimes.edu.tesoem.itics.proyectofranciscojimenez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Frm4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm4);
    }
    public void mercadovista(View view) {
        Intent mercadovista = new Intent(this, Frm5Activity.class);
        startActivity(mercadovista);
    }
    public void back(View view) {
        Intent back = new Intent(this, Frm2Activity.class);
        startActivity(back);
    }
}
