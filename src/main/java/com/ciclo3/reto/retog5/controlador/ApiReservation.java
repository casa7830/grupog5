package com.ciclo3.reto.retog5.controlador;

import com.ciclo3.reto.retog5.entidad.Reservation;
import com.ciclo3.reto.retog5.servicio.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/Reservation")

public class ApiReservation {

        @Autowired
        private ReservationService service;

        @GetMapping("/all")
        public List<Reservation> getReservations(){
            return service.getReservations();
        }

        /*@GetMapping( "/{idReservation}")
        public Reservation getReservation(@PathVariable long idReservation){
            return service.getReservation(idReservation);
        }
        */

        @PostMapping("/save")
        public ResponseEntity saveReservation(@RequestBody Reservation reservation){
            service.saveReservation(reservation);
            return ResponseEntity.status(201).build();

        }
  /*
    @PutMapping("/update")
    public ResponseEntity updateRoom(@RequestBody Room room) {
        service.updateRoom(room);
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteRoom(@PathVariable long id) {
        service.deleteRoom(id);
        return ResponseEntity.status(204).build();
    }
  */
    }


