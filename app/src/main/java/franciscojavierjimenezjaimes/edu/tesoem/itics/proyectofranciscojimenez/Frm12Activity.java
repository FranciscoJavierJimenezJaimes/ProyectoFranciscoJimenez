package franciscojavierjimenezjaimes.edu.tesoem.itics.proyectofranciscojimenez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Frm12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm12);
    }
    public void nexuss(View view) {
        Intent nexuss= new Intent(this, Frm13Activity.class);
        startActivity(nexuss);
        finish();
    }
    public void back(View view) {
        Intent back= new Intent(this, Frm2Activity.class);
        startActivity(back);
        finish();
    }
    public void easteregg(View view) {
        Intent erasteregg = new Intent(this, Frm14Activity.class);
        startActivity(erasteregg);
        finish();
    }
}
