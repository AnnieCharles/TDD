import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SteamEngineTest {
	
	
	@Test
	public void initialiseEngine_WithRequiredFuelType() {
		SteamEngine steamEngine = new SteamEngine(FuelType.WOOD);
		FuelType fuelType = steamEngine.getFuelType();
		assertThat(fuelType, anyOf(equalTo(FuelType.COAL),
								equalTo (FuelType.WOOD)));

	}
	
	@Test (expected = IllegalArgumentException.class)
	public void initialiseEngine_WithWrongFuelType_ThrowsException(){
		SteamEngine steamEngine = new SteamEngine(FuelType.PETROL);
	}
	
	


}
