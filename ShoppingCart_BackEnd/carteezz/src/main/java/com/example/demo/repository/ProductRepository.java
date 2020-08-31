/**
 * 
 */
package com.example.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Products;

/**
 * @author SK
 *
 */
@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "product", path = "product")
public interface ProductRepository extends JpaRepository<Products, Long> {
	
	 Page<Products> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);

	 Page<Products> findByNameContaining(@RequestParam("name") String name, Pageable pageable);

}
