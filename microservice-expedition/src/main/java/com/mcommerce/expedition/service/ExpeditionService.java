package com.mcommerce.expedition.service;

import com.mcommerce.expedition.model.Expedition;

import java.util.Optional;

public interface ExpeditionService {

    Expedition create(Expedition expedition);
    Expedition update(Expedition expedition);
    Optional<Expedition> findOneById(Long id);
}
