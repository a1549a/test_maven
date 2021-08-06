package com.example.favorite.model;

import com.example.favorite.entity.UnFavoriteEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.util.stream.Collectors;

public class UnFavoriteResponse {

    private Long id;

    private Long userId;

    private UnFavoriteEntity.OperationType operationType;

    private Long senderId;

    private String sender;

    private String title;

    private Long amount;

    private String receiver;

    private Long receiverId;

    private Long recipientId;

    private UnFavoriteEntity.AccountType senderType;

    private UnFavoriteEntity.AccountType receiverType;

    private UnFavoriteEntity.CCurrency currency;

    private String fieldData;

    private UnFavoriteEntity.FavoriteType favoriteType;

    private String logoUrl;

    private String balance;

    private Boolean isBudget;

    private String mfo;

    private String receiverFullName;

    private String docDetails;

    private String inn;

    public UnFavoriteResponse() {
    }

    private UnFavoriteResponse(Long id, Long userId, UnFavoriteEntity.OperationType operationType, Long senderId, String sender, String title, Long amount, String receiver, Long receiverId, Long recipientId, UnFavoriteEntity.AccountType senderType, UnFavoriteEntity.AccountType receiverType, UnFavoriteEntity.CCurrency currency, String fieldData, UnFavoriteEntity.FavoriteType favoriteType, String logoUrl, String balance, Boolean isBudget, String mfo, String receiverFullName, String docDetails, String inn) {
        this.id = id;
        this.userId = userId;
        this.operationType = operationType;
        this.senderId = senderId;
        this.sender = sender;
        this.title = title;
        this.amount = amount;
        this.receiver = receiver;
        this.receiverId = receiverId;
        this.recipientId = recipientId;
        this.senderType = senderType;
        this.receiverType = receiverType;
        this.currency = currency;
        this.fieldData = fieldData;
        this.favoriteType = favoriteType;
        this.logoUrl = logoUrl;
        this.balance = balance;
        this.isBudget = isBudget;
        this.mfo = mfo;
        this.receiverFullName = receiverFullName;
        this.docDetails = docDetails;
        this.inn = inn;
    }

    public static UnFavoriteResponse of(UnFavoriteEntity unFavoriteEntity){

        return new UnFavoriteResponse(
                unFavoriteEntity.getId(),
                unFavoriteEntity.getUserId(),
                unFavoriteEntity.getOperationType(),
                unFavoriteEntity.getSenderId(),
                unFavoriteEntity.getSender(),
                unFavoriteEntity.getTitle(),
                unFavoriteEntity.getAmount(),
                unFavoriteEntity.getReceiver(),
                unFavoriteEntity.getReceiverId(),
                unFavoriteEntity.getRecipientId(),
                unFavoriteEntity.getSenderType(),
                unFavoriteEntity.getReceiverType(),
                unFavoriteEntity.getCurrency(),
                unFavoriteEntity.getFieldData(),
                unFavoriteEntity.getFavoriteType(),
                unFavoriteEntity.getLogoUrl(),
                unFavoriteEntity.getBalance(),
                unFavoriteEntity.getBudget(),
                unFavoriteEntity.getMfo(),
                unFavoriteEntity.getReceiverFullName(),
                unFavoriteEntity.getDocDetails(),
                unFavoriteEntity.getInn());
    }

    public static Page<UnFavoriteResponse> of(Page<UnFavoriteEntity> favoriteEntities){

        return new PageImpl<>(
                favoriteEntities.stream().map(UnFavoriteResponse::of).collect(Collectors.toList()),
                favoriteEntities.getPageable(),
                favoriteEntities.getTotalElements()
        );
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public UnFavoriteEntity.OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(UnFavoriteEntity.OperationType operationType) {
        this.operationType = operationType;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    public Long getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Long recipientId) {
        this.recipientId = recipientId;
    }

    public UnFavoriteEntity.AccountType getSenderType() {
        return senderType;
    }

    public void setSenderType(UnFavoriteEntity.AccountType senderType) {
        this.senderType = senderType;
    }

    public UnFavoriteEntity.AccountType getReceiverType() {
        return receiverType;
    }

    public void setReceiverType(UnFavoriteEntity.AccountType receiverType) {
        this.receiverType = receiverType;
    }

    public UnFavoriteEntity.CCurrency getCurrency() {
        return currency;
    }

    public void setCurrency(UnFavoriteEntity.CCurrency currency) {
        this.currency = currency;
    }

    public String getFieldData() {
        return fieldData;
    }

    public void setFieldData(String fieldData) {
        this.fieldData = fieldData;
    }

    public UnFavoriteEntity.FavoriteType getFavoriteType() {
        return favoriteType;
    }

    public void setFavoriteType(UnFavoriteEntity.FavoriteType favoriteType) {
        this.favoriteType = favoriteType;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public Boolean getBudget() {
        return isBudget;
    }

    public void setBudget(Boolean budget) {
        isBudget = budget;
    }

    public String getMfo() {
        return mfo;
    }

    public void setMfo(String mfo) {
        this.mfo = mfo;
    }

    public String getReceiverFullName() {
        return receiverFullName;
    }

    public void setReceiverFullName(String receiverFullName) {
        this.receiverFullName = receiverFullName;
    }

    public String getDocDetails() {
        return docDetails;
    }

    public void setDocDetails(String docDetails) {
        this.docDetails = docDetails;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }
}
