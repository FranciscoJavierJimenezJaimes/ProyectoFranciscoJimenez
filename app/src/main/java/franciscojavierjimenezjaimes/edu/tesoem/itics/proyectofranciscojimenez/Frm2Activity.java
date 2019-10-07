package franciscojavierjimenezjaimes.edu.tesoem.itics.proyectofranciscojimenez;

import androidx.appcompat.app.AppCompatActivity;
import  android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import  android.widget.TextView;

public class Frm2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm2);
    }

    public void Historia(View view) {
        Intent Historia = new Intent(this, Frm3Activity.class);
        startActivity(Historia);
        finish();

    }

    public void Android1(View view) {
        Intent Android1 = new Intent(this, Frm4Activity.class);
        startActivity(Android1);
        finish();
    }

    public void Android1_5(View view) {
        Intent Android1_5 = new Intent(this, Frm6Activity.class);
        startActivity(Android1_5);
        finish();
    }

    public void Android1_6(View view) {
        Intent Android1_6 = new Intent(this, Frm7Activity.class);
        startActivity(Android1_6);
        finish();
    }

    public void Android2_0(View view) {
        Intent Android2_0 = new Intent(this, Frm9Activity.class);
        startActivity(Android2_0);
        finish();
    }

    public void Android2_2(View view) {
        Intent Android2_2 = new Intent(this, Frm11Activity.class);
        startActivity(Android2_2);
        finish();
    }
    public void Android2_3(View view) {
        Intent Android2_3= new Intent(this, Frm12Activity.class);
        startActivity(Android2_3);
        finish();
    }
    public void Android3(View view) {
        Intent Android3= new Intent(this, Frm15Activity.class);
        startActivity(Android3);
        finish();
    }
    public void Android4(View view) {
        Intent Android4= new Intent(this, Frm18Activity.class);
        startActivity(Android4);
        finish();
    }
    public void Android41(View view) {
        Intent Android41= new Intent(this, Frm21Activity.class);
        startActivity(Android41);
        finish();
    }
    public void Android44(View view) {
        Intent Android44= new Intent(this, Frm23Activity.class);
        startActivity(Android44);
        finish();
    }
    public void Android5(View view) {
        Intent Android5= new Intent(this, Frm25Activity.class);
        startActivity(Android5);
        finish();
    }
    public void Android6(View view) {
        Intent Android6 = new Intent(this, Frm27Activity.class);
        startActivity(Android6);
        finish();
    }
    public void Android7(View view) {
        Intent Android7= new Intent(this, Frm29Activity.class);
        startActivity(Android7);
        finish();
    }
    public void Android8(View view) {
        Intent Android8= new Intent(this, Frm31Activity.class);
        startActivity(Android8);
        finish();
    }
}
