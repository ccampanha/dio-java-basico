package edu.cristiana.segundasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Cristiana";
        String segundoNome = "Campanha";

        System.out.print (NomeCompleto(primeiroNome, segundoNome));

    }

    public static String NomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome); 
    }
}
