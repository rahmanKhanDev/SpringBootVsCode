package com.nt.runner;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Optional;
import java.util.Scanner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.MarriageSeeker;
import com.nt.service.IMarriageSeekerServiceMgmt;

@Component
public class MarriageSeekerTestRunner implements CommandLineRunner {
	@Autowired
	public IMarriageSeekerServiceMgmt seekerService;

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);

//		// Receving propeerties data from Enduser
//		System.out.println("Enter seeker name::");
//		String sName = sc.next();
//		System.out.println("Enter seeker sddress::");
//		String sAdd = sc.next();
//		System.out.println("Enter seeker is Indian::");
//		boolean isIndian = sc.nextBoolean();
//		System.out.println("Enter photo path::");
//		String photoPath = sc.next();
//		System.out.println("Enter resume path::");
//		String resumePath = sc.next();
//
//		// creating byte[] for photo content
//		File file = new File(photoPath);
//		FileInputStream fis = new FileInputStream(file);
//		byte photoContent[] = new byte[fis.available()];
//		photoContent = fis.readAllBytes();
//
//		// creating char[] for resume data
//		file = new File(resumePath);
//		FileReader reader = new FileReader(file);
//		char resumeContent[] = new char[(int) file.length()];
//		reader.read(resumeContent);
//
//		// Entity clas object
//		MarriageSeeker seeker = new MarriageSeeker(sName, sAdd, isIndian, photoContent, resumeContent);
//
//		// invoke service method
//	//	String resultMsg = seekerService.registerMarraigeSeeker(seeker);
//	//	System.out.println(resultMsg);

		System.out.println("Enter seeker id::");
		int sId = sc.nextInt();

		Optional<MarriageSeeker> opt = seekerService.getMarraigeSeekerById(sId);
		if (opt.isPresent()) {
			MarriageSeeker seeker = opt.get();
			System.out.println("seekerId::" + seeker.getSId() + " ... seekerName::" + seeker.getSName()
					+ " ... seekerAdd::" + seeker.getSAdd() + " ... isIndian::" + seeker.getIsIndian());

			FileOutputStream fos = new FileOutputStream("received_photo.jpg");
			fos.write(seeker.getPhoto());
			fos.flush();

			Writer writer = new FileWriter("received_biodata.txt");
			writer.write(seeker.getResume());
			writer.flush();

			fos.close();
			writer.close();
			System.out.println("LOBs are received");

		}

		// close streams
//		fis.close();
//		reader.close();
		sc.close();

	}

}
