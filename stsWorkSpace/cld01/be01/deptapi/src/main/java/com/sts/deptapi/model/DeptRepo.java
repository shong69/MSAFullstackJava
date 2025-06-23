package com.sts.deptapi.model;
import com.sts.deptapi.model.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepo extends JpaRepository<Dept,Integer>{
    
}
