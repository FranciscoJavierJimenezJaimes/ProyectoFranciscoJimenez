package franciscojavierjimenezjaimes.edu.tesoem.itics.proyectofranciscojimenez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Frm18Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm18);
    }
    public void back(View view) {
        Intent back= new Intent(this, Frm2Activity.class);
        startActivity(back);
        finish();
    }
    public void samsung(View view) {
        Intent samsung= new Intent(this, Frm19Activity.class);
        startActivity(samsung);
        finish();
    }
    public void east4(View view) {
        Intent east4= new Intent(this, Frm20Activity.class);
        startActivity(east4);
        finish();
    }
}
