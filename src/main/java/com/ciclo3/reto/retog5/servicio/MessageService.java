package com.ciclo3.reto.retog5.servicio;

import com.ciclo3.reto.retog5.entidad.Message;
import com.ciclo3.reto.retog5.repositorio.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository repository;

    /**
     * mostrar datos message
     *
     */
    public List<Message> getMessages(){
        return repository.findAll();
    }
    /**
     *
     * guardar datos message
     */
    public Message saveMessage(Message message) {
        return repository.save(message);
    }

}








