package AmazonPrimePack;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyFile {
	
	public PropertyFile(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	

	@FindBy(linkText="Whole Foods")
	private WebElement clickOnWF;
	
	@FindBy(xpath="//img[starts-with(@alt, 'Prime Pantry')]")
	private WebElement primePantry;
	
	@FindBy(linkText="Grocery & Gourmet Food")
	private WebElement groceryGourmet;
	
	@FindBy(linkText="Breads & Bakery")
	private WebElement breadBakery;
	
	@FindBy(linkText="Free of Trans Fat (0g)")
	private WebElement nutitionFacts;
	
	@FindBy(xpath="//img[starts-with(@alt, '365 Everyday Value, Gluten Free Mint Chocolate Chip')]")
	private WebElement finalProduct;
	
	//@Findby(index=1)
	
	
	

	/**
	 * @return the clickOnWF
	 */
	public WebElement getclickOnWF() {
		return clickOnWF;
	}

	/**
	 * @return the primePantry
	 */
	public WebElement getprimePantry() {
		return primePantry;
	}

	/**
	 * @return the groceryGourmet
	 */
	public WebElement getgroceryGourmet() {
		return groceryGourmet;
	}

	/**
	 * @return the crebreadBakery
	 */
	public WebElement getbreadBakery() {
		return breadBakery;
	}

	/**
	 * @return the nutitionFacts
	 */
	public WebElement getnutitionFacts() {
		return nutitionFacts;
	}

	/**
	 * @return the finalProduct
	 */
	public WebElement getfinalProduct() {
		return finalProduct;
	}
	
}
	
	
