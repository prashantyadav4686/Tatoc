package com.qait.TatoctestNg;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
public class Keyword extends BaseTest{
	public WebDriver driver;
	public Keyword(WebDriver driver) {
		this.driver = driver;
	}

	       public void launch() {
		    	 driver.get("http://10.0.1.86/tatoc");
		         verifyTatoc();
		        
		         
	}


	       public void gridPage() {
	  
		         verifyGridGate(); 
		         verifyMatchInstructions();
		      
				 
		 }

	       public void framePage() {
		 
		         verifyFrameDungeon();
		         verifyMatchInstructionsFrame();
                 framebox();
	}
	   
	       
	   public void popupWindowMethod() {
		   driver.findElement(By.linkText("Proceed")).click();
		   verifyPopupWindow() ;
		   verifyLaunchpopupWindow();
		   verifyProceedLink();
	   }
	   
	   public void launchpopupWindowMethod() {
		  
		  // String MainWindow=driver.getWindowHandle();
		   //System.out.println(MainWindow);
		   driver.findElement(By.linkText("Launch Popup Window")).click();
		   //Set handles = driver.getWindowHandles();
		    
	         //System.out.println(handles);
		     ArrayList<String>al=new ArrayList<String>(driver.getWindowHandles());
		     driver.switchTo().window(al.get(1));
		     driver.findElement(By.id("name")).sendKeys("abc");
		     driver.findElement(By.id("submit")).click();
		     driver.switchTo().window(al.get(0));
		     verifyProceedLink();
	   }
		  
		  public void setCookie() {
		        cookie();
		        verifyEnd();
		        verifyCourseComplete();
		        verifyBasicCourse();
		        verifyAdvancedCourse();
	   }
		  
		  public void clickAdvancedCourse() {
			  verifyBasicCourse();
		        verifyAdvancedCourse();
		        driver.findElement(By.linkText("Advanced Course")).click();
		        
		        
		  }
	       
		  public void dropDown() {
			   driver.findElement(By.className("page").tagName("span")).click();
			   driver.findElement(By.xpath("//span[@class='menuitem'][contains(text(),'Go Next')]")).click();
				// Select dropdown = new Select(menu.findElement(By.xpath("//div[@class='menutop m2']")));
			   //  dropdown.selectByVisibleText("Go Next");
			    // String st1= dropdown.getFirstSelectedOption().getText();
			    //  System.out.println(st1);
			   driver.findElement(By.id("summary").linkText("GET")).click();
			   driver.findElement(By.id("summary").linkText("POST")).click();
			   driver.findElement(By.id("summary").linkText("Cookies")).click();
			   driver.findElement(By.id("summary").linkText("ENV")).click();
			 }
	   
	
	       public void framebox() {
	     
		         String color2="";
		         driver.switchTo().frame("main");
	             WebElement el = driver.findElement(By.xpath("//div[@id='answer'][contains(text(),'Box 1')]"));
	             String color1 = el.getAttribute("className");
	      
		//System.out.println(color1);
	             driver.switchTo().defaultContent();
	             driver.switchTo().frame("main");
	             driver.switchTo().frame("child");
	             WebElement el1 = driver.findElement(By.xpath("//div[@id='answer'][contains(text(),'Box 2')]"));
	             color2 = el1.getAttribute("className");
	        //System.out.println(color2);
	        while(!color1.equals(color2)) {
	        	 driver.switchTo().defaultContent();
	        	 driver.switchTo().frame("main");
	        	 driver.findElement(By.linkText("Repaint Box 2")).click();
	        	 
	        	 driver.switchTo().defaultContent();
	  	         driver.switchTo().frame("main");
	  	         driver.switchTo().frame("child");
	  	         WebElement el2 = driver.findElement(By.xpath("//div[@id='answer'][contains(text(),'Box 2')]"));
	  	         color2 = el2.getAttribute("className");
	       //driver.findElement(By.linkText("Proceed")).click();
		  //Assert.assertEquals(driver.getTitle(),"Drag Around");
	        }
	             driver.switchTo().defaultContent();
       	         driver.switchTo().frame("main");
	             driver.findElement(By.linkText("Proceed")).click();
	             
	            
       	 
	}
	       public void dragNdrop() {
	    	   WebElement sourcelocator = driver.findElement(By.xpath("//div[@id='dragbox'][@class='ui-draggable']"));
		    	 WebElement targetlocator = driver.findElement(By.xpath("//div[@id='dropbox']"));
		    	 (new Actions(driver)).dragAndDrop(sourcelocator, targetlocator).perform();
	             
		    	
		    	 
	       }
	      
	       
	      void verifyTatoc() {
	    	  
		       String str= driver.findElement(By.tagName("h1")).getText();
			   String str1 ="Test Automation Training Obstacle Course";
			   Assert.assertEquals(str,str1);
		       System.out.println(str + " " + "Verified");
			   verifyBasicCourse();
			   verifyAdvancedCourse();
		       
	   }
	      void verifyGridGate() {
	    	  
	    	    driver.findElement(By.linkText("Basic Course")).click();
		        String str = driver.findElement(By.tagName("h1")).getText();
		        String str1 = "Grid Gate";
		        Assert.assertEquals(str, str1);
			    System.out.println(str + " " + "Verified");
			  
				 
	  }
	 
	     void verifyFrameDungeon(){
		 
		       driver.findElement(By.className("greenbox")).click();
	           String str = driver.findElement(By.tagName("h1")).getText();
			   String str1 = "Frame Dungeon";
			   Assert.assertEquals(str, str1);
			   System.out.println(str + " " + "Verified");
			 
	 }
	     void verifyBasicCourse() {
	    	String str = driver.findElement(By.linkText("Basic Course")).getText();
	    	 String str1 = "Basic Course";
	    	 Assert.assertEquals(str, str1);
	    	 System.out.println(str + " " + "Text" + " " + "Verified");
	    	 //System.out.println(str1);
	     }
	     void verifyAdvancedCourse() {
	    	 String str = driver.findElement(By.linkText("Advanced Course")).getText();
	    	 String str1 = "Advanced Course";
	    	 Assert.assertEquals(str, str1);
	    	 System.out.println(str + " " + "Text" + " " + "Verified");
	    }
	     void verifyMatchInstructions() {
	    	    String str = driver.findElement(By.tagName("h3")).getText();
		        String str1 = "Instructions";
		        Assert.assertEquals(str, str1);
			    System.out.println(str + " " + "Verified");
	     }
	     void verifyMatchInstructionsFrame() {
	    	    String str = driver.findElement(By.tagName("h3")).getText();
		        String str1 = "Instructions";
		        Assert.assertEquals(str, str1);
			    System.out.println(str + " " + "Verified");
	     }
	     void verifyDragAround() {
	    	  String str = driver.findElement(By.tagName("h1")).getText();
	    	  String str1 = "Drag Around";
		      Assert.assertEquals(str, str1);
			  System.out.println(str + " " + "Verified");

	     }
	     void verifyPopupWindow() {
	    	 String str = driver.findElement(By.tagName("h1")).getText();
	    	  String str1 = "Popup Windows";
		      Assert.assertEquals(str, str1);
			  System.out.println(str + " " + "Verified");

	     }
	     void verifyLaunchpopupWindow() {
	    	 String str = driver.findElement(By.linkText("Launch Popup Window")).getText();
	    	 String str1 = "Launch Popup Window";
	    	 Assert.assertEquals(str, str1);
	    	 System.out.println(str + " " + "Link" + " " + "is Verified");
	     }
	     void verifyProceedLink() {
	    	 String str = driver.findElement(By.linkText("Proceed")).getText();
	    	 String str1 = "Proceed";
	    	 Assert.assertEquals(str, str1);
	    	 System.out.println(str + " " + "Link" + " " + "is verified");
	     }
	    void cookie() {
	    	driver.findElement(By.linkText("Proceed")).click();
	    	driver.findElement(By.linkText("Generate Token")).click();
		     String str= driver.findElement(By.id("token")).getText();
		     //System.out.println(str);
			String[] data = str.split(": ");
			//String str2 = data[0];
			String str1 = data[1];
			Cookie ck = new Cookie("Token", str1);
			driver.manage().addCookie(ck);
			 driver.findElement(By.linkText("Proceed")).click(); 
	    }
	    void verifyEnd() {
	    	String str = driver.findElement(By.tagName("h1")).getText();
	    	  String str1 = "End";
		      Assert.assertEquals(str, str1);
			  System.out.println(str + " " + "Verified");
	    }
	    void verifyCourseComplete() {
	    	String str = driver.findElement(By.tagName("span")).getText();
	    	  String str1 = "Obstacle Course is Complete!";
		      Assert.assertEquals(str, str1);
			  System.out.println(str + " " + "Verified");
	    }
}

