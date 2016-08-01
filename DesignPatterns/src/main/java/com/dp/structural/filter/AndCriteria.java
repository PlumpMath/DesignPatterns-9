package com.dp.structural.filter;

import java.util.List;

public class AndCriteria implements Criteria {

	private Criteria oneCriteria;
	private Criteria otherCriteria;
	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> oneCriteriaPersons = this.oneCriteria.meetCriteria(persons);
		return this.otherCriteria.meetCriteria(oneCriteriaPersons);
	}

	public AndCriteria(Criteria oneCriteria, Criteria otherCriteria) {
		super();
		this.oneCriteria = oneCriteria;
		this.otherCriteria = otherCriteria;
	}

	public Criteria getOneCriteria() {
		return oneCriteria;
	}

	public void setOneCriteria(Criteria oneCriteria) {
		this.oneCriteria = oneCriteria;
	}

	public Criteria getOtherCriteria() {
		return otherCriteria;
	}

	public void setOtherCriteria(Criteria otherCriteria) {
		this.otherCriteria = otherCriteria;
	}
}
