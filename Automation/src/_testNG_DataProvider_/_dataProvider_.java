package _testNG_DataProvider_;

import org.testng.annotations.DataProvider;

public class _dataProvider_ {

	
/*	@DataProvider(name="data-provider")
	public Object[][] dataProviderMethod(){
		return new Object[][] {{"Automation Testing"},{"Manual Testing"},{"API"},{"Database Testing"}};   */
		
		@DataProvider(name="data-provider")
		public Object[][] _dataprovidermethod(){
			return new Object[][] {{"automation testing"},{"manual testing"},{"API"},{"database testing"}};
			
	}
}
