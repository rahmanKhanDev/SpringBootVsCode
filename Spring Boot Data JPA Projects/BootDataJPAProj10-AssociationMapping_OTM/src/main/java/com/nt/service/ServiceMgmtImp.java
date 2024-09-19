package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.repository.IPersonRepository;
import com.nt.repository.IPhoneNumberRepository;

@Service
public class ServiceMgmtImp implements IOTMAssociationMappingMgmtService {

	@Autowired
	private IPersonRepository personRepo;
	@Autowired
	private IPhoneNumberRepository phoneRepo;

	@Override
	public void saveDataUsingParent() {
		// person obj
		Person per = new Person("BOB", "New York");
		Person per2 = new Person("John", "London");
		// child obj
		PhoneNumber ph1 = new PhoneNumber(22222222L, "Airtel");
		PhoneNumber ph2 = new PhoneNumber(11111111L, "Airtel");

		PhoneNumber ph3 = new PhoneNumber(12121212L, "BSNl");
		PhoneNumber ph4 = new PhoneNumber(76767676L, "JIO");

		// set parent to child
		ph1.setPersonInfo(per);
		ph2.setPersonInfo(per);
		ph3.setPersonInfo(per2);
		ph4.setPersonInfo(per2);

		// Set child to parent
		per.setPhoneNumbers(Set.of(ph1, ph2));
		per2.setPhoneNumbers(Set.of(ph3, ph4));

		// list of parent
		Iterable<Person> list = List.of(per, per2);
		System.out.println(personRepo.saveAll(list).size()+" no of parents saved");

	}

	@Override
	public void saveDataUsingChild() {
		// person obj
		Person per = new Person("Mojibur rahman Khan", "Bihar");
		// child obj
		PhoneNumber ph1 = new PhoneNumber(33333333L, "airtel");
		PhoneNumber ph2 = new PhoneNumber(66555577L, "vodaphone");

		// set child to parent
		per.setPhoneNumbers(Set.of(ph1, ph2));

		// set parent to child
		ph1.setPersonInfo(per);
		ph2.setPersonInfo(per);

		System.out.println("Parent and associates Childs are saved (child to parent) with registration numbers::"
				+ phoneRepo.save(ph1).getRegNo() + " & " + phoneRepo.save(ph2).getRegNo());

	}

	@Override
	public void loadDataUsingParent() {
		Iterable<Person> it = personRepo.findAll();
		it.forEach(per -> {
			System.out.println("Person Info::" + per);
			Set<PhoneNumber> childs = per.getPhoneNumbers();
			System.out.println("Count of phone numbers are::" + childs.size());
			childs.forEach(ph -> {
				System.out.println("Phones numbers are::" + ph.getNumber());
			});

		});

	}

	@Override
	public void loadDataUsingChild() {
		Iterable<PhoneNumber> it = phoneRepo.findAll();
		it.forEach(ph -> {
			System.out.println(ph);
			Person per = ph.getPersonInfo();
			System.out.println(per);
		});

	}

	@Override
	public void deleteByparent(int personId) {
		Optional<Person> opt = personRepo.findById(personId);
		if (opt.isPresent()) {
			Person per = opt.get();
			personRepo.delete(per);
			System.out.println("Person and associated child deleted successfully");

		} else {
			System.out.println("Record not found");
		}

	}

	@Override
	public void deleteAllChildOfAParent(int personId) {
		Optional<Person> opt = personRepo.findById(personId);
		if (opt.isPresent()) {
			Person per = opt.get();
			Set<PhoneNumber> childs = per.getPhoneNumbers();

			childs.forEach(ph -> {
				ph.setPersonInfo(null);
			});
			phoneRepo.deleteAllInBatch(childs);
			System.out.println(childs.size() + " no of Childs of person id " + personId + " are deleted");

		} else {
			System.out.println("Person record not found");
		}

	}

	@Override
	public void addNewChildToAParent(int persoId) {
		Optional<Person> opt = personRepo.findById(persoId);
		if (opt.isPresent()) {
			Person per = opt.get();
			Set<PhoneNumber> childs = per.getPhoneNumbers();
			PhoneNumber ph1 = new PhoneNumber(14141414L, "airtel");
			PhoneNumber ph2 = new PhoneNumber(24345434L, "jio");

			ph1.setPersonInfo(per);
			ph2.setPersonInfo(per);
			childs.add(ph1);
			childs.add(ph2);
			personRepo.save(per);
			System.out.println("New child is added successfully");
		} else {
			System.out.println("record not found");
		}

	}

	@Override
	public void updateParentById(Person per) {
		Optional<Person> opt = personRepo.findById(per.getPId());
		if (opt.isPresent()) {
			int id = personRepo.save(per).getPId();
			System.out.println("Parent exist and updated with id:" + id);

		} else {
			int id = personRepo.save(per).getPId();
			System.out.println("Parent not exist, registered successfully with id:" + id);
		}

	}

}
