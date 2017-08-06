package com.boot.repository;

import com.boot.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jingshanyin on 7/30/17.
 */

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
