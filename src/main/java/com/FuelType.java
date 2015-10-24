public enum FuelType {
    PETROL (9.0),
    DIESEL (12.0),
    WOOD(4.35),
    COAL(5.65);
    
    private double costPerBatch;

	FuelType(double costPerBatch){
    	this.costPerBatch = costPerBatch;
    }
	
	double fuelCostPerBatch(){
		return costPerBatch;
	}
}
