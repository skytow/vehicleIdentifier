package com.workscape.vehicleidentifier.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Powertrain {

	private PowertrainHuman human;
	private PowertrainBernoulli bernoulli;
	private PowertrainInternalCombustion internalCombustion;

	public PowertrainHuman getHuman() {
		return human;
	}
	
	public void setHuman(PowertrainHuman human) {
		this.human = human;
	}
	
	public PowertrainBernoulli getBernoulli() {
		return bernoulli;
	}
	
	public void setBernoulli(PowertrainBernoulli bernoulli) {
		this.bernoulli = bernoulli;
	}
	
	public PowertrainInternalCombustion getInternalCombustion() {
		return internalCombustion;
	}
	
	public void setInternalCombustion(PowertrainInternalCombustion internalCombustion) {
		this.internalCombustion = internalCombustion;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
