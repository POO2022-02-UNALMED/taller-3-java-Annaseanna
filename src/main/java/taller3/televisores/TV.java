package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    boolean estado;
    private int volumen = 1;
    private Control control;

    private static int numTV = 0;

    public TV(Marca marca, boolean estado) {
        this.setMarca(marca);
        this.estado = estado;
        numTV++;
    }

    public void volumenUp() {
        if (volumen < 7 && estado) {
            volumen++;
        }
    }

    public void volumenDown() {
        if (volumen > 0 && estado) {
            volumen--;
        }
    }

    public void canalUp() {
        if (canal < 120 && estado==true) {
            canal++;
        }
    }

    public void canalDown() {
        if (canal > 1 && estado==true) {
            canal--;
        }
    }

    public void turnOn() {
        estado = true;
    }

    public void turnOff() {
        estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal < 120 && canal >= 1 && estado) {
            this.canal = canal;
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if (volumen <= 7 && volumen >= 0 && estado) {
            this.volumen = volumen;
        }
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }
}
