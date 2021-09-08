package com.mcommerce.expedition.service.impl;

import com.mcommerce.expedition.model.Expedition;
import com.mcommerce.expedition.repository.ExpeditionRepository;
import com.mcommerce.expedition.service.ExpeditionService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExpeditionServiceImpl implements ExpeditionService {

    private final ExpeditionRepository expeditionRepository;

    public ExpeditionServiceImpl(ExpeditionRepository expeditionRepository) {
        this.expeditionRepository = expeditionRepository;
    }

    @Override
    public Expedition create(Expedition expedition) {
        return expeditionRepository.save(expedition);
    }

    @Override
    public Expedition update(Expedition expedition) {
        if(expedition.getId() != null){
            return expeditionRepository.save(expedition);
        } else {
            return create(expedition);
        }
    }

    @Override
    public Optional<Expedition> findOneById(Long id) {
        return expeditionRepository.findById(id);
    }
}
