package arvore;

import javax.swing.*;

public class ArvoreDeAnimais {
    // static Animal animal = new Animal();
    public ArvoreDeAnimais noEsq;
    public ArvoreDeAnimais noDir;
    public String val;

    public ArvoreDeAnimais(String val) {
        this.val = val;
    }

    public void verificarAnimalNaArvore(ArvoreDeAnimais noAnimais) {

        int resposta = JOptionPane.showConfirmDialog
                (null, "O animal que você pensou " + noAnimais.val, "Confirmar",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        //Vorifica de forma recursiva até encontrar o animal (se ele esteja na arvore).
        if (resposta == 0) {
            if (noAnimais.noDir == null)
                JOptionPane.showMessageDialog(null, "Acertei!");
            else {
                verificarAnimalNaArvore(noAnimais.noDir);
            }
        }

        // Se o animal não estiver na arvore ele entra como folha
        if (resposta == 1) {
            if (noAnimais.noEsq == null)
                insereAnimal(noAnimais);
            else {
                verificarAnimalNaArvore(noAnimais.noEsq);
            }
        }
    }

    public void insereAnimal(ArvoreDeAnimais noAnimais) {
        String animal = JOptionPane.showInputDialog(null,
                "Qual o animal que você pensou?");

        String acao = (JOptionPane.showInputDialog("Um(a) "
                + animal + "______ mas um(a) " + noAnimais.val + " não."));

        //Substitui o nó anterior pelo nome atual
        String substituicao = noAnimais.val;
        noAnimais.val = acao;

        //nó direito = animal atual, nó esquerdo = animal anterior
        noAnimais.noDir = new ArvoreDeAnimais(animal);
        noAnimais.noEsq = new ArvoreDeAnimais(substituicao);

    }
}
