
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject;

import com.kms.katalon.core.model.FailureHandling;
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords;

public class Formular {

	public Formular() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean prihlasUzivatela(String user, String password) {
		WebUiBuiltInKeywords.click(findTestObject("Object Repository/Page_Portl elektronickch sluieb regionlneho_9bdbd3/a_Shlasm"));

		WebUiBuiltInKeywords.maximizeWindow();

		WebUiBuiltInKeywords.click(findTestObject("Page_Portl elektronickch sluieb regionlneho_9bdbd3/a_Prihlsi sa"));

		WebUiBuiltInKeywords.click(findTestObject("Page_Spsoby prihlsenia sa na portl - Iam.Web/div_Identifiktor a heslo fyzickej osoby    _3153de"));

		WebUiBuiltInKeywords.setText(findTestObject("Page_Identifiktor a heslo fyzickej osoby - Iam.Web/input_Zadajte svoj identifiktor_DomainName"), 
		    user);

		WebUiBuiltInKeywords.setEncryptedText(findTestObject("Page_Identifiktor a heslo fyzickej osoby - Iam.Web/input_Zadajte svoje prihlasovacie heslo_Password"), 
		    password);

		WebUiBuiltInKeywords.click(findTestObject("Page_Identifiktor a heslo fyzickej osoby - Iam.Web/input_Zabudnut heslo_btn-continue"));
		
		if (WebUiBuiltInKeywords.verifyElementPresent(findTestObject("Page_Detail podania  Elektronick sluby port_bcdefc/a_Odhlsi"), 0, FailureHandling.OPTIONAL)) {
			return true;
		} else {
			return false;
		}
	}
}