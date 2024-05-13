package com.api.test.model;


public class Person {
    //Attributes
    public Integer Id;
    public String NameEquipoA;
    public String GolEquipo;
    public String MejorJugador;
    public String Mingol;

    //Constructor
    public Person(Integer id, String nameequipoA, String golequipo, String mejorjugador, String mingol) {
        this.Id = id;
        this.NameEquipoA = nameequipoA;
        this.GolEquipo = golequipo;
        this.MejorJugador = mejorjugador;
        this.Mingol = mingol;
    }
}
