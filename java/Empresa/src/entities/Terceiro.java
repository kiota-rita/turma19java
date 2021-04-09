package entities;

public class Terceiro extends Funcionario {
	private double adicional;

	public Terceiro(String matricula, String nome, double adicional) {
		super(matricula, nome);
		this.adicional = adicional;
	}	

	public Terceiro(String matricula, String nome, int horasTrabalhadas, double valorHora, double adicional) {
		super(matricula, nome, horasTrabalhadas, valorHora);
		this.adicional = adicional;
	}

	//get set
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	//metodo
	@Override//permite usar o mesmo metodo da classe mãe com os argumentos protected
	public double salario() {
		double salario = horasTrabalhadas*valorHora+this.adicional;
		return salario;
	}
}
