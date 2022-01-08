package aula04.estruturas_decisao;

public class A01_EstruturaSE {

	public static void main(String[] args) {
		
		int idade = 21;
		boolean temDinheiro = true;
		
		//boolean podeDirigir = idade >=18 ? true : false;
		
		boolean podeDirigir;
		String tipoCNH;
		/*
		//paga pela pr�pria CNH
		if(idade>=18 && temDinheiro) 
			podeDirigir = true;
		else 
			podeDirigir = false;
		
		//para poder ter direito a CNH popular
		//n�o pode ter dinheiro para pag�-la
		//por isso usamos o operador de nega��o.
		if(idade>=18 && !temDinheiro) 
			podeDirigir = true;
		else 
			podeDirigir = false;
		*/
		
		if(idade>=18 && temDinheiro) {
			
			podeDirigir = true;
			tipoCNH = "comum";
			
		}else if(idade>=18 && !temDinheiro) {
			
			podeDirigir = true;
			tipoCNH = "CNH popular";
			
		}else {
			podeDirigir = false;
			tipoCNH = "nula";
		}
		
		System.out.println("A pessoa est� apta a tirar a CNH: "+podeDirigir);
		System.out.println("Tipo de CNH: "+tipoCNH);
	}
}
