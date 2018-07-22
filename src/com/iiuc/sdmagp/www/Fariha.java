package com.iiuc.sdmagp.www;

public class Fariha implements Human{
    @Override
    public void sleeps() {
        System.out.println( " sleeps sound " );
    }

    @Override
    public void eats() {
        System.out.println( " spicy food " );
    }

    @Override
    public void runs() {
        System.out.println( " slow " );
    }

    @Override
    public void works() {
        System.out.println( " code kore " );
    }
}
