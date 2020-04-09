package lutadores;

public class Lutadores {

    public static void main(String[] args) {
        Lutador lutador[] = new Lutador[5];
        
        /*Se quiser adicionar mais lutadores
        lutador[valorIndice] = new Lutador ("NomeLutador", "Peso", "Vitorias", "Derrotas", "Empates");
        */
        lutador[0] = new Lutador("Gabriel", 79, 3, 2, 1);

        lutador[1] = new Lutador("Jose aldo", 120, 0, 1, 7);

        lutador[0].apresentacao();
        lutador[0].status();
        lutador[1].apresentacao();
        lutador[1].status();

        Luta l1 = new Luta();
        l1.lutar(lutador[0], lutador[1]);
        
    }

}
