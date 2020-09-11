package com.dciwang.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysEnvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysEnvExample() {
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

        public Criteria andVarIdIsNull() {
            addCriterion("var_id is null");
            return (Criteria) this;
        }

        public Criteria andVarIdIsNotNull() {
            addCriterion("var_id is not null");
            return (Criteria) this;
        }

        public Criteria andVarIdEqualTo(String value) {
            addCriterion("var_id =", value, "varId");
            return (Criteria) this;
        }

        public Criteria andVarIdNotEqualTo(String value) {
            addCriterion("var_id <>", value, "varId");
            return (Criteria) this;
        }

        public Criteria andVarIdGreaterThan(String value) {
            addCriterion("var_id >", value, "varId");
            return (Criteria) this;
        }

        public Criteria andVarIdGreaterThanOrEqualTo(String value) {
            addCriterion("var_id >=", value, "varId");
            return (Criteria) this;
        }

        public Criteria andVarIdLessThan(String value) {
            addCriterion("var_id <", value, "varId");
            return (Criteria) this;
        }

        public Criteria andVarIdLessThanOrEqualTo(String value) {
            addCriterion("var_id <=", value, "varId");
            return (Criteria) this;
        }

        public Criteria andVarIdLike(String value) {
            addCriterion("var_id like", value, "varId");
            return (Criteria) this;
        }

        public Criteria andVarIdNotLike(String value) {
            addCriterion("var_id not like", value, "varId");
            return (Criteria) this;
        }

        public Criteria andVarIdIn(List<String> values) {
            addCriterion("var_id in", values, "varId");
            return (Criteria) this;
        }

        public Criteria andVarIdNotIn(List<String> values) {
            addCriterion("var_id not in", values, "varId");
            return (Criteria) this;
        }

        public Criteria andVarIdBetween(String value1, String value2) {
            addCriterion("var_id between", value1, value2, "varId");
            return (Criteria) this;
        }

        public Criteria andVarIdNotBetween(String value1, String value2) {
            addCriterion("var_id not between", value1, value2, "varId");
            return (Criteria) this;
        }

        public Criteria andVarNameIsNull() {
            addCriterion("var_name is null");
            return (Criteria) this;
        }

        public Criteria andVarNameIsNotNull() {
            addCriterion("var_name is not null");
            return (Criteria) this;
        }

        public Criteria andVarNameEqualTo(String value) {
            addCriterion("var_name =", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameNotEqualTo(String value) {
            addCriterion("var_name <>", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameGreaterThan(String value) {
            addCriterion("var_name >", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameGreaterThanOrEqualTo(String value) {
            addCriterion("var_name >=", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameLessThan(String value) {
            addCriterion("var_name <", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameLessThanOrEqualTo(String value) {
            addCriterion("var_name <=", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameLike(String value) {
            addCriterion("var_name like", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameNotLike(String value) {
            addCriterion("var_name not like", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameIn(List<String> values) {
            addCriterion("var_name in", values, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameNotIn(List<String> values) {
            addCriterion("var_name not in", values, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameBetween(String value1, String value2) {
            addCriterion("var_name between", value1, value2, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameNotBetween(String value1, String value2) {
            addCriterion("var_name not between", value1, value2, "varName");
            return (Criteria) this;
        }

        public Criteria andVarValueIsNull() {
            addCriterion("var_value is null");
            return (Criteria) this;
        }

        public Criteria andVarValueIsNotNull() {
            addCriterion("var_value is not null");
            return (Criteria) this;
        }

        public Criteria andVarValueEqualTo(String value) {
            addCriterion("var_value =", value, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueNotEqualTo(String value) {
            addCriterion("var_value <>", value, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueGreaterThan(String value) {
            addCriterion("var_value >", value, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueGreaterThanOrEqualTo(String value) {
            addCriterion("var_value >=", value, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueLessThan(String value) {
            addCriterion("var_value <", value, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueLessThanOrEqualTo(String value) {
            addCriterion("var_value <=", value, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueLike(String value) {
            addCriterion("var_value like", value, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueNotLike(String value) {
            addCriterion("var_value not like", value, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueIn(List<String> values) {
            addCriterion("var_value in", values, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueNotIn(List<String> values) {
            addCriterion("var_value not in", values, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueBetween(String value1, String value2) {
            addCriterion("var_value between", value1, value2, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueNotBetween(String value1, String value2) {
            addCriterion("var_value not between", value1, value2, "varValue");
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

        public Criteria andVarTypeIsNull() {
            addCriterion("var_type is null");
            return (Criteria) this;
        }

        public Criteria andVarTypeIsNotNull() {
            addCriterion("var_type is not null");
            return (Criteria) this;
        }

        public Criteria andVarTypeEqualTo(String value) {
            addCriterion("var_type =", value, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeNotEqualTo(String value) {
            addCriterion("var_type <>", value, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeGreaterThan(String value) {
            addCriterion("var_type >", value, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("var_type >=", value, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeLessThan(String value) {
            addCriterion("var_type <", value, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeLessThanOrEqualTo(String value) {
            addCriterion("var_type <=", value, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeLike(String value) {
            addCriterion("var_type like", value, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeNotLike(String value) {
            addCriterion("var_type not like", value, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeIn(List<String> values) {
            addCriterion("var_type in", values, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeNotIn(List<String> values) {
            addCriterion("var_type not in", values, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeBetween(String value1, String value2) {
            addCriterion("var_type between", value1, value2, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeNotBetween(String value1, String value2) {
            addCriterion("var_type not between", value1, value2, "varType");
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

        public Criteria andShowSequenceEqualTo(Integer value) {
            addCriterion("show_sequence =", value, "showSequence");
            return (Criteria) this;
        }

        public Criteria andShowSequenceNotEqualTo(Integer value) {
            addCriterion("show_sequence <>", value, "showSequence");
            return (Criteria) this;
        }

        public Criteria andShowSequenceGreaterThan(Integer value) {
            addCriterion("show_sequence >", value, "showSequence");
            return (Criteria) this;
        }

        public Criteria andShowSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_sequence >=", value, "showSequence");
            return (Criteria) this;
        }

        public Criteria andShowSequenceLessThan(Integer value) {
            addCriterion("show_sequence <", value, "showSequence");
            return (Criteria) this;
        }

        public Criteria andShowSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("show_sequence <=", value, "showSequence");
            return (Criteria) this;
        }

        public Criteria andShowSequenceIn(List<Integer> values) {
            addCriterion("show_sequence in", values, "showSequence");
            return (Criteria) this;
        }

        public Criteria andShowSequenceNotIn(List<Integer> values) {
            addCriterion("show_sequence not in", values, "showSequence");
            return (Criteria) this;
        }

        public Criteria andShowSequenceBetween(Integer value1, Integer value2) {
            addCriterion("show_sequence between", value1, value2, "showSequence");
            return (Criteria) this;
        }

        public Criteria andShowSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("show_sequence not between", value1, value2, "showSequence");
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