package com.ojas.question20;

public interface IExportData {
	void convertToJSON(Shipment[] shipmentObj);
	void convertToCSV(Shipment[] shipmentObj);
	
}
