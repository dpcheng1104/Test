/**
 * 2016��10��17��09:46:13
 * Ŀ�ģ� ��װ��¼���ڡ� 
 * ���⣺ ���һ���װ�˴����������֪������ڽű��е��á� ���ڵ�����������������Ļcom.firstversion.SH ***/

package cos.firstversion.SH;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Login {
	    
		public static void IE(WebDriver driver) {
			System.setProperty("webdriver.ie.driver", "D:\\Software\\WorkTools\\eclipse\\selenium\\IEDriverServer-32bit\\IEDriverServer.exe");
			driver	= new InternetExplorerDriver();
		}
		
		public static void login(WebDriver driver) {
			// TODO Auto-generated method stub
			// �����˵�¼����֯�������루��������ô��룩��֤�����롢���롣 ���Ե�¼���ڽ����˷�װ���� ����û�а����������
			   
		    driver.findElement(By.id("orgCode")).clear();
		    driver.findElement(By.id("orgCode")).sendKeys("78945612-3");  //��֯�������루��������ô��룩
		    driver.findElement(By.id("userIdCardNumber")).clear();
		    driver.findElement(By.id("userIdCardNumber")).sendKeys("431230198410240040"); //֤������
		    driver.findElement(By.id("userPwd")).clear();
		    driver.findElement(By.id("userPwd")).sendKeys("791013");
		    driver.findElement(By.id("btUserLogin")).click();
		    
		}

}
