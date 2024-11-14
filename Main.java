package aulas.associacao.agregacao;

public class Main {
    public static void main(String[] args) {
        
        Empresa google = new Empresa ("Google Inc.");
        google.mostrarInfo();
        
        Profissional joana = new Profissional("Joana");
        Profissional ricardo = new Profissional("Ricardo");
        
        joana.mostrarInfo();
        ricardo.mostrarInfo();
        
        joana.setEmpresa(google);
        joana.mostrarInfo();
        
        //lampada qts vzs a lampada acende
        //objt contador, que add toda vez que eu acender a lampada
    }
}
