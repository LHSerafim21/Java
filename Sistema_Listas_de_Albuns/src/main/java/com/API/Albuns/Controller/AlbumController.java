package com.API.Albuns.Controller;

import com.API.Albuns.Model.Album;
import com.API.Albuns.Model.Lista;
import com.API.Albuns.Repository.AlbumRepository;
import com.API.Albuns.Repository.ListasRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AlbumController {
    @Autowired
    private AlbumRepository albunsRepo;
    @Autowired
    private ListasRepository listasRepo;

    @GetMapping("/adicionarAlbum")
    public String adicionarAlbum(@RequestParam("idLista") Integer idLista) {
        return "formAlbum";
    }

    @PostMapping("/adicionarAlbum")
    public String criarLista(@Valid Album album,
                             BindingResult result,
                             RedirectAttributes attributes,
                             @RequestParam(value="idLista") Integer idLista
                             ) {
        if (result.hasErrors()) {
            attributes.addFlashAttribute(
                    "mensagem", "Verifique os campos!"
            );
            return "redirect:/listas";
        }
        album.setListaAlbum(listasRepo.findByIdLista(idLista));
        albunsRepo.save(album);
        return "redirect:/listas";
    }


}

