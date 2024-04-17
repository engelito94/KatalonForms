
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import com.kms.katalon.core.logging.KeywordLogger;
import com.kms.katalon.core.model.FailureHandling;
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords;


public class Email {
	public Email() {
		// TODO Auto-generated constructor stub
	}
	
	public void kontrolaMailu(int cislo, String identifikator) {
		KeywordLogger log = new KeywordLogger();

		WindowsBuiltinKeywords.startApplicationWithTitle("C:\\Program Files\\Microsoft Office\\root\\Office16\\OUTLOOK.EXE", "");
		
		WindowsBuiltinKeywords.waitForElementPresent(findWindowsObject("Object Repository/Edit(1)"), 30);

		WindowsBuiltinKeywords.setText(findWindowsObject("Object Repository/Edit(1)"), identifikator);
		
		WindowsBuiltinKeywords.delay(1);
		
		WindowsBuiltinKeywords.click(findWindowsObject("Object Repository/TabItem"));
		
		String text = "";
		
		for (int i = 0; i < cislo; i++) {
			
			WindowsBuiltinKeywords.click(findWindowsObject("Object Repository/DataItem"));
		
			text = WindowsBuiltinKeywords.getText(findWindowsObject("Object Repository/Edit"));
			if (text.indexOf("PDF") != -1) {
				log.logPassed("Priloha prilozena");
			} else if(text.indexOf("úplné overenie") != -1) {
				log.logPassed("Uplne overenie najdene");
			} else if(text.indexOf("predbežné overenie") != -1) {
				log.logPassed("Predbezne overenie najdene");
			} else if(text.indexOf("prijatá doručenka") != -1) {
				log.logPassed("Dorucenka najdena");
			}
			WindowsBuiltinKeywords.click(findWindowsObject("Object Repository/Button(3)"));
		}

		WindowsBuiltinKeywords.closeApplication();
	}
	
	/*v ulozenom dokumente najde vyskyt podla zadaneho parametra
	 * subor : "nazov suboru", ocakavanyVysledok: hladany retazec
	 * vrati inde >0 pri zhode */
	public int kontrolaDokumentu(String subor, String ocakavanyVysledok) throws IOException {
		String cesta = "C:\\Users\\barcik\\Katalon Studio\\Ris2Formulare\\Files\\" + subor + ".pdf";
		File file = new File(cesta);
		PDDocument doc = new PDDocument();
		doc = Loader.loadPDF(file);
		PDFTextStripper stripper = new PDFTextStripper();
		String pdfFileInText = stripper.getText(doc);

		int index = pdfFileInText.indexOf(ocakavanyVysledok);
		doc.close();

		return index;
	}
	
	/*z mailu ulozi prilohu
	 *  vrati nazov ulozeneho suboru suboru*/
	public String ulozPrilohu() {
		KeywordLogger log = new KeywordLogger();

		WindowsBuiltinKeywords.startApplicationWithTitle("C:\\Program Files\\Microsoft Office\\root\\Office16\\OUTLOOK.EXE", "");

		WindowsBuiltinKeywords.setText(findWindowsObject("Object Repository/Edit(1)"), "Potvrdenie školy o zamestnaní");

		WindowsBuiltinKeywords.click(findWindowsObject("Object Repository/DataItem")); //klik na email

		WindowsBuiltinKeywords.click(findWindowsObject("Object Repository/Button")); //klik na drop-down prilohy

		WindowsBuiltinKeywords.click(findWindowsObject("Object Repository/MenuItem")); //klik saveAs

		WindowsBuiltinKeywords.switchToDesktop();

		WindowsBuiltinKeywords.setText(findWindowsObject("Explorer/Files"), " C:\\Users\\barcik\\Katalon Studio\\Ris2Formulare\\Files");

		WindowsBuiltinKeywords.click(findWindowsObject("Object Repository/Explorer/GoTo")); //potvrdenie cesty

		String subor = WindowsBuiltinKeywords.getText(findWindowsObject("Object Repository/Explorer/Nazov_suboru")); //nazov suboru
		        
		WindowsBuiltinKeywords.click(findWindowsObject("Object Repository/Explorer/Save_button")); //ulozenie suboru do priecinka v projekte

		if (WindowsBuiltinKeywords.waitForElementPresent(findWindowsObject("Object Repository/Explorer/Yes_button"), 0, FailureHandling.OPTIONAL) == true) {
			WindowsBuiltinKeywords.click(findWindowsObject("Object Repository/Explorer/Yes_button"));
		}

		WindowsBuiltinKeywords.switchToApplication();
		
		log.logInfo("subor uspesne ulozeny");

		WindowsBuiltinKeywords.click(findWindowsObject("Object Repository/TabItem")); //karta home

		WindowsBuiltinKeywords.click(findWindowsObject("Object Repository/Button(3)")); //vymazat mail
		
		log.logPassed("Ulozenie prilohy OK");

		WindowsBuiltinKeywords.closeApplication();
		
		return subor;
	}
}