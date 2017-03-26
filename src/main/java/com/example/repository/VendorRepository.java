package com.example.repository;

import com.example.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by RANGA on 3/26/2017.
 */
@Repository
public interface VendorRepository extends CrudRepository<Vendor,Long> {
}
