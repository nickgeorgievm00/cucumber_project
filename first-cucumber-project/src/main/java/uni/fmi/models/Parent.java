package uni.fmi.models;

import java.util.*;

/**
 * 
 */
public class Parent {
	
    private String username;
    private String password;
    private String email;
    private String name;
    private String number;
    private String coparent;
    private Role role;
    private Set<Child> children;

    /**
     * Default constructor
     */
    public Parent() {
    }

    /**
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username 
     * @return
     */
    public void setUsername(String username) {
        this.username=username;
    }

    /**
     * @return
     */
    public String getPassword() { 
        return password;
    }

    /**
     * @param pass 
     * @return
     */
    public void setPassword(String pass) {
        this.password=pass;
    }

    /**
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
        this.email=email;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        this.name=name;
    }

    /**
     * @return
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number 
     * @return
     */
    public void setNumber(String number) {
        this.number=number;
    }

    /**
     * @return
     */
    public String getCoparent() {
        return coparent;
    }

    /**
     * @param coparent 
     * @return
     */
    public void setCoparent(String coparent) {
        this.coparent=coparent;
    }

    /**
     * @return
     */
    public Role getRole() {
        return role;
    }

    /**
     * @param role 
     * @return
     */
    public void setRole(Role role) {
        this.role=role;
        }

    /**
     * @return
     */
    public Set<Child> getChildren() {
        // TODO implement here
        return children;
    }

    /**
     * @param children 
     * @return
     */
    public void setChildren(Set<Child> children) {
        this.children=children;
    }

}