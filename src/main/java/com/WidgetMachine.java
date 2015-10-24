public class WidgetMachine implements Widget {
	private Engine engine;

	WidgetMachine(Engine engine) {
		this.engine = engine;
	}

	public double produceWidgets(int quantity) {

		double cost = getProductionCost(quantity);

		return cost;
	}

	/**
	 * @param quantity
	 * @param cost
	 * @return
	 */
	private double getProductionCost(int quantity) {
		double cost = 0;
		startEngine();
		if (isEngineRunning()) {
			cost = produce(quantity);
		}
		stopEngine();
		return cost;
	}

	/**
	 * 
	 */
	private void startEngine() {
		engine.start();
	}

	/**
	 * @return
	 */
	private boolean isEngineRunning() {
		return engine.isRunning();
	}

	/**
	 * 
	 */
	private void stopEngine() {
		engine.stop();
	}

	/**
	 * 
	 * @param quantity
	 * @return
	 */
	private double produce(int quantity) {
		double costPerBatch = engine.getFuelType().fuelCostPerBatch();
		int batchCount = calculateActualBatchCount(quantity);

		return batchCount * costPerBatch;
	}

	/**
	 * Batch count depends on the batchsize of the engine.
	 * 
	 * @param quantity
	 * @param batchCount
	 * @return
	 */
	private int calculateActualBatchCount(int quantity) {
		int batchCount = 0;
		int batch = 0;
		while (batch < quantity) {
			batch += engine.getBatchSize();
			batchCount++;
		}
		return batchCount;
	}

}
