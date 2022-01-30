package uni.fmi.models;

import java.util.*;

/**
 * 
 */
public class Role {

    private String roleCode;
    private Parent parent;
    private Admin admin;
    private Child child;

    /**
     * Default constructor
     */
    public Role() {
    }
    
    /**
     * @return
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * @param code 
     * @return
     */
    public void setRoleCode(String code) {
        this.roleCode=code;
    }

    /**
     * @return
     */
    public Parent getParent() {
        return parent;
    }

    /**
     * @param parent 
     * @return
     */
    public void setParent(Parent parent) {
    	this.parent=parent;
    }

    /**
     * @return
     */
    public Admin getAdmin() {
        return admin;
    }

    /**
     * @param admin 
     * @return
     */
    public void setAdmin(Admin admin) {
        this.admin=admin;
    }

    /**
     * @return
     */
    public Child getChild() {
        return child;
    }

    /**
     * @param child 
     * @return
     */
    public void setChild(Child child) {
        this.child=child;
    }

}