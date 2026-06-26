public class App {
    
    public static void main(String[] args) {
        Medico m = new Medico();

        m.setCrm("123MGX-PE");
        m.setId(1L);
        m.setNome("Ana Maria");

        m.fazerLogin();
        m.fazerLogout();

        Paciente p = new Paciente();

        p.setAltura(1.84);
        p.setId(2L);
        p.setNome("Beatriz Menezes");

        p.fazerLogin();
        p.fazerLogout();
    }

}
