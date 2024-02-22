package listenersProgs;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listeners_Progs_1.class)
public class TestCase_1 
{
	@Test
   public void test() throws InterruptedException
   {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("Tshirts");
	Thread.sleep(5000);
	List<WebElement> a1=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	int count_of_a1=a1.size();
	System.out.println(count_of_a1);
	a1.get(1).click();
}
}
