package com.company;

public class Lamp {

    private boolean lampStatus;

    public Lamp(){
        this.lampStatus = false;
    }
    //Gør at man kan sætte lampStatus i det man opretter den nye variabel
    public Lamp(boolean status){
        this.lampStatus = status;
    }

    public boolean getLampStatus(){
        return lampStatus;
    }

    public void setLampStatus(boolean lampStatus){
        this.lampStatus = lampStatus;
    }
    public void lightSwitch(){
        if(lampStatus == true){ // Hvis lampeStatsu er true så skal den sættes til false
            lampStatus = false;
        } else {                // Hvis den ikke er true(altså hvis den er false) så skal den sættes true
            lampStatus = true;
        }

    }

    public String toString(){
        if( lampStatus == true){
            return "Tændt";
        } else {
            return "Slukket";
        }
    }
}
