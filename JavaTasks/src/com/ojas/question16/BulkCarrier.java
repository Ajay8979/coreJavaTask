package com.ojas.question16;

public class BulkCarrier extends WaterTransport {
		private String companyName;

		public BulkCarrier(int id, String customerName, String arrivalPort,
				String departurePort, float weight,
				String capacity, String companyName) {
			super(id, customerName, arrivalPort, departurePort, weight, capacity);
			this.companyName = companyName;
		}

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public void displayDetails() {
			System.out.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s",getId(),getCustomerName(),getArrivalPort(),
					getDeparturePort(),getWeight(),getCompanyName(),getCapacity());
		}
}
