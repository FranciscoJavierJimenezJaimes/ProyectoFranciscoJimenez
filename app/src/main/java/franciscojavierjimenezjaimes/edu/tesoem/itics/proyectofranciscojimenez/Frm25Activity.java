package franciscojavierjimenezjaimes.edu.tesoem.itics.proyectofranciscojimenez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Frm25Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm25);
    }
    public void back(View view) {
        Intent back= new Intent(this, Frm2Activity.class);
        startActivity(back);
        finish();
    }
    public void east5(View view) {
        Intent east5= new Intent(this, Frm26Activity.class);
        startActivity(east5);
        finish();
    }
}
