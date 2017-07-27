package come.example.senasoft.trasmiautos.vista;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import come.example.senasoft.trasmiautos.R;
import come.example.senasoft.trasmiautos.controlador.ControladorAutos;
import come.example.senasoft.trasmiautos.controlador.ControladorUsuario;
import come.example.senasoft.trasmiautos.modelo.Auto;
import come.example.senasoft.trasmiautos.modelo.BaseDatosConfi;
import come.example.senasoft.trasmiautos.modelo.Usuario;

public class MainActivity extends AppCompatActivity {
    Usuario usu;
    SQLiteDatabase db;
    ControladorAutos controladorAutos;
    BaseDatosConfi base;
    String nombreUsu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        base=   new BaseDatosConfi(this, "tramiautos", null, 1);
        db=base.getWritableDatabase();
        controladorAutos=new ControladorAutos(this);



    ArrayList<Auto> autos= new ArrayList<>() ;

        if (controladorAutos.consultarMarca("Audi").size()==0;
         {


        //Registro autos:

        autos.add(new Auto("", "", "", "","",""));





        controladorAutos.registrarAuto(autos);

    }




    public void registro(View v){


        Intent intent = new Intent(MainActivity.this, Perfil.class);
        startActivity(intent);
        finish();

    }





}
