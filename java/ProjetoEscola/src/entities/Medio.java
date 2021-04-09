package entities;

public class Medio extends Estudante {
	
	private int contadorBoletim;

	//construtor
	public Medio(String cpf, int matricula) {
		super(cpf, matricula);
	}

	//get set
	public int getContadorBoletim() {
		return contadorBoletim;
	}

	public void setContadorBoletim(int contadorBoletim) {
		this.contadorBoletim = contadorBoletim;
	}
	
	public void imprimirBoletim() {
		System.out.println("Boletim");
		System.out.println("Pontos atuais: "+super.getPontos());
	}
}
