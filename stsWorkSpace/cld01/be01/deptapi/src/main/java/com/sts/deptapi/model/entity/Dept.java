package com.sts.deptapi.model.entity;
import com.sts.deptapi.model.DeptVo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="dept")
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dept{
    @Id
    @Column(name="dept_no")
    private int deptno;
    @Column(length=20, nullable=false)
    private String dname;
    @Column(length=20, nullable=true)
    private String loc;

    public DeptVo voBuild(){
        return DeptVo.builder()
        .deptno(deptno)
        .dname(dname)
        .loc(loc)
        .build();
    }
}