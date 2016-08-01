package com.dp.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class MaleCriteria implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<>();
		for (Person person : persons) {
			if ("MALE".equalsIgnoreCase(person.getGender())) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}
}
