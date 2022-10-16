package com.ciclo3.reto.retog5.servicio;


import com.ciclo3.reto.retog5.entidad.Room;
import com.ciclo3.reto.retog5.repositorio.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository repository;
    //GET
    public List<Room> getRooms(){
       return repository.findAll();
    }
    //POST
   public Room saveRoom(Room room) {
        return repository.save(room);
   }

   /*
   public Room getRoom(long id){
        return repository.findById(id).orElse( null);
   }

   public Room updtateRoom(Room roomUpd){
     Room roomOld = getRoom(roomUpd.getId());
     roomOld.setName(roomUpd.getName());
     roomOld.setHotel(roomUpd.getHotel());
     return repository.save(roomOld);
   }
   */
}
