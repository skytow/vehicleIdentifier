package com.workscape.vehicleidentifier.vehicle;

import org.apache.commons.lang3.builder.EqualsBuilder;

import com.workscape.vehicleidentifier.model.Vehicle;

public class VehicleTypeComparator {

	public static boolean matches(Vehicle v1, Vehicle v2) {
		if (!EqualsBuilder.reflectionEquals(v1, v2, "id"))
			return false;

		return true;
	}

}
