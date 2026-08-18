public class vendedor extends funcionario{

    vendedor(String nome){
        super.setNome(nome);

        // aqui eu defini o valor default do salario de 1500, caso n adicione salario esse valor sera definido
        setSalario(1500);
    }

    vendedor(String nome, double salario){
        super.setNome(nome);
        super.setSalario(salario);
    }

    //calcula o bonus por meio do cálculo da porcentagem e adição da mesma no salário, aqui está setado em 10%
    public void bonus() {
        double percentual = (double) 10 / 100;
        double bonus = percentual * getSalario();
        this.setSalario(bonus + getSalario());
    }

    // calcula o valor adicional quando chamado, adicione o valor desejado e sera somado no salario
    public void BAterMeta(double valorAdicional){
        this.setValorAdicional(valorAdicional);

        //aqui é a calculadora responsavel por adicionar o valor escrito ao salario
        double adicionar = getValorAdicional() + getSalario();
        this.setSalario(adicionar);

    }
}
