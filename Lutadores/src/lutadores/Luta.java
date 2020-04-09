package lutadores;

import java.util.Random;

public class Luta {

    private boolean statusLuta;
    private Lutador lutador;
    private Lutador lutador1;
    private String vencedor;
    
    public void lutar(Lutador a, Lutador b){
        if(a.getCategoria().equals(b.getCategoria())){
            System.out.println("\n\n        O PAU VAI QUEBRAAA");
            Random luta = new Random();
            int valorVencedor = luta.nextInt(3);
            System.out.println("========= Vencedor da luta =========");
            switch(valorVencedor){
                case 0:
                    System.out.println("A luta empatou, os cara e BRABO DE MAIS");
                    a.setEmpates(a.getEmpates()+1);
                    b.setEmpates(b.getEmpates()+1);
                    break;
                case 1:
                    System.out.println("Lutador "+a.getNome()+" é mais BRABO");
                    a.setVitorias(a.getVitorias()+1);
                    b.setVitorias(b.getDerrotas()+1);
                    break;
                case 2:
                    System.out.println("Lutador "+b.getNome()+" é mais BRABO");
                    b.setVitorias(b.getVitorias()+1);
                    a.setVitorias(a.getDerrotas()+1);
                    break;
            }
            System.out.println("===========================================");
        }else{
            System.out.println("--------------------------");
            System.out.println("Modalidades são diferentes");
            System.out.println(a.getNome()+" peso "+a.getCategoria());
            System.out.println(b.getNome()+" peso "+b.getCategoria());
            System.out.println("Pau nao quebro que pena... rs");
            System.out.println("--------------------------");
        }
    }
    public boolean getStatusLuta() {
        return statusLuta;
    }

    public void setStatusLuta(boolean statusLuta) {
        this.statusLuta = statusLuta;
    }

    public Lutador getLutador() {
        return lutador;
    }

    public void setLutador(Lutador lutador) {
        this.lutador = lutador;
    }

    public Lutador getLutador1() {
        return lutador1;
    }

    public void setLutador1(Lutador lutador1) {
        this.lutador1 = lutador1;
    }

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }
    
    
    
}
