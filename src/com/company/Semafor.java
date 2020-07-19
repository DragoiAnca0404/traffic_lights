package com.company;

public class Semafor {
    CuloareSemafor culoare = CuloareSemafor.ROSU;

    public void schimba() {
        switch (culoare) {
            case ROSU:
                culoare = CuloareSemafor.VERDE;
                break;
            case VERDE:
                culoare = CuloareSemafor.GALBEN;
                break;
            case GALBEN:
                culoare = CuloareSemafor.ROSU;
                break;
        }
    }

    @Override
    public String toString() {
        return "Culoarea curenta a semaforului este" + culoare;
    }
}
