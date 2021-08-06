package com.example.favorite.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "unfavorite")
public class UnFavoriteEntity {

    @Transient
    static final String sequenceName = "favorite_id_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = sequenceName)
    @SequenceGenerator(name = sequenceName, sequenceName = sequenceName, allocationSize = 1)
    private Long id;

//    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id", insertable = false, updatable = false)
//    private User user;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "operation_type")
    @Enumerated(EnumType.STRING)
    private OperationType operationType;

    @Column(name = "sender_id")
    @NotNull
    private Long senderId;

    @Column(name = "sender")
    private String sender;

    @Column(name = "title")
    @NotNull
    private String title;

    @Column(name = "amount")
    @NotNull
    private Long amount;

    @Column(name = "receiver")
    private String receiver;

    @Column(name = "receiverId")
    private Long receiverId;

    @Column(name = "recipientId")
    private Long recipientId;

    @Column(name = "sender_type")
    @Enumerated(EnumType.STRING)
    private AccountType senderType;

    @Column(name = "receiver_type")
    @Enumerated(EnumType.STRING)
    private AccountType receiverType;

    @Column(name = "currency")
    @Enumerated(EnumType.STRING)
    private CCurrency currency;

    @Column(name = "field_data")
    private String fieldData;

    @Column(name = "favorite_type")
    @Enumerated(EnumType.STRING)
    private FavoriteType favoriteType;

    @Column(name = "logo_url")
    private String logoUrl;

    @Column(name = "balance")
    private String balance;

    @Column(name = "is_budjet")
    private Boolean isBudget;

    @Column(name = "mfo")
    private String mfo;

    @Column(name = "receiver_name")
    private String receiverFullName;

    @Column(name = "doc_details")
    private String docDetails;

    @Column(name = "inn")
    private String inn;

    public UnFavoriteEntity() {
    }

    public UnFavoriteEntity(
            Long userId,
            OperationType operationType,
            @NotNull Long senderId,
            String sender,
            @NotNull String title,
            @NotNull Long amount,
            String receiver,
            Long receiverId,
            Long recipientId,
            AccountType senderType,
            AccountType receiverType,
            CCurrency currency,
            String fieldData,
            FavoriteType favoriteType,
            String logoUrl,
            String balance,
            Boolean isBudget,
            String mfo,
            String receiverFullName,
            String docDetails,
            String inn) {
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

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
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

    public AccountType getSenderType() {
        return senderType;
    }

    public void setSenderType(AccountType senderType) {
        this.senderType = senderType;
    }

    public AccountType getReceiverType() {
        return receiverType;
    }

    public void setReceiverType(AccountType receiverType) {
        this.receiverType = receiverType;
    }

    public CCurrency getCurrency() {
        return currency;
    }

    public void setCurrency(CCurrency currency) {
        this.currency = currency;
    }

    public String getFieldData() {
        return fieldData;
    }

    public void setFieldData(String fieldData) {
        this.fieldData = fieldData;
    }

    public FavoriteType getFavoriteType() {
        return favoriteType;
    }

    public void setFavoriteType(FavoriteType favoriteType) {
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

    public enum OperationType {string}

    public enum AccountType {string}

    public enum CCurrency {string}

    public enum FavoriteType {string}

}
