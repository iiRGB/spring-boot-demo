/**
 * 
 */
package com.rgb.tools.dao.model.erm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.ArrayList;
import java.util.List;

/**
 * @author megapro
 *
 */
@XmlRootElement(name = "category_settings")
public class ERCategorySettings {
	
	/**
	 * 模型分类
	 */
	@XmlElementWrapper(name = "categories")
	@XmlElement(name = "category")
	private List<ERCategory> category = new ArrayList<>();
	
	@XmlTransient
	public List<ERCategory> getCategories() {
		return category;
	}

	public void setCategories(List<ERCategory> category) {
		this.category = category;
	}
}
