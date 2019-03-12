package pdfCompare;

import java.io.IOException;

import de.redsix.pdfcompare.PdfComparator;

public class PDFCompare {

	public static void main(String[] args) throws IOException 	 {
		// TODO Auto-generated method stub
		
		String actual = "C:\\Users\\Apoorva\\Downloads\\dummy.pdf";
		String expected = "C:\\Users\\Apoorva\\Downloads\\dummy.pdf";
		String diffOutput = "C:\\Users\\Apoorva\\Downloads";
		
		new PdfComparator(expected, actual).compare().writeTo(diffOutput);
		
		boolean isEquals = new PdfComparator(expected, actual).compare().writeTo(diffOutput);
		if (!isEquals) {
		    System.out.println("Differences found!");
		    
		    
		}
		
		else
			System.out.println("Same");
		

	}

}
