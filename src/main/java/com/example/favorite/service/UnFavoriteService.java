package com.example.favorite.service;

import com.example.favorite.model.UnFavoriteRequest;
import com.example.favorite.model.UnFavoriteResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UnFavoriteService {

    UnFavoriteResponse create(UnFavoriteRequest favoriteRequest);

    UnFavoriteResponse update(Long id, Long userId, UnFavoriteRequest favoriteRequest);

    UnFavoriteResponse findByIdAndUserId(Long id, Long userId);

    void deleteByIdAndUserId(Long id, Long userId);

    Page<UnFavoriteResponse> all(Long userId, Pageable pageable);

}
