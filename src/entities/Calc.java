package entities;

public class Calc {
	
	private int repeat;
	private int countPositive;
	private double sum;
	private double values;
	
	public Calc() {
	}

	public int getRepeat() {
		return repeat;
	}

	public void setRepeat(int repeat) {
		this.repeat = repeat;
	}

	public int getCountPositive() {
		return countPositive;
	}

	public void addCountPositive() { //soma 1 na conta dos positivos
		this.countPositive++;
	}

	public double getSum() { //pegar a soma
		return sum;
	}

	public void sum(double values) { // somar os valores
		sum += values;
	}

	public double getValues() { //pega esse valor no prog. principal
		return values;
	}

	public void setValues(double values) { // atribui um valor
		this.values = values;
	}
	
	public Double media() {
		return getSum() / getCountPositive(); //faz o calculo da media
	}
	
	public String toString() { //imprime na tela os valores
		return getCountPositive() 
			  + " positive values\n"
			  + String.format("%.1f", media());
	}
}
