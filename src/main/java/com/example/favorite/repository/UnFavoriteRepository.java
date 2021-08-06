package com.example.favorite.repository;

import com.example.favorite.entity.UnFavoriteEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UnFavoriteRepository extends JpaRepository<UnFavoriteEntity, Long> {

    Page<UnFavoriteEntity> findAllByUserId(Long userId, Pageable pageable);

    Optional<UnFavoriteEntity> findByIdAndUserId(Long id, Long userId);
}
