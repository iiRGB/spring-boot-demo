package com.rgb.tools.tools;

import com.rgb.tools.dao.model.erm.ERModel;
import org.apache.commons.io.FileUtils;

import javax.xml.bind.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

public class XmlToBean {

	public static void main(String[] args) {
		ERModel t= parseToBean(ERModel.class,"D:\\project\\kepple-doc\\kepple\\02-设计\\construction-site.erm");
		System.out.println(t);
	}
	 //xml转换成bean
    public static <T>  T parseToBean( Class<T> type,String filepath)  {  
    	File f= new File(filepath);
    	String xmlstr;
		try {
			xmlstr = FileUtils.readFileToString(f);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}
    	T requestXml = null;  
        try {  
            JAXBContext jaxbContext = JAXBContext.newInstance(type);  
            Unmarshaller um = jaxbContext.createUnmarshaller();  
            um.setEventHandler(
            	    new ValidationEventHandler() {
            	        @Override
						public boolean handleEvent(ValidationEvent event ) {
            	        	System.out.println("解析xml有错误:"+event.getMessage());
            	        	  event.getLinkedException().printStackTrace();
            	            throw new RuntimeException(event.getMessage(),
            	                                       event.getLinkedException());
            	          
            	        }
            	});
            requestXml = (T)um.unmarshal(new ByteArrayInputStream(xmlstr.getBytes()));  
        } catch (JAXBException e) {  
            e.getMessage();  
        }  
        return requestXml;  
    }
}
