package contaBancaria;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	private int diaRendimento;

	public int getdiaRendimento() {
		return diaRendimento;
		// Esse método geralmente retorna o valor atual do saldo da conta
	}

	public int setdiaRendimento() {
		// Este método geralmente atualiza o valor do saldo da conta com o valor
		// fornecido como argumento.
		return this.diaRendimento = diaRendimento;
	}
    public String toString() {
        String s = "ContaPoupança[";
        s += " diaRendimento: " + diaRendimento;
        s += "; " + super.toString();
        s += "]" ;
        return s;
    }


	public boolean calcularNovoSaldo(double taxaRendimento, double saldo) {

		Calendar hoje = Calendar.getInstance();
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
	         this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
			return true;
		}
		return false;
	}
}
