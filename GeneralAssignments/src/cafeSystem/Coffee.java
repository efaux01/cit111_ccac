/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeSystem;

/**
 *
 * @author efaux01
 */
class Coffee {
    public String flavor;
    public boolean hot;
    public boolean withIce;
    public boolean percolate;
    public boolean espressoBase;
    public int roastStrength;
    public String beanType;
    public boolean creamer;
    public int creamerAmount;
    public int percCreamer;
    public String creamerType;
    public int sizeOz;
    public String sizeName;
    
    public void setBase(){
        if(percolate = false){
            espressoBase=true;
        }else espressoBase=false;
    }//close setBase
}
