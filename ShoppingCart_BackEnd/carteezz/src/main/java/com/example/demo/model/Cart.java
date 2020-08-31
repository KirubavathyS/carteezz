/**
 * 
 */
package com.example.demo.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author SK
 *
 */

@Entity
public class Cart {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;

	    @ElementCollection
	    private List<Products> items;

	    private double total ;
	    
	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public List<Products> getItems() {
	        return items;
	    }

	    public void setItems(List<Products> items) {
	        this.items = items;
	    }

	    public double getTotal() {
	        return total;
	    }

	    public void setTotal(double total) {
	        this.total = total;
	    }
}
