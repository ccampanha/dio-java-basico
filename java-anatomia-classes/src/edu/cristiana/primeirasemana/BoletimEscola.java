package edu.cristiana.primeirasemana;

public class BoletimEscola {
    public static void main (String[] args) {
        int mediaFinal = 9;
        if(mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal >= 6)
            System.out.println("APROVADO");
    }
    
}
