package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.binding.ActorData;
import com.nt.entity.ActorInfo;
import com.nt.repository.IActorInfoRepository;

@Service
public class ActorInfoMgmtServiceImp implements IActorInfoMgmtService {
	@Autowired
	private IActorInfoRepository actorRepo;
	@Value("${user.name}")
	private String osuser;

	// register actor
	@Override
	public String registerActor(ActorData actor) {
		// binding data to entity class data
		ActorInfo entity = new ActorInfo();
		BeanUtils.copyProperties(actor, entity);
		// set meta data
		entity.setCreatedBy(osuser);
		entity.setUpdatedBy(osuser);
		int id = actorRepo.save(entity).getAid();
		return "Actor registred successfully with id:" + id;
	}

	// get all actor data

	@Override
	public List<ActorData> showAllData() {
		List<ActorData> listData = new ArrayList<>();
		// get entity list
		List<ActorInfo> entityList = actorRepo.findAll();
		// copy to ActorData obj
		for (ActorInfo entity : entityList) {
			ActorData data = new ActorData();
			BeanUtils.copyProperties(entity, data);
			listData.add(data);
		}
		return listData;
	}

	// get actor by id
	
	@Override
	public ActorData showActorById(Integer id) {
		//invoke repo
		ActorInfo entity=actorRepo.findById(id).orElseThrow(()->new IllegalArgumentException("invalid id"));
		//copy entity to ActorData Obj
		ActorData data=new ActorData();
		BeanUtils.copyProperties(entity, data);
		return data;
	}
	
	//update actor
	@Override
	public String updateActorData(ActorData data) {
		//invoke repo
		ActorInfo entity=actorRepo.findById(data.getAid()).orElseThrow(()->new IllegalArgumentException("invalid id"));
		//compy actordata to entity
		BeanUtils.copyProperties(data, entity);
		//set properties
		entity.setCreatedBy(osuser);
		entity.setUpdatedBy(osuser);
		//update actor data
		int id=actorRepo.save(entity).getAid();
		return id+" updated successfully";
	}
	
	
	//update actor status
	@Override
	public String updateActorStatus(String status,Integer id) {
		//invoke repo
		ActorInfo entity=actorRepo.findById(id).orElseThrow(()->new IllegalArgumentException("invalid id"));
		// set status
		entity.setActive_SW(status);
		//update entity
		int idVal=actorRepo.save(entity).getAid();
		
		return idVal+" status updated successfully";
	}
	
     //delete actor by id
	@Override
	public String deleteActorById(Integer id) {
		//invoke repo
		ActorInfo entity=actorRepo.findById(id).orElseThrow(()->new IllegalArgumentException("invalid id"));
		// delete actor
		actorRepo.deleteById(id);
		return id+" deleted successfully";
	}



}
