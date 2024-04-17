import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.apache.groovy.parser.antlr4.GroovyParser.IfElseStatementContext
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://es-test.minedu.sk/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Portl elektronickch sluieb regionlneho_9bdbd3/a_Shlasm'))

WebUI.click(findTestObject('Object Repository/Page_Portl elektronickch sluieb regionlneho_9bdbd3/a_Prihlsi sa'))

WebUI.click(findTestObject('Object Repository/Page_Spsoby prihlsenia sa na portl - Iam.Web/div_Registranho formulra_icon'))

WebUI.setText(findTestObject('Object Repository/Page_Identifiktor a heslo fyzickej osoby - Iam.Web/input_Zadajte svoj identifiktor_DomainName'), 
    '930382290')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Identifiktor a heslo fyzickej osoby - Iam.Web/input_Zadajte svoje prihlasovacie heslo_Password'), 
    'U8nf8IyamTpUg019is4peg==')

WebUI.click(findTestObject('Object Repository/Page_Identifiktor a heslo fyzickej osoby - Iam.Web/input_Zabudnut heslo_btn-continue'))

WebUI.click(findTestObject('Object Repository/Page_Portl elektronickch sluieb regionlneho_9bdbd3/a_tudent'))

WebUI.click(findTestObject('Object Repository/Page_Elektronick sluby pre tudentov  Elektr_37b4bf/a_Podvanie iadosti o piku pre tudentov z Fo_135f09'))

WebUI.click(findTestObject('Object Repository/Page_Podvanie iadosti o piku pre tudentov z_37fe9e/a_Prejs na iados o piku (bez zabezpeenia ruiteom)'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/span_ESRVS-2024-2148'), 
    0)

identifikator = WebUI.getText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/span_ESRVS-2024-2148'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/span_ESRVS-2024-2148'), 
    identifikator, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Zadajte PS trvalho pobytu_UI_V_ZP_in__f1f09d'), 
    '05687')

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Zadajte kontaktn e-mailov adresu_UI_V_aee6cc'), 
    'barcik@ditec.sk')

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Zadajte najvy zskan titul (v prpade v_aad6cd'), 
    'Ing.')

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Zadajte telefnne slo vrtane medzinrod_dbbd6c'), 
    '+421950654789')

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Pokraova'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/select_Hlavn                               _477f09'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/select_Hlavn2'), '2', false)

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Uloi'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/select_Vber Fakulta priemyselnch technolgi _aa995f'), 
    '400000105', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Zadajte adresu koly_UI_V_ZP_in_SkolaS_4fb274'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_De_UI_V_ZP_in_SkolaSlovenska_DatumZapisu-day'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Mesiac_UI_V_ZP_in_SkolaSlovenska_Datu_c1c0f2'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Rok_UI_V_ZP_in_SkolaSlovenska_DatumZa_88e07d'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_I. stupe_UI_V_ZP_in_SkolaSlovenska_St_7dbc3c'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/select_1                                   _3dfe8f'), 
    0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Zobrazi detail_UI_V_ZP_in_SkolaSloven_03cebd'))

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Mesiac_UI_V_ZP_in_SkolaSlovenska_Datu_9c1a47'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Rok_UI_V_ZP_in_SkolaSlovenska_DatumSt_7956e6'), 
    '2027')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_tudujete sbene aj na inej fakulte  vy_e867b7'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/select_Vber Akadmia ozbrojench sl generla M_e1eb3a'), 
    0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/select_Vber Evanjelick bohosloveck fakulta _9b66ac'), 
    0, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/select_1                                   _4271de'), 
    '4', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_II. stupe_UI_V_ZP_in_DalsieStudiumSlo_199592'), 
    0, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Mesiac_UI_V_ZP_in_DalsieStudiumSloven_ae0432'), 
    '6')

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Rok_UI_V_ZP_in_DalsieStudiumSlovenska_e3d9a8'), 
    '2026')

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Pokraova'))

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_tudent  III. stupa vysokokolskho tdia_8c32d4'), 
    '2000')

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Zadajte poadovan splatnos piky na cel_96d0f4'), 
    '10')

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Pokraova'))

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Oznamu o monosti predkladania iadost _3ca0bd'))

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Pokraova'))

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Detail'))

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Potvrdenie o nvteve V v SR (iadate)_s_46946e'))

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Uloi_1'))

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Detail_1'))

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Potvrdenie o nvteve V v SR (iadate)_s_46946e'))

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Uloi_1'))

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Detail_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Potvrdenie o nvteve V v SR (iadate)_s_46946e'))

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Uloi_1'))

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Zadajte miesto odoslania iadosti_UI_V_59ba54'), 
    'Bratislava')

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Pokraova'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/div_ESRVS-2024-2148'), 
    identifikator, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_shlasm so zskanm dajov z referennch r_c9102a'))

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_www.fnpv.sk_UI_V_ZP_in_CHB_OsobneUdaj_50afb9'))

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Odosla nepodpsan iados o piku a vytl_be1331'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/h1_daje zo iadosti o piku boli odoslan'), 
    0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/a_Privtna zna'))

WebUI.click(findTestObject('Object Repository/Page_Portl elektronickch sluieb regionlneho_9bdbd3/div_Zoznam rozpracovanch podan_icon-blue'))

WebUI.setText(findTestObject('Object Repository/Page_Zoznam odoslanch podan  Elektronick sl_14b0c6/input_Identifiktor_identifikator'), 
    identifikator)

WebUI.click(findTestObject('Object Repository/Page_Zoznam odoslanch podan  Elektronick sl_14b0c6/button_Vyhada'))

WebUI.click(findTestObject('Object Repository/Page_Zoznam odoslanch podan  Elektronick sl_14b0c6/a_Detail'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Detail podania  Elektronick sluby port_bcdefc/span_ESRVS-2024-2148'), 
    identifikator, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Detail podania  Elektronick sluby port_bcdefc/span_Robert Chamraz'), 
    'Robert Chamraz', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Detail podania  Elektronick sluby port_bcdefc/span_Podvanie iadosti o piku pre tudentov z_b27195'), 
    'Podávanie žiadosti o pôžičku pre študentov z Fondu na podporu vzdelávania (bez ručitela)', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Detail podania  Elektronick sluby port_bcdefc/a_Odhlsi'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Portl elektronickch sluieb regionlneho_9bdbd3/a_Prihlsi sa'), 
    0)

WebUI.closeBrowser()

Email mail = new Email()
mail.kontrolaMailu(4, identifikator)


