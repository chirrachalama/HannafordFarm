package com.nurture.Base;

import java.util.ArrayList;

import com.nurture.ExcelUtil.Xls_Reader;

public class CreateListExcelUtil {
	
	static Xls_Reader reader;


	public static ArrayList<Object[]> getDataFromExcel() {
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		  
		try {
		//Get the Excel data
			reader=new Xls_Reader("C:\\Users\\CHALAMA\\eclipse-workspace\\HannafordFarmExchange\\src\\main\\java\\com\\nurture\\TestData\\TestData.xlsx");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
				//parameterization
				
				for(int rownum=2; rownum<= reader.getRowCount("CreateListing"); rownum++ ) {
	
					String ListHead=reader.getCellData("CreateListing", "ListingHeading", rownum);
					String ListDesc=reader.getCellData("CreateListing", "ListingDesc", rownum);
					String seedQuantity=reader.getCellData("CreateListing", "AvailableQuantity", rownum);
					String MinQuantity=reader.getCellData("CreateListing", "MinimumQuantity", rownum);
					String SeedPrice=reader.getCellData("CreateListing", "Price", rownum);
					String Postcode=reader.getCellData("CreateListing", "PostCode", rownum);
					String Address=reader.getCellData("CreateListing", "Address", rownum);
					String Locality=reader.getCellData("CreateListing", "Locality", rownum);
					Object ob[]= {ListHead, ListDesc,seedQuantity,MinQuantity,SeedPrice,Postcode,Address,Locality };
					//myData.add(ob);
					myData.add(new Object[] {ListHead, ListDesc,seedQuantity,MinQuantity,SeedPrice,Postcode,Address,Locality});
				}
				
				return myData;
	}


}
