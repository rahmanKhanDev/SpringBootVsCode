package com.nt.service;

import com.nt.entity.Person;

public interface IOTMAssociationMappingMgmtService {
public void saveDataUsingParent();
public void saveDataUsingChild();
public void loadDataUsingParent();
public void loadDataUsingChild();
public void deleteByparent(int personId);
public void deleteAllChildOfAParent(int personId);
public void addNewChildToAParent(int persoId);
public void updateParentById(Person person);
}
