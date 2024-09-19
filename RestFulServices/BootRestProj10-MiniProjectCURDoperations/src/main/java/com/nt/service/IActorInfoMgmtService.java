package com.nt.service;

import java.util.List;

import com.nt.binding.ActorData;

public interface IActorInfoMgmtService {
public String registerActor(ActorData actor);
public List<ActorData> showAllData();
public ActorData showActorById(Integer id);
public String updateActorData(ActorData data);
public String updateActorStatus(String status,Integer id);
public String deleteActorById(Integer id);

}
