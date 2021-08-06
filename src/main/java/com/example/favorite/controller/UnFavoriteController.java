package com.example.favorite.controller;

import com.example.favorite.model.UnFavoriteRequest;
import com.example.favorite.model.UnFavoriteResponse;
import com.example.favorite.service.UnFavoriteService;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("unfavorite")
public class UnFavoriteController {

    private final UnFavoriteService UNFavoriteService;

    public UnFavoriteController(UnFavoriteService UNFavoriteService) {
        this.UNFavoriteService = UNFavoriteService;
    }

    @ApiOperation(value = "create favorite")
    @PostMapping
    public ResponseEntity<UnFavoriteResponse> create(@Valid @RequestBody UnFavoriteRequest favoriteRequest) {

        //TODO get userId from token
        Long userId = 1L;
        favoriteRequest.setUserId(userId);

        return ResponseEntity.ok(
                UNFavoriteService.create(favoriteRequest)
        );

    }

    @ApiOperation(value = "update favorite")
    @PutMapping("{id}")
    public ResponseEntity<UnFavoriteResponse> update(
            @PathVariable Long id,
            @Valid @RequestBody UnFavoriteRequest favoriteRequest) {

        //TODO get userId from token
        Long userId = 1L;
        favoriteRequest.setUserId(userId);

        return ResponseEntity.ok(
                UNFavoriteService.update(id, userId, favoriteRequest)
        );

    }

    @ApiOperation(value = "get favorite by id")
    @GetMapping("{id}")
    public ResponseEntity<UnFavoriteResponse> findById(@PathVariable Long id) {

        //TODO get userId from token
        Long userId = 1L;

        return ResponseEntity.ok(
                UNFavoriteService.findByIdAndUserId(id, userId)
        );

    }

    @ApiOperation(value = "delete favorite by id")
    @DeleteMapping("{id}")
    public ResponseEntity<Long> delete(@PathVariable Long id) {

        //TODO get userId from token
        Long userId = 1L;
        UNFavoriteService.deleteByIdAndUserId(id, userId);

        return ResponseEntity.ok(
                id
        );

    }

    @ApiOperation(value = "get favorite pageable")
    @GetMapping
    public ResponseEntity<Page<UnFavoriteResponse>> all(@RequestParam Integer page, @RequestParam Integer size) {

        //TODO get userId from token
        Long userId = 1L;

        return ResponseEntity.ok(
                UNFavoriteService.all(userId, PageRequest.of(page, size))
        );

    }
}
