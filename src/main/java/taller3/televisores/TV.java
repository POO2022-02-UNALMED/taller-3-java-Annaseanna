package taller3.televisores;

public class TV {
    private static int numTv;
    private Marca marca;
    private Control control;
    private int canal;
    private int precio;
    boolean estado;
    private int volumen;

    //constructor
    public TV(Marca marca,boolean estado){
        this.marca=marca;
        this.estado=estado;
        canal=1;
        volumen=1;
        precio=500;
        numTv++;
    }
    //getters
    public Marca getMarca(){
        return marca;
    }
    public Control getControl(){
        return control;
    }
    public int getPrecio(){
        return precio;
    }
    public int getVolumen(){
        return volumen;
    }
    public int getCanal(){
        return canal;
    }
    public boolean getEstado(){
        return estado;
    }
    //setters
    public void setMarca(Marca marca){
        this.marca=marca;
    }
    public void setControl(Control control){
        this.control=control;
    }
    public void setPrecio(int precio){
        this.precio=precio;
    }
    public void setVolumen(int volumen){
        this.volumen=volumen;
    }
    public void setCanal(int canal){
        if(canal>=1 && canal<=120 && estado==true) {
            this.canal = canal;
        }
    }
    public static void setNumTV(int numTV) {
        TV.numTv = numTV;
    }
    //metodos
    public static int getNumTv(){
        return numTv;
    }
    public void turnOn(){
        estado=true;
    }
    public void turnOff(){
        estado=false;
    }
    public void canalUp(){
        if (canal<120 && estado ==true){
            canal++;
        }
        else {
            System.out.println("No hay mas canales");
        }
    }
    public void canalDown(){
        if (canal<120 && estado ==true){
            canal--;
        }
        else {
            System.out.println("No hay mas canales");
        }
    }
    public void volumenUp(){
        if (volumen<7 && estado ==true){
            volumen++;
        }
        else {
            System.out.println("Llego al tope min o max de volumen");
        }
    }
    public void volumenDown(){
        if (volumen<7 && estado ==true){
            volumen--;
        }
        else {
            System.out.println("Llego al tope min o max de volumen");
        }
    }

}
