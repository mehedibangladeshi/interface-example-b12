package com.iiuc.sdmagp.www;

public class Nilufa implements Human {
    @Override
    public void sleeps() {
        System.out.println( " sleeps deeply " );
    }

    @Override
    public void eats() {
        System.out.println( " chips " );
    }

    @Override
    public void runs() {
        System.out.println( " fast " );
    }

    @Override
    public void works() {
        System.out.println( " studies " );
    }
}
