package teste.principal;

import teste.heranca.Cliente;
import teste.heranca.Funcionario;

public class TesteHeranca {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Jõao", 25, "Masculino", "Peças", "Estoquista");
        Cliente cliente1 = new Cliente("Roberto", 45, "Masculino");

        System.out.println(funcionario1);
        funcionario1.fazerAniversario();
        funcionario1.receberAumento(500);
        funcionario1.mudarFuncao("Vendedor");
        System.out.println(funcionario1);

        System.out.println(cliente1);
        cliente1.fazerAniversario();
        cliente1.compraAprazo(500);
        cliente1.emitirBoleto();
        System.out.println(cliente1);



    }
    
}
