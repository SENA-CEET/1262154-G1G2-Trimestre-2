/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemploasociacionesbasedatos.model;

import java.util.List;

/**
 *
 * @author Enrique
 */
public class Role {
    private String idRole;
    private String description;
    private Boolean status;
    private List<Customer> Customers;

    public String getIdRole() {
        return idRole;
    }

    public void setIdRole(String idRole) {
        this.idRole = idRole;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<Customer> getCustomers() {
        return Customers;
    }

    public void setCustomers(List<Customer> Customers) {
        this.Customers = Customers;
    }
    
    
    
    
    
    
}
