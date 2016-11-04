//*******���ʵ�鶯���������֤��죨����ɣ�
/**������ɣ�
 * 2016��9��21��14:34:17
 * ���ʵ�鶯���������֤���
 * Ŀ�ģ������������ݡ�
 * ����� �����ݵĴ�����com.firstversion.SH* **/

package cos.firstversion.SH.animal;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cos.firstversion.SH.*;
public class ProjectAnimalProductionAnnualInspection {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass
  public void setUp() throws Exception {
//    driver = new FirefoxDriver();
    baseUrl = "http://183.62.232.131:8099/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test2222222222222222() throws Exception {
	  driver.get(baseUrl + "/");
	    driver.manage().window().maximize();
	    Login.login(driver);      // �����˵�¼����֯�������루��������ô��룩��֤�����롢���롣 ���Ե�¼���ڽ����˷�װ���� ����û�а����������
	   
	    Thread.sleep(4000);
	    driver.findElement(By.id("jpwFinish")).click(); // �رյ����Ĵ��ڡ�
	    driver.findElement(By.id("tree2_1_span")).click();
	    driver.findElement(By.id("tree2_2_span")).click();

/**�л���main**/	    
	    driver.findElement(By.id("main")).click();   
	    Thread.sleep(3000); 	
	    driver.switchTo().parentFrame();
	    driver.switchTo().frame("main");   // ��ת��main
	    driver.findElement(By.id("11baad43-6bec-4890-b20f-0a9600d2de54")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);      
	    driver.switchTo().frame("kcw_artdialog_b6980eff-b305-4b75-ab04-532565642df0");  //  ��ת��iframe�У�
	    driver.findElement(By.linkText("ʵ�鶯���������֤���")).click();
	    driver.switchTo().parentFrame();  // ��ת    
	    Thread.sleep(3000);

    
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
/*** ��ҵ��Ա���    ***/    
    driver.findElement(By.linkText("��ҵ��Ա���")).click();
    driver.findElement(By.id("995e0b6f-d0fb-4011-8a37-518d4d061391")).clear();
    driver.findElement(By.id("995e0b6f-d0fb-4011-8a37-518d4d061391")).sendKeys("���ҳ���");
    driver.findElement(By.id("fc9129a3-27b4-478e-95e3-62a7791fc603")).clear();
    driver.findElement(By.id("fc9129a3-27b4-478e-95e3-62a7791fc603")).sendKeys("leader");
    driver.findElement(By.id("55e94272-1c44-4c2d-92f9-104ddf56ffe4")).clear();
    driver.findElement(By.id("55e94272-1c44-4c2d-92f9-104ddf56ffe4")).sendKeys("0001");
    driver.findElement(By.id("6680dde3-af10-467f-9148-fceb22320aa9")).clear();
    driver.findElement(By.id("6680dde3-af10-467f-9148-fceb22320aa9")).sendKeys("212");
    driver.findElement(By.id("388623af-739e-4eed-ac3b-f52fe09153f4")).clear();
    driver.findElement(By.id("388623af-739e-4eed-ac3b-f52fe09153f4")).sendKeys("����");

    driver.findElement(By.id("6d85bfe9-ba29-41d7-a9fe-494d21ee2acf")).clear();
    driver.findElement(By.id("6d85bfe9-ba29-41d7-a9fe-494d21ee2acf")).sendKeys("423232");
    driver.findElement(By.id("5f73d872-66d7-4850-9df8-a7154681c463")).clear();
    driver.findElement(By.id("5f73d872-66d7-4850-9df8-a7154681c463")).sendKeys("����");
    driver.findElement(By.id("ed04cd1f-1c37-4834-b7c0-45b938c0e91a")).clear();
    driver.findElement(By.id("ed04cd1f-1c37-4834-b7c0-45b938c0e91a")).sendKeys("432323");
    driver.findElement(By.id("c410d83f-7d48-4c49-b4d5-719580e93624")).clear();
    driver.findElement(By.id("c410d83f-7d48-4c49-b4d5-719580e93624")).sendKeys("dpc");
    driver.findElement(By.id("ff0c4589-14a3-4f0b-bac3-ff52a47f8336")).clear();
    driver.findElement(By.id("ff0c4589-14a3-4f0b-bac3-ff52a47f8336")).sendKeys("13123232323");
    driver.findElement(By.id("7e0a9cbf-648e-40c7-af1c-31833a8e27c5")).clear();
    driver.findElement(By.id("7e0a9cbf-648e-40c7-af1c-31833a8e27c5")).sendKeys("13121121212");
    driver.findElement(By.id("c40e34a4-2758-4455-92af-3aea2daa6e85")).clear();
    driver.findElement(By.id("c40e34a4-2758-4455-92af-3aea2daa6e85")).sendKeys("dpc@ddf.com");
    new Select(driver.findElement(By.id("ef140814-d0fd-432d-b019-6bfdb1d46ecf"))).selectByVisibleText("SPF����");
    driver.findElement(By.id("853183ca-00ec-46f9-a1bb-5322c7820fd8")).clear();
    driver.findElement(By.id("853183ca-00ec-46f9-a1bb-5322c7820fd8")).sendKeys("dfdfdfdf");
    driver.findElement(By.id("aff364444766ee51353be316ed2397f1_ad917c04-eb4d-4a25-a505-f00b27ff6a4a")).clear();
    driver.findElement(By.id("aff364444766ee51353be316ed2397f1_ad917c04-eb4d-4a25-a505-f00b27ff6a4a")).sendKeys("122");
    driver.findElement(By.id("aff364444766ee51353be316ed2397f1_689ab00c-b132-4cf9-8313-d2791c35b868")).clear();
    driver.findElement(By.id("aff364444766ee51353be316ed2397f1_689ab00c-b132-4cf9-8313-d2791c35b868")).sendKeys("22");
    driver.findElement(By.id("aff364444766ee51353be316ed2397f1_aaa6ea3e-e2b5-4509-ac11-1b4c225be84a")).clear();
    driver.findElement(By.id("aff364444766ee51353be316ed2397f1_aaa6ea3e-e2b5-4509-ac11-1b4c225be84a")).sendKeys("22");
    driver.findElement(By.id("aff364444766ee51353be316ed2397f1_1c597a1f-a16c-4e2d-9e2a-d0d69f38435c")).clear();
    driver.findElement(By.id("aff364444766ee51353be316ed2397f1_1c597a1f-a16c-4e2d-9e2a-d0d69f38435c")).sendKeys("22");
    driver.findElement(By.id("aff364444766ee51353be316ed2397f1_8ab900f3-3e57-4e10-9166-86428e7d9ba8")).clear();
    driver.findElement(By.id("aff364444766ee51353be316ed2397f1_8ab900f3-3e57-4e10-9166-86428e7d9ba8")).sendKeys("22");
    driver.findElement(By.id("6b7a7da2419f4aa5b9e92eb8cb63eb88_ef1e8b33-4197-4fd8-b1e1-4485a02b1915")).clear();
    driver.findElement(By.id("6b7a7da2419f4aa5b9e92eb8cb63eb88_ef1e8b33-4197-4fd8-b1e1-4485a02b1915")).sendKeys("223");
    new Select(driver.findElement(By.id("bb25bcbfc8d54ff8baee622b4bce0138_ce5eefa2-ef95-4b6d-9d82-a512799d6a70"))).selectByVisibleText("��");    
    driver.findElement(By.id("bb25bcbfc8d54ff8baee622b4bce0138_654684c2-b82b-4388-9f4c-9327d2a1fad9")).sendKeys("2016-09-21 14:05");
    driver.findElement(By.id("bb25bcbfc8d54ff8baee622b4bce0138_953f76aa-af38-45ef-add1-beb6c15ee1d0")).clear();
    driver.findElement(By.id("bb25bcbfc8d54ff8baee622b4bce0138_953f76aa-af38-45ef-add1-beb6c15ee1d0")).sendKeys("223");
    driver.findElement(By.id("bb25bcbfc8d54ff8baee622b4bce0138_9c8fe255-4982-4453-860e-b1104cda3e7c")).clear();
    driver.findElement(By.id("bb25bcbfc8d54ff8baee622b4bce0138_9c8fe255-4982-4453-860e-b1104cda3e7c")).sendKeys("22");
   
    
/*** ������λ���   ***/
    driver.findElement(By.linkText("������λ���")).click();
    driver.findElement(By.id("30184814-1ee2-4c93-af9d-d28ae133fafe_Add")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=edit-dialog9698 | ]]
    
driver.switchTo().parentFrame();
driver.switchTo().frame(driver.findElement(By.xpath(".//*[contains(@src,'dynamicPageId=17609')]")));

    driver.findElement(By.id("71adccea-9ab8-43a8-9a37-4e9ed57f686a")).clear();
    driver.findElement(By.id("71adccea-9ab8-43a8-9a37-4e9ed57f686a")).sendKeys("222");
    driver.findElement(By.id("aa7fc61e-54a0-40a8-a9c9-9d4d9ebc439a")).clear();
    driver.findElement(By.id("aa7fc61e-54a0-40a8-a9c9-9d4d9ebc439a")).sendKeys("2");
    driver.findElement(By.id("6ca4d11e-e57c-4c0f-9cf8-433a53701eb0")).clear();
    driver.findElement(By.id("6ca4d11e-e57c-4c0f-9cf8-433a53701eb0")).sendKeys("2");
    driver.findElement(By.id("2fd42329-39dc-45aa-80d1-a52539162edf")).clear();
    driver.findElement(By.id("2fd42329-39dc-45aa-80d1-a52539162edf")).sendKeys("2");
    driver.findElement(By.id("68df8691-4127-42dc-9981-607738d7f77e")).clear();
    driver.findElement(By.id("68df8691-4127-42dc-9981-607738d7f77e")).sendKeys("2");
    driver.findElement(By.id("68703b02-8ee6-4dd4-9fe0-601b7db3884d")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=main | ]]
    driver.switchTo().parentFrame();
    driver.switchTo().frame("main");
    
    driver.findElement(By.id("9fe6e9fa-8ea6-4785-902c-9c19ce2973b0_Add")).click();
    
    driver.switchTo().parentFrame();
    driver.switchTo().frame(driver.findElement(By.xpath(".//*[contains(@src,'dynamicPageId=17610')]")));
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=edit-dialog6701 | ]]
    driver.findElement(By.id("0c02ecab-3e60-4d9f-93a1-dffcb6089d4d")).clear();
    driver.findElement(By.id("0c02ecab-3e60-4d9f-93a1-dffcb6089d4d")).sendKeys("2");
    driver.findElement(By.id("b1ca9411-c667-4013-9b05-f6ec573d1a67")).clear();
    driver.findElement(By.id("b1ca9411-c667-4013-9b05-f6ec573d1a67")).sendKeys("2");
    driver.findElement(By.id("533661e0-2c42-4e48-b400-97c5c37d81c1")).clear();
    driver.findElement(By.id("533661e0-2c42-4e48-b400-97c5c37d81c1")).sendKeys("2");
    driver.findElement(By.id("ae6fccd3-4686-482b-bd13-bca3d329adb0")).clear();
    driver.findElement(By.id("ae6fccd3-4686-482b-bd13-bca3d329adb0")).sendKeys("2");
//    driver.findElement(By.id("4319ffbc-c115-474e-ab55-41cc7d8b0481")).clear();
//    driver.findElement(By.id("4319ffbc-c115-474e-ab55-41cc7d8b0481")).sendKeys("2");
    driver.findElement(By.id("a4ef9f79-43ba-466a-8f10-e2d64cd189ef")).click();  // ����
    driver.switchTo().parentFrame();
    driver.switchTo().frame("main");
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=main | ]]
    driver.findElement(By.id("d290016b-c12a-4c72-89f2-aa480927d26e_Add")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=edit-dialog6055 | ]]
    
    
    driver.switchTo().parentFrame();
    driver.switchTo().frame(driver.findElement(By.xpath(".//*[contains(@src,'dynamicPageId=17554')]")));
    driver.findElement(By.id("9372928c-952e-4dd6-b090-939658512658")).clear();
    driver.findElement(By.id("9372928c-952e-4dd6-b090-939658512658")).sendKeys("2016-03-21 20:45");
    driver.findElement(By.id("1756fd22-aad3-4ce4-8162-1efc25479367")).clear();
    driver.findElement(By.id("1756fd22-aad3-4ce4-8162-1efc25479367")).sendKeys("2");
    driver.findElement(By.id("ccb3c874-2d7f-4e6a-8024-0ddb03b7ccf0")).clear();
    driver.findElement(By.id("ccb3c874-2d7f-4e6a-8024-0ddb03b7ccf0")).sendKeys("223");
    driver.findElement(By.id("bdf6b4e1-eefa-4441-8315-792346a2b2a2")).clear();
    driver.findElement(By.id("bdf6b4e1-eefa-4441-8315-792346a2b2a2")).sendKeys("33");
    driver.findElement(By.id("4325fb13-bc8a-44d0-8350-02933026b6ea")).clear();
    driver.findElement(By.id("4325fb13-bc8a-44d0-8350-02933026b6ea")).sendKeys("3332");
    driver.findElement(By.id("660c0ea6-1966-403b-9292-e0549138269a")).clear();
    driver.findElement(By.id("660c0ea6-1966-403b-9292-e0549138269a")).sendKeys("23232");
    driver.findElement(By.id("8970abd9-4f81-47be-bdad-06fd1ad1cd8d")).clear();
    driver.findElement(By.id("8970abd9-4f81-47be-bdad-06fd1ad1cd8d")).sendKeys("23232");
    driver.findElement(By.id("9c651dbf-7525-4eb7-9235-b8ca8027babf")).click();  //�����ӱ�
    driver.switchTo().parentFrame();
    driver.switchTo().frame("main");
    Thread.sleep(2000);
    driver.findElement(By.id("a6f14b77-a886-4eeb-b477-a0dc3e31cd18")).click();
  }

  @AfterClass
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private void fail(String verificationErrorString) {
	// TODO Auto-generated method stub
	
}

private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
