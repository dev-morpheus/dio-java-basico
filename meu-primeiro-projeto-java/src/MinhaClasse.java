public class MinhaClasse {
    //Classe inicio

    public static void main(String[] args) {
        //Criação do Main
        String primeiroNome = "Vitor";
        String segundoNome = "Correia";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println (nomeCompleto);

    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
