package come.example.senasoft.trasmiautos.vista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import come.example.senasoft.trasmiautos.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void registro(View v){

        Intent intent =new Intent(MainActivity.this,Perfil.class);
        startActivity(intent);
        finish();
    }
}
