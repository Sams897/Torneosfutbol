package model;


public class Person {
    public Integer Id;
    public String NameEquipoA;
    public String GolEquipo;
    public String MejorJugador;
    public String Mingol;



    public Person(Integer id, String nameEquipoA, String golEquipo, String mejorJugador, String mingol) {
        this.Id = id;
        this.NameEquipoA = nameEquipoA;
        this.GolEquipo = golEquipo;
        this.MejorJugador = mejorJugador;
        this.Mingol = mingol;
    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return NameEquipoA;
    }
}
