public class  Conta  {
   private double saldo;
   private int agencia;
   private double numero;
   private Cliente titular;
   // static siguinifica que esse atributo pertence a todas as cless no geral, representa o projeto inteiro. no caso aqui sera um atributo criado para somar o totsl de contrss abertas
   private static int total;


   public Conta(int agencia, int numero){
       Conta.total ++;  // (usando a class colnta mais o atributo total Statatic)
       System.out.println("o tatal de contas abertas e;" + Conta.total);
       this. agencia = agencia;
       this. numero = numero;
       System.out.println( "estou criando um metodo" + this.numero);

   }
    public void deposita(double valor){
        this.saldo = this.saldo + valor;
    }
    public boolean saca(double valor) {
        if (this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("saldo realizado com sucesso");
            return true;
        }else {
            System.out.println("saldo insuficiente");
            return false;
        }
    }
    public boolean transfere(double valor ,Conta destino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            //estou usando o metodo de deposita dentro deste outro metodo
            destino.deposita(valor);
            System.out.println("transferencia realizado com sucesso");
            return true;
        }else {
            System.out.println("transferencia falhou");
            return false;
        }
    }
 public double getSaldo(){
        return saldo;
 }

 public double  getNumero(){
     return this.numero;
    }
    public void setNumero(int numero){
        if (numero <= 0){
            System.out.println( "nao pode valor maior ou igual a zero");
            return;
        }
        this.numero = numero ;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0){
            System.out.println("nao pode agencia maior ou igual a zero");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }
}
