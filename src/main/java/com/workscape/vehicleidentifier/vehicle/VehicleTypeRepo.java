package com.workscape.vehicleidentifier.vehicle;

import static com.workscape.vehicleidentifier.model.Material.METAL;
import static com.workscape.vehicleidentifier.model.Material.PLASTIC;
import static com.workscape.vehicleidentifier.model.Position.FRONT;
import static com.workscape.vehicleidentifier.model.Position.LEFT_FRONT;
import static com.workscape.vehicleidentifier.model.Position.LEFT_REAR;
import static com.workscape.vehicleidentifier.model.Position.REAR;
import static com.workscape.vehicleidentifier.model.Position.RIGHT_FRONT;
import static com.workscape.vehicleidentifier.model.Position.RIGHT_REAR;
import static com.workscape.vehicleidentifier.model.PowertrainType.BERNOULLI;
import static com.workscape.vehicleidentifier.model.PowertrainType.HUMAN;
import static com.workscape.vehicleidentifier.model.PowertrainType.INTERNAL_COMBUSTION;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.workscape.vehicleidentifier.model.Vehicle;

public class VehicleTypeRepo {

	static Map<String, Vehicle> vehicleTypes = new LinkedHashMap<>();

	static {
		vehicleTypes.put("Big Wheel",   new VehicleBuilder().setFrameMaterial(PLASTIC).setPowertrainType(HUMAN)
				.addWheel(FRONT, PLASTIC).addWheel(LEFT_REAR, PLASTIC).addWheel(RIGHT_REAR, PLASTIC).build());
		vehicleTypes.put("Bicycle",     new VehicleBuilder().setFrameMaterial(METAL).  setPowertrainType(HUMAN)
				.addWheel(FRONT, METAL).addWheel(REAR, METAL).build());
		vehicleTypes.put("Motorcycle",  new VehicleBuilder().setFrameMaterial(METAL).  setPowertrainType(INTERNAL_COMBUSTION)
				.addWheel(FRONT, METAL).addWheel(REAR, METAL).build());
		vehicleTypes.put("Hang Glider", new VehicleBuilder().setFrameMaterial(PLASTIC).setPowertrainType(BERNOULLI)
				.build());
		vehicleTypes.put("Car",         new VehicleBuilder().setFrameMaterial(METAL).  setPowertrainType(INTERNAL_COMBUSTION)
				.addWheel(LEFT_FRONT, METAL).addWheel(RIGHT_FRONT, METAL).addWheel(LEFT_REAR, METAL).addWheel(RIGHT_REAR, METAL).build());
	}
	
	public static String findType(Vehicle vehicle) {
		for (Entry<String, Vehicle> entry : vehicleTypes.entrySet()) {
			if (VehicleTypeComparator.matches(entry.getValue(), vehicle))
				return entry.getKey();
		}
		return "Unknown type";
	}

}
