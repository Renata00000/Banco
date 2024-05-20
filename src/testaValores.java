public class testaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(8183 , 1839);
        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(8183, 1230);
        Conta conta3 = new Conta(8183, 1128);

        System.out.println( "ate o momento sao " + Conta.getTotal() + "  contas criadas");

    }
}
