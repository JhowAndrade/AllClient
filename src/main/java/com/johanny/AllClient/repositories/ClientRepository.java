package com.johanny.AllClient.repositories;

import com.johanny.AllClient.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {


}
