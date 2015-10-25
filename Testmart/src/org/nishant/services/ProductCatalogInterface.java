package org.nishant.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

//Using name = "TestMartCatalog" renames the porttype in wsdl to testmartcatalog
/*servicename changes the name of the service, so basically the URL*/

@WebService(name="TestMartCatalog",portName="TestMartCatalogPort",serviceName="TestMartCatalogService",
			targetNamespace="http://www.testmart.com")
public interface ProductCatalogInterface {

	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	public abstract List<String> getProductCategories();

	@WebMethod
	public abstract List<String> getProducts(String category);

}