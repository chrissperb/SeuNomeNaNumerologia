public class Service {

    public static int calcularNumeroNome(String nome) {
        int soma = 0;
        for (char letra : nome.toCharArray()) {
            int valorNumerico = getValorNumerico(letra);
            soma += valorNumerico;
        }

        // Reduzir a soma a um único dígito se necessário
        if (soma != 11 && soma != 22 && soma != 33) {
            while (soma > 9) {
                soma = reduzirNumero(soma);
            }
        }
        return soma;
    }

    public static int getValorNumerico(char letra) {
        // Tabela de correspondência entre letras e números
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8};
        int indice = letras.indexOf(letra);
        return numeros[indice];
    }

    public static int reduzirNumero(int numero) {
        int soma = 0;
        while (numero > 0) {
            soma += numero % 10;
            numero /= 10;
        }
        return soma;
    }

    public static String criaMensagemNome(int numeroNome) { // method para deixar mais claro e sucinto
        return switch (numeroNome) {
            case 11 -> "plano espiritual mais alto, intuição, iluminação, um idealista, sonhador.";
            case 22 -> "O Construtor Mestre, grandes empreitadas, força poderosa, liderança.";
            case 1 -> "proatividade, pioneirismo, liderança, independência, realização, individualidade.";
            case 2 -> "cooperação, adaptabilidade, consideração para com os outros, parceria, mediação.";
            case 3 -> "expressão, verbalização, socialização, as artes, a alegria de viver.";
            case 4 -> "fundação, ordem, serviço, esforço contra os limites, crescimento constante.";
            case 5 -> "expansividade, visionário, aventura, uso construtivo da liberdade.";
            case 6 -> "responsabilidade, proteção, criação, comunidade, equilíbrio, simpatia.";
            case 7 -> "análise, compreensão, conhecimento, consciência, estudo, meditação.";
            case 8 -> "iniciativas práticas, orientação para o status, busca pelo poder, objetivos materiais.";
            case 9 -> "humanitário, natureza generosa, altruísmo, obrigações, expressão criativa.";
            default -> "";
        };
    }
}