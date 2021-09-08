package com.mcommerce.expedition.web;

import com.mcommerce.expedition.model.Expedition;
import com.mcommerce.expedition.service.ExpeditionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/expedition")
public class ExpeditionController {

    private final ExpeditionService expeditionService;

    public ExpeditionController(ExpeditionService expeditionService) {
        this.expeditionService = expeditionService;
    }

    @PostMapping("/save")
    public Expedition save(Expedition expedition){
        return expeditionService.create(expedition);
    }

    @PutMapping("/update")
    public Expedition update(Expedition expedition){
        return expeditionService.update(expedition);
    }

    @GetMapping("/findById")
    public Optional<Expedition> findById(Long id){
        return expeditionService.findOneById(id);
    }
}
