package com.API.Albuns.Controller;

import com.API.Albuns.Model.Album;
import com.API.Albuns.Model.Lista;
import com.API.Albuns.Repository.ListasRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ListasController {
    @Autowired
    private ListasRepository listasRepo;

    @RequestMapping("/listas")
    public String listas() {
        return "listas";
    }

    @RequestMapping("/criarLista")
    public String criarLista() {
        return "criarLista";
    }

    @GetMapping("/listas")
    public ModelAndView listaListas() {
        ModelAndView mv = new ModelAndView("listas");
        Iterable<Lista> listas = listasRepo.findAll();
        mv.addObject("listas", listas);

        return mv;
    }

    @PostMapping("/criarLista")
    public String criarLista(@Valid Lista lista,
                             BindingResult result,
                             RedirectAttributes attributes) {
        if (result.hasErrors()) {
            attributes.addFlashAttribute(
                    "mensagem", "Verifique os campos!"
            );
            return "redirect:/listas";
        }
        listasRepo.save(lista);
        return "redirect:/listas";
    }

    @RequestMapping("/lista-{idLista}")
    public ModelAndView abrirLista(@PathVariable("idLista") Integer idLista) {
        Lista lista = listasRepo.findByIdLista(idLista);
        ModelAndView mv = new ModelAndView("detalhesLista");
        mv.addObject("lista", lista);
        return mv;
    }
}
