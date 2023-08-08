package br.com.gabi.LojaVarejo1.controller;

import br.com.gabi.LojaVarejo1.domain.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.lang.Long;

@EnableWebMvc

@Controller
@RequestMapping("produtos")
public class LojaController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/produto")
    public String carregaPaginaProduto(Long id, Model model) {
        if (id != null) {
            model.addAttribute("produto", repository.findById(id));
        }
        return "Loja/index";
    }

    @DeleteMapping("/{id}")
    @Transactional
    public String removeProduto(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/produtos";
    }
}

