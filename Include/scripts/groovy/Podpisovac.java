
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject;
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords; 


public class Podpisovac {
	
	public Podpisovac() {
		// TODO Auto-generated constructor stub
	}
	
	public void podpisFormular(){
		WindowsBuiltinKeywords.startApplicationWithTitle("C:\\Program Files\\Ditec\\DSigner .NET\\Ditec.Zep.DSigXadesStandalone.exe", "");

		WindowsBuiltinKeywords.switchToDesktop();

		WindowsBuiltinKeywords.click(findWindowsObject("Podpisovac/Podpísať_podpis"));

		WindowsBuiltinKeywords.click(findWindowsObject("Podpisovac/Vyber_filtra_podpis"));

		WindowsBuiltinKeywords.click(findWindowsObject("Podpisovac/Potvrd_vyber_filtra_podpis"));

		WindowsBuiltinKeywords.doubleClick(findWindowsObject("Podpisovac/Certifikat_podpis"));

		WindowsBuiltinKeywords.delay(3);

		WindowsBuiltinKeywords.click(findWindowsObject("Podpisovac/OK_podpis"));

		WindowsBuiltinKeywords.switchToApplication();
		WindowsBuiltinKeywords.closeApplication();
	}
	
}