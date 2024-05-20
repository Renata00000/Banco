public class TesteSacaNegaqtivo {
    public static void main(String[] args) {
        Conta conta = new Conta(33,3);
        conta.deposita(100);
        System.out.println(conta.saca(200));



        //acessar atributo diretamente, sem invocar metodos, algo proibido, pedir autorizacao(o atributo n estava provado)
//        conta.saldo = conta.saldo -101;
//        System.out.println(conta.saldo);

    }
}
