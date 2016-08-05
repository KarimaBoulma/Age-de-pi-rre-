package groupek;

public class Outils {
		//private Numero num;
		private String num; 
		
		public Outils(){
			this.num=null;
		}
		public Outils(String numero){
			this.num=numero;
		}
		
		//getteur
		public String getNum(){
			return this.num;
		}
		
		public String toString(){
			return num.toString();
		}

	}
