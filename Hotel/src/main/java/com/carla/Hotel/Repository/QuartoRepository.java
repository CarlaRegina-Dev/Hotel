package com.carla.Hotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.carla.Hotel.Model.QuartoModel;

@Repository 
public interface QuartoRepository extends JpaRepository <QuartoModel,Long>   {

}
