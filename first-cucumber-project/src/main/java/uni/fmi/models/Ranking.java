package uni.fmi.models;

import java.util.*;

/**
 * 
 */
public class Ranking {
	
    private String order;
    private Set<Child> children;
    private Admin admin;
    
    /**
     * Default constructor
     */
    public Ranking() {
    }

    /**
     * @return
     */
    public String getOrder() {
        return order;
    }

    /**
     * @param order 
     * @return
     */
    public void setOrder(String order) {
        this.order=order;
    }

    /**
     * @return
     */
    public Set<Child> getChildren() {
        return children;
    }

    /**
     * @param children 
     * @return
     */
    public void setChildren(Set<Child> children) {
        this.children=children;
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

}