package model;

public class OpenAddressingHashTable { 
    private static final int TABLE_SIZE = 128; //el tamaño de elementos
    private Person[] table; //  Este arreglo representa la tabla Hash

    public OpenAddressingHashTable() {
        table = new Person[TABLE_SIZE];
    }

    public void insert(int key, Person value) { //utilizamos el índice de la tabla hash para la clave proporcionada utilizando la función de dispersión
        int hash = hashFunction(key);
        while (table[hash] != null && table[hash].Id != key) {//direccionamiento abierto para encontrar la siguiente ubicación disponible en la tabla
            hash = (hash + 1) % TABLE_SIZE;
        }
        table[hash] = value;
    }

    public Person search(int key) {
        int hash = hashFunction(key);
        while (table[hash] != null && table[hash].Id != key) {////direccionamiento abierto para encontrar la siguiente ubicación vacia o ya ocupada
            hash = (hash + 1) % TABLE_SIZE;
        }
        return table[hash];
    }

    private int hashFunction(int key) {
        return key % TABLE_SIZE;// utilizamos el modulo % como funcion de dispersion para calcular el indice de la tabla
    }

}
