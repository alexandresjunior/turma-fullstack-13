public class Medico extends Usuario {

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

}
