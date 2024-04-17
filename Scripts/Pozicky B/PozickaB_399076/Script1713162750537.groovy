import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.util.concurrent.Delayed

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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


Podpisovac podpisovac = new Podpisovac()

Email mail = new Email()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://es-test.minedu.sk/')

WebUI.click(findTestObject('Object Repository/Page_Portl elektronickch sluieb regionlneho_9bdbd3/a_Shlasm'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Portl elektronickch sluieb regionlneho_9bdbd3/a_Prihlsi sa'))

WebUI.click(findTestObject('Page_Spsoby prihlsenia sa na portl - Iam.Web/div_Identifiktor a heslo fyzickej osoby    _3153de'))

WebUI.setText(findTestObject('Page_Identifiktor a heslo fyzickej osoby - Iam.Web/input_Zadajte svoj identifiktor_DomainName'), 
    '930382290')

WebUI.setEncryptedText(findTestObject('Page_Identifiktor a heslo fyzickej osoby - Iam.Web/input_Zadajte svoje prihlasovacie heslo_Password'), 
    'U8nf8IyamTpUg019is4peg==')

WebUI.click(findTestObject('Page_Identifiktor a heslo fyzickej osoby - Iam.Web/input_Zabudnut heslo_btn-continue'))

WebUI.click(findTestObject('Object Repository/Page_Portl elektronickch sluieb regionlneho_9bdbd3/a_tudent'))

WebUI.click(findTestObject('Page_Elektronick sluby pre tudentov  Elektr_37b4bf/a_Podvanie iadosti o piku pre tudentov z Fo_135f09'))

WebUI.click(findTestObject('Page_Podvanie iadosti o piku pre tudentov z_37fe9e/a_Prejs na iados o piku (bez zabezpeenia ruiteom)'))

WebUI.waitForElementVisible(findTestObject('Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/span_ESRVS-2024-2168'), 0)

identifikator = WebUI.getText(findTestObject('Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/span_ESRVS-2024-2168'))

WebUI.verifyElementText(findTestObject('Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/span_ESRVS-2024-2168'), identifikator)

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Zadajte najvy zskan titul (v prpade v_aad6cd'), 
    'Ing.')

WebUI.click(findTestObject('Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_ttna prslunos_UI_V_ZP_in_Identifikacn_033c20'))

WebUI.verifyElementText(findTestObject('Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/span_Robert'), 'Robert')

WebUI.verifyElementText(findTestObject('Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/span_Chamraz'), 'Chamraz')

WebUI.verifyElementText(findTestObject('Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/span_0101031238'), '0101031238')

WebUI.verifyElementText(findTestObject('Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/span_03.01.2001'), '03.01.2001')

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Zadajte PS trvalho pobytu_UI_V_ZP_in__f1f09d'), 
    '04568')

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Zadajte kontaktn e-mailov adresu_UI_V_aee6cc'), 
    'barcik@ditec.sk')

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Zadajte telefnne slo vrtane medzinrod_dbbd6c'), 
    '+421987456321')

WebUI.click(findTestObject('Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Zhoduje sa Vaa korepondenn adresa s a_6ce0fa'))

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Pokraova'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/select_Hlavn                               _477f09'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/select_Hlavn2'), '2', false)

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Uloi'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/select_Vber Akadmia ozbrojench sl generla M_e1eb3a'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/select_Vber Fakulta priemyselnch technolgi _aa995f'), 
    '400000105', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Zadajte adresu koly_UI_V_ZP_in_SkolaS_4fb274'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_I. stupe_UI_V_ZP_in_SkolaSlovenska_St_7dbc3c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/select_1                                   _3dfe8f'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Zobrazi detail_UI_V_ZP_in_SkolaSloven_03cebd'))

'checkbox subezne studium\r\n'
WebUI.verifyElementChecked(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_tudujete sbene aj na inej fakulte  vy_e867b7'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/select_Vber Akadmia ozbrojench sl generla M_e1eb3a_1 (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/select_Vber Evanjelick bohosloveck fakulta _9b66ac'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_II. stupe_UI_V_ZP_in_DalsieStudiumSlo_199592'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/select_1                                   _4271de'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Mesiac_UI_V_ZP_in_DalsieStudiumSloven_ae0432'), 
    '6')

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Rok_UI_V_ZP_in_DalsieStudiumSlovenska_e3d9a8'), 
    '2026')

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Mesiac_UI_V_ZP_in_SkolaSlovenska_Datu_9c1a47'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Rok_UI_V_ZP_in_SkolaSlovenska_DatumSt_7956e6'), 
    '2027')

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Rok_UI_V_ZP_in_DalsieStudiumSlovenska_e3d9a8'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Pokraova'))

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Pokraova'))

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_tudent  III. stupa vysokokolskho tdia_8c32d4'), 
    '2000')

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Zadajte poadovan splatnos piky na cel_96d0f4'), 
    '10')

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Pokraova'))

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Oznamu o monosti predkladania iadost _3ca0bd'))

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Nie_typ-8'))

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Nie_typ-9'))

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

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Detail_1_2_3'))

WebUI.uploadFile(findTestObject('Page_Formulr iadosti o piku (bez zabezpeenia ruiteom)  Elektronick sluby portlu regionlneho a vysokho kolstva/input_Uloi_file-upload-field'), 
    'C:\\Users\\barcik\\Downloads\\form.573.Prehlad-24-potvrdenie-print-save_5a11da50-9aec-4f8b-a1a0-d42325a914a4.pdf')

WebUI.click(findTestObject('Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Uloi_2'))

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Detail_1_2_3_4'))

WebUI.uploadFile(findTestObject('Page_Formulr iadosti o piku (bez zabezpeenia ruiteom)  Elektronick sluby portlu regionlneho a vysokho kolstva/input_Uloi_file-upload-field'), 
    'C:\\Users\\barcik\\Downloads\\form.573.Prehlad-24-potvrdenie-print-save_5a11da50-9aec-4f8b-a1a0-d42325a914a4.pdf')

WebUI.click(findTestObject('Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Uloi_2'))

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Detail_1_2_3_4_5'))

WebUI.uploadFile(findTestObject('Page_Formulr iadosti o piku (bez zabezpeenia ruiteom)  Elektronick sluby portlu regionlneho a vysokho kolstva/input_Uloi_file-upload-field'), 
    'C:\\Users\\barcik\\Downloads\\form.573.Prehlad-24-potvrdenie-print-save_5a11da50-9aec-4f8b-a1a0-d42325a914a4.pdf')

WebUI.click(findTestObject('Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Uloi_2'))

WebUI.setText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/input_Zadajte miesto odoslania iadosti_UI_V_59ba54'), 
    'Bratislava')

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Pokraova'))

WebUI.click(findTestObject('Page_Formulr iadosti o piku (bez zabezpeenia ruiteom)  Elektronick sluby portlu regionlneho a vysokho kolstva/label_estne vyhlasujem, e vetky daje uveden v iadosti  s pravdiv a som si plne vedom prvnych nsledkov v prpade uvedenia nepravdivch dajov'))

WebUI.click(findTestObject('Page_Formulr iadosti o piku (bez zabezpeenia ruiteom)  Elektronick sluby portlu regionlneho a vysokho kolstva/label_Beriem na vedomie, e v slade s  17 ods. 8 zkona o FnPV fond zverejuje na svojom webovom sdle zoznam schvlench piiek, ktor obsahuje meno a priezvisko iadatea, ktormu bolo poskytnutie piky schvlen, dln sumu, lehotu s'))

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Podpsa iados o piku kvalifikovanm el_0eb4be'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/h1_Podvanie iadosti o piku pre tudentov z F_127594'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Podpsa'))

WebUI.delay(10)

podpisovac.podpisFormular()

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Odosla'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/h1_daje zo iadosti o piku boli odoslan'), 
    'Údaje zo žiadosti o pôžičku boli odoslané.')

WebUI.click(findTestObject('Object Repository/Page_Formulr iadosti o piku (bez zabezpeeni_2a8278/button_Prejs na domovsk strnku'))

WebUI.click(findTestObject('Page_Portl elektronickch sluieb regionlneho_9bdbd3/a_Privtna zna'))

WebUI.click(findTestObject('Page_Portl elektronickch sluieb regionlneho_9bdbd3/div_Zoznam rozpracovanch podan_icon-blue'))

WebUI.setText(findTestObject('Page_Zoznam odoslanch podan  Elektronick sl_14b0c6/input_Identifiktor_identifikator'), identifikator)

WebUI.click(findTestObject('Page_Zoznam odoslanch podan  Elektronick sl_14b0c6/button_Vyhada'))

WebUI.click(findTestObject('Page_Zoznam odoslanch podan  Elektronick sl_14b0c6/a_Detail'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Detail podania  Elektronick sluby port_bcdefc/span_ESRVS-2024-2168'), 
    identifikator)

WebUI.verifyElementText(findTestObject('Page_Detail podania  Elektronick sluby port_bcdefc/span_Robert Chamraz'), 'Robert Chamraz')

WebUI.verifyElementText(findTestObject('Page_Detail podania  Elektronick sluby port_bcdefc/span_Podvanie iadosti o piku pre tudentov z_b27195'), 
    'Podávanie žiadosti o pôžičku pre študentov z Fondu na podporu vzdelávania (bez ručitela)')

WebUI.click(findTestObject('Page_Detail podania  Elektronick sluby port_bcdefc/a_Odhlsi'))

WebUI.verifyElementPresent(findTestObject('Page_Portl elektronickch sluieb regionlneho_9bdbd3/a_Prihlsi sa'), 0)

WebUI.closeBrowser()

WebUI.delay(30)

mail.kontrolaMailu(2, identifikator)
