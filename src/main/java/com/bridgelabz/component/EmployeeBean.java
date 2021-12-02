package com.bridgelabz.component;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Purpose: This is a pojo class where we are injecting the dependency from DepartmentBean class.
 *
 * @author Ashwith
 * @since 1/12/21
 */
@Component
@Slf4j
public class EmployeeBean {

    public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);
    private int eid;
    private String eName;
    /**
     * Purpose : Autowiring to make the object dependency connection with te DepartmentBean class and logger expression
     */
    @Autowired
    private DepartmentBean departmentBean;

    /**
     * Purpose : This method is used to access the object dependency connection of the employee of particular department
     *
     * @param departmentBean defines the name of the department in which the employee is belonging
     */
    @Autowired
    public EmployeeBean(DepartmentBean departmentBean) {
        logger.debug("*** Autowiring by using @Autowire annotation on constructor ***");
        this.departmentBean = departmentBean;
    }

    /**
     * Purpose : This method is used to get the employee id
     *
     * @return the eid of the employee
     */
    public int getEid() {
        return eid;
    }

    /**
     * Purpose : This method is used to set the employee id
     *
     * @param eid defines employee id
     */
    public void setEid(int eid) {
        this.eid = eid;
    }

    /**
     * Purpose : This method is used to get the name of the employee
     *
     * @return the employee name
     */
    public String geteName() {
        return eName;
    }

    /**
     * Purpose : This method is used to set the name of the employee
     *
     * @param eName employee name
     */
    public void seteName(String eName) {
        this.eName = eName;
    }

    /**
     * Purpose : This method is used to access the DepartmentBean to get the name of the department
     *
     * @return the name of the department
     */
    public DepartmentBean getDepartmentBean() {
        return departmentBean;
    }

    /**
     * Purpose : This method is used to set the name of the department
     *
     * @param departmentBean defines the name of the department
     */
    @Autowired
    public void setDepartmentBean(DepartmentBean departmentBean) {
        logger.debug("*** Autowiring by using @Autowire annotation on Setter ***");
        this.departmentBean = departmentBean;
    }

    /**
     * This method is to log all the details of Employee.
     */
    public void showEmployeeDetails() {
        logger.debug("Employee Id : {}", eid);
        logger.debug("Employee Name : {}", eName);
        departmentBean.setDeptName("Backend Developer");
        logger.debug("Department : {}", departmentBean.getDeptName());

    }
}
