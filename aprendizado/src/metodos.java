public class Metodos {
    public static void main(String[] args){
        
    }
    /*exemplo de metodo com 2 argumentos de entrada e um retorno */
    public double somar(int num1, int num2){
		double result = num1 + num2;
		return result ;
	}
	
    /*exemplo de um metodo que tem um argumento de entrada, mas sem retorno */
	public void imprimir(String texto){
		//LOGICA - FINALIDADE DO MÉTODO
		//AQUI NÃO PRECISA DO RETURN
		//POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
	}

	// throws Exception : indica que o método ao ser utilizado
	// poderá gerar uma exceção
	public double dividir(int dividendo, int divisor) throws Exception{
        double result=dividendo/divisor;
        return result;
    }
	
	// este método não pode ser visto por outras classes no projeto
	private void metodoPrivado(String nome){
        String teste="um teste de metodo privado";
    }
	
	//alguns equívocos estruturais
	public void validar(){
		//este método deveria retornar algum valor
		//no caso boolean (true ou false)
	}
	public void calcularEnviar(){
		//um método deve representar uma única responsabilidade
	}
	public void gravarCliente(String nome, String cpf, Integer telefone){
		//este método tem a finalidade de gravar
		//informações de um cliente, por que não criar
		//um objeto cliente e passar como parâmetro ?
		//veja abaixo
	}
    /* 
	public void gravarCliente(Cliente cliente){}
	//ou
	public void gravar(Cliente cliente){}
    */
}
