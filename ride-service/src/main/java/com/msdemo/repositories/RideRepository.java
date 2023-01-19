package com.msdemo.repositories;

import com.msdemo.models.Ride;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RideRepository  extends CrudRepository<Ride, Long> {
    public List<Ride> findByFromAndTo(String from, String to);
}
