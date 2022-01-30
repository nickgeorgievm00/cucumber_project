package uni.fmi.models;

import java.util.*;

/**
 * 
 */
public class Child {

    private String name;
    private int yearOld;
    private boolean workingParent;
    private boolean workingCoparent;
    private boolean disability;
    private boolean hasTwin;
    private int hasSibling;
    private Parent parent;
    private Ranking rank;
    private Role role;
    
    /**
     * Default constructor
     */
    public Child() {
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
    public int getYearOld() {
        return yearOld;
    }

    /**
     * @param yearOld 
     * @return
     */
    public void setYearOld(int yearOld) {
        this.yearOld=yearOld;
    }

    /**
     * @return
     */
    public boolean getWorkingParent() {
        return workingParent;
    }

    /**
     * @param workingParent 
     * @return
     */
    public void setWorkingParent(boolean workingParent) {
        this.workingParent=workingParent;
    }

    /**
     * @return
     */
    public boolean getWorkingCoparent() {
        return workingCoparent;
    }

    /**
     * @param workingCoparent 
     * @return
     */
    public void setWorkingCoparent(boolean workingCoparent) {
        this.workingCoparent=workingCoparent;
    }

    /**
     * @return
     */
    public boolean getDisability() {
        return disability;
    }

    /**
     * @param disability 
     * @return
     */
    public void setDisability(boolean disability) {
        this.disability=disability;
    }

    /**
     * @return
     */
    public boolean getHasTwin() {
        return hasTwin;
    }

    /**
     * @param hasTwin 
     * @return
     */
    public void setHasTwin(boolean hasTwin) {
       this.hasTwin=hasTwin;
    }

    /**
     * @return
     */
    public int getHasSibling() {
        return hasSibling;
    }

    /**
     * @param hasSibling 
     * @return
     */
    public void setHasSibling(int hasSibling) {
        this.hasSibling=hasSibling;
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
        this.parent=parent;    }

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
    public Ranking getRank() {
        return rank;
    }

    /**
     * @param rank 
     * @return
     */
    public void setRank(Ranking rank) {
        this.rank=rank;
    }

}