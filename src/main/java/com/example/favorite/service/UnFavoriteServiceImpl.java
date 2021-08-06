package com.example.favorite.service;

import com.example.favorite.entity.UnFavoriteEntity;
import com.example.favorite.exception.ExceptionWithStatusCode;
import com.example.favorite.model.UnFavoriteRequest;
import com.example.favorite.model.UnFavoriteResponse;
import com.example.favorite.repository.UnFavoriteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UnFavoriteServiceImpl implements UnFavoriteService {

    private final UnFavoriteRepository favoriteRepository;

    public UnFavoriteServiceImpl(UnFavoriteRepository favoriteRepository) {
        this.favoriteRepository = favoriteRepository;
    }

    @Override
    public UnFavoriteResponse create(UnFavoriteRequest favoriteRequest) {

        var favoriteEntity = new UnFavoriteEntity(
                favoriteRequest.getUserId(),
                favoriteRequest.getOperationType(),
                favoriteRequest.getSenderId(),
                favoriteRequest.getSender(),
                favoriteRequest.getTitle(),
                favoriteRequest.getAmount(),
                favoriteRequest.getReceiver(),
                favoriteRequest.getReceiverId(),
                favoriteRequest.getRecipientId(),
                favoriteRequest.getSenderType(),
                favoriteRequest.getReceiverType(),
                favoriteRequest.getCurrency(),
                favoriteRequest.getFieldData(),
                favoriteRequest.getFavoriteType(),
                favoriteRequest.getLogoUrl(),
                favoriteRequest.getBalance(),
                favoriteRequest.getBudget(),
                favoriteRequest.getMfo(),
                favoriteRequest.getReceiverFullName(),
                favoriteRequest.getDocDetails(),
                favoriteRequest.getInn());


        return UnFavoriteResponse.of(
                favoriteRepository.save(favoriteEntity)
        );
    }

    @Override
    public UnFavoriteResponse update(Long id, Long userId, UnFavoriteRequest favoriteRequest) {

        var favoriteEntity = getById(id, userId);

        favoriteEntity.setUserId(favoriteRequest.getUserId());
        favoriteEntity.setOperationType(favoriteRequest.getOperationType());
        favoriteEntity.setSenderId(favoriteRequest.getSenderId());
        favoriteEntity.setSender(favoriteRequest.getSender());
        favoriteEntity.setTitle(favoriteRequest.getTitle());
        favoriteEntity.setAmount(favoriteRequest.getAmount());
        favoriteEntity.setReceiver(favoriteRequest.getReceiver());
        favoriteEntity.setReceiverId(favoriteRequest.getReceiverId());
        favoriteEntity.setRecipientId(favoriteRequest.getRecipientId());
        favoriteEntity.setSenderType(favoriteRequest.getSenderType());
        favoriteEntity.setReceiverType(favoriteRequest.getReceiverType());
        favoriteEntity.setCurrency(favoriteRequest.getCurrency());
        favoriteEntity.setFieldData(favoriteRequest.getFieldData());
        favoriteEntity.setFavoriteType(favoriteRequest.getFavoriteType());
        favoriteEntity.setLogoUrl(favoriteRequest.getLogoUrl());
        favoriteEntity.setBalance(favoriteRequest.getBalance());
        favoriteEntity.setBudget(favoriteRequest.getBudget());
        favoriteEntity.setMfo(favoriteRequest.getMfo());
        favoriteEntity.setReceiverFullName(favoriteRequest.getReceiverFullName());
        favoriteEntity.setDocDetails(favoriteRequest.getDocDetails());
        favoriteEntity.setInn(favoriteRequest.getInn());

        return UnFavoriteResponse.of(
                favoriteRepository.save(favoriteEntity)
        );
    }

    @Override
    public UnFavoriteResponse findByIdAndUserId(Long id, Long userId) {

        return UnFavoriteResponse.of(
                getById(id, userId)
        );
    }

    private UnFavoriteEntity getById(Long id, Long userId) {

        return favoriteRepository.findByIdAndUserId(id, userId)
                .orElseThrow(() -> new ExceptionWithStatusCode(
                        404,
                        "unfavorite.entity.notfound"
                        ));
    }

    @Override
    public void deleteByIdAndUserId(Long id, Long userId) {

        var favoriteResponse = findByIdAndUserId(userId, userId);
        if (userId.equals(favoriteResponse.getUserId())) {
            favoriteRepository.deleteById(id);
        }

    }

    @Override
    public Page<UnFavoriteResponse> all(Long userId, Pageable pageable) {
        return UnFavoriteResponse.of(
                favoriteRepository.findAllByUserId(userId, pageable)
        );
    }
}
