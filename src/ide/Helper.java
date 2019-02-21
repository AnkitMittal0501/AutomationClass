package ide;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
/**
 * A dirty simple program that reads an Excel file.
 * @author www.codejava.net
 *
 */


public class Helper {

	private static Workbook wk;
	private static Sheet sh;;
	private static FileInputStream fl;
	private static FileOutputStream fo;
	private static Row row;
	private static Cell cell;
	
	public static void main(String args[]) throws EncryptedDocumentException, IOException
	{
		fl=new FileInputStream("data.xlsx");
		wk = WorkbookFactory.create(fl);
		sh=wk.getSheetAt(0);
		
		
	}
	  
	 
	}
