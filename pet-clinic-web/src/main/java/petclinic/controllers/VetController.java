package petclinic.controllers;

import com.springpetclinic.pet.model.Vet;
import com.springpetclinic.pet.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

@Controller
//@RequestMapping("/vets")
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping({"vets","vets/index","vets/index.html","/vets.html"})
    public String listVets(Model model ) {

        model.addAttribute("vets",vetService.findAll());
        return "vets/index";

    }

    @RequestMapping("/api/vets")
    public @ResponseBody Set<Vet> getVetsJson(){

        return vetService.findAll();

    }
}
