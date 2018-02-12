/**
 * 
 */
package com.rgb.tools.dao.model.erm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * ERMaster定义文件中的settings对象
 * @author megapro
 *
 */
@XmlRootElement(name = "settings")
public class ERSettings {

	@XmlElement(name = "database")
	private String dataBase ; 
	
	@XmlElement(name = "capital")
	private String capital ; 
	
	@XmlElement(name = "category_settings")
	private ERCategorySettings categorySettings ;

	@XmlElement(name = "model_properties")
	private ERModelProperties modelProperties ;
	
	
	@XmlTransient
	public String getDataBase() {
		return dataBase;
	}

	public void setDataBase(String dataBase) {
		this.dataBase = dataBase;
	}
	
	@XmlTransient
	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	@XmlTransient
	public ERCategorySettings getCategorySettings() {
		return categorySettings;
	}

	public void setCategorySettings(ERCategorySettings categorySettings) {
		this.categorySettings = categorySettings;
	}

	@XmlTransient
	public ERModelProperties getModelProperties() {
		return modelProperties;
	}

	public void setModelProperties(ERModelProperties modelProperties) {
		this.modelProperties = modelProperties;
	}
	
}
