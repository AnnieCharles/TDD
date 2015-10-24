public interface Engine {

	public static final int MIN_FUEL_LEVEL = 0;
	
	public static final int MAX_FUEL_LEVEL = 100;

	public abstract void start();
	
	public abstract boolean isRunning();

	public abstract void stop();

	public abstract int getBatchSize();

	public abstract FuelType getFuelType();

	public abstract void fill(FuelType fuelType, int fuelLevel);

}
