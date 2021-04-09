package entities;

public class Estudante {
	 private int matricula;
	    private String cpf;
	    private double pontos;
	    private boolean status;

	    //Contrutor
	    public Estudante(String cpf, int matricula) {
	        super();
	        this.cpf = cpf;
	        this.matricula = matricula;
	    }

	    //Encapsulamento - getters and setters
	    public int getMatricula() {
	        return matricula;
	    }
	   
	    /*private void setMatricula(int matricula) {
	        this.matricula = matricula;
	    }*/
	    
	    public String getCpf() {
	        return cpf;
	    }
	  
	    /*private void setCpf(String cpf) {
	        this.cpf = cpf;
	    }*/
	    
	    public double getPontos() {
	        return pontos;
	    }
	  
	    /*private void setPontos(double pontos) {
	        this.pontos = pontos;
	    }*/
	    
	    //Métodos
	    public void adicionarNota(double nota) { //inclui os pontos
	        this.pontos +=  nota;
	    }

	    public void tirarNota(double nota) {

	        if (pontos >= nota) {
	            this.pontos -=  nota;
	        }

	        else if (pontos < nota) {
	            System.out.println("\nImpossível retirar nota...");
	        }

	    }
}
