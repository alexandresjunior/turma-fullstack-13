public class Paciente extends Usuario {

    private Double peso;
    private Double altura;
    private Boolean ehPcd;

    public Paciente() {

    }

    public Paciente(Long id, String nome, String cpf, String email, String senha, Double peso, Double altura,
            Boolean ehPcd) {
        super(id, nome, cpf, email, senha);
        this.peso = peso;
        this.altura = altura;
        this.ehPcd = ehPcd;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Boolean getEhPcd() {
        return ehPcd;
    }

    public void setEhPcd(Boolean ehPcd) {
        this.ehPcd = ehPcd;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Eh PCD: " + ehPcd);
    }

    @Override
    public void fazerLogin() {
        System.out.println("Paciente fez login no sistema.");
    }

    @Override
    public void fazerLogout() {
        System.out.println("Paciente saiu do sistema.");
    }

}
