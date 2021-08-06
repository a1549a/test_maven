package com.example.favorite.repository;

import com.example.favorite.entity.ErrorTranslationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Repository
public interface ErrorTranslationRepository extends JpaRepository<ErrorTranslationEntity, UUID> {

    List<ErrorTranslationEntity> findAllByMessageKeyIn(Collection<String> messageKey);

    ErrorTranslationEntity findByMessageKey(String messageKey);
}
