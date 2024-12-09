package com.senai.eli.Model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Table(name = "categoria")
@Entity
@Getter
@Setter
public class Admin {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ultimo_acesso", nullable = false)
    private String ultimoAcesso;

    @Column(name = "email", nullable = false)
    private Email email;

    @Column(name = "senha")
    private String senha;

    @Column(name = "usuario")
    private String usuario;

}
