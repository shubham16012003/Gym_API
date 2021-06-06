package com.Gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gym.dao.DemoRepository;
import com.Gym.model.Demo;


@Service
public class DemoServiceImpl implements DemoService{
	
	@Autowired
	DemoRepository demoRepository;
	
	@Override
	public boolean saveDemo(Demo demo) {
		try {
			Demo savelead=demoRepository.save(demo);
			if(savelead !=null) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

}

