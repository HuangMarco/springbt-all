package com.huangshi.wuji.spring.scaffold.performance.logging.service;

import com.huangshi.wuji.spring.scaffold.performance.logging.model.PerformanceEmployee;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PerformanceEmployeeService {

    static HashMap<Long, PerformanceEmployee> db = new HashMap<>();

    static {
        db.put(1L, new PerformanceEmployee(1L, "Alex", "Gussin"));
        db.put(2L, new PerformanceEmployee(2L, "Brian", "Schultz"));
    }

    public PerformanceEmployee getEmployeeById(Long id) {
        return db.get(id);
    }

}
