package com.workscape.vehicleidentifier.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.apache.commons.lang3.NotImplementedException;

import com.workscape.vehicleidentifier.model.Powertrain;
import com.workscape.vehicleidentifier.model.PowertrainType;

public class PowertrainAdapter extends XmlAdapter<Powertrain, PowertrainType>{

    @Override
    public PowertrainType unmarshal(Powertrain powertrain) throws Exception {
    	if (powertrain == null)
    		return null;

    	PowertrainType result = null;
    	if (powertrain.getHuman() != null) {
    		result = PowertrainType.HUMAN;
    	} else if (powertrain.getBernoulli() != null) {
    		result = PowertrainType.BERNOULLI;
    	} else if (powertrain.getInternalCombustion() != null) {
    		result = PowertrainType.INTERNAL_COMBUSTION;
    	}
    	return result;
    }

    @Override
    public Powertrain marshal(PowertrainType powertrainType) throws Exception {
        throw new NotImplementedException("marshal not implemented");
    }

}
