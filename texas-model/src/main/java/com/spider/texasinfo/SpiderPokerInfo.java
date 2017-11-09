package com.spider.texasinfo;

import java.util.Date;

public class SpiderPokerInfo {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer gameId;

    /**
     * MTT             SNG             CASH
     */
    private String gameType;

    /**
     * 大盲注 BB
     */
    private Long bigBlind;

    /**
     * 小盲注 sb
     */
    private Long smallBlind;

    /**
     * USD RMB
     */
    private String monetaryUnit;

    /**
     * 牌局时间
     */
    private Date gameTime;

    /**
     * 当前参与人数
     */
    private Integer nowMan;

    /**
     * 最大参与人数
     */
    private Integer maxMan;

    /**
     * 最终底池
     */
    private Long pot;

    /**
     * 盲注等级
     */
    private String blindLevel;

    /**
     * 买入费用
     */
    private Long buying;

    /**
     * 翻牌内容
     */
    private String flop;

    /**
     * 转牌内容
     */
    private String turn;

    /**
     * 河牌内容
     */
    private String river;

    /**
     * 最终结束在哪一条街
     */
    private String overStreet;

    /**
     * 最终赢牌 牌面
     */
    private String winCard;

    /**
     * 赢牌类型 -A-high 3条 葫芦
     */
    private String winCardType;

    /**
     * 赢牌玩家id
     */
    private String winCardUser;

    /**
     * 
     */
    private String remark;

    /**
     * 
     */
    private String remarkJson;

    /**
     * 抽成
     */
    private Float rake;

    /**
     * 
     */
    private String company;

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
     * MTT             SNG             CASH
     * @return game_type MTT             SNG             CASH
     */
    public String getGameType() {
        return gameType;
    }

    /**
     * MTT             SNG             CASH
     * @param gameType MTT             SNG             CASH
     */
    public void setGameType(String gameType) {
        this.gameType = gameType == null ? null : gameType.trim();
    }

    /**
     * 大盲注 BB
     * @return big_blind 大盲注 BB
     */
    public Long getBigBlind() {
        return bigBlind;
    }

    /**
     * 大盲注 BB
     * @param bigBlind 大盲注 BB
     */
    public void setBigBlind(Long bigBlind) {
        this.bigBlind = bigBlind;
    }

    /**
     * 小盲注 sb
     * @return small_blind 小盲注 sb
     */
    public Long getSmallBlind() {
        return smallBlind;
    }

    /**
     * 小盲注 sb
     * @param smallBlind 小盲注 sb
     */
    public void setSmallBlind(Long smallBlind) {
        this.smallBlind = smallBlind;
    }

    /**
     * USD RMB
     * @return monetary_unit USD RMB
     */
    public String getMonetaryUnit() {
        return monetaryUnit;
    }

    /**
     * USD RMB
     * @param monetaryUnit USD RMB
     */
    public void setMonetaryUnit(String monetaryUnit) {
        this.monetaryUnit = monetaryUnit == null ? null : monetaryUnit.trim();
    }

    /**
     * 牌局时间
     * @return game_time 牌局时间
     */
    public Date getGameTime() {
        return gameTime;
    }

    /**
     * 牌局时间
     * @param gameTime 牌局时间
     */
    public void setGameTime(Date gameTime) {
        this.gameTime = gameTime;
    }

    /**
     * 当前参与人数
     * @return now_man 当前参与人数
     */
    public Integer getNowMan() {
        return nowMan;
    }

    /**
     * 当前参与人数
     * @param nowMan 当前参与人数
     */
    public void setNowMan(Integer nowMan) {
        this.nowMan = nowMan;
    }

    /**
     * 最大参与人数
     * @return max_man 最大参与人数
     */
    public Integer getMaxMan() {
        return maxMan;
    }

    /**
     * 最大参与人数
     * @param maxMan 最大参与人数
     */
    public void setMaxMan(Integer maxMan) {
        this.maxMan = maxMan;
    }

    /**
     * 最终底池
     * @return pot 最终底池
     */
    public Long getPot() {
        return pot;
    }

    /**
     * 最终底池
     * @param pot 最终底池
     */
    public void setPot(Long pot) {
        this.pot = pot;
    }

    /**
     * 盲注等级
     * @return blind_level 盲注等级
     */
    public String getBlindLevel() {
        return blindLevel;
    }

    /**
     * 盲注等级
     * @param blindLevel 盲注等级
     */
    public void setBlindLevel(String blindLevel) {
        this.blindLevel = blindLevel == null ? null : blindLevel.trim();
    }

    /**
     * 买入费用
     * @return buying 买入费用
     */
    public Long getBuying() {
        return buying;
    }

    /**
     * 买入费用
     * @param buying 买入费用
     */
    public void setBuying(Long buying) {
        this.buying = buying;
    }

    /**
     * 翻牌内容
     * @return flop 翻牌内容
     */
    public String getFlop() {
        return flop;
    }

    /**
     * 翻牌内容
     * @param flop 翻牌内容
     */
    public void setFlop(String flop) {
        this.flop = flop == null ? null : flop.trim();
    }

    /**
     * 转牌内容
     * @return turn 转牌内容
     */
    public String getTurn() {
        return turn;
    }

    /**
     * 转牌内容
     * @param turn 转牌内容
     */
    public void setTurn(String turn) {
        this.turn = turn == null ? null : turn.trim();
    }

    /**
     * 河牌内容
     * @return river 河牌内容
     */
    public String getRiver() {
        return river;
    }

    /**
     * 河牌内容
     * @param river 河牌内容
     */
    public void setRiver(String river) {
        this.river = river == null ? null : river.trim();
    }

    /**
     * 最终结束在哪一条街
     * @return over_street 最终结束在哪一条街
     */
    public String getOverStreet() {
        return overStreet;
    }

    /**
     * 最终结束在哪一条街
     * @param overStreet 最终结束在哪一条街
     */
    public void setOverStreet(String overStreet) {
        this.overStreet = overStreet == null ? null : overStreet.trim();
    }

    /**
     * 最终赢牌 牌面
     * @return win_card 最终赢牌 牌面
     */
    public String getWinCard() {
        return winCard;
    }

    /**
     * 最终赢牌 牌面
     * @param winCard 最终赢牌 牌面
     */
    public void setWinCard(String winCard) {
        this.winCard = winCard == null ? null : winCard.trim();
    }

    /**
     * 赢牌类型 -A-high 3条 葫芦
     * @return win_card_type 赢牌类型 -A-high 3条 葫芦
     */
    public String getWinCardType() {
        return winCardType;
    }

    /**
     * 赢牌类型 -A-high 3条 葫芦
     * @param winCardType 赢牌类型 -A-high 3条 葫芦
     */
    public void setWinCardType(String winCardType) {
        this.winCardType = winCardType == null ? null : winCardType.trim();
    }

    /**
     * 赢牌玩家id
     * @return win_card_user 赢牌玩家id
     */
    public String getWinCardUser() {
        return winCardUser;
    }

    /**
     * 赢牌玩家id
     * @param winCardUser 赢牌玩家id
     */
    public void setWinCardUser(String winCardUser) {
        this.winCardUser = winCardUser == null ? null : winCardUser.trim();
    }

    /**
     * 
     * @return remark 
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 
     * @param remark 
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 
     * @return remark_json 
     */
    public String getRemarkJson() {
        return remarkJson;
    }

    /**
     * 
     * @param remarkJson 
     */
    public void setRemarkJson(String remarkJson) {
        this.remarkJson = remarkJson == null ? null : remarkJson.trim();
    }

    /**
     * 抽成
     * @return rake 抽成
     */
    public Float getRake() {
        return rake;
    }

    /**
     * 抽成
     * @param rake 抽成
     */
    public void setRake(Float rake) {
        this.rake = rake;
    }

    /**
     * 
     * @return company 
     */
    public String getCompany() {
        return company;
    }

    /**
     * 
     * @param company 
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
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