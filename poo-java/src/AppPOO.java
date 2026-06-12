public class AppPOO {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(1L, "Alexandre");

        usuario1.setCpf("123.456.789-00");
        usuario1.setEmail("alexandre@treinarecife.com.br");
        usuario1.setSenha("123abc");

        usuario1.exibirDetalhes();

        Usuario usuario2 = new Usuario();
        
        usuario2.setId(2L);
        usuario2.setNome("Bruna");
        usuario2.setCpf("123.456.789-01");
        usuario2.setEmail("bruna@treinarecife.com.br");
        usuario2.setSenha("456def");

        usuario2.exibirDetalhes();
    }

}
