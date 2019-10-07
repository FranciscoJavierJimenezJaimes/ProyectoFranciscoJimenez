package franciscojavierjimenezjaimes.edu.tesoem.itics.proyectofranciscojimenez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Frm15Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm15);
    }
    public void moto(View view) {
        Intent moto = new Intent(this, Frm16Activity.class);
        startActivity(moto);
        finish();
    }
public void back(View view) {
        Intent back = new Intent(this, Frm2Activity.class);
        startActivity(back);
        finish();
    }
    public void aeasteregg3(View view) {
        Intent aesteregg3= new Intent(this, Frm17Activity.class);
        startActivity(aesteregg3);
        finish();
    }
}