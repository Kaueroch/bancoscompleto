package contaBancaria;

public class ContaEspecial extends ContaBancaria {
	private double Limite;

	public String sacar1(double saldo) {
		double valorasacar = 0;
		if (valorasacar <= 0) {
			System.out.println("Erro!Coloque valor maior que zero");
		} else {
			System.out.println("Transação concluida!");
		}
		double saldosacado = saldo - valorasacar;
		System.out.println("Valor sacado: " + valorasacar);
		return "Atual saldo da conta: " + saldosacado;

	}
	  public double getLimite() {
	    return Limite;  
      }
	  public double setLimite(){
		  return this.Limite = Limite;
	  }
	  public String toString() {
	        String s = "ContaEspecial[";
	        s += " limite: " + Limite;
	        s += "; " + super.toString();
	        s += "]" ;
	        return s;
	    }
	  public boolean sacar(double valor){
		  double Saldocomlimite = getSaldo() + Limite;
		  if((Saldocomlimite - valor)>= 0) {
			  this.setSaldo(this.getSaldo()-valor);  
			  return true;	  
		  }
		return false;
	  }
}
