public class Teste {
    public static void main(String[] args) {
Cliente renata = new Cliente();
renata.setNome("Renata");
renata.setCpf("");
renata.setProfissao("Programador");
        System.out.println(renata.getNome());
        System.out.println(renata.getProfissao());
        System.out.println(renata.getCpf());

    Conta contaRenata = new Conta(22,22);
        contaRenata.deposita(100);


//        contaRenata.titular = renata;
//        System.out.println(contaRenata.titular.nome);

    }
}