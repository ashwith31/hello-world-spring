package com.bridgelabz.component;

import org.springframework.stereotype.Component;

/**
 * Purpose : Simulate department details
 *
 * @author : Ashwith
 * @since : 1-12-2021
 */
@Component
public class DepartmentBean {
    private String deptName;

    /**
     * Purpose : This method is used to get the department name
     *
     * @return the name of the department
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * Purpose : This method is used to set the department name
     *
     * @param deptName defines the name of the department
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
