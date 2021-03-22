package net.sathyan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;


/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletOutputStream stream = response.getOutputStream();
		
		try {
			//AmazonS3Utility.listS3Documents();
			
			//response.setContentType("application/vnd.ms-excel");
			//response.setHeader("Content-Disposition", "inline; filename="+ "employeereport.xls");
			
			response.setHeader("Content-disposition", "attachment;filename=1.xls" );
			response.setContentType("application/xls");

			
			
			HSSFWorkbook book = getWorkBook();
			
			book.write(stream);
			
//			stream = response.getOutputStream();
//			stream.write(book.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try
	            {
		        	//  Close the output stream
		            if (stream != null)
		                stream.close();
	            }
	            catch(Exception e) 
	            {
	            }
	            
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	
	//Excel Download Example:-
	protected HSSFWorkbook getWorkBook()
	{
		HSSFWorkbook book = new HSSFWorkbook();
		HSSFSheet sheet = (HSSFSheet) book.createSheet("Test POI Template");
		
		
		 Font summaryFont= book.createFont();
		 summaryFont.setFontHeightInPoints((short)14);
		 summaryFont.setFontName("Arial");
		 //   font.setColor(IndexedColors.BLACK.getIndex());
		 summaryFont.setBold(true);
		 summaryFont.setItalic(true);
		    
		    Font headingfont= book.createFont();
		    headingfont.setFontHeightInPoints((short)11);
		    headingfont.setFontName("Arial");
		 //   font.setColor(IndexedColors.BLACK.getIndex());
		    headingfont.setBold(true);
		    headingfont.setItalic(false);
		    
		    
		Row row = sheet.createRow(0);
		CellStyle style=book.createCellStyle();
		
		style.setFont(summaryFont);
		style.setAlignment(HorizontalAlignment.CENTER);
		row.setRowStyle(style);
		
		Cell cell = row.createCell(0);
		cell.setCellValue("Heading : Report");	
		cell.setCellStyle(style);
		
		
		sheet.addMergedRegion(new CellRangeAddress(0, 3, 0, 14));
	
		
		 style=book.createCellStyle();
		style.setFont(headingfont);
		
			row = sheet.createRow(4);
			
			for (int j=0 ; j < 15; j++)
			{
				cell = row.createCell(j);
				cell.setCellValue(" Header " + j);
				cell.setCellStyle(style);
			}
			
		
		
		for (int i=5 ; i < 10; i++)
		{
			row = sheet.createRow(i);
			
			for (int j=0 ; j < 15; j++)
			{
				cell = row.createCell(j);
				cell.setCellValue(" Value at " + j);
			}
			
		}
		
		
		
		return book;
	}

}
