package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Informação Funcionários 
		
		//Tipos npumerucis inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3234845223L;
		
		//Tipos numericos com pontos flutueantes
		float salario = 1144544F;
		double vendasAcumuladas = 2991797103.01;
				
		//Tipos booleano
				boolean estaDeFerias = false; //true
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de Viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id+ ": ganha ->" + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status" + status);
	}

}
