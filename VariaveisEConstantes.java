package cursojava.basico;

public class VariaveisEConstantes {

	public static void main(String[] args) {
	//cria�ao de constantes
		final double ACELERACAO_GRAVIDADE_TERRA = 9.80665;
	//cira�ao de variaveis
		String nome="Jose";
		
		int idade=48;
		
		double peso=73.4,altura=1.73;
		
		char sexo='m', chn='a';
		
		boolean doadorOrgaos=true;
				
		
		System.out.println("nome:"+nome);
	
		System.out.println("idade:"+idade);
		System.out.println("peso:"+peso);
		System.out.println("Altura:"+altura);
		System.out.println("sexo:"+sexo);
		System.out.println("habilita�ao:");
		System.out.println("Doador de orgaos:"+doadorOrgaos);
		System.out.println("Tipo de Sangue:"+chn);
		System.out.println("Gravidade na terra �:"+ACELERACAO_GRAVIDADE_TERRA);
	}

}
