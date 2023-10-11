package com.tutorial;

//Class tanpa constructor (class polos)
class Polos{
    String dataString;
    int dataInteger;
}

//Class dengan constructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
}

public class Main {
    public static void main(String[] args) {

        Polos objectPolos = new Polos();
        objectPolos.dataString = "polos";
        objectPolos.dataInteger = 0;

        System.out.println(objectPolos.dataString);
        System.out.println(objectPolos.dataInteger);
    }
}
