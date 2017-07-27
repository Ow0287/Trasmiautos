package come.example.senasoft.trasmiautos.controlador;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import come.example.senasoft.trasmiautos.modelo.Auto;
import come.example.senasoft.trasmiautos.modelo.BaseDatosConfi;
import come.example.senasoft.trasmiautos.modelo.Impuestos;
import come.example.senasoft.trasmiautos.modelo.Usuario;

/**
 * Created by Senasoft on 26/07/2017.
 */

public class ControladorUsuario {

    private Context context;
    private BaseDatosConfi base;
    private SQLiteDatabase db;
     Usuario u;

    public ControladorUsuario(Context context) {
        this.context = context;
        base=   new BaseDatosConfi(context, "tramiautos", null, 1);
        db=base.getWritableDatabase();
    }
    public void validarUsuario(String nombre){
        db= base.getWritableDatabase();
        String validar="select * from usuarios where nombre=  '"+nombre+"' ";
        db.execSQL(validar);
        if (nombre==""){
            Toast.makeText(context, "No ingreso Datos", Toast.LENGTH_SHORT).show();
        }else  if (nombre==u.getNombre()){
            Toast.makeText(context, "Este Nombre ya Existe en Nuestra Base de Datos", Toast.LENGTH_SHORT).show();
        }
        db.close();

    }
    public String validar(String nombre){
        String usua = "";
        db= base.getWritableDatabase();
        String validar="select * from usuarios where nombre=  '"+nombre+"' ";
        db.execSQL(validar);
        db.close();
        return usua;
        }
    public void registrarUsuario(Usuario u){
        db= base.getWritableDatabase();
        String registro="insert into usuarios values('"+ u.getNombre()+"','"+u.getFechaNa()+"','"+u.getCorreo()+"','"+u.getFechaExpedicion()+"' )";
        db.execSQL(registro);
        db.close();

    }


    }



