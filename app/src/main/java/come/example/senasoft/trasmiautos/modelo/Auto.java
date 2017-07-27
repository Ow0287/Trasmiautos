package come.example.senasoft.trasmiautos.modelo;

import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Senasoft on 26/07/2017.
 */

public class Auto extends SugarRecord<Auto> {


    private String marca;
    private String color;
    private String placa;
    private String ciudad;
    private String modelo;
    private String fechaSoat;


    public Auto(String marca, String color, String placa, String ciudad, String modelo, String fechaSoat) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.ciudad = ciudad;
        this.modelo = modelo;
        this.fechaSoat = fechaSoat;

    }

    public String getMarca() {
        return marca;
    }

    public String getFechaSoat() {
        return fechaSoat;
    }

    public void setFechaSoat(String fechaSoat) {
        this.fechaSoat = fechaSoat;
    }

    public void setMarca(String marca) {
        this.marca = marca;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public Auto() {
    }


    public  void llenarAuto(ArrayList<Auto> lugares){
        for (int f=0;f<lugares.size();f++){
            Auto lu=lugares.get(f);
            lu.save();



        }


    }
    public Auto consultarTipoA(String nombre){
        List<Auto> lu= Auto.find(Auto.class,"nombre = ? ",nombre);

        return lu.get(0);
    }


    public List<Auto>  consultarTipoT(String marca){
        List<Auto> lu= Auto.find(Auto.class,"tipo = ?",marca);

        return lu;
    }


}
