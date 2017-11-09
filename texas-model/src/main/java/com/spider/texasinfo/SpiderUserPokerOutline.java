package com.spider.texasinfo;

import java.util.Date;

public class SpiderUserPokerOutline {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer gameId;

    /**
     * 用户编号
     */
    private String userId;

    /**
     * 收益 有+ -
     */
    private Long earnings;

    /**
     * B&S,BTN,SB,BB,MP,EP,CO
     */
    private String userSite;

    /**
     * 用户手牌
     */
    private String userHand;

    /**
     * 口袋对 高张 连牌
     */
    private String handType;

    /**
     * 1-是 0-非
     */
    private Integer suited;

    /**
     * 1 allin  0- off allin
     */
    private Integer allin;

    /**
     * 
     */
    private Date createAt;

    /**
     * 
     */
    private Date updateAt;

    /**
     * 
     */
    private String createUser;

    /**
     * 
     */
    private String updateUser;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return game_id 
     */
    public Integer getGameId() {
        return gameId;
    }

    /**
     * 
     * @param gameId 
     */
    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    /**
     * 用户编号
     * @return user_id 用户编号
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户编号
     * @param userId 用户编号
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 收益 有+ -
     * @return earnings 收益 有+ -
     */
    public Long getEarnings() {
        return earnings;
    }

    /**
     * 收益 有+ -
     * @param earnings 收益 有+ -
     */
    public void setEarnings(Long earnings) {
        this.earnings = earnings;
    }

    /**
     * B&S,BTN,SB,BB,MP,EP,CO
     * @return user_site B&S,BTN,SB,BB,MP,EP,CO
     */
    public String getUserSite() {
        return userSite;
    }

    /**
     * B&S,BTN,SB,BB,MP,EP,CO
     * @param userSite B&S,BTN,SB,BB,MP,EP,CO
     */
    public void setUserSite(String userSite) {
        this.userSite = userSite == null ? null : userSite.trim();
    }

    /**
     * 用户手牌
     * @return user_hand 用户手牌
     */
    public String getUserHand() {
        return userHand;
    }

    /**
     * 用户手牌
     * @param userHand 用户手牌
     */
    public void setUserHand(String userHand) {
        this.userHand = userHand == null ? null : userHand.trim();
    }

    /**
     * 口袋对 高张 连牌
     * @return hand_type 口袋对 高张 连牌
     */
    public String getHandType() {
        return handType;
    }

    /**
     * 口袋对 高张 连牌
     * @param handType 口袋对 高张 连牌
     */
    public void setHandType(String handType) {
        this.handType = handType == null ? null : handType.trim();
    }

    /**
     * 1-是 0-非
     * @return suited 1-是 0-非
     */
    public Integer getSuited() {
        return suited;
    }

    /**
     * 1-是 0-非
     * @param suited 1-是 0-非
     */
    public void setSuited(Integer suited) {
        this.suited = suited;
    }

    /**
     * 1 allin  0- off allin
     * @return allin 1 allin  0- off allin
     */
    public Integer getAllin() {
        return allin;
    }

    /**
     * 1 allin  0- off allin
     * @param allin 1 allin  0- off allin
     */
    public void setAllin(Integer allin) {
        this.allin = allin;
    }

    /**
     * 
     * @return create_at 
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 
     * @param createAt 
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 
     * @return update_at 
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 
     * @param updateAt 
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * 
     * @return create_user 
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 
     * @param createUser 
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * 
     * @return update_user 
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 
     * @param updateUser 
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }
}