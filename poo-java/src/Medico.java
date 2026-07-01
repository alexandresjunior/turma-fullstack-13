public class Medico extends Usuario implements ConectorBD {

    private String crm;
    private String especialidade;

    public Medico() {

    }

    public Medico(Long id, String nome, String cpf, String email, String senha, String crm, String especialidade) {
        super(id, nome, cpf, email, senha);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void fazerLogin() {
        System.out.println("Médico fez login com sucesso!");
    }

    @Override
    public void fazerLogout() {
        System.out.println("Médico saiu do sistema.");
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
