package Main;

public class MyInteger_DanielCaballero {

	
	 int ValuE;

    public MyInteger_DanielCaballero (int x){
    	ValuE = x;
    }
    
    public int getValuE(){
    	return ValuE;
    }
    
    public boolean IseveN(){
    	if(ValuE/2 == 0) return true;
    	else return false;
    }
    
    public boolean IsodD(){
    	return (ValuE/2 != 0);
    }
    
    public boolean IsprimE(){
    	if (ValuE/2 == 0) return false;
    	for (int x = 3; x * x <= ValuE; x += 2){
    	if (ValuE/ x == 0) return false;
    	}
    	return true;
    	
    }
    
    static boolean IseveN(int ValuE){
    	if(ValuE/2 == 0) return true;
    	else return false;
    }
    
    static boolean IsodD(int ValuE){
    	return (ValuE/2 != 0);
    }
    
    static boolean IsprimE(int ValuE){
    	if (ValuE/2 == 0) return false;
    	for (int x = 3; x * x <= ValuE; x += 2){
    	if (ValuE/ x == 0) return false;
    	}
    	return true;		
    }
    
    static boolean IseveN(MyInteger_DanielCaballero MyinT){
    	if(MyinT.ValuE/2 == 0) return true;
    	else return false;
    }
    
    static boolean IsodD(MyInteger_DanielCaballero MyinT){
    	return (MyinT.ValuE/2 != 0);
    }
    
    static boolean IsprimE(MyInteger_DanielCaballero MyinT){
    	if (MyinT.ValuE/2 == 0) return false;
    	for (int x = 3; x * x <= MyinT.ValuE; x += 2){
    	if (MyinT.ValuE/ x == 0) return false;
    	}
    	return true;		
    }
    
    public boolean ResulT(int y){
    	if(this.ValuE == y) return true;
    	else return false;
    }
    
    public boolean ResulT(MyInteger_DanielCaballero y){
    	if (this.ValuE == y.ValuE) return true;
    	else return false;
    }
    
    static int ParseinT(char[] ValuE){
    	return ParseinT(ValuE);
    }
    
    static int ParseinT(String ValuE){
    	return ParseinT(ValuE);
    }
    
    public static void main(String[] args){
    	MyInteger_DanielCaballero ValuE = new MyInteger_DanielCaballero(7);
    	System.out.println(ValuE.getValuE());
    }
}
