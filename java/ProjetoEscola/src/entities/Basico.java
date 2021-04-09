package entities;

public class Basico extends Estudante {
	
	private int diaAniversario;

	//construtor
	public Basico(String cpf, int matricula, int diaAniversario) {
		super(cpf, matricula);
		this.diaAniversario = diaAniversario;
	}

	//encapsulamento
	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
			
	//metodo
	public void bonusAniversario(int diaAtual) {//usuario precisa passar o dia atual para fazer o calculo abaixo
		if(diaAniversario == diaAtual) {	
			super.adicionarNota(super.getPontos()*0.01);//super- acessa o que está na classe mãe (Estudante). calculo para adicionar 1% a nota do aluno se o dia do aniversario for = ao dia atual
		}
	}
	
	
}
