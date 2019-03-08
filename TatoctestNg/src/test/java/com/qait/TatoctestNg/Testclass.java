package com.qait.TatoctestNg;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

/**
 * Unit test for simple App.
 */
public class Testclass extends BaseTest {
    
    @Test(groups = {"Default-group"})
	public void Test01_LaunchTest() {
    	key.launch();
	}
    
    @Test(groups = {"Basic-group"})
	public void Test02_gridGateTatoc() {
    	 key.gridPage();
	}
  
    @Test(groups = {"Basic-group"})
    public void Test03_frame() {
    	key.framePage();
    }
    @Test(groups = {"Basic-group"})
    public void Test04_dragTest() {
    	key.dragNdrop();
    	
    }
    @Test(groups = {"Basic-group"})
    public void Test05_popupWindowTest() {
    	key.popupWindowMethod();
    }
    @Test(groups = {"Basic-group"})
    public void Test06_LaunchpopupWindow() {
    	key.launchpopupWindowMethod();
    }
    @Test(groups = {"Basic-group"})
    public void Test07_cookieHandling() {
    	key.setCookie();
    }
    @Test(groups = {"Basic-group"})
    public void Test08_advancedCourse() {
    	key.clickAdvancedCourse();
  }
    @Test(groups = {"Advanced-group"})
    public void Test09_dropDown() {
    	key.dropDown();
  }
}