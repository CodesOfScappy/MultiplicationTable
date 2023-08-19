package de.multi;

/**
 * Eine Klasse zur Generierung und Ausgabe des kleinen Einmaleins in einer
 * Tabellenform. Das kleine Einmaleins ist eine Tabelle, in der die Produkte von
 * Multiplikationen von 1 bis zu den angegebenen Breiten- und Höhenwerten
 * aufgeführt werden. Die Tabelle wird auf dem Bildschirm ausgegeben.
 * 
 * @author David Maurin
 * @version 1.0
 */
public class LittleMultiplicationTable {

	/**
	 * Die Hauptmethode des Programms, die das kleine Einmaleins ausgibt.
	 * 
	 * @param args Die Befehlszeilenargumente (werden nicht verwendet).
	 */
	public static void main(String[] args) {
		System.out.println("#################################");
		System.out.println("# Die kleinen Einmaleins-Reihen #");
		System.out.println("#################################");
		System.out.println();
		printMultiplicationTable(10, 10);
	}

	/**
	 * Generiert das kleine Einmaleins in einer Tabellenform und gibt es aus.
	 * 
	 * @param breite Die Anzahl der Spalten (Breite) der Tabelle.
	 * @param hoehe  Die Anzahl der Zeilen (Höhe) der Tabelle.
	 */
	public static void printMultiplicationTable(int width, int height) {
		int multiplicationTable[][] = new int[height][width];

		// Fülle das Array mit den Produkten der Multiplikation
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				multiplicationTable[i - 1][j - 1] = i * j;
			}
		}

		// Gib das kleine Einmaleins aus
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(multiplicationTable[i][j] + "\t");
			}
			System.out.println();
		}
	}
}