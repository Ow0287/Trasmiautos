package come.example.senasoft.trasmiautos.vista;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import come.example.senasoft.trasmiautos.R;
import come.example.senasoft.trasmiautos.controlador.ControladorUsuario;
import come.example.senasoft.trasmiautos.modelo.BaseDatosConfi;
import come.example.senasoft.trasmiautos.modelo.Usuario;

public class Registro extends AppCompatActivity {
    EditText nombre,fecha,correo,expedicion;
    String nombreU,fechaU,correoU,expedicionU;
    Usuario usuario;
    ControladorUsuario controladorUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        nombre=(EditText)findViewById(R.id.nombre_completo);
        fecha=(EditText)findViewById(R.id.fecha_de_nacimiento);
        correo= (EditText)findViewById(R.id.correo_electronico);
        expedicion=(EditText)findViewById(R.id.vencimiento);
        controladorUsuario=new ControladorUsuario(this);
    }

    public void regisUsu(View v) {
       nombreU=nombre.getText().toString();
        fechaU=fecha.getText().toString();
        correoU=correo.getText().toString();
        expedicionU=expedicion.getText().toString();
        usuario=new Usuario(nombreU,fechaU,correoU,expedicionU);
        controladorUsuario.registrarUsuario(usuario);


    }
}
