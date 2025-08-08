package Fundamentos.controle;

public class SwitchSemBreak {
    public static void main(String[] args) {

        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sabe técnicas avançadas de defesa, ataque, Poomsae e Kyorugi com precisão.");
            case "grau preta":
                System.out.println("Aprende controle emocional e táticas de combate avançadas.");
            case "vermelha":
                System.out.println("Aprende Poomsae Kukkiwon e domínio de técnicas com foco em precisão.");
            case "roxa":
                System.out.println("Aprende chutes com giro e combinações mais complexas.");
            case "azul":
                System.out.println("Aprende chutes laterais saltando e técnicas de contra-ataque.");
            case "cinza":
                System.out.println("Aprende combinações de socos e chutes em movimento.");
            case "verde":
                System.out.println("Aprende chutes circulares e defesas mais elaboradas.");
            case "laranja":
                System.out.println("Aprende primeiros Poomsae (formas) e variações de chutes frontais.");
            case "amarela":
                System.out.println("Aprende base de socos, bloqueios simples e chutes frontais.");
            case "branca":
                System.out.println("Aprende disciplina, postura básica e primeiros comandos.");
                break;
            default:
                System.out.println("Não sei nada.");
            }

        System.out.println("Fim!");

        int idade = 2;

        switch (idade) {
            case 3:
                System.out.println("Sabe programar.");
            case 2:
                System.out.println("Sabe falar.");
            case 1:
                System.out.println("Sabe andar.");
            case 0:
                System.out.println("Sabe respirar.");
        }
    }
}
