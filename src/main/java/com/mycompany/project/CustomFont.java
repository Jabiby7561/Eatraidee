//--PACKAGE--..
package com.mycompany.project;

//--IMPORT--..
import java.awt.*;
import java.io.*;

//--JAVA CLASS--..
public class CustomFont {
    
    //--VARIABLE--..
    private Font customFont;

    //--METHOD--..
    public CustomFont() {
        this.customFont = null;
    }

    public Font setFontFile(int fontSize) {
        try {
            File customFontFile = getFontFile("/Jua-Regular.ttf");
            // Create custom font
            customFont = Font.createFont(Font.TRUETYPE_FONT, customFontFile).deriveFont((float) fontSize);
        } catch (FontFormatException | IOException e) {
            System.out.println("Error: " + e);
        }
        return customFont;
    }

    public static File getFontFile(String resource) {
        String filePath = LoginFrame.class.getResource(resource).getPath();

        // Check to see if filepath contains any folder with spaces in the name
        if (filePath.contains("%20")) {
            filePath = filePath.replaceAll("%20", " ");
        }

        return new File(filePath);
    }
}
//--JAVA FILE's END--..