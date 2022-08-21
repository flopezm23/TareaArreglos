public class Taller {

    //private int correlativo;
    int correlativo;//lo agregué ahora
    Vehiculo [] carros;

    public Taller (){
        this.correlativo=correlativo;
    carros=new Vehiculo[5];
        correlativo=0;
    }

    public void agregarVehiculo(Vehiculo transporte){
        carros[correlativo]=transporte;
        System.out.println("Se agrego el carro "+carros[correlativo].getPlaca());
        correlativo++;
    }

    public void mostrar(){
        System.out.println(carros.length);
        for(int cuenta=0;cuenta<1;cuenta++) {
            System.out.println(carros[cuenta].getMarca() + carros[cuenta].getPlaca() + carros[cuenta].getModelo() + carros[cuenta].getProblema() + carros[cuenta].getCosto());
        }
    }

    public void eliminar(int cuenta){

        carros  [cuenta] = new Vehiculo("","","",0,0);
    }




}
