package listenersProgs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listeners_Prog_2.class)
public class TestCase_2 
{
@Test
public void method_1()
{
	
}
@Test()
public void method_2()
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("Tshirts");
}
@Test
public void method_3()
{
	
}
@Test
public void method_4()
{
	
}
@Test
public void method_5()
{
	
}

}
