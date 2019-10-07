package franciscojavierjimenezjaimes.edu.tesoem.itics.proyectofranciscojimenez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Frm27Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm27);
    }
    public void back(View view) {
        Intent back= new Intent(this, Frm2Activity.class);
        startActivity(back);
        finish();
    }
    public void east8 (View view) {
        Intent east8= new Intent(this, Frm28Activity.class);
        startActivity(east8);
        finish();
    }
}
