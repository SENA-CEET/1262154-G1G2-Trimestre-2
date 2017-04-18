/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemploasociacionesbasedatos.model2;

import java.util.List;

/**
 *
 * @author Enrique
 */
public class Role {
    private String idRole;
    private String description;
    private Boolean status;
    private List<CustomerHasRole> CustomerHasRoleCollection;

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

    public List<CustomerHasRole> getCustomerHasRoleCollection() {
        return CustomerHasRoleCollection;
    }

    public void setCustomerHasRoleCollection(List<CustomerHasRole> CustomerHasRoleCollection) {
        this.CustomerHasRoleCollection = CustomerHasRoleCollection;
    }
    
    
    
}
