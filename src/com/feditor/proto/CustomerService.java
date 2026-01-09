package com.feditor.proto;

public class CustomerService {
    //asking, reading, etc.
    //Voi olla, et tarvitaa eriksee joku luokka minne tallennetaan tietoa (getterit ja setterit)
    private String answer = "";

    public CustomerService(){
        greeting();
    }

    public void greeting(){
        System.out.println("Hello! What would you like to do?");
        System.out.println("Write 'edit' if you'd like to edit files");
        //tee lukija metodi jota voidaan kutsua vaikka tästä metodista
    }

}
