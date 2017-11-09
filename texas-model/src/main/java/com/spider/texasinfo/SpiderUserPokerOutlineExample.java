package com.spider.texasinfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpiderUserPokerOutlineExample {
    /**
     * spider_user_poker_outline
     */
    protected String orderByClause;

    /**
     * spider_user_poker_outline
     */
    protected boolean distinct;

    /**
     * spider_user_poker_outline
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-11-09
     */
    public SpiderUserPokerOutlineExample() {
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
     * spider_user_poker_outline 2017-11-09
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andEarningsIsNull() {
            addCriterion("earnings is null");
            return (Criteria) this;
        }

        public Criteria andEarningsIsNotNull() {
            addCriterion("earnings is not null");
            return (Criteria) this;
        }

        public Criteria andEarningsEqualTo(Long value) {
            addCriterion("earnings =", value, "earnings");
            return (Criteria) this;
        }

        public Criteria andEarningsNotEqualTo(Long value) {
            addCriterion("earnings <>", value, "earnings");
            return (Criteria) this;
        }

        public Criteria andEarningsGreaterThan(Long value) {
            addCriterion("earnings >", value, "earnings");
            return (Criteria) this;
        }

        public Criteria andEarningsGreaterThanOrEqualTo(Long value) {
            addCriterion("earnings >=", value, "earnings");
            return (Criteria) this;
        }

        public Criteria andEarningsLessThan(Long value) {
            addCriterion("earnings <", value, "earnings");
            return (Criteria) this;
        }

        public Criteria andEarningsLessThanOrEqualTo(Long value) {
            addCriterion("earnings <=", value, "earnings");
            return (Criteria) this;
        }

        public Criteria andEarningsIn(List<Long> values) {
            addCriterion("earnings in", values, "earnings");
            return (Criteria) this;
        }

        public Criteria andEarningsNotIn(List<Long> values) {
            addCriterion("earnings not in", values, "earnings");
            return (Criteria) this;
        }

        public Criteria andEarningsBetween(Long value1, Long value2) {
            addCriterion("earnings between", value1, value2, "earnings");
            return (Criteria) this;
        }

        public Criteria andEarningsNotBetween(Long value1, Long value2) {
            addCriterion("earnings not between", value1, value2, "earnings");
            return (Criteria) this;
        }

        public Criteria andUserSiteIsNull() {
            addCriterion("user_site is null");
            return (Criteria) this;
        }

        public Criteria andUserSiteIsNotNull() {
            addCriterion("user_site is not null");
            return (Criteria) this;
        }

        public Criteria andUserSiteEqualTo(String value) {
            addCriterion("user_site =", value, "userSite");
            return (Criteria) this;
        }

        public Criteria andUserSiteNotEqualTo(String value) {
            addCriterion("user_site <>", value, "userSite");
            return (Criteria) this;
        }

        public Criteria andUserSiteGreaterThan(String value) {
            addCriterion("user_site >", value, "userSite");
            return (Criteria) this;
        }

        public Criteria andUserSiteGreaterThanOrEqualTo(String value) {
            addCriterion("user_site >=", value, "userSite");
            return (Criteria) this;
        }

        public Criteria andUserSiteLessThan(String value) {
            addCriterion("user_site <", value, "userSite");
            return (Criteria) this;
        }

        public Criteria andUserSiteLessThanOrEqualTo(String value) {
            addCriterion("user_site <=", value, "userSite");
            return (Criteria) this;
        }

        public Criteria andUserSiteLike(String value) {
            addCriterion("user_site like", value, "userSite");
            return (Criteria) this;
        }

        public Criteria andUserSiteNotLike(String value) {
            addCriterion("user_site not like", value, "userSite");
            return (Criteria) this;
        }

        public Criteria andUserSiteIn(List<String> values) {
            addCriterion("user_site in", values, "userSite");
            return (Criteria) this;
        }

        public Criteria andUserSiteNotIn(List<String> values) {
            addCriterion("user_site not in", values, "userSite");
            return (Criteria) this;
        }

        public Criteria andUserSiteBetween(String value1, String value2) {
            addCriterion("user_site between", value1, value2, "userSite");
            return (Criteria) this;
        }

        public Criteria andUserSiteNotBetween(String value1, String value2) {
            addCriterion("user_site not between", value1, value2, "userSite");
            return (Criteria) this;
        }

        public Criteria andUserHandIsNull() {
            addCriterion("user_hand is null");
            return (Criteria) this;
        }

        public Criteria andUserHandIsNotNull() {
            addCriterion("user_hand is not null");
            return (Criteria) this;
        }

        public Criteria andUserHandEqualTo(String value) {
            addCriterion("user_hand =", value, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandNotEqualTo(String value) {
            addCriterion("user_hand <>", value, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandGreaterThan(String value) {
            addCriterion("user_hand >", value, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandGreaterThanOrEqualTo(String value) {
            addCriterion("user_hand >=", value, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandLessThan(String value) {
            addCriterion("user_hand <", value, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandLessThanOrEqualTo(String value) {
            addCriterion("user_hand <=", value, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandLike(String value) {
            addCriterion("user_hand like", value, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandNotLike(String value) {
            addCriterion("user_hand not like", value, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandIn(List<String> values) {
            addCriterion("user_hand in", values, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandNotIn(List<String> values) {
            addCriterion("user_hand not in", values, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandBetween(String value1, String value2) {
            addCriterion("user_hand between", value1, value2, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandNotBetween(String value1, String value2) {
            addCriterion("user_hand not between", value1, value2, "userHand");
            return (Criteria) this;
        }

        public Criteria andHandTypeIsNull() {
            addCriterion("hand_type is null");
            return (Criteria) this;
        }

        public Criteria andHandTypeIsNotNull() {
            addCriterion("hand_type is not null");
            return (Criteria) this;
        }

        public Criteria andHandTypeEqualTo(String value) {
            addCriterion("hand_type =", value, "handType");
            return (Criteria) this;
        }

        public Criteria andHandTypeNotEqualTo(String value) {
            addCriterion("hand_type <>", value, "handType");
            return (Criteria) this;
        }

        public Criteria andHandTypeGreaterThan(String value) {
            addCriterion("hand_type >", value, "handType");
            return (Criteria) this;
        }

        public Criteria andHandTypeGreaterThanOrEqualTo(String value) {
            addCriterion("hand_type >=", value, "handType");
            return (Criteria) this;
        }

        public Criteria andHandTypeLessThan(String value) {
            addCriterion("hand_type <", value, "handType");
            return (Criteria) this;
        }

        public Criteria andHandTypeLessThanOrEqualTo(String value) {
            addCriterion("hand_type <=", value, "handType");
            return (Criteria) this;
        }

        public Criteria andHandTypeLike(String value) {
            addCriterion("hand_type like", value, "handType");
            return (Criteria) this;
        }

        public Criteria andHandTypeNotLike(String value) {
            addCriterion("hand_type not like", value, "handType");
            return (Criteria) this;
        }

        public Criteria andHandTypeIn(List<String> values) {
            addCriterion("hand_type in", values, "handType");
            return (Criteria) this;
        }

        public Criteria andHandTypeNotIn(List<String> values) {
            addCriterion("hand_type not in", values, "handType");
            return (Criteria) this;
        }

        public Criteria andHandTypeBetween(String value1, String value2) {
            addCriterion("hand_type between", value1, value2, "handType");
            return (Criteria) this;
        }

        public Criteria andHandTypeNotBetween(String value1, String value2) {
            addCriterion("hand_type not between", value1, value2, "handType");
            return (Criteria) this;
        }

        public Criteria andSuitedIsNull() {
            addCriterion("suited is null");
            return (Criteria) this;
        }

        public Criteria andSuitedIsNotNull() {
            addCriterion("suited is not null");
            return (Criteria) this;
        }

        public Criteria andSuitedEqualTo(Integer value) {
            addCriterion("suited =", value, "suited");
            return (Criteria) this;
        }

        public Criteria andSuitedNotEqualTo(Integer value) {
            addCriterion("suited <>", value, "suited");
            return (Criteria) this;
        }

        public Criteria andSuitedGreaterThan(Integer value) {
            addCriterion("suited >", value, "suited");
            return (Criteria) this;
        }

        public Criteria andSuitedGreaterThanOrEqualTo(Integer value) {
            addCriterion("suited >=", value, "suited");
            return (Criteria) this;
        }

        public Criteria andSuitedLessThan(Integer value) {
            addCriterion("suited <", value, "suited");
            return (Criteria) this;
        }

        public Criteria andSuitedLessThanOrEqualTo(Integer value) {
            addCriterion("suited <=", value, "suited");
            return (Criteria) this;
        }

        public Criteria andSuitedIn(List<Integer> values) {
            addCriterion("suited in", values, "suited");
            return (Criteria) this;
        }

        public Criteria andSuitedNotIn(List<Integer> values) {
            addCriterion("suited not in", values, "suited");
            return (Criteria) this;
        }

        public Criteria andSuitedBetween(Integer value1, Integer value2) {
            addCriterion("suited between", value1, value2, "suited");
            return (Criteria) this;
        }

        public Criteria andSuitedNotBetween(Integer value1, Integer value2) {
            addCriterion("suited not between", value1, value2, "suited");
            return (Criteria) this;
        }

        public Criteria andAllinIsNull() {
            addCriterion("allin is null");
            return (Criteria) this;
        }

        public Criteria andAllinIsNotNull() {
            addCriterion("allin is not null");
            return (Criteria) this;
        }

        public Criteria andAllinEqualTo(Integer value) {
            addCriterion("allin =", value, "allin");
            return (Criteria) this;
        }

        public Criteria andAllinNotEqualTo(Integer value) {
            addCriterion("allin <>", value, "allin");
            return (Criteria) this;
        }

        public Criteria andAllinGreaterThan(Integer value) {
            addCriterion("allin >", value, "allin");
            return (Criteria) this;
        }

        public Criteria andAllinGreaterThanOrEqualTo(Integer value) {
            addCriterion("allin >=", value, "allin");
            return (Criteria) this;
        }

        public Criteria andAllinLessThan(Integer value) {
            addCriterion("allin <", value, "allin");
            return (Criteria) this;
        }

        public Criteria andAllinLessThanOrEqualTo(Integer value) {
            addCriterion("allin <=", value, "allin");
            return (Criteria) this;
        }

        public Criteria andAllinIn(List<Integer> values) {
            addCriterion("allin in", values, "allin");
            return (Criteria) this;
        }

        public Criteria andAllinNotIn(List<Integer> values) {
            addCriterion("allin not in", values, "allin");
            return (Criteria) this;
        }

        public Criteria andAllinBetween(Integer value1, Integer value2) {
            addCriterion("allin between", value1, value2, "allin");
            return (Criteria) this;
        }

        public Criteria andAllinNotBetween(Integer value1, Integer value2) {
            addCriterion("allin not between", value1, value2, "allin");
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
     * spider_user_poker_outline
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * spider_user_poker_outline 2017-11-09
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