# TDD
package com.practice;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.lloyds.FuelType;
import com.lloyds.InternalCombustionEngine;
import com.lloyds.WidgetMachine;

public class WidgetMachineTest {

	WidgetMachine widget;
	
	@Before
	public void setUp() {
		InternalCombustionEngine engine = new InternalCombustionEngine(FuelType.PETROL);
		widget = new WidgetMachine(engine);
	}
	
	@Test
	public void testWidgetMachineInternalCombEngine(){
		int cost = widget.produceWidgets(2);
		assertThat(cost, equalTo(9));		
	}

	@Test
	public void testWidgetMachineInternalCombEngineTenQty(){
		int cost = widget.produceWidgets(10);
		assertThat(cost, equalTo(18));		
	}
	
	/*@Test
	public void testWigetPrdSteamEngine(){
		int cost = widget.produceWidgets(2);
		assertThat(cost,equalTo(18));
	}*/
}
