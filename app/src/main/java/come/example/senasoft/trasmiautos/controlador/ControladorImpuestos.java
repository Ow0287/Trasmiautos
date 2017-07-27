package come.example.senasoft.trasmiautos.controlador;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import come.example.senasoft.trasmiautos.modelo.Auto;
import come.example.senasoft.trasmiautos.modelo.BaseDatosConfi;
import come.example.senasoft.trasmiautos.modelo.Impuestos;

/**
 * Created by Senasoft on 26/07/2017.
 */

public class ControladorImpuestos {

     private Context context;
     private BaseDatosConfi base;
    private  SQLiteDatabase db;


    public ControladorImpuestos(Context context) {
        this.context = context;
        base=   new BaseDatosConfi(context, "tramiautos", null, 1);
        db=base.getWritableDatabase();
    }
    public void registrarImpuesto(Impuestos i){
        db= base.getWritableDatabase();
        String registro="insert into impuesto values('"+ i.getCiudad()+"','"+i.getMes()+"','"+i.getNumIni()+"','"+i.getNumFi()+"' ,'"+i.getAño()+"')";
        db.execSQL(registro);
        db.close();

    }



}
