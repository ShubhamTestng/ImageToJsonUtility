package ImageConvert;

import net.sourceforge.tess4j.Tesseract;

import net.sourceforge.tess4j.TesseractException;

import java.io.File;


import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class ImageToText {
    public static String extractTextFromImage(String imagePath) {
        String tessdataPath = "C:\\Users\\wbox62\\eclipse-workspace\\ImageToJsonUtility\\target\\tessdata";
        System.out.println("TESSDATA_PREFIX: " + tessdataPath); // Verify path
        Tesseract tesseract = new Tesseract();
        try {
            tesseract.setDatapath(tessdataPath);
            System.out.println("Setting Tesseract data path to: " + tessdataPath);
            File trainedDataFile = new File(tessdataPath, "eng.traineddata");
            System.out.println("Checking if file exists: " + trainedDataFile.exists()); // Check file existence
            tesseract.setLanguage("eng");
            return tesseract.doOCR(new File(imagePath));
        } catch (TesseractException e) {
            e.printStackTrace();
            return null;
        }
    }
}








