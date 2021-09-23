package com.company;

public class Værelse {
    public static void main(String[] args) {
        Lamp kitchenLamp = new Lamp(true);
        System.out.println("Køkkenlyset er: " + kitchenLamp);
        System.out.println(kitchenLamp.getLampStatus());

        kitchenLamp.setLampStatus(true);
        System.out.println("Køkkenlyset er: " + kitchenLamp);

        kitchenLamp.lightSwitch();
        System.out.println("Køkkenlyset er nu: " + kitchenLamp);

        kitchenLamp.lightSwitch();
        System.out.println("Køkkenlyset er nu: " + kitchenLamp);

        Lamp bedLamp = new Lamp();
        System.out.println("Sengelampen er: " + bedLamp);

        bedLamp.lightSwitch();
        System.out.println("Sengelampen er: " + bedLamp);

        bedLamp.lightSwitch();
        System.out.println("Sengelampen er: " + bedLamp);

        System.out.println(Lamp.getCount());
        System.out.println(kitchenLamp.getCount1());
        System.out.println(bedLamp.getCount1());

    }
}
