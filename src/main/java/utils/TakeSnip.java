package utils;

import base.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TakeSnip extends Base {
    public static void takeSnip() throws IOException {
        File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String Date=new Date().toString();
        FileUtils.copyFile(Source,new File(System.getProperty("user.dir")+"/ScreenShots/"+Date.replace(":", "_").replace(" ", "_")+".png"));
    }
}
