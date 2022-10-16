package com.ciclo3.reto.retog5.servicio;


import com.ciclo3.reto.retog5.entidad.Reservation;
import com.ciclo3.reto.retog5.repositorio.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ReservationService {

    @Autowired
    private ReservationRepository repository;

    //GET
    public List<Reservation> getReservations(){
            return repository.findAll();
    }
    //POST
   public Reservation saveReservation(Reservation reservation) {
        return repository.save(reservation);
   }

   /*
   public Reservation getReservation(long idReservation){
        return repository.findById(idReservation).orElse( null);
   }
   public Reservation updtateReservation(Reservation reservationUpd){
     Reservation reservationOld = getReservation(reservationUpd.getId());
     reservationOld.setName(reservationUpd.getName());
     roomOld.setHotel(roomUpd.getHotel());
     return repository.save(roomOld);
   }
   */
    }
