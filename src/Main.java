import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<funcionario> funcionario = new ArrayList<>();

        //lista de funcionários
        funcionario.add(new vendedor("Otávio"));
        funcionario.add(new gerente("Tauã"));

        vendedor v = new vendedor("Otávio",1000);

        // este metodo adiciona a porcentagem definida no salário, se remover este metodo não havera porcentagem adicional
        v.bonus();
        // ja este adiciona o valor desejado ao salario
        v.BAterMeta(200);



        gerente g = new gerente("Tauã");
        // aqui eu não setei nenhum salário, então por default ira sair 1500 de salário base

        g.bonus();
        g.BAterMeta(0);

        // laço que ira repetir o print varias vezes
        for (int i = 1; i <= 3; i++) {

            System.out.println(v.getNome() + " recebe R$" + v.getSalario());
            System.out.println(g.getNome() + " recebe R$" + g.getSalario());
        }
    }
}