public class Paciente extends Usuario implements ConectorBD {

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

    @Override
    public void cadastrar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrar'");
    }

    @Override
    public void atualizar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public void buscarPeloID() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPeloID'");
    }

    @Override
    public void listar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

    @Override
    public void excluir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

}
