package br.com.springboot.tarefas;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
public class Tarefas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tarefaa;


}
