package com.workscape.vehicleidentifier.jaxb;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.apache.commons.lang3.NotImplementedException;

import com.workscape.vehicleidentifier.model.Material;
import com.workscape.vehicleidentifier.model.Position;
import com.workscape.vehicleidentifier.model.Wheel;
import com.workscape.vehicleidentifier.model.Wheels;

public class WheelsAdapter extends XmlAdapter<Wheels, Map<Position, Material>>{

    @Override
    public Map<Position, Material> unmarshal(Wheels wheels) throws Exception {
    	if (wheels == null || wheels.getWheels() == null || wheels.getWheels().isEmpty())
            return null;

    	Map<Position, Material> result = new LinkedHashMap<Position, Material>();
    	
    	for (Wheel wheel : wheels.getWheels()) {
    		result.put(wheel.getPosition(), wheel.getMaterial());
		}

    	return result;
    }

    @Override
    public Wheels marshal(Map<Position, Material> wheels) throws Exception {
        throw new NotImplementedException("marshal not implemented");
    }

}
