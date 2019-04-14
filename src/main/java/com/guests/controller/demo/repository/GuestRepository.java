package com.guests.controller.demo.repository;

import com.guests.controller.demo.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest,Long> {

}
