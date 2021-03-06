package com.example.liquibase.change;

import liquibase.serializer.AbstractLiquibaseSerializable;

public class DefaultConstraintConfig extends AbstractLiquibaseSerializable {
    private String name;
    private String expression;

    @Override
    public String getSerializedObjectNamespace() {
        return GENERIC_CHANGELOG_EXTENSION_NAMESPACE;
    }

    @Override
    public String getSerializedObjectName() {
        return "defaultConstraint";
    }

    @Override
    public SerializationType getSerializableFieldType(String field) {
        if ("expression".equals(field)) {
            return SerializationType.DIRECT_VALUE;
        }
        return SerializationType.NAMED_FIELD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}
