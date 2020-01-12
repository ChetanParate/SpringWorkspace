package com.chetan.mvc.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

public class StudentPDFView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document document, PdfWriter pw, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		List<?> list =(ArrayList<?>)map.get("stresult");
		Paragraph p = new Paragraph("Student Details");
		p.setAlignment("center");
		document.add(p);
		
		Table table = new Table(1);
		table.addCell(list.get(0)+"");
		table.addCell(list.get(1)+"");
		table.addCell(list.get(2)+"");
		table.addCell(list.get(3)+"");
		table.addCell(list.get(4)+"");
		document.add(table);
		
	}

}
