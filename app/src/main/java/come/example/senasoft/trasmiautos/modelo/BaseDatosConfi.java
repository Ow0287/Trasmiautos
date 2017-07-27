package come.example.senasoft.trasmiautos.modelo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Senasoft on 26/07/2017.
 */

public class BaseDatosConfi extends SQLiteOpenHelper{
    String crearTablaUsuarios="create table usuarios(nombre text,fechaNac,text,correo text,fechaExp text)   ";
    String crearTablaAutos="create table autos(marca text,color text,placa text,ciudad text,modelo text)   ";
    String crearTablaImpuestos="create table impuestos(ciudad text,mes text,numI text,numF text,anio text)   ";

    public BaseDatosConfi(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    sqLiteDatabase.execSQL(crearTablaUsuarios);
      sqLiteDatabase.execSQL(crearTablaAutos);
        sqLiteDatabase.execSQL(crearTablaImpuestos);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists usuarios");
        sqLiteDatabase.execSQL(crearTablaUsuarios);
        sqLiteDatabase.execSQL("drop table if exists autos");
        sqLiteDatabase.execSQL(crearTablaAutos);
        sqLiteDatabase.execSQL("drop table if exists impuestos");
        sqLiteDatabase.execSQL(crearTablaImpuestos);

    }
}
