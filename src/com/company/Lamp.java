package com.company;

public class Lamp {

    private boolean lampStatus;
    private static int count;
    private int count1;

    public Lamp(){
        this.lampStatus = false;
        count++;
    }
    //Gør at man kan sætte lampStatus i det man opretter den nye variabel
    public Lamp(boolean status){
        this.lampStatus = status;
        count++;
    }

    public boolean getLampStatus(){
        return lampStatus;
    }

    public void setLampStatus(boolean lampStatus){
        this.lampStatus = lampStatus;
    }

    public static int getCount(){
        return count;
    }

    public int getCount1(){
        return count1;
    }

    public void lightSwitch(){
        if(lampStatus == true){ // Hvis lampeStatsu er true så skal den sættes til false
            lampStatus = false;
        } else {                // Hvis den ikke er true(altså hvis den er false) så skal den sættes true
            lampStatus = true;
        }
        count1++;

    }

    public String toString(){
        if( lampStatus == true){
            return "Tændt";
        } else {
            return "Slukket";
        }
    }
}
