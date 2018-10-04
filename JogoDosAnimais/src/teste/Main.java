package teste;

import arvore.ArvoreDeAnimais;

import javax.swing.*;

public class Main {
    public static ArvoreDeAnimais raiz;

    public static void main(String[] args) {
        //inicialização da raiz da arovre com os valores padrões
        ArvoreDeAnimais arvoreDeAnimais = new ArvoreDeAnimais("vive na agua");
        raiz = arvoreDeAnimais;
        raiz.noEsq = new ArvoreDeAnimais("Cachorro");
        raiz.noDir = new ArvoreDeAnimais("Tubarao");

        int sair = 1;

        do {
            // Pergunta inicial
            JOptionPane.showMessageDialog(null, "Pense em um Animal");

            int resposta = JOptionPane.showConfirmDialog(null,
                    "O animal que você pensou " + raiz.val, "INICIO",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            // Se resposta for Sim, verificao nó direito, se for Não verifica o Esquerdo

            switch (resposta) {
                case 0:
                    raiz.verificarAnimalNaArvore(raiz.noDir);
                    break;
                case 1:
                    raiz.verificarAnimalNaArvore(raiz.noEsq);
                    break;

                case JOptionPane.CLOSED_OPTION:
                    sair = 0;
                    break;
            }
        } while (sair == 1);
    }


}