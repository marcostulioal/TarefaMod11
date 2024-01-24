import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioMod11 {


    public static void main (String[] args){
        exemplosNomes();
        exemplosGenero();

    }

    private static void exemplosNomes(){
        System.out.println("***** parte 1 *****");

        List<String> lista = new ArrayList<>();

        lista.add("Marcos Tulio");
        lista.add("Ana Maria");
        lista.add("Claudia Silva");
        lista.add("Amanda Souza");

        List<String> nomesDivididos = new ArrayList<>();
        for (String nome : lista) {
            String[] partes = nome.split(" ");
            Collections.addAll(nomesDivididos, partes);
        }

        Collections.sort(nomesDivididos);

        System.out.println(nomesDivididos);

    }

    private static void exemplosGenero(){
        System.out.println("***** parte2 *****");

        List<String> nome =  new ArrayList<>();

        nome.add("Marcos Tulio");
        nome.add("Ana Maria");
        nome.add("Claudio Silva");
        nome.add("Amanda Souza");
        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        for (String nomeCompleto : nome) {
            // Dividindo o nome completo em partes usando espaço como delimitador
            String[] partes = nomeCompleto.split(" ");

            // Obtendo o primeiro nome
            String primeiroNome = partes[0];

            // Classificando por gênero
            if (ehMasculino(primeiroNome)) {
                masculinos.add(nomeCompleto);
            } else if (ehFeminino(primeiroNome)) {
                femininos.add(nomeCompleto);
            }
        }

        System.out.println("Masculinos: " + masculinos);
        System.out.println("Femininos: " + femininos);
    }

    private static boolean ehMasculino(String primeiroNome) {
        return primeiroNome.equalsIgnoreCase("Marcos") || primeiroNome.equalsIgnoreCase("Claudio");
    }

    private static boolean ehFeminino(String primeiroNome) {
        return primeiroNome.equalsIgnoreCase("Ana") || primeiroNome.equalsIgnoreCase("Amanda");
    }
}

