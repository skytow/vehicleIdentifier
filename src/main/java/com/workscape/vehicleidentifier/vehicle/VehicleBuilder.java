package com.workscape.vehicleidentifier.vehicle;

import java.util.HashMap;
import java.util.Map;

import com.workscape.vehicleidentifier.model.Frame;
import com.workscape.vehicleidentifier.model.Material;
import com.workscape.vehicleidentifier.model.Position;
import com.workscape.vehicleidentifier.model.PowertrainType;
import com.workscape.vehicleidentifier.model.Vehicle;

public class VehicleBuilder {

	private Vehicle vehicle = new Vehicle();

	public VehicleBuilder setFrameMaterial(Material material) {
		Frame frame = new Frame();
		frame.setMaterial(material);
		vehicle.setFrame(frame);
		return this;
	}

	public VehicleBuilder addWheel(Position position, Material material) {
		Map<Position, Material> wheels = vehicle.getWheels();
		if (wheels == null) {
			wheels = new HashMap<Position, Material>();
			vehicle.setWheels(wheels);
		}
		wheels.put(position, material);
		return this;
	}

	public VehicleBuilder setPowertrainType(PowertrainType powertrainType) {
		vehicle.setPowertrainType(powertrainType);
		return this;
	}

	public Vehicle build() {
		return vehicle;
	}

}
