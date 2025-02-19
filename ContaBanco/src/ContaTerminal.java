import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);

        int numero;
        String agencia, titular;
        float saldo;

        System.out.println("Por favor, digite o Numero do banco !");
        numero = tec.nextInt();
        tec.nextLine();
        
        System.out.println("Por favor, digite o Numero da Agencia !");
        agencia = tec.next();
        tec.nextLine();

        System.out.println("Por favor, digite o nome do titular da conta!");
        titular = tec.nextLine();

        System.out.println("Por favor, insira seu saldo!");
        saldo = tec.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", titular, agencia, numero, saldo);

        tec.close();
    }
}
