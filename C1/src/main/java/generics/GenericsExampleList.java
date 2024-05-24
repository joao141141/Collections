package main.java.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExampleList {

    public static void main(String[] args) {
        //Sem Generics
        List ListaSemGenerics = new ArrayList();
        ListaSemGenerics.add("Elemento 1");
        ListaSemGenerics.add(10); //Pode-se adicionar qualquer coisa.

        // Com Generics
        List<String> ListaGenerics = new ArrayList<>();
        ListaGenerics.add("Elemento 1");
        ListaGenerics.add("Elemento 2");

        for (String elemento : ListaGenerics) {
            System.out.println(elemento);
        }
        for (Object elemento : ListaSemGenerics) {
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}
