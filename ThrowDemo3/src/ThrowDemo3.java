class ThrowDemo3 {

	public static void sacar(Double quantidade) throws SaqueNegativoException{
		   if(quantidade < 0) {
		        throw new SaqueNegativoException();
		   }
	}
	
	public static void main(String args[]) {
		try{			
		    sacar(-23.2);
		 }catch(SaqueNegativoException e){
		    System.out.println(e);
		 }
	}
}
