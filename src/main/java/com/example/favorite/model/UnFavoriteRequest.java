package com.example.favorite.model;

import com.example.favorite.entity.UnFavoriteEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class UnFavoriteRequest {

    private Long userId;

    @JsonIgnore
    private UnFavoriteEntity.OperationType operationType;

    @NotNull
    private Long senderId;

    private String sender;

    @NotNull
    private String title;

    @NotNull
    private Long amount;

    @JsonIgnore
    private String receiver;

    private Long receiverId;

    @JsonIgnore
    private Long recipientId;

    @JsonIgnore
    private UnFavoriteEntity.AccountType senderType;
    @JsonIgnore
    private UnFavoriteEntity.AccountType receiverType;
    @JsonIgnore
    private UnFavoriteEntity.CCurrency currency;

    private String fieldData;

    @JsonIgnore
    private UnFavoriteEntity.FavoriteType favoriteType;
    @JsonIgnore
    private String logoUrl;

    @Pattern(regexp = "^[0-9]+$")
    private String balance;

    @JsonIgnore
    private Boolean isBudget;
    @JsonIgnore
    private String mfo;
    @JsonIgnore
    private String receiverFullName;
    @JsonIgnore
    private String docDetails;

    @Pattern(regexp = "^[0-9]+$")
    private String inn;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public UnFavoriteEntity.OperationType getOperationType() {
        return operationType;
    }

    public UnFavoriteRequest setOperationType(UnFavoriteEntity.OperationType operationType) {
        this.operationType = operationType;
        return this;
    }

    public Long getSenderId() {
        return senderId;
    }

    public UnFavoriteRequest setSenderId(Long senderId) {
        this.senderId = senderId;
        return this;
    }

    public String getSender() {
        return sender;
    }

    public UnFavoriteRequest setSender(String sender) {
        this.sender = sender;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public UnFavoriteRequest setTitle(String title) {
        this.title = title;
        return this;
    }

    public Long getAmount() {
        return amount;
    }

    public UnFavoriteRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    public String getReceiver() {
        return receiver;
    }

    public UnFavoriteRequest setReceiver(String receiver) {
        this.receiver = receiver;
        return this;
    }

    public Long getReceiverId() {
        return receiverId;
    }

    public UnFavoriteRequest setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
        return this;
    }

    public Long getRecipientId() {
        return recipientId;
    }

    public UnFavoriteRequest setRecipientId(Long recipientId) {
        this.recipientId = recipientId;
        return this;
    }

    public UnFavoriteEntity.AccountType getSenderType() {
        return senderType;
    }

    public UnFavoriteRequest setSenderType(UnFavoriteEntity.AccountType senderType) {
        this.senderType = senderType;
        return this;
    }

    public UnFavoriteEntity.AccountType getReceiverType() {
        return receiverType;
    }

    public UnFavoriteRequest setReceiverType(UnFavoriteEntity.AccountType receiverType) {
        this.receiverType = receiverType;
        return this;
    }

    public UnFavoriteEntity.CCurrency getCurrency() {
        return currency;
    }

    public UnFavoriteRequest setCurrency(UnFavoriteEntity.CCurrency currency) {
        this.currency = currency;
        return this;
    }

    public String getFieldData() {
        return fieldData;
    }

    public UnFavoriteRequest setFieldData(String fieldData) {
        this.fieldData = fieldData;
        return this;
    }

    public UnFavoriteEntity.FavoriteType getFavoriteType() {
        return favoriteType;
    }

    public UnFavoriteRequest setFavoriteType(UnFavoriteEntity.FavoriteType favoriteType) {
        this.favoriteType = favoriteType;
        return this;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public UnFavoriteRequest setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    public String getBalance() {
        return balance;
    }

    public UnFavoriteRequest setBalance(String balance) {
        this.balance = balance;
        return this;
    }

    public Boolean getBudget() {
        return isBudget;
    }

    public UnFavoriteRequest setBudget(Boolean budget) {
        isBudget = budget;
        return this;
    }

    public String getMfo() {
        return mfo;
    }

    public UnFavoriteRequest setMfo(String mfo) {
        this.mfo = mfo;
        return this;
    }

    public String getReceiverFullName() {
        return receiverFullName;
    }

    public UnFavoriteRequest setReceiverFullName(String receiverFullName) {
        this.receiverFullName = receiverFullName;
        return this;
    }

    public String getDocDetails() {
        return docDetails;
    }

    public UnFavoriteRequest setDocDetails(String docDetails) {
        this.docDetails = docDetails;
        return this;
    }

    public String getInn() {
        return inn;
    }

    public UnFavoriteRequest setInn(String inn) {
        this.inn = inn;
        return this;
    }
}
