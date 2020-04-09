package lutadores;

public class Lutador {

    private int peso;
    private String categoria, nome;
    private int vitorias, derrotas, empates, idade;

    public Lutador(String nome, int peso, int vitorias, int empates, int perdas) {
        this.setNome(nome);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setEmpates(empates);
        this.setDerrotas(perdas);
    }

    public void apresentacao() {
        System.out.println("----------------------");
        System.out.println("Apresentando o lutador " + this.getNome()
                + "\nPesando " + this.getPeso() + "kg\nCompetindo na modalidade peso " + this.getCategoria());
    }

    public void status() {
        System.out.println("\n---------------------------");
        System.out.println("O lutador " + this.getNome() + " é BRABO DE MAIS conta com " + this.getVitorias() + " vitorias\n" + this.getEmpates() + " Empates "
                + this.getDerrotas() + " Derrotas");
    }

    private void categoria(int peso) {
        if (this.getPeso() > 90) {
            this.setCategoria("pesado");
        } else if (this.getPeso() >= 80) {
            this.setCategoria("medio");
        } else if (this.getPeso() >= 70) {
            this.setCategoria("leve");
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
        categoria(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
