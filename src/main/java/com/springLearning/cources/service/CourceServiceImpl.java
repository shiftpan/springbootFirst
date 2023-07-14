package com.springLearning.cources.service;

import com.springLearning.cources.dao.CourceDao;
import com.springLearning.cources.entity.Cource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourceServiceImpl implements CourceService {
    /**
     * @return
     */
   // List<Cource> courseList=null;
@Autowired
private CourceDao courceDao;
    public CourceServiceImpl() {



//        courseList= new ArrayList<>();
//        courseList.add(new Cource(123, "java","This is java cources"));
//        courseList.add(new Cource(321, "Paython","This is Paython cources"));
    }

    @Override
    @Transactional()
    public List<Cource> getAllCource() {
        return courceDao.findAll();
    }
}
