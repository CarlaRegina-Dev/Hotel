package com.carla.Hotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.carla.Hotel.Model.ReservaModel;

public interface ReservaRepository extends JpaRepository <ReservaModel,Long>{

}
