package com.aurionpro.test;

import com.aurionpro.model.TableMetadata;

public class TableMetadataTest {
	public static void main(String args[]) {
		
        TableMetadata connection = new TableMetadata();
        connection.connectToDb();
        connection.getTableDetails();
	}

}
