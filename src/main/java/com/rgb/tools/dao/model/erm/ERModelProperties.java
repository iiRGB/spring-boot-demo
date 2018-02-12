/**
 * 
 */
package com.rgb.tools.dao.model.erm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.ArrayList;
import java.util.List;

/**
 * @author megapro
 *
 */
@XmlRootElement(name = "model_properties")
public class ERModelProperties {

	/**
	 * 模型属性
	 */
	@XmlElement(name = "model_property")
	private List<ERModelProperty> modelProperties = new ArrayList<>();
	
	@XmlTransient
	public List<ERModelProperty> getModelProperties() {
		return modelProperties;
	}

	public void setModelProperties(List<ERModelProperty> modelProperties) {
		this.modelProperties = modelProperties;
	}
}
