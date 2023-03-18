
public class main {
	
	public static boolean estSansDoublon(int[] tabNbEntier) {
		int verifNum;

		boolean pasDoublon = true;
		for (int i = 0; i < tabNbEntier.length && pasDoublon; i++) {
			verifNum = tabNbEntier[i];
			for ( int j = 0; j < tabNbEntier.length; j++) {
				if (j != i && tabNbEntier[j] == verifNum)
					pasDoublon = false;
			}
		}
		return pasDoublon;
	}
	
	public static int getNombresValeursPresentes(int[] t, int[] v) {
		int comparateurNum;
		int i, j;
		int compteurValeursPresentes = 0;
		
		for (i = 0; i < t.length; i++) {
			comparateurNum = t[i];
			for (j = 0; j < v.length; j++) {
				if (comparateurNum == v[j])
					compteurValeursPresentes++;
			}
		}
		return compteurValeursPresentes;
		
	}
	
	public static int inserer(int[] t, int x, int position) {
		int i;
		for(i = t.length-1; i > position; i--) 
			t[i] = t[i - 1];
		t[position] = x;
		return 1;
	}
	
	public static int trierInserer(int[] t, int x) {
		int max = t[0];
		int i;
		int indexMax = 0;
		int j, k, temp;
		
		for (j = 1; j < t.length; j++) {
			if (t[j] > max) {
				max = t[j];
				indexMax = j;
			}
		}
		
		t[indexMax] = x;
		
		for (int m = 0; m < t.length; m++) {
			System.out.println(t[m]);
		}

		for (i = 1; i < t.length; i++) {
			temp = t[i];
			for (k = i; k > 0 && t[k-1] > temp; k--) {
				t[k] = t[k-1];
			
			}
			t[k] = temp;
		}
		return 1;

	}
	
	public static int rechercheBinaire(String[] tab, String val) {
		boolean trouvee = false;
		int debut = 0;
		int fin = tab.length-1;
		int milieu = -1;
		while (debut<=fin && !trouvee) {
			milieu = (fin + debut)/2;
			if (val.compareTo(tab[milieu]) == 0) 
				trouvee = true;
			else if (tab[milieu].compareTo(val)>0)
				fin = milieu - 1;
			else
				debut = milieu + 1;
		}
		if (trouvee)
			return 1;
		else
			return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabNbEntier = {12,2,32,232,5,9,7};
		int[] tab2 = {23,2,3,124,5363,2,1};
		
		System.out.println(estSansDoublon(tabNbEntier));
		System.out.println(getNombresValeursPresentes(tabNbEntier, tab2));
		
		inserer(tab2, 123124, 3);
		for (int i = 0; i < tab2.length; i++) {
			System.out.println(tab2[i]);
		}
		
		trierInserer(tabNbEntier, 99999);
		for (int j = 0; j < tabNbEntier.length; j++) {
			System.out.println(tabNbEntier[j]);
		}
		
		String[] tabString = {"allo", "mon", "beau", "haha", "tch"};
		System.out.println(rechercheBinaire(tabString, "alla"));
		
	}

}
