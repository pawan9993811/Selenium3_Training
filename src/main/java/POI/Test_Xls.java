package POI;

public class Test_Xls extends ExcelUtils{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		  String currentDir = System.getProperty("user.dir");
	      String Xls_Location = currentDir + "/TestData/Datatest.xlsx";
	      System.out.println(Xls_Location);
	       
		  ExcelUtils.setExcelFile(Xls_Location, "Record1");
		  System.out.println(ExcelUtils.getRowUsed());
		  
		  
		  
		  for (int i = 0; i < ExcelUtils.getRowUsed(); i++) {
			  ExcelUtils.getCellData(i, 0);
			  for (int j = 0; j <ExcelUtils.getRowUsed(); j++) {
				 System.out.println(ExcelUtils.getCellData(i, j));
			}
		}
		  
	}

}
