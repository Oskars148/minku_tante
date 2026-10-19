package minku_tante;
import java.io.File;
import java.time.Year;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class MinkuTante {
	
	static String virknesParbaude(String zinojums, String noklusejums) {
		String virkne;
		do {
			virkne = JOptionPane.showInputDialog(zinojums, noklusejums);
			if(virkne == null)
				return null;
			
			virkne = virkne.trim();
		}while(!Pattern.matches("^[\\p{L} ]+$", virkne));
		return virkne;
	}
	
	static int skaitlaParbaude(String zinojums, int min, int max) {
		String ievade;
		int skaitlis;
		
		while(true) {
			ievade = JOptionPane.showInputDialog(zinojums, min);
			if(ievade == null)
				return -1;
			
			try {
				skaitlis = Integer.parseInt(ievade);
				if(skaitlis < min || skaitlis > max) {
					JOptionPane.showMessageDialog(null,  "Norādītais skaitlis ir ārpus pieļaujamā intervāla", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
					continue;
				}
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null,  "Netika ievadits vesels skaitlis!",
						"Kļūda!", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
		

	public static void main(String[] args) {
		Minka runcis = new Minka("Muris", "Meinkūns",
				"Pelēks", "Pētris", 2021, true, "loto");
		
		JOptionPane.showMessageDialog(null, runcis.nolasitAtributus());
		runcis.medit();
		String izvelne, failsNosaukums = System.getProperty("user.home") + File.separator
				+ "Desktop" + File.separator + "minkas.txt";
				
				Minka runcis = null;
				String[] darbibuSaraksts = {"Izveidot kaķi", "Izsaukt metodi", "Saglabāt failā",
						"Apskatīt failā saglabātos kaķus", "Aizvērt"};
				
				do {
					izvelne = (String) JOptionPane.showInputDialog(null, "Izvēlies darbību",
							"Darbību izvēle", JOptionPane.QUESTION_MESSAGE,
							null, darbibuSaraksts, darbibuSaraksts[0]);
					if(izvelne == null)
						izvelne = "Aizvērt";
					
					switch(izvelne) {
					case"Izveidot kaķi":
						String minkasVards, skirne, splavasKrasa, saimnieks, cels;
						int dzGads = 0;
						boolean siksnina;
						
						minkasVards =
								virknesParbaude("Ievdi kaķa vārdu", "Rudis");
						skirne = 
								virknesParbaude("Ievdi kaķa šķirni", "Meinkūns");
						spalvasKrasa =
								virknesParbaude("Ievdi kaķa kažoka krāsu", "Pelēka");
						saimnieks =
								virknesParbaude("Ievdi saimnieka vārdu", "Mirdza");
						cels = virknesParbaude("Ievdi bildes nosaukumu", "Rudis");
						dzGads = skaitlaparbaude("Norādi kaķa dzimšanas gadu", (Year.now().getValue()) - 19, (Year.now().getValue()));
						
						break;
					}
				}while(!izvelne.equals("Aizvērt"));
	}
	
}