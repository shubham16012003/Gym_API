package com.Gym.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Gym.model.Demo;

@Repository
public interface DemoRepository extends JpaRepository<Demo, Integer>{

}
