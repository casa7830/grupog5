package com.ciclo3.reto.retog5.servicio;


import com.ciclo3.reto.retog5.entidad.Admin;
import com.ciclo3.reto.retog5.repositorio.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
  @Autowired
  private AdminRepository repository;

  /**
   * peticion get
   */
  public List<Admin> getAdmins() {
    return repository.findAll();
  }

  /**
   * peticion post
   */
  public Admin saveAdmin(Admin admin) {
     return repository.save(admin);
  }


  }

