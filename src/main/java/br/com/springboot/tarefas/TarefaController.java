package br.com.springboot.tarefas;

import br.com.springboot.cliente.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    @GetMapping
    public List<Tarefas> list() {
        return tarefaRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tarefas adicionar(@RequestBody Tarefas tarefas){
        return tarefaRepository.save(tarefas);
    }

}
