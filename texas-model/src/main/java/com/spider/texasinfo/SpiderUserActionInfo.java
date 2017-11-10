package com.spider.texasinfo;

import java.util.Date;

/**
 * @author lxx
 * 用户行为信息
 */
public class SpiderUserActionInfo {
    /**
     * 
     */
    private Integer id;

    /**
     * 平台游戏id
     */
    private String platformGameId;

    /**
     * 平台
     */
    private String platform;

    /**
     * pre-flop flop  turn river
     */
    private String step;

    /**
     * 下注总量
     */
    private Long betAmounts;

    /**
     * 加注总量
     */
    private Long raiseAmounts;

    /**
     * bet call raise allin
     */
    private String userAction;

    /**
     * B&S,BTN,SB,BB,MP,EP,CO
     */
    private String userSite;

    /**
     * 
     */
    private Date createAt;

    /**
     * 
     */
    private String createUser;

    /**
     * 
     */
    private Date updateAt;

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
     * 平台游戏id
     * @return platform_game_id 平台游戏id
     */
    public String getPlatformGameId() {
        return platformGameId;
    }

    /**
     * 平台游戏id
     * @param platformGameId 平台游戏id
     */
    public void setPlatformGameId(String platformGameId) {
        this.platformGameId = platformGameId == null ? null : platformGameId.trim();
    }

    /**
     * 平台
     * @return platform 平台
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * 平台
     * @param platform 平台
     */
    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    /**
     * pre-flop flop  turn river
     * @return step pre-flop flop  turn river
     */
    public String getStep() {
        return step;
    }

    /**
     * pre-flop flop  turn river
     * @param step pre-flop flop  turn river
     */
    public void setStep(String step) {
        this.step = step == null ? null : step.trim();
    }

    /**
     * 下注总量
     * @return bet_amounts 下注总量
     */
    public Long getBetAmounts() {
        return betAmounts;
    }

    /**
     * 下注总量
     * @param betAmounts 下注总量
     */
    public void setBetAmounts(Long betAmounts) {
        this.betAmounts = betAmounts;
    }

    /**
     * 加注总量
     * @return raise_amounts 加注总量
     */
    public Long getRaiseAmounts() {
        return raiseAmounts;
    }

    /**
     * 加注总量
     * @param raiseAmounts 加注总量
     */
    public void setRaiseAmounts(Long raiseAmounts) {
        this.raiseAmounts = raiseAmounts;
    }

    /**
     * bet call raise allin
     * @return user_action bet call raise allin
     */
    public String getUserAction() {
        return userAction;
    }

    /**
     * bet call raise allin
     * @param userAction bet call raise allin
     */
    public void setUserAction(String userAction) {
        this.userAction = userAction == null ? null : userAction.trim();
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