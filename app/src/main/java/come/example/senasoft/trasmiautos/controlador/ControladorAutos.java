package come.example.senasoft.trasmiautos.controlador;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import come.example.senasoft.trasmiautos.modelo.Auto;
import come.example.senasoft.trasmiautos.modelo.BaseDatosConfi;

/**
 * Created by Senasoft on 26/07/2017.
 */

public class ControladorAutos {
    Context context;
    BaseDatosConfi base;
    SQLiteDatabase db;
    Auto auto;

    public ControladorAutos(Context context) {
        this.context = context;
        base=   new BaseDatosConfi(context, "tramiautos", null, 1);
        db=base.getWritableDatabase();
    }


    public void registrarAuto(Auto a){
        db= base.getWritableDatabase();
        String registro="insert into auto values('"+ a.getMarca()+"','"+a.getColor()+"','"+a.getPlaca()+"','"+a.getCiudad()+"' ,'"+a.getModelo()+"')";
        db.execSQL(registro);
        db.close();

    }
    public Auto consultarMarca(String marca){
        db= base.getWritableDatabase();
        String consultar="select * from autos where marca ='"+marca+"'";

        Cursor cursor=db.rawQuery(consultar,null);
        if (cursor.moveToFirst()){
            auto=new Auto(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5));
        }else {
            auto=null;
        }
        db.close();
        return auto;

    }


}
