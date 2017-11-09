package com.spider.texasinfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpiderPokerInfoExample {
    /**
     * spider_poker_info
     */
    protected String orderByClause;

    /**
     * spider_poker_info
     */
    protected boolean distinct;

    /**
     * spider_poker_info
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-11-09
     */
    public SpiderPokerInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2017-11-09
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-11-09
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-11-09
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2017-11-09
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2017-11-09
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2017-11-09
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2017-11-09
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-11-09
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-11-09
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-11-09
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * spider_poker_info 2017-11-09
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNull() {
            addCriterion("game_id is null");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNotNull() {
            addCriterion("game_id is not null");
            return (Criteria) this;
        }

        public Criteria andGameIdEqualTo(Integer value) {
            addCriterion("game_id =", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotEqualTo(Integer value) {
            addCriterion("game_id <>", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThan(Integer value) {
            addCriterion("game_id >", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_id >=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThan(Integer value) {
            addCriterion("game_id <", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThanOrEqualTo(Integer value) {
            addCriterion("game_id <=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdIn(List<Integer> values) {
            addCriterion("game_id in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotIn(List<Integer> values) {
            addCriterion("game_id not in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdBetween(Integer value1, Integer value2) {
            addCriterion("game_id between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotBetween(Integer value1, Integer value2) {
            addCriterion("game_id not between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameTypeIsNull() {
            addCriterion("game_type is null");
            return (Criteria) this;
        }

        public Criteria andGameTypeIsNotNull() {
            addCriterion("game_type is not null");
            return (Criteria) this;
        }

        public Criteria andGameTypeEqualTo(String value) {
            addCriterion("game_type =", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotEqualTo(String value) {
            addCriterion("game_type <>", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeGreaterThan(String value) {
            addCriterion("game_type >", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeGreaterThanOrEqualTo(String value) {
            addCriterion("game_type >=", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeLessThan(String value) {
            addCriterion("game_type <", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeLessThanOrEqualTo(String value) {
            addCriterion("game_type <=", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeLike(String value) {
            addCriterion("game_type like", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotLike(String value) {
            addCriterion("game_type not like", value, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeIn(List<String> values) {
            addCriterion("game_type in", values, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotIn(List<String> values) {
            addCriterion("game_type not in", values, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeBetween(String value1, String value2) {
            addCriterion("game_type between", value1, value2, "gameType");
            return (Criteria) this;
        }

        public Criteria andGameTypeNotBetween(String value1, String value2) {
            addCriterion("game_type not between", value1, value2, "gameType");
            return (Criteria) this;
        }

        public Criteria andBigBlindIsNull() {
            addCriterion("big_blind is null");
            return (Criteria) this;
        }

        public Criteria andBigBlindIsNotNull() {
            addCriterion("big_blind is not null");
            return (Criteria) this;
        }

        public Criteria andBigBlindEqualTo(Long value) {
            addCriterion("big_blind =", value, "bigBlind");
            return (Criteria) this;
        }

        public Criteria andBigBlindNotEqualTo(Long value) {
            addCriterion("big_blind <>", value, "bigBlind");
            return (Criteria) this;
        }

        public Criteria andBigBlindGreaterThan(Long value) {
            addCriterion("big_blind >", value, "bigBlind");
            return (Criteria) this;
        }

        public Criteria andBigBlindGreaterThanOrEqualTo(Long value) {
            addCriterion("big_blind >=", value, "bigBlind");
            return (Criteria) this;
        }

        public Criteria andBigBlindLessThan(Long value) {
            addCriterion("big_blind <", value, "bigBlind");
            return (Criteria) this;
        }

        public Criteria andBigBlindLessThanOrEqualTo(Long value) {
            addCriterion("big_blind <=", value, "bigBlind");
            return (Criteria) this;
        }

        public Criteria andBigBlindIn(List<Long> values) {
            addCriterion("big_blind in", values, "bigBlind");
            return (Criteria) this;
        }

        public Criteria andBigBlindNotIn(List<Long> values) {
            addCriterion("big_blind not in", values, "bigBlind");
            return (Criteria) this;
        }

        public Criteria andBigBlindBetween(Long value1, Long value2) {
            addCriterion("big_blind between", value1, value2, "bigBlind");
            return (Criteria) this;
        }

        public Criteria andBigBlindNotBetween(Long value1, Long value2) {
            addCriterion("big_blind not between", value1, value2, "bigBlind");
            return (Criteria) this;
        }

        public Criteria andSmallBlindIsNull() {
            addCriterion("small_blind is null");
            return (Criteria) this;
        }

        public Criteria andSmallBlindIsNotNull() {
            addCriterion("small_blind is not null");
            return (Criteria) this;
        }

        public Criteria andSmallBlindEqualTo(Long value) {
            addCriterion("small_blind =", value, "smallBlind");
            return (Criteria) this;
        }

        public Criteria andSmallBlindNotEqualTo(Long value) {
            addCriterion("small_blind <>", value, "smallBlind");
            return (Criteria) this;
        }

        public Criteria andSmallBlindGreaterThan(Long value) {
            addCriterion("small_blind >", value, "smallBlind");
            return (Criteria) this;
        }

        public Criteria andSmallBlindGreaterThanOrEqualTo(Long value) {
            addCriterion("small_blind >=", value, "smallBlind");
            return (Criteria) this;
        }

        public Criteria andSmallBlindLessThan(Long value) {
            addCriterion("small_blind <", value, "smallBlind");
            return (Criteria) this;
        }

        public Criteria andSmallBlindLessThanOrEqualTo(Long value) {
            addCriterion("small_blind <=", value, "smallBlind");
            return (Criteria) this;
        }

        public Criteria andSmallBlindIn(List<Long> values) {
            addCriterion("small_blind in", values, "smallBlind");
            return (Criteria) this;
        }

        public Criteria andSmallBlindNotIn(List<Long> values) {
            addCriterion("small_blind not in", values, "smallBlind");
            return (Criteria) this;
        }

        public Criteria andSmallBlindBetween(Long value1, Long value2) {
            addCriterion("small_blind between", value1, value2, "smallBlind");
            return (Criteria) this;
        }

        public Criteria andSmallBlindNotBetween(Long value1, Long value2) {
            addCriterion("small_blind not between", value1, value2, "smallBlind");
            return (Criteria) this;
        }

        public Criteria andMonetaryUnitIsNull() {
            addCriterion("monetary_unit is null");
            return (Criteria) this;
        }

        public Criteria andMonetaryUnitIsNotNull() {
            addCriterion("monetary_unit is not null");
            return (Criteria) this;
        }

        public Criteria andMonetaryUnitEqualTo(String value) {
            addCriterion("monetary_unit =", value, "monetaryUnit");
            return (Criteria) this;
        }

        public Criteria andMonetaryUnitNotEqualTo(String value) {
            addCriterion("monetary_unit <>", value, "monetaryUnit");
            return (Criteria) this;
        }

        public Criteria andMonetaryUnitGreaterThan(String value) {
            addCriterion("monetary_unit >", value, "monetaryUnit");
            return (Criteria) this;
        }

        public Criteria andMonetaryUnitGreaterThanOrEqualTo(String value) {
            addCriterion("monetary_unit >=", value, "monetaryUnit");
            return (Criteria) this;
        }

        public Criteria andMonetaryUnitLessThan(String value) {
            addCriterion("monetary_unit <", value, "monetaryUnit");
            return (Criteria) this;
        }

        public Criteria andMonetaryUnitLessThanOrEqualTo(String value) {
            addCriterion("monetary_unit <=", value, "monetaryUnit");
            return (Criteria) this;
        }

        public Criteria andMonetaryUnitLike(String value) {
            addCriterion("monetary_unit like", value, "monetaryUnit");
            return (Criteria) this;
        }

        public Criteria andMonetaryUnitNotLike(String value) {
            addCriterion("monetary_unit not like", value, "monetaryUnit");
            return (Criteria) this;
        }

        public Criteria andMonetaryUnitIn(List<String> values) {
            addCriterion("monetary_unit in", values, "monetaryUnit");
            return (Criteria) this;
        }

        public Criteria andMonetaryUnitNotIn(List<String> values) {
            addCriterion("monetary_unit not in", values, "monetaryUnit");
            return (Criteria) this;
        }

        public Criteria andMonetaryUnitBetween(String value1, String value2) {
            addCriterion("monetary_unit between", value1, value2, "monetaryUnit");
            return (Criteria) this;
        }

        public Criteria andMonetaryUnitNotBetween(String value1, String value2) {
            addCriterion("monetary_unit not between", value1, value2, "monetaryUnit");
            return (Criteria) this;
        }

        public Criteria andGameTimeIsNull() {
            addCriterion("game_time is null");
            return (Criteria) this;
        }

        public Criteria andGameTimeIsNotNull() {
            addCriterion("game_time is not null");
            return (Criteria) this;
        }

        public Criteria andGameTimeEqualTo(Date value) {
            addCriterion("game_time =", value, "gameTime");
            return (Criteria) this;
        }

        public Criteria andGameTimeNotEqualTo(Date value) {
            addCriterion("game_time <>", value, "gameTime");
            return (Criteria) this;
        }

        public Criteria andGameTimeGreaterThan(Date value) {
            addCriterion("game_time >", value, "gameTime");
            return (Criteria) this;
        }

        public Criteria andGameTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("game_time >=", value, "gameTime");
            return (Criteria) this;
        }

        public Criteria andGameTimeLessThan(Date value) {
            addCriterion("game_time <", value, "gameTime");
            return (Criteria) this;
        }

        public Criteria andGameTimeLessThanOrEqualTo(Date value) {
            addCriterion("game_time <=", value, "gameTime");
            return (Criteria) this;
        }

        public Criteria andGameTimeIn(List<Date> values) {
            addCriterion("game_time in", values, "gameTime");
            return (Criteria) this;
        }

        public Criteria andGameTimeNotIn(List<Date> values) {
            addCriterion("game_time not in", values, "gameTime");
            return (Criteria) this;
        }

        public Criteria andGameTimeBetween(Date value1, Date value2) {
            addCriterion("game_time between", value1, value2, "gameTime");
            return (Criteria) this;
        }

        public Criteria andGameTimeNotBetween(Date value1, Date value2) {
            addCriterion("game_time not between", value1, value2, "gameTime");
            return (Criteria) this;
        }

        public Criteria andNowManIsNull() {
            addCriterion("now_man is null");
            return (Criteria) this;
        }

        public Criteria andNowManIsNotNull() {
            addCriterion("now_man is not null");
            return (Criteria) this;
        }

        public Criteria andNowManEqualTo(Integer value) {
            addCriterion("now_man =", value, "nowMan");
            return (Criteria) this;
        }

        public Criteria andNowManNotEqualTo(Integer value) {
            addCriterion("now_man <>", value, "nowMan");
            return (Criteria) this;
        }

        public Criteria andNowManGreaterThan(Integer value) {
            addCriterion("now_man >", value, "nowMan");
            return (Criteria) this;
        }

        public Criteria andNowManGreaterThanOrEqualTo(Integer value) {
            addCriterion("now_man >=", value, "nowMan");
            return (Criteria) this;
        }

        public Criteria andNowManLessThan(Integer value) {
            addCriterion("now_man <", value, "nowMan");
            return (Criteria) this;
        }

        public Criteria andNowManLessThanOrEqualTo(Integer value) {
            addCriterion("now_man <=", value, "nowMan");
            return (Criteria) this;
        }

        public Criteria andNowManIn(List<Integer> values) {
            addCriterion("now_man in", values, "nowMan");
            return (Criteria) this;
        }

        public Criteria andNowManNotIn(List<Integer> values) {
            addCriterion("now_man not in", values, "nowMan");
            return (Criteria) this;
        }

        public Criteria andNowManBetween(Integer value1, Integer value2) {
            addCriterion("now_man between", value1, value2, "nowMan");
            return (Criteria) this;
        }

        public Criteria andNowManNotBetween(Integer value1, Integer value2) {
            addCriterion("now_man not between", value1, value2, "nowMan");
            return (Criteria) this;
        }

        public Criteria andMaxManIsNull() {
            addCriterion("max_man is null");
            return (Criteria) this;
        }

        public Criteria andMaxManIsNotNull() {
            addCriterion("max_man is not null");
            return (Criteria) this;
        }

        public Criteria andMaxManEqualTo(Integer value) {
            addCriterion("max_man =", value, "maxMan");
            return (Criteria) this;
        }

        public Criteria andMaxManNotEqualTo(Integer value) {
            addCriterion("max_man <>", value, "maxMan");
            return (Criteria) this;
        }

        public Criteria andMaxManGreaterThan(Integer value) {
            addCriterion("max_man >", value, "maxMan");
            return (Criteria) this;
        }

        public Criteria andMaxManGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_man >=", value, "maxMan");
            return (Criteria) this;
        }

        public Criteria andMaxManLessThan(Integer value) {
            addCriterion("max_man <", value, "maxMan");
            return (Criteria) this;
        }

        public Criteria andMaxManLessThanOrEqualTo(Integer value) {
            addCriterion("max_man <=", value, "maxMan");
            return (Criteria) this;
        }

        public Criteria andMaxManIn(List<Integer> values) {
            addCriterion("max_man in", values, "maxMan");
            return (Criteria) this;
        }

        public Criteria andMaxManNotIn(List<Integer> values) {
            addCriterion("max_man not in", values, "maxMan");
            return (Criteria) this;
        }

        public Criteria andMaxManBetween(Integer value1, Integer value2) {
            addCriterion("max_man between", value1, value2, "maxMan");
            return (Criteria) this;
        }

        public Criteria andMaxManNotBetween(Integer value1, Integer value2) {
            addCriterion("max_man not between", value1, value2, "maxMan");
            return (Criteria) this;
        }

        public Criteria andPotIsNull() {
            addCriterion("pot is null");
            return (Criteria) this;
        }

        public Criteria andPotIsNotNull() {
            addCriterion("pot is not null");
            return (Criteria) this;
        }

        public Criteria andPotEqualTo(Long value) {
            addCriterion("pot =", value, "pot");
            return (Criteria) this;
        }

        public Criteria andPotNotEqualTo(Long value) {
            addCriterion("pot <>", value, "pot");
            return (Criteria) this;
        }

        public Criteria andPotGreaterThan(Long value) {
            addCriterion("pot >", value, "pot");
            return (Criteria) this;
        }

        public Criteria andPotGreaterThanOrEqualTo(Long value) {
            addCriterion("pot >=", value, "pot");
            return (Criteria) this;
        }

        public Criteria andPotLessThan(Long value) {
            addCriterion("pot <", value, "pot");
            return (Criteria) this;
        }

        public Criteria andPotLessThanOrEqualTo(Long value) {
            addCriterion("pot <=", value, "pot");
            return (Criteria) this;
        }

        public Criteria andPotIn(List<Long> values) {
            addCriterion("pot in", values, "pot");
            return (Criteria) this;
        }

        public Criteria andPotNotIn(List<Long> values) {
            addCriterion("pot not in", values, "pot");
            return (Criteria) this;
        }

        public Criteria andPotBetween(Long value1, Long value2) {
            addCriterion("pot between", value1, value2, "pot");
            return (Criteria) this;
        }

        public Criteria andPotNotBetween(Long value1, Long value2) {
            addCriterion("pot not between", value1, value2, "pot");
            return (Criteria) this;
        }

        public Criteria andBlindLevelIsNull() {
            addCriterion("blind_level is null");
            return (Criteria) this;
        }

        public Criteria andBlindLevelIsNotNull() {
            addCriterion("blind_level is not null");
            return (Criteria) this;
        }

        public Criteria andBlindLevelEqualTo(String value) {
            addCriterion("blind_level =", value, "blindLevel");
            return (Criteria) this;
        }

        public Criteria andBlindLevelNotEqualTo(String value) {
            addCriterion("blind_level <>", value, "blindLevel");
            return (Criteria) this;
        }

        public Criteria andBlindLevelGreaterThan(String value) {
            addCriterion("blind_level >", value, "blindLevel");
            return (Criteria) this;
        }

        public Criteria andBlindLevelGreaterThanOrEqualTo(String value) {
            addCriterion("blind_level >=", value, "blindLevel");
            return (Criteria) this;
        }

        public Criteria andBlindLevelLessThan(String value) {
            addCriterion("blind_level <", value, "blindLevel");
            return (Criteria) this;
        }

        public Criteria andBlindLevelLessThanOrEqualTo(String value) {
            addCriterion("blind_level <=", value, "blindLevel");
            return (Criteria) this;
        }

        public Criteria andBlindLevelLike(String value) {
            addCriterion("blind_level like", value, "blindLevel");
            return (Criteria) this;
        }

        public Criteria andBlindLevelNotLike(String value) {
            addCriterion("blind_level not like", value, "blindLevel");
            return (Criteria) this;
        }

        public Criteria andBlindLevelIn(List<String> values) {
            addCriterion("blind_level in", values, "blindLevel");
            return (Criteria) this;
        }

        public Criteria andBlindLevelNotIn(List<String> values) {
            addCriterion("blind_level not in", values, "blindLevel");
            return (Criteria) this;
        }

        public Criteria andBlindLevelBetween(String value1, String value2) {
            addCriterion("blind_level between", value1, value2, "blindLevel");
            return (Criteria) this;
        }

        public Criteria andBlindLevelNotBetween(String value1, String value2) {
            addCriterion("blind_level not between", value1, value2, "blindLevel");
            return (Criteria) this;
        }

        public Criteria andBuyingIsNull() {
            addCriterion("buying is null");
            return (Criteria) this;
        }

        public Criteria andBuyingIsNotNull() {
            addCriterion("buying is not null");
            return (Criteria) this;
        }

        public Criteria andBuyingEqualTo(Long value) {
            addCriterion("buying =", value, "buying");
            return (Criteria) this;
        }

        public Criteria andBuyingNotEqualTo(Long value) {
            addCriterion("buying <>", value, "buying");
            return (Criteria) this;
        }

        public Criteria andBuyingGreaterThan(Long value) {
            addCriterion("buying >", value, "buying");
            return (Criteria) this;
        }

        public Criteria andBuyingGreaterThanOrEqualTo(Long value) {
            addCriterion("buying >=", value, "buying");
            return (Criteria) this;
        }

        public Criteria andBuyingLessThan(Long value) {
            addCriterion("buying <", value, "buying");
            return (Criteria) this;
        }

        public Criteria andBuyingLessThanOrEqualTo(Long value) {
            addCriterion("buying <=", value, "buying");
            return (Criteria) this;
        }

        public Criteria andBuyingIn(List<Long> values) {
            addCriterion("buying in", values, "buying");
            return (Criteria) this;
        }

        public Criteria andBuyingNotIn(List<Long> values) {
            addCriterion("buying not in", values, "buying");
            return (Criteria) this;
        }

        public Criteria andBuyingBetween(Long value1, Long value2) {
            addCriterion("buying between", value1, value2, "buying");
            return (Criteria) this;
        }

        public Criteria andBuyingNotBetween(Long value1, Long value2) {
            addCriterion("buying not between", value1, value2, "buying");
            return (Criteria) this;
        }

        public Criteria andFlopIsNull() {
            addCriterion("flop is null");
            return (Criteria) this;
        }

        public Criteria andFlopIsNotNull() {
            addCriterion("flop is not null");
            return (Criteria) this;
        }

        public Criteria andFlopEqualTo(String value) {
            addCriterion("flop =", value, "flop");
            return (Criteria) this;
        }

        public Criteria andFlopNotEqualTo(String value) {
            addCriterion("flop <>", value, "flop");
            return (Criteria) this;
        }

        public Criteria andFlopGreaterThan(String value) {
            addCriterion("flop >", value, "flop");
            return (Criteria) this;
        }

        public Criteria andFlopGreaterThanOrEqualTo(String value) {
            addCriterion("flop >=", value, "flop");
            return (Criteria) this;
        }

        public Criteria andFlopLessThan(String value) {
            addCriterion("flop <", value, "flop");
            return (Criteria) this;
        }

        public Criteria andFlopLessThanOrEqualTo(String value) {
            addCriterion("flop <=", value, "flop");
            return (Criteria) this;
        }

        public Criteria andFlopLike(String value) {
            addCriterion("flop like", value, "flop");
            return (Criteria) this;
        }

        public Criteria andFlopNotLike(String value) {
            addCriterion("flop not like", value, "flop");
            return (Criteria) this;
        }

        public Criteria andFlopIn(List<String> values) {
            addCriterion("flop in", values, "flop");
            return (Criteria) this;
        }

        public Criteria andFlopNotIn(List<String> values) {
            addCriterion("flop not in", values, "flop");
            return (Criteria) this;
        }

        public Criteria andFlopBetween(String value1, String value2) {
            addCriterion("flop between", value1, value2, "flop");
            return (Criteria) this;
        }

        public Criteria andFlopNotBetween(String value1, String value2) {
            addCriterion("flop not between", value1, value2, "flop");
            return (Criteria) this;
        }

        public Criteria andTurnIsNull() {
            addCriterion("turn is null");
            return (Criteria) this;
        }

        public Criteria andTurnIsNotNull() {
            addCriterion("turn is not null");
            return (Criteria) this;
        }

        public Criteria andTurnEqualTo(String value) {
            addCriterion("turn =", value, "turn");
            return (Criteria) this;
        }

        public Criteria andTurnNotEqualTo(String value) {
            addCriterion("turn <>", value, "turn");
            return (Criteria) this;
        }

        public Criteria andTurnGreaterThan(String value) {
            addCriterion("turn >", value, "turn");
            return (Criteria) this;
        }

        public Criteria andTurnGreaterThanOrEqualTo(String value) {
            addCriterion("turn >=", value, "turn");
            return (Criteria) this;
        }

        public Criteria andTurnLessThan(String value) {
            addCriterion("turn <", value, "turn");
            return (Criteria) this;
        }

        public Criteria andTurnLessThanOrEqualTo(String value) {
            addCriterion("turn <=", value, "turn");
            return (Criteria) this;
        }

        public Criteria andTurnLike(String value) {
            addCriterion("turn like", value, "turn");
            return (Criteria) this;
        }

        public Criteria andTurnNotLike(String value) {
            addCriterion("turn not like", value, "turn");
            return (Criteria) this;
        }

        public Criteria andTurnIn(List<String> values) {
            addCriterion("turn in", values, "turn");
            return (Criteria) this;
        }

        public Criteria andTurnNotIn(List<String> values) {
            addCriterion("turn not in", values, "turn");
            return (Criteria) this;
        }

        public Criteria andTurnBetween(String value1, String value2) {
            addCriterion("turn between", value1, value2, "turn");
            return (Criteria) this;
        }

        public Criteria andTurnNotBetween(String value1, String value2) {
            addCriterion("turn not between", value1, value2, "turn");
            return (Criteria) this;
        }

        public Criteria andRiverIsNull() {
            addCriterion("river is null");
            return (Criteria) this;
        }

        public Criteria andRiverIsNotNull() {
            addCriterion("river is not null");
            return (Criteria) this;
        }

        public Criteria andRiverEqualTo(String value) {
            addCriterion("river =", value, "river");
            return (Criteria) this;
        }

        public Criteria andRiverNotEqualTo(String value) {
            addCriterion("river <>", value, "river");
            return (Criteria) this;
        }

        public Criteria andRiverGreaterThan(String value) {
            addCriterion("river >", value, "river");
            return (Criteria) this;
        }

        public Criteria andRiverGreaterThanOrEqualTo(String value) {
            addCriterion("river >=", value, "river");
            return (Criteria) this;
        }

        public Criteria andRiverLessThan(String value) {
            addCriterion("river <", value, "river");
            return (Criteria) this;
        }

        public Criteria andRiverLessThanOrEqualTo(String value) {
            addCriterion("river <=", value, "river");
            return (Criteria) this;
        }

        public Criteria andRiverLike(String value) {
            addCriterion("river like", value, "river");
            return (Criteria) this;
        }

        public Criteria andRiverNotLike(String value) {
            addCriterion("river not like", value, "river");
            return (Criteria) this;
        }

        public Criteria andRiverIn(List<String> values) {
            addCriterion("river in", values, "river");
            return (Criteria) this;
        }

        public Criteria andRiverNotIn(List<String> values) {
            addCriterion("river not in", values, "river");
            return (Criteria) this;
        }

        public Criteria andRiverBetween(String value1, String value2) {
            addCriterion("river between", value1, value2, "river");
            return (Criteria) this;
        }

        public Criteria andRiverNotBetween(String value1, String value2) {
            addCriterion("river not between", value1, value2, "river");
            return (Criteria) this;
        }

        public Criteria andOverStreetIsNull() {
            addCriterion("over_street is null");
            return (Criteria) this;
        }

        public Criteria andOverStreetIsNotNull() {
            addCriterion("over_street is not null");
            return (Criteria) this;
        }

        public Criteria andOverStreetEqualTo(String value) {
            addCriterion("over_street =", value, "overStreet");
            return (Criteria) this;
        }

        public Criteria andOverStreetNotEqualTo(String value) {
            addCriterion("over_street <>", value, "overStreet");
            return (Criteria) this;
        }

        public Criteria andOverStreetGreaterThan(String value) {
            addCriterion("over_street >", value, "overStreet");
            return (Criteria) this;
        }

        public Criteria andOverStreetGreaterThanOrEqualTo(String value) {
            addCriterion("over_street >=", value, "overStreet");
            return (Criteria) this;
        }

        public Criteria andOverStreetLessThan(String value) {
            addCriterion("over_street <", value, "overStreet");
            return (Criteria) this;
        }

        public Criteria andOverStreetLessThanOrEqualTo(String value) {
            addCriterion("over_street <=", value, "overStreet");
            return (Criteria) this;
        }

        public Criteria andOverStreetLike(String value) {
            addCriterion("over_street like", value, "overStreet");
            return (Criteria) this;
        }

        public Criteria andOverStreetNotLike(String value) {
            addCriterion("over_street not like", value, "overStreet");
            return (Criteria) this;
        }

        public Criteria andOverStreetIn(List<String> values) {
            addCriterion("over_street in", values, "overStreet");
            return (Criteria) this;
        }

        public Criteria andOverStreetNotIn(List<String> values) {
            addCriterion("over_street not in", values, "overStreet");
            return (Criteria) this;
        }

        public Criteria andOverStreetBetween(String value1, String value2) {
            addCriterion("over_street between", value1, value2, "overStreet");
            return (Criteria) this;
        }

        public Criteria andOverStreetNotBetween(String value1, String value2) {
            addCriterion("over_street not between", value1, value2, "overStreet");
            return (Criteria) this;
        }

        public Criteria andWinCardIsNull() {
            addCriterion("win_card is null");
            return (Criteria) this;
        }

        public Criteria andWinCardIsNotNull() {
            addCriterion("win_card is not null");
            return (Criteria) this;
        }

        public Criteria andWinCardEqualTo(String value) {
            addCriterion("win_card =", value, "winCard");
            return (Criteria) this;
        }

        public Criteria andWinCardNotEqualTo(String value) {
            addCriterion("win_card <>", value, "winCard");
            return (Criteria) this;
        }

        public Criteria andWinCardGreaterThan(String value) {
            addCriterion("win_card >", value, "winCard");
            return (Criteria) this;
        }

        public Criteria andWinCardGreaterThanOrEqualTo(String value) {
            addCriterion("win_card >=", value, "winCard");
            return (Criteria) this;
        }

        public Criteria andWinCardLessThan(String value) {
            addCriterion("win_card <", value, "winCard");
            return (Criteria) this;
        }

        public Criteria andWinCardLessThanOrEqualTo(String value) {
            addCriterion("win_card <=", value, "winCard");
            return (Criteria) this;
        }

        public Criteria andWinCardLike(String value) {
            addCriterion("win_card like", value, "winCard");
            return (Criteria) this;
        }

        public Criteria andWinCardNotLike(String value) {
            addCriterion("win_card not like", value, "winCard");
            return (Criteria) this;
        }

        public Criteria andWinCardIn(List<String> values) {
            addCriterion("win_card in", values, "winCard");
            return (Criteria) this;
        }

        public Criteria andWinCardNotIn(List<String> values) {
            addCriterion("win_card not in", values, "winCard");
            return (Criteria) this;
        }

        public Criteria andWinCardBetween(String value1, String value2) {
            addCriterion("win_card between", value1, value2, "winCard");
            return (Criteria) this;
        }

        public Criteria andWinCardNotBetween(String value1, String value2) {
            addCriterion("win_card not between", value1, value2, "winCard");
            return (Criteria) this;
        }

        public Criteria andWinCardTypeIsNull() {
            addCriterion("win_card_type is null");
            return (Criteria) this;
        }

        public Criteria andWinCardTypeIsNotNull() {
            addCriterion("win_card_type is not null");
            return (Criteria) this;
        }

        public Criteria andWinCardTypeEqualTo(String value) {
            addCriterion("win_card_type =", value, "winCardType");
            return (Criteria) this;
        }

        public Criteria andWinCardTypeNotEqualTo(String value) {
            addCriterion("win_card_type <>", value, "winCardType");
            return (Criteria) this;
        }

        public Criteria andWinCardTypeGreaterThan(String value) {
            addCriterion("win_card_type >", value, "winCardType");
            return (Criteria) this;
        }

        public Criteria andWinCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("win_card_type >=", value, "winCardType");
            return (Criteria) this;
        }

        public Criteria andWinCardTypeLessThan(String value) {
            addCriterion("win_card_type <", value, "winCardType");
            return (Criteria) this;
        }

        public Criteria andWinCardTypeLessThanOrEqualTo(String value) {
            addCriterion("win_card_type <=", value, "winCardType");
            return (Criteria) this;
        }

        public Criteria andWinCardTypeLike(String value) {
            addCriterion("win_card_type like", value, "winCardType");
            return (Criteria) this;
        }

        public Criteria andWinCardTypeNotLike(String value) {
            addCriterion("win_card_type not like", value, "winCardType");
            return (Criteria) this;
        }

        public Criteria andWinCardTypeIn(List<String> values) {
            addCriterion("win_card_type in", values, "winCardType");
            return (Criteria) this;
        }

        public Criteria andWinCardTypeNotIn(List<String> values) {
            addCriterion("win_card_type not in", values, "winCardType");
            return (Criteria) this;
        }

        public Criteria andWinCardTypeBetween(String value1, String value2) {
            addCriterion("win_card_type between", value1, value2, "winCardType");
            return (Criteria) this;
        }

        public Criteria andWinCardTypeNotBetween(String value1, String value2) {
            addCriterion("win_card_type not between", value1, value2, "winCardType");
            return (Criteria) this;
        }

        public Criteria andWinCardUserIsNull() {
            addCriterion("win_card_user is null");
            return (Criteria) this;
        }

        public Criteria andWinCardUserIsNotNull() {
            addCriterion("win_card_user is not null");
            return (Criteria) this;
        }

        public Criteria andWinCardUserEqualTo(String value) {
            addCriterion("win_card_user =", value, "winCardUser");
            return (Criteria) this;
        }

        public Criteria andWinCardUserNotEqualTo(String value) {
            addCriterion("win_card_user <>", value, "winCardUser");
            return (Criteria) this;
        }

        public Criteria andWinCardUserGreaterThan(String value) {
            addCriterion("win_card_user >", value, "winCardUser");
            return (Criteria) this;
        }

        public Criteria andWinCardUserGreaterThanOrEqualTo(String value) {
            addCriterion("win_card_user >=", value, "winCardUser");
            return (Criteria) this;
        }

        public Criteria andWinCardUserLessThan(String value) {
            addCriterion("win_card_user <", value, "winCardUser");
            return (Criteria) this;
        }

        public Criteria andWinCardUserLessThanOrEqualTo(String value) {
            addCriterion("win_card_user <=", value, "winCardUser");
            return (Criteria) this;
        }

        public Criteria andWinCardUserLike(String value) {
            addCriterion("win_card_user like", value, "winCardUser");
            return (Criteria) this;
        }

        public Criteria andWinCardUserNotLike(String value) {
            addCriterion("win_card_user not like", value, "winCardUser");
            return (Criteria) this;
        }

        public Criteria andWinCardUserIn(List<String> values) {
            addCriterion("win_card_user in", values, "winCardUser");
            return (Criteria) this;
        }

        public Criteria andWinCardUserNotIn(List<String> values) {
            addCriterion("win_card_user not in", values, "winCardUser");
            return (Criteria) this;
        }

        public Criteria andWinCardUserBetween(String value1, String value2) {
            addCriterion("win_card_user between", value1, value2, "winCardUser");
            return (Criteria) this;
        }

        public Criteria andWinCardUserNotBetween(String value1, String value2) {
            addCriterion("win_card_user not between", value1, value2, "winCardUser");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkJsonIsNull() {
            addCriterion("remark_json is null");
            return (Criteria) this;
        }

        public Criteria andRemarkJsonIsNotNull() {
            addCriterion("remark_json is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkJsonEqualTo(String value) {
            addCriterion("remark_json =", value, "remarkJson");
            return (Criteria) this;
        }

        public Criteria andRemarkJsonNotEqualTo(String value) {
            addCriterion("remark_json <>", value, "remarkJson");
            return (Criteria) this;
        }

        public Criteria andRemarkJsonGreaterThan(String value) {
            addCriterion("remark_json >", value, "remarkJson");
            return (Criteria) this;
        }

        public Criteria andRemarkJsonGreaterThanOrEqualTo(String value) {
            addCriterion("remark_json >=", value, "remarkJson");
            return (Criteria) this;
        }

        public Criteria andRemarkJsonLessThan(String value) {
            addCriterion("remark_json <", value, "remarkJson");
            return (Criteria) this;
        }

        public Criteria andRemarkJsonLessThanOrEqualTo(String value) {
            addCriterion("remark_json <=", value, "remarkJson");
            return (Criteria) this;
        }

        public Criteria andRemarkJsonLike(String value) {
            addCriterion("remark_json like", value, "remarkJson");
            return (Criteria) this;
        }

        public Criteria andRemarkJsonNotLike(String value) {
            addCriterion("remark_json not like", value, "remarkJson");
            return (Criteria) this;
        }

        public Criteria andRemarkJsonIn(List<String> values) {
            addCriterion("remark_json in", values, "remarkJson");
            return (Criteria) this;
        }

        public Criteria andRemarkJsonNotIn(List<String> values) {
            addCriterion("remark_json not in", values, "remarkJson");
            return (Criteria) this;
        }

        public Criteria andRemarkJsonBetween(String value1, String value2) {
            addCriterion("remark_json between", value1, value2, "remarkJson");
            return (Criteria) this;
        }

        public Criteria andRemarkJsonNotBetween(String value1, String value2) {
            addCriterion("remark_json not between", value1, value2, "remarkJson");
            return (Criteria) this;
        }

        public Criteria andRakeIsNull() {
            addCriterion("rake is null");
            return (Criteria) this;
        }

        public Criteria andRakeIsNotNull() {
            addCriterion("rake is not null");
            return (Criteria) this;
        }

        public Criteria andRakeEqualTo(Float value) {
            addCriterion("rake =", value, "rake");
            return (Criteria) this;
        }

        public Criteria andRakeNotEqualTo(Float value) {
            addCriterion("rake <>", value, "rake");
            return (Criteria) this;
        }

        public Criteria andRakeGreaterThan(Float value) {
            addCriterion("rake >", value, "rake");
            return (Criteria) this;
        }

        public Criteria andRakeGreaterThanOrEqualTo(Float value) {
            addCriterion("rake >=", value, "rake");
            return (Criteria) this;
        }

        public Criteria andRakeLessThan(Float value) {
            addCriterion("rake <", value, "rake");
            return (Criteria) this;
        }

        public Criteria andRakeLessThanOrEqualTo(Float value) {
            addCriterion("rake <=", value, "rake");
            return (Criteria) this;
        }

        public Criteria andRakeIn(List<Float> values) {
            addCriterion("rake in", values, "rake");
            return (Criteria) this;
        }

        public Criteria andRakeNotIn(List<Float> values) {
            addCriterion("rake not in", values, "rake");
            return (Criteria) this;
        }

        public Criteria andRakeBetween(Float value1, Float value2) {
            addCriterion("rake between", value1, value2, "rake");
            return (Criteria) this;
        }

        public Criteria andRakeNotBetween(Float value1, Float value2) {
            addCriterion("rake not between", value1, value2, "rake");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Date value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Date value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Date value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Date value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Date> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Date> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Date value1, Date value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNull() {
            addCriterion("update_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("update_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtEqualTo(Date value) {
            addCriterion("update_at =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Date value) {
            addCriterion("update_at <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Date value) {
            addCriterion("update_at >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("update_at >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Date value) {
            addCriterion("update_at <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Date value) {
            addCriterion("update_at <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Date> values) {
            addCriterion("update_at in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Date> values) {
            addCriterion("update_at not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Date value1, Date value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Date value1, Date value2) {
            addCriterion("update_at not between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }
    }

    /**
     * spider_poker_info
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * spider_poker_info 2017-11-09
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}