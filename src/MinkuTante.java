import java.io.File;

import javax.swing.JOptionPane;

public class MinkuTante {

	public static void main(String[] args) {
//		Minka runcis = new Minka("Muris", "Meinkūns",
//				"Pelēks", "Pētris", 2021, true, "loto");
//		
//		JOptionPane.showMessageDialog(null, runcis.nolasitAtributus());
//		runcis.medit();
		String izvelne, failsNosaukums = System.getProperty("user.home") + File.separator
				+ "Desktop" + file.separator + "minkas.txt";
				
				Minka runcis = null;
				String[] darbibuSaraksts = {"Izveidot kaķi", "Izsaukt metodi", "Saglabāt failā",
						"Apskatīt failā saglabātos kaķus", "Aizvērt"};
				
				do {
					izvelne = (String) JOptionPane.showInputDialog(null, "Izvēlies darbību",
							"Darbību izvēle", JOptionPane.QUESTION_MESSAGE,
							null, darbibuSaraksts, darbibuSaraksts[0]);
				}while(!izvelne.equals("Aizvērt"));
	}
	
}