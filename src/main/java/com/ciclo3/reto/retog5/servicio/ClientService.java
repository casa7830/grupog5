package com.ciclo3.reto.retog5.servicio;


import com.ciclo3.reto.retog5.entidad.Category;
import com.ciclo3.reto.retog5.entidad.Client;
import com.ciclo3.reto.retog5.repositorio.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
  @Autowired
  private ClientRepository repository;

  /**
   * peticion get
   */
  public List<Client> getClients() {
    return repository.findAll();
  }

  /**
   * peticion post
   */
  public Client saveClient(Client client) {
    return repository.save(client);
  }


  public Client getClient(long id) {
    return repository.findById(id).orElse(null);
  }

  public void deleteClient (long idClient){
    repository.deleteById(idClient);
  }

  public Client updateClient(Client clientUpd) {
    Client clientOld = getClient(clientUpd.getIdClient());
    clientOld.setName(clientUpd.getName());
    clientOld.setEmail(clientUpd.getEmail());
    clientOld.setPassword(clientUpd.getPassword());
    clientOld.setAge(clientUpd.getAge());
    return repository.save(clientOld);
  }

  }

