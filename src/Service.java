public class Service {

    public static int calcularNumeroNome(String nome) {
        int soma = 0;
        for (char letra : nome.toCharArray()) {
            int valorNumerico = getValorNumerico(letra);
            soma += valorNumerico;
        }

        // Reduzir a soma a um único dígito se necessário
        if (soma == 11 || soma == 22 || soma == 33) {
            return soma;
        } else {
            while (soma > 9) {
                soma = reduzirNumero(soma);
            }
            return soma;
        }
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

    public static String criaMensagemNome(int numeroNome) { // método para deixar mais claro e sucinto
        String mensagem = "";
        switch (numeroNome) {
            case 11:
                mensagem = "plano espiritual mais alto, intuição, iluminação, um idealista, sonhador.";
                break;
            case 22:
                mensagem = "O Construtor Mestre, grandes empreitadas, força poderosa, liderança.";
                break;
            case 1:
                mensagem = "proatividade, pioneirismo, liderança, independência, realização, individualidade.";
                break;
            case 2:
                mensagem = "cooperação, adaptabilidade, consideração para com os outros, parceria, mediação.";
                break;
            case 3:
                mensagem = "expressão, verbalização, socialização, as artes, a alegria de viver.";
                break;
            case 4:
                mensagem = "fundação, ordem, serviço, esforço contra os limites, crescimento constante.";
                break;
            case 5:
                mensagem = "expansividade, visionário, aventura, uso construtivo da liberdade.";
                break;
            case 6:
                mensagem = "responsabilidade, proteção, criação, comunidade, equilíbrio, simpatia.";
                break;
            case 7:
                mensagem = "análise, compreensão, conhecimento, consciência, estudo, meditação.";
                break;
            case 8:
                mensagem = "iniciativas práticas, orientação para o status, busca pelo poder, objetivos materiais.";
                break;
            case 9:
                mensagem = "humanitário, natureza generosa, altruísmo, obrigações, expressão criativa.";
                break;
        }
        return mensagem;
    }
}