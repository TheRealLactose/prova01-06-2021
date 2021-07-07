package br.com.springboot.cliente;

import br.com.springboot.tarefas.Produto;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @ManyToOne
    private Produto produtoempresa;


}
