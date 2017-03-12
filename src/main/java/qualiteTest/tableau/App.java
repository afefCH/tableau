package qualiteTest.tableau;

import java.text.DecimalFormat;

/**
 * Hello world!
 *
 */
public class App 
{
	public static double calculMoy(int tab[]) throws IllegalArgumentException{
		int som = 0;
		double moy = 0;
		if(tab == null){
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < tab.length; i++) {
			som = som + tab[i];
		}
		moy = (double)((double)som / (double)tab.length);
		
		DecimalFormat df = new DecimalFormat("#,###");      
		return Double.valueOf(df.format(moy));
	}
	
	public static double afficheMax(int tab[]) throws IllegalArgumentException{
		int max = 0 ;
		if(tab == null){
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < tab.length; i++) {
			if(tab[max] < tab[i])
				max = i;
		}
		return max;
	}
	
	public static double afficheMin(int tab[]) throws IllegalArgumentException{
		int min = 0 ;
		if(tab == null){
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < tab.length; i++) {
			if(tab[min] > tab[i])
				min = i;
		}
		return min;
	}
	
	public static void main( String[] args )
    {
    	double min, max,moyenne; 
    	int table [] = null;
    	
    	moyenne = calculMoy(table);
    	System.out.println("Moyenne = %f\n" + moyenne);
     
    	max = afficheMax(table);
    	System.out.println("max = %f\n" + max);
    	
    	min = afficheMin(table);
    	System.out.println("min = %f\n" + min);
     
    }
}
