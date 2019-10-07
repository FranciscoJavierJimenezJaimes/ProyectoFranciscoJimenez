package franciscojavierjimenezjaimes.edu.tesoem.itics.proyectofranciscojimenez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Frm21Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm21);
    }
    public void back(View view) {
        Intent back= new Intent(this, Frm2Activity.class);
        startActivity(back);
        finish();
    }
    public void east41(View view) {
        Intent east41= new Intent(this, Frm22Activity.class);
        startActivity(east41);
        finish();
    }
}
