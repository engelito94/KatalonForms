import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

KeywordLogger log = new KeywordLogger()

Email mail = new Email()

Podpisovac podpis = new Podpisovac()

Formular form = new Formular()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://es-test.minedu.sk/')

if (form.prihlasUzivatela('930471954', 'zTTfKFASM+jMVRoiJaGOIA==')) {
    log.logInfo('Prihlasenie uspesne')
} else {
    log.logFailed('Prihlasenie zlyhalo')
}

WebUI.click(findTestObject('Object Repository/Page_Portl elektronickch sluieb regionlneho_9bdbd3/a_Pedagogick a odborn zamestnanec'))

WebUI.click(findTestObject('Object Repository/Page_Elektronick sluby pre pedagogickch a o_83fa6f/a_Podvanie iadosti o piku pre pedaggov z Fo_d7a76f'))

WebUI.click(findTestObject('Object Repository/Page_Podvanie iadosti o piku pre pedaggov z_981991/a_Prejs na podvanie iadosti o piku pre peda_d8ef74'))

WebUI.waitForElementPresent(findTestObject('Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/span_ESRVS-2024-2188'), 30, 
    FailureHandling.STOP_ON_FAILURE)

identifikator = WebUI.getText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/span_ESRVS-2024-2188'))

WebUI.verifyElementText(findTestObject('Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/span_ESRVS-2024-2188'), identifikator)

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Zadajte najvy zskan titul (v prpade v_aad6cd'), 
    'Ing.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/span_Marek'), 
    'Marek')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/span_Tirpk'), 
    'Tirpák')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/span_8001010017'), 
    '8001010017')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/span_01.01.1980'), 
    '01.01.1980')

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/label_In'))

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Zadajte PS trvalho pobytu_UI_V_ZP_in__f1f09d'), 
    '07865')

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/label_Nie'))

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Zadajte obec alebo mesto, kam bude v _9b039a'), 
    'Košice-Juh')

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pedaggov z Fondu na podporu vzdelvania  Elektronick sluby portlu regionlneho a vysokho kolstva/div_Koice-Juh (Koice IV)'))

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Zadajte ulicu, kam bude v prpade potr_a6c0b2'), 
    'Vymyslená')

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Zadajte spisn slo, kam bude v prpade _a00d5c'), 
    '98')

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Zadajte orientan slo, kam bude v prpa_557c52'), 
    '55')

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Zadajte PS, kam bude v prpade potreby_22cb62'), 
    '01265')

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Zadajte kontaktn e-mailov adresu_UI_V_aee6cc'))

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Zadajte kontaktn e-mailov adresu_UI_V_aee6cc'), 
    GlobalVariable.email)

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Zadajte telefnne slo vrtane medzinrod_dbbd6c'), 
    '+421456321789')

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Vyberte minimlne jednu, alebo viac mo_04f0d9'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_doktorand v dennej forme tdia_UI_V_ZP_9333fb'))

if (WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Pokraova'))) {
    log.logInfo('Udaje korektne zadane')
} else {
    log.logFailed('Chyba pri zadavani')
}

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Pokraova'))

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Poadovan vka piky (zaokrhlene na stov_c8e10c'), 
    '15000')

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Zadajte poadovan splatnos piky na cel_03b518'), 
    '15')

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Pokraova'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Vygenerova potvrdenie_checkbox'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Odstrni'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Vygenerova potvrdenie_checkbox'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Odstrni'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Prida'))

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Uvete presn nzov zamestnvatea, kde pr_ffa6a4'), 
    'škola 1')

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Poloka mus by vyplnen_UI_V_ZP_in_Udaj_cdc09e'), 
    'tst@tst.sk')

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Vyhadajte obec po zadan prvch 3 znako_4b7030'), 
    'Martin')

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/div_Martin (Martin)'))

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Spisn slo_UI_V_ZP_in_AdresaZamestnava_d21fa0'), 
    '55')

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Poloka mus by vyplnen_UI_V_ZP_in_Adre_3a19c5'), 
    '65458')

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Uvete presn nzov pracovnej pozcie_UI__8f6d79'), 
    'gh')

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_De_UI_V_ZP_in_PracovnaPozicia_DatumNa_0fb358'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Mesiac_UI_V_ZP_in_PracovnaPozicia_Dat_7d96bd'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Rok_UI_V_ZP_in_PracovnaPozicia_DatumN_103076'), 
    '2005')

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Muste vybra aspo jednu monos_UI_V_ZP__218c8d'))

WebUI.click(findTestObject('Page_Formulr Podvanie iadosti o piku pre pedaggov z Fondu na podporu vzdelvania  Elektronick sluby portlu regionlneho a vysokho kolstva/input_Poloka mus by vyplnen_UI_V_ZP_in_PracovnaPozicia_TypZmluvy-group-2'))

WebUI.click(findTestObject('Page_Formulr Podvanie iadosti o piku pre pedaggov z Fondu na podporu vzdelvania  Elektronick sluby portlu regionlneho a vysokho kolstva/input_Poloka mus by vyplnen_UI_V_ZP_in_PracovnaPozicia_DruhZmluvy-group-2'))

WebUI.check(findTestObject('Page_Formulr Podvanie iadosti o piku pre pedaggov z Fondu na podporu vzdelvania  Elektronick sluby portlu regionlneho a vysokho kolstva/input_Poloka mus by vyplnen_UI_V_ZP_in_PracovnaPozicia_PedagogickaCinnost-group-2'))

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Poloka mus by vyplnen_UI_V_ZP_in_Prac_796394'), 
    '1000')

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Poloka mus by vyplnen_UI_V_ZP_in_Prac_cae66d'), 
    '800')

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Uloi'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/a_Vygenerova potvrdenie'))

if (WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Pokraova'))) {
    log.logInfo('Pridanie zamestnavatela uspesne')
} else {
    log.logFailed('Pridanie zamestnavatela zlyhalo')
}

WebUI.delay(30)

String subor = mail.ulozPrilohu()

if (mail.kontrolaDokumentu(subor, 'Marek') > 1) {
    log.logPassed('Zhoda najdena')
} else {
    log.logFailed('Zhoda nebola najdena')
}

if (mail.kontrolaDokumentu(subor, 'Tirpák') > 1) {
    log.logPassed('Zhoda najdena')
} else {
    log.logFailed('Zhoda nebola najdena')
}

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Pokraova'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Nie_typ-27'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Nie_typ-29'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Pokraova'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Detail'))

WebUI.uploadFile(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Uloi_file-upload-field'), 
    'C:\\Users\\barcik\\Downloads\\form.573.Prehlad-24-potvrdenie-print-save_5a11da50-9aec-4f8b-a1a0-d42325a914a4.pdf')

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Uloi_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Detail_1'))

WebUI.uploadFile(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Uloi_file-upload-field'), 
    'C:\\Users\\barcik\\Downloads\\form.573.Prehlad-24-potvrdenie-print-save_5a11da50-9aec-4f8b-a1a0-d42325a914a4.pdf')

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Uloi_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Detail_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Spolon vekos priloench sborov nesmie _e74e60'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Uloi_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Detail_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Spolon vekos priloench sborov nesmie _e74e60'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Uloi_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Detail_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Spolon vekos priloench sborov nesmie _e74e60'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Uloi_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Detail_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Spolon vekos priloench sborov nesmie _e74e60'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Uloi_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Detail_1_2_3_4_5_6'))

WebUI.uploadFile(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Uloi_file-upload-field'), 
    'C:\\Users\\barcik\\Downloads\\form.573.Prehlad-24-potvrdenie-print-save_5a11da50-9aec-4f8b-a1a0-d42325a914a4.pdf')

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Uloi_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Detail_1_2_3_4_5_6_7'))

WebUI.uploadFile(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Uloi_file-upload-field'), 
    'C:\\Users\\barcik\\Downloads\\form.573.Prehlad-24-potvrdenie-print-save_5a11da50-9aec-4f8b-a1a0-d42325a914a4.pdf')

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Uloi_1_2'))

WebUI.setText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/input_Zadajte miesto odoslania iadosti_UI_V_59ba54'), 
    'Bratislava')

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Pokraova'))

WebUI.verifyElementText(findTestObject('Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/div_ESRVS-2024-2188'), identifikator)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/div_Bratislava'), 
    'Bratislava')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/div_Ing'), 
    'Ing.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/div_Marek'), 
    'Marek')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/div_Tirpk'), 
    'Tirpák')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/div_Mlynsk 3292207865 Koice-Star Mesto (Koi_afa4d6'), 
    'Mlynská 329/2207865 Košice-Staré Mesto (Košice I)Slovenská republika', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/div_421456321789'), 
    '+421456321789', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/div_barcikditec.sk'), 
    GlobalVariable.email, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/div_15000'), 
    '15000')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/div_15'), '15')

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/label_estne vyhlasujem, e vetky daje uveden_88100d'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/label_Beriem na vedomie, e v slade s  17 od_1288a0'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Podpsa iados o piku kvalifikovanm el_0eb4be'))

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Podpsa'))

WebUI.delay(12)

podpis.podpisFormular()

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Odosla'))

WebUI.waitForElementVisible(findTestObject('Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Prejs na domovsk strnku'), 
    20)

WebUI.click(findTestObject('Object Repository/Page_Formulr Podvanie iadosti o piku pre pe_fbb4f4/button_Prejs na domovsk strnku'))

WebUI.click(findTestObject('Page_Portl elektronickch sluieb regionlneho_9bdbd3/a_Privtna zna'))

WebUI.click(findTestObject('Object Repository/Page_Portl elektronickch sluieb regionlneho_9bdbd3/span_Zoznam odoslanch podan'))

WebUI.setText(findTestObject('Page_Zoznam odoslanch podan  Elektronick sl_14b0c6/input_Identifiktor_identifikator'), identifikator)

WebUI.click(findTestObject('Page_Zoznam odoslanch podan  Elektronick sl_14b0c6/button_Vyhada'))

WebUI.click(findTestObject('Page_Zoznam odoslanch podan  Elektronick sl_14b0c6/a_Detail'))

WebUI.verifyElementText(findTestObject('Page_Detail podania  Elektronick sluby port_bcdefc/span_ESRVS-2024-2188'), identifikator)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Detail podania  Elektronick sluby port_bcdefc/span_Marek Tirpk'), 
    'Marek Tirpák')

WebUI.closeBrowser()

WebUI.delay(30)

mail.kontrolaMailu(2, identifikator)

