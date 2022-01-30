package uni.fmi.models;

import java.util.*;

/**
 * 
 */
public class Admin {

    private String username;
    private String password;
    private String email;
    private Role role;
    private Set<Ranking> rankings;
   
    /**
     * Default constructor
     */
    
    public Admin() {
    }
    /**
     * 
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
    public Set<Ranking> getRankings() {
        return rankings;
    }

    /**
     * @param rankings 
     * @return
     */
    public void setRankings(Set<Ranking> rankings) {
        this.rankings=rankings;
    }

}