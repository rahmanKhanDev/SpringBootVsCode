package com.nt.restController;

import java.util.List;

import org.hibernate.engine.spi.Resolution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.binding.ActorData;
import com.nt.service.IActorInfoMgmtService;

@RestController
@RequestMapping("/actor-api")
public class ActorOperationController {
//inject service
	@Autowired
	private IActorInfoMgmtService actorService;
	
	
	//save actor
	@PostMapping("/save")
	public ResponseEntity<String> saveActor(@RequestBody ActorData actor){
		//invoke b.logic		
		String msg=actorService.registerActor(actor);
		//return api
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	
	}
	
	// get all actor
	@GetMapping("/report")
	public ResponseEntity<List<ActorData>> getAllActorData(){
		//invoke service
		List<ActorData> listData=actorService.showAllData();
		// return api
		return new ResponseEntity<List<ActorData>>(listData,HttpStatus.OK);
	}
	
	
	//get actor by id
	@GetMapping("/get/{id}")
	public ResponseEntity<ActorData> getActorByid(@PathVariable Integer id){
		//invoke service
		ActorData data=actorService.showActorById(id);
		return new ResponseEntity<ActorData>(data,HttpStatusCode.valueOf(200));
	}
	
	//update actor
	@PutMapping("/update")
	public ResponseEntity<String> updateActorData(@RequestBody ActorData data){
		//invoke service
		String msg=actorService.updateActorData(data);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	//update actor status
	@PatchMapping("/supdate/{id}/{status}")
	public ResponseEntity<String> updateActorStatus(@PathVariable Integer id,@PathVariable String status){
		//invoke service
		String msg=actorService.updateActorStatus(status, id);
		return new ResponseEntity<String>(msg,HttpStatusCode.valueOf(200));
	}
	
	//delete actor
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteByid(@PathVariable Integer id){
		//invoke service
		String msg=actorService.deleteActorById(id);
		return new ResponseEntity<String>(msg,HttpStatusCode.valueOf(200));
	}
	
}
