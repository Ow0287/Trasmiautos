package come.example.senasoft.trasmiautos.modelo;

/**
 * Created by Senasoft on 26/07/2017.
 */

public class Impuestos {
    private  String ciudad;
    private  String mes;
    private  String numIni;
    private  String numFi;
    private  String año;

    public Impuestos(String ciudad, String mes, String numIni, String numFi, String año) {
        this.ciudad = ciudad;
        this.mes = mes;
        this.numIni = numIni;
        this.numFi = numFi;
        this.año = año;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getNumIni() {
        return numIni;
    }

    public void setNumIni(String numIni) {
        this.numIni = numIni;
    }

    public String getNumFi() {
        return numFi;
    }

    public void setNumFi(String numFi) {
        this.numFi = numFi;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }
}
