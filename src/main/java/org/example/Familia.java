package org.example;

import java.util.Scanner;

public class Familia {

    Animal papa;
    Animal mama;
    Animal hijo;

    public Familia(Animal papa, Animal mama){
    this.papa = papa;
    this.mama = mama;
    }
    public Familia(Animal papa, Animal mama, Animal hijo) {
        this.papa = papa;
        this.mama = mama;
        this.hijo = hijo;
    }

    public void imprimirFamilia(){

        //Este metodo muestra los nombres de los integrantes de la familia
        System.out.println(
                "El papá es: "+this.papa.getNombre()+
                        "\nLa mamá es: "+this.mama.getNombre()+
                            "\nEl hijo es: "+this.hijo.getNombre()
        );

    }

    public void tenerHijo(String nombre){

        if(this.papa.getPareja() != null){

            Animal hijo = new Animal(nombre);
            hijo.setNombre(nombre);
            hijo.setPeso(1);
            double random = Math.random();
            if(random<0.5){
                hijo.genero="F";
            }else{
                hijo.genero="M";
            }
            this.hijo=hijo;

        }else{
            System.out.println("Aun no puedes tener hijos");
        }


    }




}
