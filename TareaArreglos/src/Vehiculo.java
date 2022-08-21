public class Vehiculo {

    public String title;
    String placa;
    String marca;
    String problema;
    int modelo;
    double costo;

    //inicializacion
    public Vehiculo(){
        this.placa=" ";
        this.marca=" ";
        this.problema="";
        this.modelo=0;
        this.costo=0;
    }
    //Constructor
    public Vehiculo(String placa, String marca, String problema, int modelo, double costo){
        this.placa=placa;
        this.marca=marca;
        this.problema=problema;
        this.modelo=modelo;
        this.costo=costo;
    }
    //Get
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getProblema() {
        return problema;
    }

    public int getModelo() {
        return modelo;
    }

    public double getCosto() {
        return costo;
    }
    //SET
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }



}
