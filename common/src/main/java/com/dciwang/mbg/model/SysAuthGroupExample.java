package com.dciwang.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysAuthGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysAuthGroupExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andAuthGroupIdIsNull() {
            addCriterion("auth_group_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthGroupIdIsNotNull() {
            addCriterion("auth_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthGroupIdEqualTo(String value) {
            addCriterion("auth_group_id =", value, "authGroupId");
            return (Criteria) this;
        }

        public Criteria andAuthGroupIdNotEqualTo(String value) {
            addCriterion("auth_group_id <>", value, "authGroupId");
            return (Criteria) this;
        }

        public Criteria andAuthGroupIdGreaterThan(String value) {
            addCriterion("auth_group_id >", value, "authGroupId");
            return (Criteria) this;
        }

        public Criteria andAuthGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("auth_group_id >=", value, "authGroupId");
            return (Criteria) this;
        }

        public Criteria andAuthGroupIdLessThan(String value) {
            addCriterion("auth_group_id <", value, "authGroupId");
            return (Criteria) this;
        }

        public Criteria andAuthGroupIdLessThanOrEqualTo(String value) {
            addCriterion("auth_group_id <=", value, "authGroupId");
            return (Criteria) this;
        }

        public Criteria andAuthGroupIdLike(String value) {
            addCriterion("auth_group_id like", value, "authGroupId");
            return (Criteria) this;
        }

        public Criteria andAuthGroupIdNotLike(String value) {
            addCriterion("auth_group_id not like", value, "authGroupId");
            return (Criteria) this;
        }

        public Criteria andAuthGroupIdIn(List<String> values) {
            addCriterion("auth_group_id in", values, "authGroupId");
            return (Criteria) this;
        }

        public Criteria andAuthGroupIdNotIn(List<String> values) {
            addCriterion("auth_group_id not in", values, "authGroupId");
            return (Criteria) this;
        }

        public Criteria andAuthGroupIdBetween(String value1, String value2) {
            addCriterion("auth_group_id between", value1, value2, "authGroupId");
            return (Criteria) this;
        }

        public Criteria andAuthGroupIdNotBetween(String value1, String value2) {
            addCriterion("auth_group_id not between", value1, value2, "authGroupId");
            return (Criteria) this;
        }

        public Criteria andAuthGroupNameIsNull() {
            addCriterion("auth_group_name is null");
            return (Criteria) this;
        }

        public Criteria andAuthGroupNameIsNotNull() {
            addCriterion("auth_group_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuthGroupNameEqualTo(String value) {
            addCriterion("auth_group_name =", value, "authGroupName");
            return (Criteria) this;
        }

        public Criteria andAuthGroupNameNotEqualTo(String value) {
            addCriterion("auth_group_name <>", value, "authGroupName");
            return (Criteria) this;
        }

        public Criteria andAuthGroupNameGreaterThan(String value) {
            addCriterion("auth_group_name >", value, "authGroupName");
            return (Criteria) this;
        }

        public Criteria andAuthGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("auth_group_name >=", value, "authGroupName");
            return (Criteria) this;
        }

        public Criteria andAuthGroupNameLessThan(String value) {
            addCriterion("auth_group_name <", value, "authGroupName");
            return (Criteria) this;
        }

        public Criteria andAuthGroupNameLessThanOrEqualTo(String value) {
            addCriterion("auth_group_name <=", value, "authGroupName");
            return (Criteria) this;
        }

        public Criteria andAuthGroupNameLike(String value) {
            addCriterion("auth_group_name like", value, "authGroupName");
            return (Criteria) this;
        }

        public Criteria andAuthGroupNameNotLike(String value) {
            addCriterion("auth_group_name not like", value, "authGroupName");
            return (Criteria) this;
        }

        public Criteria andAuthGroupNameIn(List<String> values) {
            addCriterion("auth_group_name in", values, "authGroupName");
            return (Criteria) this;
        }

        public Criteria andAuthGroupNameNotIn(List<String> values) {
            addCriterion("auth_group_name not in", values, "authGroupName");
            return (Criteria) this;
        }

        public Criteria andAuthGroupNameBetween(String value1, String value2) {
            addCriterion("auth_group_name between", value1, value2, "authGroupName");
            return (Criteria) this;
        }

        public Criteria andAuthGroupNameNotBetween(String value1, String value2) {
            addCriterion("auth_group_name not between", value1, value2, "authGroupName");
            return (Criteria) this;
        }

        public Criteria andShowSequenceIsNull() {
            addCriterion("show_sequence is null");
            return (Criteria) this;
        }

        public Criteria andShowSequenceIsNotNull() {
            addCriterion("show_sequence is not null");
            return (Criteria) this;
        }

        public Criteria andShowSequenceEqualTo(Short value) {
            addCriterion("show_sequence =", value, "showSequence");
            return (Criteria) this;
        }

        public Criteria andShowSequenceNotEqualTo(Short value) {
            addCriterion("show_sequence <>", value, "showSequence");
            return (Criteria) this;
        }

        public Criteria andShowSequenceGreaterThan(Short value) {
            addCriterion("show_sequence >", value, "showSequence");
            return (Criteria) this;
        }

        public Criteria andShowSequenceGreaterThanOrEqualTo(Short value) {
            addCriterion("show_sequence >=", value, "showSequence");
            return (Criteria) this;
        }

        public Criteria andShowSequenceLessThan(Short value) {
            addCriterion("show_sequence <", value, "showSequence");
            return (Criteria) this;
        }

        public Criteria andShowSequenceLessThanOrEqualTo(Short value) {
            addCriterion("show_sequence <=", value, "showSequence");
            return (Criteria) this;
        }

        public Criteria andShowSequenceIn(List<Short> values) {
            addCriterion("show_sequence in", values, "showSequence");
            return (Criteria) this;
        }

        public Criteria andShowSequenceNotIn(List<Short> values) {
            addCriterion("show_sequence not in", values, "showSequence");
            return (Criteria) this;
        }

        public Criteria andShowSequenceBetween(Short value1, Short value2) {
            addCriterion("show_sequence between", value1, value2, "showSequence");
            return (Criteria) this;
        }

        public Criteria andShowSequenceNotBetween(Short value1, Short value2) {
            addCriterion("show_sequence not between", value1, value2, "showSequence");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("updated_by like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("updated_by not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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