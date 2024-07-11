package com.rocketseat.planner.trip;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface TripRepository extends JpaRepository<Trip, UUID>{ //faz a conexão com o banco dados
    
}
