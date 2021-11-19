package edu.ib;

import java.io.IOException;

public class TabulatorDemo {
    public static void main(String[] args) {

        Sinus s=new Sinus();
        Tabulator tabulator= new Tabulator();
        tabulator.calculate(0, 2*Math.PI,10,s);
        tabulator.terminalDisplay();
        try {
            tabulator.saveToFile("test.txt");
        }
        catch(IOException e){

        }
    }

}
