package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.repository.IStockInfoRepository;

@Component
public class FindermethodsTestRunner implements CommandLineRunner {

	@Autowired
	private IStockInfoRepository stockRepo;

	@Override
	public void run(String... args) throws Exception {
		// stockRepo.getByStockType("power").forEach(System.out::println);
		// stockRepo.findByStockTypeIn(List.of("power","technology")).forEach(System.out::println);
		// stockRepo.findByNameLike("%A%").forEach(System.out::println);
		// stockRepo.findByNameLike("J%").forEach(System.out::println);;
		// stockRepo.findByNameLike("%s").forEach(System.out::println);;
		//stockRepo.findByNameStartingWith("a").forEach(System.out::println);;
		stockRepo.findByCompanyEndingWith("p").forEach(System.out::println);
	}

}
