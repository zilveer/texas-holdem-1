package com.spider.texasinfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpiderUserActionInfoExample {
    /**
     * spider_user_action_info
     */
    protected String orderByClause;

    /**
     * spider_user_action_info
     */
    protected boolean distinct;

    /**
     * spider_user_action_info
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-11-09
     */
    public SpiderUserActionInfoExample() {
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
     * spider_user_action_info 2017-11-09
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

        public Criteria andStepIsNull() {
            addCriterion("step is null");
            return (Criteria) this;
        }

        public Criteria andStepIsNotNull() {
            addCriterion("step is not null");
            return (Criteria) this;
        }

        public Criteria andStepEqualTo(String value) {
            addCriterion("step =", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotEqualTo(String value) {
            addCriterion("step <>", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThan(String value) {
            addCriterion("step >", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThanOrEqualTo(String value) {
            addCriterion("step >=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThan(String value) {
            addCriterion("step <", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThanOrEqualTo(String value) {
            addCriterion("step <=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLike(String value) {
            addCriterion("step like", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotLike(String value) {
            addCriterion("step not like", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepIn(List<String> values) {
            addCriterion("step in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotIn(List<String> values) {
            addCriterion("step not in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepBetween(String value1, String value2) {
            addCriterion("step between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotBetween(String value1, String value2) {
            addCriterion("step not between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andBetAmountsIsNull() {
            addCriterion("bet_amounts is null");
            return (Criteria) this;
        }

        public Criteria andBetAmountsIsNotNull() {
            addCriterion("bet_amounts is not null");
            return (Criteria) this;
        }

        public Criteria andBetAmountsEqualTo(Long value) {
            addCriterion("bet_amounts =", value, "betAmounts");
            return (Criteria) this;
        }

        public Criteria andBetAmountsNotEqualTo(Long value) {
            addCriterion("bet_amounts <>", value, "betAmounts");
            return (Criteria) this;
        }

        public Criteria andBetAmountsGreaterThan(Long value) {
            addCriterion("bet_amounts >", value, "betAmounts");
            return (Criteria) this;
        }

        public Criteria andBetAmountsGreaterThanOrEqualTo(Long value) {
            addCriterion("bet_amounts >=", value, "betAmounts");
            return (Criteria) this;
        }

        public Criteria andBetAmountsLessThan(Long value) {
            addCriterion("bet_amounts <", value, "betAmounts");
            return (Criteria) this;
        }

        public Criteria andBetAmountsLessThanOrEqualTo(Long value) {
            addCriterion("bet_amounts <=", value, "betAmounts");
            return (Criteria) this;
        }

        public Criteria andBetAmountsIn(List<Long> values) {
            addCriterion("bet_amounts in", values, "betAmounts");
            return (Criteria) this;
        }

        public Criteria andBetAmountsNotIn(List<Long> values) {
            addCriterion("bet_amounts not in", values, "betAmounts");
            return (Criteria) this;
        }

        public Criteria andBetAmountsBetween(Long value1, Long value2) {
            addCriterion("bet_amounts between", value1, value2, "betAmounts");
            return (Criteria) this;
        }

        public Criteria andBetAmountsNotBetween(Long value1, Long value2) {
            addCriterion("bet_amounts not between", value1, value2, "betAmounts");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountsIsNull() {
            addCriterion("raise_amounts is null");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountsIsNotNull() {
            addCriterion("raise_amounts is not null");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountsEqualTo(Long value) {
            addCriterion("raise_amounts =", value, "raiseAmounts");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountsNotEqualTo(Long value) {
            addCriterion("raise_amounts <>", value, "raiseAmounts");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountsGreaterThan(Long value) {
            addCriterion("raise_amounts >", value, "raiseAmounts");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountsGreaterThanOrEqualTo(Long value) {
            addCriterion("raise_amounts >=", value, "raiseAmounts");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountsLessThan(Long value) {
            addCriterion("raise_amounts <", value, "raiseAmounts");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountsLessThanOrEqualTo(Long value) {
            addCriterion("raise_amounts <=", value, "raiseAmounts");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountsIn(List<Long> values) {
            addCriterion("raise_amounts in", values, "raiseAmounts");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountsNotIn(List<Long> values) {
            addCriterion("raise_amounts not in", values, "raiseAmounts");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountsBetween(Long value1, Long value2) {
            addCriterion("raise_amounts between", value1, value2, "raiseAmounts");
            return (Criteria) this;
        }

        public Criteria andRaiseAmountsNotBetween(Long value1, Long value2) {
            addCriterion("raise_amounts not between", value1, value2, "raiseAmounts");
            return (Criteria) this;
        }

        public Criteria andUserActionIsNull() {
            addCriterion("user_action is null");
            return (Criteria) this;
        }

        public Criteria andUserActionIsNotNull() {
            addCriterion("user_action is not null");
            return (Criteria) this;
        }

        public Criteria andUserActionEqualTo(String value) {
            addCriterion("user_action =", value, "userAction");
            return (Criteria) this;
        }

        public Criteria andUserActionNotEqualTo(String value) {
            addCriterion("user_action <>", value, "userAction");
            return (Criteria) this;
        }

        public Criteria andUserActionGreaterThan(String value) {
            addCriterion("user_action >", value, "userAction");
            return (Criteria) this;
        }

        public Criteria andUserActionGreaterThanOrEqualTo(String value) {
            addCriterion("user_action >=", value, "userAction");
            return (Criteria) this;
        }

        public Criteria andUserActionLessThan(String value) {
            addCriterion("user_action <", value, "userAction");
            return (Criteria) this;
        }

        public Criteria andUserActionLessThanOrEqualTo(String value) {
            addCriterion("user_action <=", value, "userAction");
            return (Criteria) this;
        }

        public Criteria andUserActionLike(String value) {
            addCriterion("user_action like", value, "userAction");
            return (Criteria) this;
        }

        public Criteria andUserActionNotLike(String value) {
            addCriterion("user_action not like", value, "userAction");
            return (Criteria) this;
        }

        public Criteria andUserActionIn(List<String> values) {
            addCriterion("user_action in", values, "userAction");
            return (Criteria) this;
        }

        public Criteria andUserActionNotIn(List<String> values) {
            addCriterion("user_action not in", values, "userAction");
            return (Criteria) this;
        }

        public Criteria andUserActionBetween(String value1, String value2) {
            addCriterion("user_action between", value1, value2, "userAction");
            return (Criteria) this;
        }

        public Criteria andUserActionNotBetween(String value1, String value2) {
            addCriterion("user_action not between", value1, value2, "userAction");
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
     * spider_user_action_info
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * spider_user_action_info 2017-11-09
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