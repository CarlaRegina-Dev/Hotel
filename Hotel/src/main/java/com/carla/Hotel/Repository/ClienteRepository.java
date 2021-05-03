package com.carla.Hotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.carla.Hotel.Model.ClienteModel;

@Repository 
public interface ClienteRepository extends JpaRepository <ClienteModel,Long>{

}
