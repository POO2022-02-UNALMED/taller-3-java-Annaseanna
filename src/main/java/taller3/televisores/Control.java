package taller3.televisores;

public class Control {
    TV tv;
    //constructor
    public Control (TV tv){
        this.tv=tv;
        tv.setControl(this);
    }
    //metodos
    public void turnOn(){
        tv.turnOn();
    }
    public void turnOff(){
        tv.turnOff();
    }
    public void canalUp(){
        tv.canalUp();
    }
    public void canalDown(){
        tv.canalDown();
    }
    public void volumenUp(){
        tv.volumenUp();
    }
    public void volumenDown(){
        tv.turnOn();
    }
}
