public class Calculo {
	public static int conta(int dia, int mes, int ano) {
		int x = etapa1(dia, mes);
		int y = etapa2(ano, mes);
		int z = x + y;
		int maiorMutilploDe7 = maiorMutiploDe7(z);
		z = z - maiorMutilploDe7;		
		return z;
	}
	
	public static int etapa1(int dia, int mes) {
		int tabelaMes = tabelaMes(mes);
		int x = dia + tabelaMes;
		int maiorMutiploDe7 = maiorMutiploDe7(x);
		x = x - maiorMutiploDe7;
		return x;
	}
	
	public static int etapa2(int ano, int mes) {
		int abreviacaoAno = abreviacaoAno(ano);
		int maiorMutiploDe28 = maiorMutiploDe28(abreviacaoAno);
		int x = abreviacaoAno - maiorMutiploDe28;
		int y = abreviacaoAno / 4;
		x = x + y;
		int seculo = seculo(ano);
		x = x + seculo;
		if ((mes == 1) || (mes == 2 )) {
			int bisexto = anoBixesto(ano);
			x = x - bisexto;
		}
		return x;
	}
	
	public static int tabelaMes(int mes){
		int y = 0;
		switch (mes) {
			case 1:
				y = 0;
			break;
			case 2:		
				y = 3;
			break;
			case 3:
				y = 3;
			break;
			case 4:
				y = 6;
			break;
			case 5:
				y = 1;
			break;
			case 6:
				y = 4;
			break;
			case 7:
				y = 6;
			break;
			case 8:	
				y = 2;
			break;
			case 9:
				y = 5;
			break;
			case 10:
				y = 0;
			break;
			case 11:
				y = 3;
			break;
			case 12:
				y = 5;
			break;
		}	
		return y;
	}

		public static int maiorMutiploDe7 (int x) {
			int y = 0;
			for (int i = 0; i < x; i = i + 7) {
				y = i;
			}
			return y;
		}
		
		public static int maiorMutiploDe28 (int x) {
			int y = 0;
			for (int i = 0; i < x; i = i + 28) {
				y = i;
			}
			return y;
		}
		
		public static int abreviacaoAno (int x) {
			int y = 0;
			if ((x >= 1900) && (x < 2000)) {
				y = x - 1900;
			}
			if (x >= 2000) {
				y = x - 2000;
			}
			return y;
		}
		
		public static int seculo(int ano) {
			int x = 0;
			if ((ano >= 1600) && (ano < 1700)) {
				x = 0;
			}
			if ((ano >= 1700) && (ano < 1800)) {
				x = 5;
			}
			if ((ano >= 1800) && (ano < 1900)) {
				x = 3;
			}
			if ((ano >= 1900) && (ano < 2000)) {
				x = 1;
			}
			if (ano >= 2000) {
				x = 0;
			}		
			return x;
		}
		
		public static int anoBixesto (int ano) {
	        int x = 0;
			if(ano % 400 == 0){
	            x = 1;
	        } else if((ano % 4 == 0) && (ano % 100 != 0)){
	        	x = 1;
	        } else{
	            x = 0;
	        }
	        return x;
	    }
}
