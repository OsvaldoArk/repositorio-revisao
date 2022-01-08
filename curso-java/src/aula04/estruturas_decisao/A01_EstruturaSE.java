package aula04.estruturas_decisao;

public class A01_EstruturaSE {

	public static void main(String[] args) {
		
		int idade = 21;
		boolean temDinheiro = true;
		
		//boolean podeDirigir = idade >=18 ? true : false;
		
		boolean podeDirigir;
		String tipoCNH;
		/*
		//paga pela própria CNH
		if(idade>=18 && temDinheiro) 
			podeDirigir = true;
		else 
			podeDirigir = false;
		
		//para poder ter direito a CNH popular
		//não pode ter dinheiro para pagá-la
		//por isso usamos o operador de negação.
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
		
		System.out.println("A pessoa está apta a tirar a CNH: "+podeDirigir);
		System.out.println("Tipo de CNH: "+tipoCNH);
	}
}
